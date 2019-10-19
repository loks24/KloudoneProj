package com.kloudone.proj.services;



import java.util.List;

import com.kloudone.proj.bean.CommentBean;

public interface CommentService {
	
	public CommentBean updateComment(CommentBean commentbean);

	public List<CommentBean> getcommentlist();

//	public CommentBean updatepost(Long postid);

}
