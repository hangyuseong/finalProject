package han.dto;

import org.springframework.beans.factory.annotation.Autowired;

import han.service.RoomService;

public class DefaultOptionDTO {

	@Autowired
	RoomService roomservice;

	
	private String d_wifi;
	private String d_washer;
	private String d_air;
	private String d_tv;
	private String d_lock;
	private String d_c_heat;
	private String d_heat;
	private String d_refer;
	private String d_gas;
	private String d_micro;
	private String d_book;
	private String d_closet;
	private String d_bed;
	public String getD_wifi() {
		return d_wifi;
	}
	public void setD_wifi(String d_wifi) {
		this.d_wifi = d_wifi;
	}
	public String getD_washer() {
		return d_washer;
	}
	public void setD_washer(String d_washer) {
		this.d_washer = d_washer;
	}
	public String getD_air() {
		return d_air;
	}
	public void setD_air(String d_air) {
		this.d_air = d_air;
	}
	public String getD_tv() {
		return d_tv;
	}
	public void setD_tv(String d_tv) {
		this.d_tv = d_tv;
	}
	public String getD_lock() {
		return d_lock;
	}
	public void setD_lock(String d_lock) {
		this.d_lock = d_lock;
	}
	public String getD_c_heat() {
		return d_c_heat;
	}
	public void setD_c_heat(String d_c_heat) {
		this.d_c_heat = d_c_heat;
	}
	public String getD_heat() {
		return d_heat;
	}
	public void setD_heat(String d_heat) {
		this.d_heat = d_heat;
	}
	public String getD_refer() {
		return d_refer;
	}
	public void setD_refer(String d_refer) {
		this.d_refer = d_refer;
	}
	public String getD_gas() {
		return d_gas;
	}
	public void setD_gas(String d_gas) {
		this.d_gas = d_gas;
	}
	public String getD_micro() {
		return d_micro;
	}
	public void setD_micro(String d_micro) {
		this.d_micro = d_micro;
	}
	public String getD_book() {
		return d_book;
	}
	public void setD_book(String d_book) {
		this.d_book = d_book;
	}
	public String getD_closet() {
		return d_closet;
	}
	public void setD_closet(String d_closet) {
		this.d_closet = d_closet;
	}
	public String getD_bed() {
		return d_bed;
	}
	public void setD_bed(String d_bed) {
		this.d_bed = d_bed;
	}
	
	
}
