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
	
	//방 업로드 컨트롤러
	
/*	@RequestMapping(value = "/han/roomupload1", method = RequestMethod.GET)
	public String roomForm1()
	{
		System.out.println("방 상세정보 등록 roomController");
		return "roomupload1";
	}
	*/
	
}
