package com.zhong.myapp.doc_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocServiceApplication {

  public static void main(String[] args) {
	  System.out.println("Doc service started!");
    SpringApplication.run(DocServiceApplication.class, args);
  }

}
