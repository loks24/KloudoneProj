package com.kloudone.proj.dao;


import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.entity.CommentEntity;
import com.kloudone.proj.entity.ReplyEntity;


public interface CommentDAO {
	
	public CommentEntity updatecomment(CommentEntity commententity);

	public ReplyEntity updatereply(ReplyEntity replyentity);

//	public CommentBean updatebypost(PostBean postbean);

}
