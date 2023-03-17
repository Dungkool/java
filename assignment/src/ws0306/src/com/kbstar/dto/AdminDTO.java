package com.kbstar.dto;

public class AdminDTO {
	private String id;
	private String pwd;
	private String name;
	private int level;
	private String authority;
	
	public AdminDTO() {
	}
	public AdminDTO(String id, String pwd, String name, int level, String authority) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.level = level;
		this.authority = authority;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", level=" + level + ", authority="
				+ authority + "]";
	}
	
	
}
