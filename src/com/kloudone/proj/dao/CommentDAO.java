package com.kloudone.proj.dao;


import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.entity.CommentEntity;


public interface CommentDAO {
	
	public CommentEntity updatecomment(CommentEntity commententity);

//	public CommentBean updatebypost(PostBean postbean);

}
