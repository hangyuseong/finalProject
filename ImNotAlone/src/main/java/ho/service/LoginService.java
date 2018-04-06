package ho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ho.dto.MemberDTO;
import ho.model.MemberDAO;

//@Service
public class LoginService {

	@Autowired
	MemberDAO dao;

	public int login(MemberDTO dto) {

		String userPasswd = dao.checkUser(dto.getUserEmail());

		if (userPasswd != null) {
			if (dto.getUserPasswd().equals(userPasswd)) {
				return 1; // 로그인성공
			} else {
				return 2; // 비밀번호 틀림
			}

		} else {
			return 0; // 회원정보가 없음.
		}
	}
	
	
	
	
}
