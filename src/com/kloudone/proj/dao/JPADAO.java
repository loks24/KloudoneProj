package com.kloudone.proj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kloudone.proj.entity.PostEntity;

public interface JPADAO extends JpaRepository<PostEntity,String>{
	
	@Query("select k from PostEntity k")
	public List<PostEntity> getPosts();
	@Query("select k from PostEntity k where k.id=?1")
	public PostEntity getPostbyid(Long post_id);

}
