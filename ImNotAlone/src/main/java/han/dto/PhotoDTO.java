package han.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class PhotoDTO {
	
	private int rp_board_no;
	private String rp_id;
	private int rp_no;
	//private String rp_img;
	private String rp_img_path;
	private String rp_oname;
	private String rp_sname;
	private long rp_img_size;
	private String rp_type_of;
	
	//
	
	
	private MultipartFile user_file2;
	private ArrayList<String> type_of;
	private List<MultipartFile> user_file;
	
	public String getRp_type_of() {
		return rp_type_of;
	}
	public void setRp_type_of(String rp_type_of) {
		this.rp_type_of = rp_type_of;
	}
	
	
	public int getRp_board_no() {
		return rp_board_no;
	}
	public void setRp_board_no(int rp_board_no) {
		this.rp_board_no = rp_board_no;
	}
	public String getRp_id() {
		return rp_id;
	}
	public void setRp_id(String rp_id) {
		this.rp_id = rp_id;
	}
	public int getRp_no() {
		return rp_no;
	}
	public void setRp_no(int rp_no) {
		this.rp_no = rp_no;
	}
	/*public String getRp_img() {
		return rp_img;
	}
	public void setRp_img(String rp_img) {
		this.rp_img = rp_img;
	}*/
	
	public String getRp_oname() {
		return rp_oname;
	}
	public String getRp_img_path() {
		return rp_img_path;
	}
	public void setRp_img_path(String rp_img_path) {
		this.rp_img_path = rp_img_path;
	}
	public void setRp_oname(String rp_oname) {
		this.rp_oname = rp_oname;
	}
	public String getRp_sname() {
		return rp_sname;
	}
	public void setRp_sname(String rp_sname) {
		this.rp_sname = rp_sname;
	}
	public long getRp_img_size() {
		return rp_img_size;
	}
	public void setRp_img_size(long rp_img_size) {
		this.rp_img_size = rp_img_size;
	}
	
	//
	public MultipartFile getUser_file2() {
		return user_file2;
	}
	public void setUser_file2(MultipartFile user_file2) {
		this.user_file2 = user_file2;
	}
	public ArrayList<String> getType_of() {
		return type_of;
	}
	public void setType_of(ArrayList<String> type_of) {
		this.type_of = type_of;
	}
	public List<MultipartFile> getUser_file() {
		return user_file;
	}
	public void setUser_file(List<MultipartFile> user_file) {
		this.user_file = user_file;
	}
	
}
