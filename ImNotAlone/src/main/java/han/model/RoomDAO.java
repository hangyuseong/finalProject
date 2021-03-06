package han.model;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import han.dto.PhotoDTO;
import han.dto.RoomDTO;

public class RoomDAO extends SqlSessionDaoSupport{

	@Transactional(readOnly=true)
	public int uploadFile(PhotoDTO pDTO)
	{
		return getSqlSession().insert("uploadImg",pDTO);
	}
	//
}

