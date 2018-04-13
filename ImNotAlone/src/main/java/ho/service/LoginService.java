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
				return 1; // �α��μ���s
			} else {
				return 2; // ��й�ȣ Ʋ��
			}

		} else {
			return 0; // ȸ�������� ����.
		}
	}
	
	
	
	
}
