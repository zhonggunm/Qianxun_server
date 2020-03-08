package com.zhong.myapp.doc_service.domain.models;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
@Document(collection = "categories")
public class Category {

  public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

@Id
  String id;

  String name;
  
  public Category() {
	  super();
  }

  @Builder
  public static Category newCategory(String name){
    final Category category = new Category();
    category.setId(UUID.randomUUID().toString());
    category.setName(name);
    return category;
  }

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
