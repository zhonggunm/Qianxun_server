package com.zhong.myapp.doc_service.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.zhong.myapp.doc_service.domain.models.News;

/**
 * @author claudioed on 14/11/17. Project cms
 */
public interface NewsRepository extends ReactiveMongoRepository<News,String> {
}