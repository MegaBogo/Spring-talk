package com.dbogo.talk.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Member {
	@Id
	private String id;
	private String name;
	private String email;
	private String pwd;
	@Column(insertable=false) 
	private Date regDate;
	private String photo;
	
	
}
