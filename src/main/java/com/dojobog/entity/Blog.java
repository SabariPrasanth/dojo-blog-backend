package com.dojobog.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Blog")
public class Blog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String body;
private String author;
private String title;


public Blog(String title, String body, String author) {
	super();
	this.title = title;
	this.body = body;
	this.author = author;
}

public Blog() {
	super();
	
}
@Override
public String toString() {
	return "Blog [id=" + id + ", title=" + title + ", body=" + body + ", author=" + author + "]";
}
@Override
public int hashCode() {
	return Objects.hash(author, body, id, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Blog other = (Blog) obj;
	return Objects.equals(author, other.author) && Objects.equals(body, other.body) && id == other.id
			&& Objects.equals(title, other.title);
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}
