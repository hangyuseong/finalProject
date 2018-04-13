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
		System.out.println("�� ��ġ���  roomController");
		return "roomupload";
	}
	
	@RequestMapping(value = "/han/roomupload1", method = RequestMethod.GET)
	public String roomForm1(HttpSession session)
	{
		System.out.println("�� ������� roomController");
		return "roomupload1";
	}
	
	@RequestMapping(value = "/han/roomupload2", method = RequestMethod.GET)
	public String roomForm2(HttpSession session)
	{
		System.out.println("�� ������ ��� roomController");
		return "roomupload2";
	}
	
	@RequestMapping(value = "/han/roomuploadComplete", method = RequestMethod.GET)
	public String roomComplete()
	{
		System.out.println("�� ��� �Ϸ� Controller");
		return "roomuploadComplete";
	}
}
