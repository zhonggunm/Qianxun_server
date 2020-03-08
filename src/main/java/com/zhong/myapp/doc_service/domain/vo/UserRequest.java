package com.zhong.myapp.doc_service.domain.vo;

import com.zhong.myapp.doc_service.domain.models.Role;

import lombok.Data;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
public class UserRequest {

  String identity;

  String name;

  Role role;

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

}
