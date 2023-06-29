package com.LibMS.LibraryDemo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberData")
public class PersonalData {

	@Id
	private String Member_id;
	private String Name;
	private String Contact_no;
	private String Address;
	
	public PersonalData() {
		
	}
	public PersonalData(String member_id, String name, String contact_no, String address) {
		super();
		Member_id = member_id;
		Name = name;
		Contact_no = contact_no;
		Address = address;
	}
	public String getMember_id() {
		return Member_id;
	}
	public void setMember_id(String member_id) {
		Member_id = member_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContact_no() {
		return Contact_no;
	}
	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
