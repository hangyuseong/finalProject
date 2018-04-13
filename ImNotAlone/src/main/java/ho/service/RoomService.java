package ho.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.el.parser.Token;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import ho.dto.MemberDTO;
import ho.dto.RoomStarDTO;
import ho.model.RoomStarDAO;
import ho.vo.PageVO;

@Service
@Transactional
public class RoomService implements ApplicationContextAware {

	@Autowired
	RoomStarDAO rsDAO;

	MultipartFile uploadFile;
	String oname;
	String sname;
	String path;
	long size;
	String result;
	private WebApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = (WebApplicationContext) applicationContext;
	}

	
	
	@Transactional
	public String contentsUpload(RoomStarDTO rsDTO) throws Exception {
		String type_of = "";
		int check = 0;
		int check2 = 0;
		int de = 0;
		int like = 0;
		int view = 0;
		
		/*type_of �߰�*/
		for(int i = 0; i < rsDTO.getType_of().size(); i++) {
			if(rsDTO.getType_of().size() == i+1) {
			type_of += rsDTO.getType_of().get(i);
			break;
			}
			type_of += rsDTO.getType_of().get(i) + ",";
		}
		
		
		String[] a = type_of.split(",");
		System.out.println("type_of Ȯ�� : " + type_of);
		rsDTO.setBst_type_of(type_of);
		rsDTO.setBst_like(like);
		rsDTO.setBst_view(view);
		
		// (1)������ ���ε�
		check = rsDAO.insertContents(rsDTO);

		// (2)���Ͼ��ε�
		if (check == 1) {
			check = 0;
			for (int i = 0; i < rsDTO.getUser_file().size(); i++) {
				uploadFile = rsDTO.getUser_file().get(i);
				oname = rsDTO.getUser_file().get(i).getOriginalFilename();
				sname = System.currentTimeMillis() + "_" + new Random().nextInt(10) + "_" + oname;
				size = rsDTO.getUser_file().get(i).getSize();
				path = context.getServletContext().getRealPath("/uploadedFile");
				// path =
				// "C:/xor4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ImNotAlone/uploadedFile/"
				// + sname;

				rsDTO.setBst_img_oname(oname);
				rsDTO.setBst_img_sname(sname);
				rsDTO.setBst_img_path(path + "\\" + sname);
				rsDTO.setBst_img_size(size);
				
				
				// ���ȣȮ��
				//������ �ͼ��� �߻�
//				rsDAO.tranTest();
				List<RoomStarDTO> list = rsDAO.checkBstNo(rsDTO);
				
				if (list.get(0).getBst_board_no() == 0) {
					list.get(0).setBst_board_no(0);
				}
				rsDTO.setBst_board_no(list.get(0).getBst_board_no());
				
				// (2-1)���� ���ε�
				check2 = rsDAO.uploadFile(rsDTO);
				System.out.println("-----------------");
				System.out.println(i + "��° �ε��� ���� ���ε� ����");
				
				// (3)���ε� ���� ������ ���� �̵�.
				if (check2 == 1) {
				check2 = 0;
				try {
					rsDTO.getUser_file().get(i).transferTo(new File(rsDTO.getBst_img_path()));
					System.out.println(i + "��° �ε��� ���� �̵� ����");

				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
					System.out.println(i + "��° �ε��� ���� �̵� ����");
				}
			}//if 
				
			}// for
		} // if

		return "�ӹ�����";
	}// contentsUpload






	public int getCountList() {
		int count = rsDAO.getCountList();
		return count ;
	}



//	public List<RoomStarDTO> getListContents(MemberDTO mbDTO) {
//		List<RoomStarDTO> contentsList = new ArrayList<RoomStarDTO>();
//		contentsList = rsDAO.getListContents(mbDTO);
//		return contentsList;
//	}

	public List<RoomStarDTO> getListContents(PageVO pageVo){
		List<RoomStarDTO> contentsList = new ArrayList<RoomStarDTO>();
		contentsList = rsDAO.getListContents(pageVo);
		return contentsList;
	}

	
	
	
	
	

}
