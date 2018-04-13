package ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ho.dto.MemberDTO;
import ho.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/ho/login",method=RequestMethod.GET)
	public String loginForm() {
		System.out.println("����");
		return "loginForm";
	}
	
	
	@RequestMapping(value="/ho/login1", method=RequestMethod.POST)
	public String loginForm2(MemberDTO dto) {

		int result = loginService.login(dto);
		if(result == 1) {
			return "redirect:/share/main/mainView"; //�α��� ����
		}else if(result == 2){
			System.out.println("�α��� ����, �н����� ����ġ");
			return "redirect:/share/ho/login"; //�н����� ����ġ
		}else {
			System.out.println("�α��� ����, ȸ������ ���� or �̸����� Ʋ��");
			return "redirect:/share/ho/login"; //ȸ������ ���� 
		}
	}
	
	
	 
}
