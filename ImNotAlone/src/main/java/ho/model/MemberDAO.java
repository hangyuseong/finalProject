package ho.model;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ho.dto.MemberDTO;

public class MemberDAO extends SqlSessionDaoSupport {

	public String checkUser(String userEmail) {
		return getSqlSession().selectOne("checkUserEmailForLogin", userEmail);		
	}

	
}
