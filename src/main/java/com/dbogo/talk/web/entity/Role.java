package com.dbogo.talk.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private String name;
	private String description;

}
