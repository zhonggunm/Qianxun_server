package com.zhong.myapp.doc_service.domain.models;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
@Document(collection = "news")
public class News {

  @Id
  String id;

  String title;

  String content;

  User author;

  Set<User> mandatoryReviewers = new HashSet<>();

  Set<Review> reviewers = new HashSet<>();

  Set<Category> categories = new HashSet<>();

  Set<Tag> tags = new HashSet<>();

  public Boolean revised() {
    return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
        .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
  }

  public Review review(String userId,String status){
    final Review review = new Review(userId, status);
    this.reviewers.add(review);
    return review;
  }

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

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

public User getAuthor() {
	return author;
}

public void setAuthor(User author) {
	this.author = author;
}

public Set<User> getMandatoryReviewers() {
	return mandatoryReviewers;
}

public void setMandatoryReviewers(Set<User> mandatoryReviewers) {
	this.mandatoryReviewers = mandatoryReviewers;
}

public Set<Review> getReviewers() {
	return reviewers;
}

public void setReviewers(Set<Review> reviewers) {
	this.reviewers = reviewers;
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