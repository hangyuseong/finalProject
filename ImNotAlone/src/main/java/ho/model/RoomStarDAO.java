package ho.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import ho.dto.MemberDTO;
import ho.dto.RoomStarDTO;
import ho.vo.PageVO;

public class RoomStarDAO extends SqlSessionDaoSupport{

	@Transactional(readOnly=true)
	public int uploadFile(RoomStarDTO rsDTO) {
		return getSqlSession().insert("uploadBstImg", rsDTO);
	}

	public int insertContents(RoomStarDTO rsDTO) {
		return getSqlSession().insert("insertBstContents", rsDTO);
	}

	public List<RoomStarDTO> checkBstNo(RoomStarDTO rsDTO) {
		return getSqlSession().selectList("checkBstNo",rsDTO);
				
	}



	public int getCountList() {
		return getSqlSession().selectOne("getBstCountList");
	}

//	public List<RoomStarDTO> getListContents(MemberDTO mbDTO) {
//		return getSqlSession().selectList("getListContents", mbDTO);
//	}
	
	public List<RoomStarDTO> getListContents(PageVO pageVo) {
		return getSqlSession().selectList("getListContents", pageVo);
	}
	
	
}
