package com.zhong.myapp.doc_service.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.zhong.myapp.doc_service.domain.models.Category;

/**
 * @author claudioed on 29/10/17. Project cms
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}
