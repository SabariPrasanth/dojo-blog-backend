package com.dojobog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dojobog.entity.Blog;
import com.dojobog.repositories.BlogRepositories;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/blog")

public class DojoBlogController {
	@Autowired
	private BlogRepositories blog;
	
	@GetMapping
	public List<Blog> getAllusers(){
		return this.blog.findAll();
	}

	@GetMapping("/{id}")
	public Blog getUserById(@PathVariable (value = "id")long userId) {
		System.out.println(userId);
		return this.blog.findById(userId).orElse(null);
		
	}

	//create user
		@PostMapping
		public Blog createUser(@RequestBody Blog blog) {
			return this.blog.save(blog);
		}
		
	
		
		// delete user by id
		@DeleteMapping("/{id}")
		public ResponseEntity<Blog> deleteUser(@PathVariable ("id") long userId){
			 Blog existingBlog = this.blog.findById(userId).orElse(null);
			 this.blog.delete(existingBlog);
			 return ResponseEntity.ok().build();
		}

}
