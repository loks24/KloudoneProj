package com.kloudone.proj.bean;


public class CommentBean {

    private Long id;
    private String body;
//    private PostBean post;
    private Long postid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

	public Long getPostid() {
		return postid;
	}

	public void setPostid(Long postid) {
		this.postid = postid;
	}

 

}