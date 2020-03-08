package com.zhong.myapp.doc_service.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Review {

	  public Review() {
	  }
	  
  public Review(String userId, String status) {
		super();
		this.userId = userId;
		this.status = status;
	}

String userId;

  String status;

}
