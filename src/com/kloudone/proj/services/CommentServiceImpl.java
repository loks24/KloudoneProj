package com.kloudone.proj.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.dao.CommentDAO;
import com.kloudone.proj.dao.JPADAO;
import com.kloudone.proj.entity.CommentEntity;
import com.kloudone.proj.entity.PostEntity;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentDAO commentdao;
	@Autowired
	JPADAO jpadao;
	
	@Override
	public CommentBean updateComment(CommentBean commentbean) {
		CommentEntity commententity=new CommentEntity();
		BeanUtils.copyProperties(commentbean, commententity);
		CommentEntity commententity1=commentdao.updatecomment(commententity);
		return commentbean;
	}

	@Override
	public List<CommentBean> getcommentlist() {
		// TODO Auto-generated method stub
		List<CommentEntity> list=jpadao.getComments();
		List <CommentBean> li=new ArrayList<CommentBean>();
		for(CommentEntity en:list)
		{
			CommentBean cb=new CommentBean();
			BeanUtils.copyProperties(en, cb);
			li.add(cb);
		}
		return li;
	}

//	@Override
//	public CommentBean updatepost(Long postid) {
//		// TODO Auto-generated method stub
//		PostBean postbean=new PostBean();
//		PostEntity postenetity=new PostEntity();
////		String postid1=Long.toString(postid);
//		postenetity=jpadao.getPostbyid(postid);
//		BeanUtils.copyProperties(postenetity, postbean);
//		CommentBean commentbean=new CommentBean();
//		commentbean=commentdao.updatebypost(postbean);
//		return commentbean;
//	}

}
