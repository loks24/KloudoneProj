package com.kloudone.proj.services;



import java.util.List;

import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.ReplyBean;

public interface CommentService {
	
	public CommentBean updateComment(CommentBean commentbean);

	public List<CommentBean> getcommentlist();

	public ReplyBean updateReply(ReplyBean replybean);

	public List<ReplyBean> getreplylist();

//	public CommentBean updatepost(Long postid);

}
