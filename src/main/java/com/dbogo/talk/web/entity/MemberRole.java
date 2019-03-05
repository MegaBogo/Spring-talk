package com.dbogo.talk.web.entity;

import javax.persistence.EmbeddedId;

public class MemberRole {
	@EmbeddedId
	private MemberRoleId id;
	
	private boolean defaultRole;
}
