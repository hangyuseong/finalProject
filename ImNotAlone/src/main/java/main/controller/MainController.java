package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	
	@RequestMapping(value="/main/mainView",method=RequestMethod.GET)
	public String mainView() {
		return "mainView";
	}
	
	//�� ���ε� ��Ʈ�ѷ�
	
/*	@RequestMapping(value = "/han/roomupload1", method = RequestMethod.GET)
	public String roomForm1()
	{
		System.out.println("�� ������ ��� roomController");
		return "roomupload1";
	}
	*/
	
}
