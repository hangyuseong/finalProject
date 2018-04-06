package ho.dto;

import java.sql.Date;

public class MemberDTO {

	private String userId;
	private String userPasswd;
	private String userName;
	private String userEmail;
	private Date userSignIn;
	
	MemberDTO(){}

	public MemberDTO(String userId, String userPasswd, String userName, String userEmail, Date userSignIn) {
		super();
		this.userId = userId;
		this.userPasswd = userPasswd;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userSignIn = userSignIn;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserSignIn() {
		return userSignIn;
	}
	public void setUserSignIn(Date userSignIn) {
		this.userSignIn = userSignIn;
	}

}
