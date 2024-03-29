package com.kloudone.proj.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.entity.CommentEntity;
import com.kloudone.proj.entity.PostEntity;
import com.kloudone.proj.entity.ReplyEntity;

@Repository
public class CommentDAOImpl implements CommentDAO{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public CommentEntity updatecomment(CommentEntity commententity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		try {
			et.begin();
			entityManager.persist(commententity);
			et.commit();
//			et.begin();
//			PostEntity postentity=commententity.getPost();
//			ArrayList<CommentEntity> al=new ArrayList<CommentEntity>();
//			al.add((CommentEntity) postentity.getComments());
//			postentity.setComments(al);
//			entityManager.merge(postentity);
//			et.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return commententity;
	}

	@Override
	public ReplyEntity updatereply(ReplyEntity replyentity) {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		try {
			et.begin();
			entityManager.persist(replyentity);
			et.commit();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return replyentity;
	}

//	@Override
//	public CommentBean updatebypost(PostBean postbean) {
//		// TODO Auto-generated method stub
//		CommentBean commentbean=new CommentBean();
//		commentbean.setPost(postbean);
//		return commentbean;
//	}

}
