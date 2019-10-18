package com.kloudone.proj.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.dao.JPADAO;
import com.kloudone.proj.dao.PostDAO;
import com.kloudone.proj.entity.PostEntity;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostDAO postdao;
	@Autowired
	private JPADAO jpadao;
	@Override
	public PostBean updatePost(PostBean postbean) {
		// TODO Auto-generated method stub
		PostEntity postentity=new PostEntity();
		BeanUtils.copyProperties(postbean, postentity);
		PostEntity postentity1=postdao.updatePost(postentity);
		return postbean;
	}
	@Override
	public List<PostBean> getpostlist() {
		// TODO Auto-generated method stub
		List<PostEntity> list=jpadao.getPosts();
		List <PostBean> li=new ArrayList<PostBean>();
		for(PostEntity en:list)
		{
			PostBean pb=new PostBean();
			BeanUtils.copyProperties(en, pb);
			li.add(pb);
		}
		return li;
	}

}
