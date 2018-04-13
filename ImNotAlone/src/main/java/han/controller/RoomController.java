package han.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import han.service.RoomUploadService;

@Controller
public class RoomController {

	
	@Autowired
	RoomUploadService roomuploadservice;
	
	@RequestMapping(value = "/han/roomupload", method = RequestMethod.GET)
	public String roomForm(HttpSession session)
	{
		System.out.println("방 위치등록  roomController");
		return "roomupload";
	}
	
	@RequestMapping(value = "/han/roomupload1", method = RequestMethod.GET)
	public String roomForm1(HttpSession session)
	{
		System.out.println("방 사진등록 roomController");
		return "roomupload1";
	}
	
	@RequestMapping(value = "/han/roomupload2", method = RequestMethod.GET)
	public String roomForm2(HttpSession session)
	{
		System.out.println("방 상세정보 등록 roomController");
		return "roomupload2";
	}
	
	@RequestMapping(value = "/han/roomuploadComplete", method = RequestMethod.GET)
	public String roomComplete()
	{
		System.out.println("방 등록 완료 Controller");
		return "roomuploadComplete";
	}
}
