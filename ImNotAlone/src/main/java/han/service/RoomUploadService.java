package han.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.tiles.request.ApplicationContextAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import han.dto.PhotoDTO;
import han.dto.RoomDTO;
import han.model.RoomDAO;
import han.model.PhotoDAO;

@Service
@Transactional
public class RoomUploadService {
/*	implements ApplicationContextAware 
*/	/*@Autowired
	PhotoDAO pDAO;
	
	MultipartFile uploadFile;
	String rp_oname;
	String rp_sname;
	String rp_img_path;
	long rp_img_size;
	String result;
	
	private WebApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException{
		this.context = (WebApplicationContext)applicationcontext;
	}
	
	
	@Transactional
	public String roomUpload(PhotoDTO pDTO) throws Exception
	{
		String type_of = "";
		int check = 0;
		int check2 = 0;
		
		for(int i = 0;i<pDTO.getType_of().size();i++)
		{
			if(pDTO.getType_of().size() == i+1)
			{
				type_of += pDTO.getType_of().get(i);
				break;
			}
			type_of += pDTO.getType_of().get(i)+ ",";
		}
		
		String[] a = type_of.split(",");
		
		pDTO.setRp_type_of(type_of);
		
		for(int i = 0;i<pDTO.getUser_file().size();i++)
		{
			uploadFile = pDTO.getUser_file().get(i);
			rp_oname = pDTO.getUser_file().get(i).getOriginalFilename();
			rp_sname = System.currentTimeMillis() + "_" + new Random().nextInt(10) + "_" + rp_oname;
			
			rp_img_size = pDTO.getUser_file().get(i).getSize();
			rp_img_path = context.getServletContext().getRealPath("/uploadedFile");
			
			pDTO.setRp_oname(rp_oname);
			pDTO.setRp_sname(rp_sname);
			pDTO.setRp_img_path(rp_img_path);
			pDTO.setRp_img_size(rp_img_size);
			
		}
		return "방사진 올리기";
	}*/
	
}
