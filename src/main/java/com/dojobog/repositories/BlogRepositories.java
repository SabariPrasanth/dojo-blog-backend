package com.dojobog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dojobog.entity.Blog;

@Repository
public interface BlogRepositories extends JpaRepository<Blog, Long>{

}
