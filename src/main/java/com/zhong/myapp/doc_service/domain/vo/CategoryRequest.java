package com.zhong.myapp.doc_service.domain.vo;

import lombok.Data;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
public class CategoryRequest {

  String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
