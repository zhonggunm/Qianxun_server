package com.zhong.myapp.doc_service.domain.vo;

import java.util.Set;

import com.zhong.myapp.doc_service.domain.models.Category;
import com.zhong.myapp.doc_service.domain.models.Tag;

import lombok.Data;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
public class NewsRequest {

  String title;

  String content;

  Set<Category> categories;

  Set<Tag> tags;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public Set<Category> getCategories() {
	return categories;
}

public void setCategories(Set<Category> categories) {
	this.categories = categories;
}

public Set<Tag> getTags() {
	return tags;
}

public void setTags(Set<Tag> tags) {
	this.tags = tags;
}

}
