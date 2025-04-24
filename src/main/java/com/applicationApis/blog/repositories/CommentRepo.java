package com.applicationApis.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationApis.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
