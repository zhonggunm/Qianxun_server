package com.zhong.myapp.doc_service.domain.service;

import org.springframework.stereotype.Service;

import com.zhong.myapp.doc_service.domain.repository.NewsRepository;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Service
public class NewsService {

  private final NewsRepository newsRepository;

  public NewsService(NewsRepository newsRepository) {
    this.newsRepository = newsRepository;
  }

}
