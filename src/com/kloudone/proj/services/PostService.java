package com.kloudone.proj.services;


import java.util.List;

import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.entity.PostEntity;

public interface PostService {
	
	public PostBean updatePost(PostBean postbean);

	public List<PostBean> getpostlist();
	
}
