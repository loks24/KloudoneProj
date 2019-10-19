package com.kloudone.proj.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "body", columnDefinition = "TEXT")
    @NotEmpty(message = "*Please write something")
    private String body;

//    @ManyToOne
//    @JoinColumn(name = "post_id", referencedColumnName = "post_id", nullable = false)
//    private PostEntity post;
    
    @Column(name="post_id")
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