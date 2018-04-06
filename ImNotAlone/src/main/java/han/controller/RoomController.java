package han.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import han.service.RoomService;

@Controller
public class RoomController {

	
	@Autowired
	RoomService roomService;
	
	@RequestMapping(value = "/han/roomupload", method = RequestMethod.GET)
	public String roomForm()
	{
		System.out.println("�� ��� roomController");
		return "roomupload";
	}
	
	@RequestMapping(value = "/han/roomupload1", method = RequestMethod.GET)
	public String roomForm1()
	{
		System.out.println("�� ������ ��� roomController");
		return "roomupload1";
	}
	
	@RequestMapping(value = "/han/roomupload2", method = RequestMethod.GET)
	public String roomForm2()
	{
		System.out.println("�� ��ġ���� ��� roomController");
		return "roomupload2";
	}
}
