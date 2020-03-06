package com.zhong.myapp.sql_user_service.domain.exceptions;

import lombok.Getter;

/**
 * @author claudioed on 03/12/17. Project cms
 */
public class NewsNotFoundException extends RuntimeException{

  @Getter
  private final String id;

  public NewsNotFoundException(String id) {
    this.id = id;
  }

}
