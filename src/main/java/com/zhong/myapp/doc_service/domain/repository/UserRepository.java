package com.zhong.myapp.doc_service.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.zhong.myapp.doc_service.domain.models.User;

/**
 * @author claudioed on 29/10/17. Project cms
 */
public interface UserRepository extends ReactiveMongoRepository<User,String> {}
