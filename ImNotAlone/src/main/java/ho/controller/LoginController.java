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
		System.out.println("실행");
		return "loginForm";
	}
	
	
	@RequestMapping(value="/ho/login1", method=RequestMethod.POST)
	public String loginForm2(MemberDTO dto) {

		int result = loginService.login(dto);
		if(result == 1) {
			return "redirect:/share/main/mainView"; //로그인 성공
		}else if(result == 2){
			System.out.println("로그인 실패, 패스워드 불일치");
			return "redirect:/share/ho/login"; //패스워드 불일치
		}else {
			System.out.println("로그인 실패, 회원정보 없음 or 이메일이 틀림");
			return "redirect:/share/ho/login"; //회원정보 없음 
		}
	}
	
	 
}
