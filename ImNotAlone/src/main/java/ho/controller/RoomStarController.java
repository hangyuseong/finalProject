package ho.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ho.dto.MemberDTO;
import ho.dto.RoomStarDTO;
import ho.service.RoomService;
import ho.vo.PageVO;

@Controller
public class RoomStarController {

	@Autowired
	RoomService rsService;

	@RequestMapping(value = "/roomStar", method = RequestMethod.GET)
	public String roomStarView() {
		return "roomStarView";
	}

	@RequestMapping(value = "/roomStar2", method = RequestMethod.GET)
	public String roomStarView2() {
		return "roomStarView2";
	}

	@RequestMapping(value = "/roomStar3", method = RequestMethod.GET)
	public String roomStarView3() {
		return "roomStarView3";
	}
	
	

	@ModelAttribute("pageNum")
	public String pageNum(String pageNum) {
		if(pageNum == null || pageNum.equals("")){pageNum="1";}
		return pageNum;
	}
	
	
/*	@RequestMapping(value = "/roomStar4", method = RequestMethod.GET)
	public String roomStarView4(HttpSession session, Model model) {
		MemberDTO mbDTO = (MemberDTO) session.getAttribute("member");
		List<RoomStarDTO> contentsList = new ArrayList<RoomStarDTO>();
		contentsList = rsService.getListContents(mbDTO);
		int count = rsService.getCountList();
		System.out.println("list 확인 : " + contentsList);

		model.addAttribute("count", count);
		model.addAttribute("bst_contents", contentsList);
		return "roomStarView4";
	}*/
	
	
	@RequestMapping(value="/roomStar4")
	public String roomStarView5(@ModelAttribute("pageNum")String pageNum, Model model) {
		PageVO vo = new PageVO();
		List<RoomStarDTO> contentsList;
		
		vo.setTotalCount(rsService.getCountList());
		vo.setPageNum(Integer.parseInt(pageNum));
		vo.makePaging();
		contentsList = rsService.getListContents(vo);
		
		model.addAttribute("bst_contents", contentsList);
		model.addAttribute("pageVO", vo);
		
		System.out.println("이거 실행 됨.");
		return "roomStarView4";
	}
		
		
	
	
	
	@RequestMapping(value = "/roomStarRegisterForm", method = RequestMethod.GET)
	public String registerForm(HttpSession session) {
		return "roomStarRegisterForm";
	}
	
	@RequestMapping(value = "/roomStarReviewView", method = RequestMethod.GET)
	public String contentReView() {
		return "roomStarReviewView";
	}

	@RequestMapping(value = "/roomStarContentView", method = RequestMethod.GET)
	public String contentView() {
		return "roomStarContentView";
	}
	
	
	@RequestMapping(value="/roomStarUpload")
	public String fileUpload(RoomStarDTO roomStarDTO) throws Exception {
		
		String result = rsService.contentsUpload(roomStarDTO);
		System.out.println(result);
		return "redirect:/share/roomStarRegisterForm";
	}
	
	
	
	
	
	
	
	
	
}