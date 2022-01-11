package com.wowoni.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subid;
	@Column(name = "first_subject")
	private String firstSubName;
	@Column(name = "secound_subject")
	private String secoundSubName;

	public Subject(long subid, String firstSubName, String secoundSubName) {
		super();
		this.subid = subid;
		this.firstSubName = firstSubName;
		this.secoundSubName = secoundSubName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getSubid() {
		return subid;
	}

	public void setSubid(long subid) {
		this.subid = subid;
	}

	public String getFirstSubName() {
		return firstSubName;
	}

	public void setFirstSubName(String firstSubName) {
		this.firstSubName = firstSubName;
	}

	public String getSecoundSubName() {
		return secoundSubName;
	}

	public void setSecoundSubName(String secoundSubName) {
		this.secoundSubName = secoundSubName;
	}

}
