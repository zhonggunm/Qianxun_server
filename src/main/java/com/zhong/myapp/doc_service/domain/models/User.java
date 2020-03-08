package com.zhong.myapp.doc_service.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
@Document(collection = "users")
public class User {

  @Id
  String id;

  String identity;

  String name;

  Role role;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

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
