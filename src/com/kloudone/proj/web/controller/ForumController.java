package com.kloudone.proj.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.bean.ReplyBean;
import com.kloudone.proj.entity.PostEntity;
import com.kloudone.proj.services.CommentService;
import com.kloudone.proj.services.PostService;

@Controller
@SessionAttributes({"postbean"})
public class ForumController {
	
	@Autowired
	PostService postservice;
	@Autowired
	CommentService commentservice;
	
	@RequestMapping(value="forum.html",method = RequestMethod.GET)
	public ModelAndView post() {
		PostBean postbean=new PostBean();
		ModelAndView modelAndView=new ModelAndView("forum","PostBean",postbean);
		return modelAndView;
	}
	@RequestMapping(value="update.html",method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("PostBean") PostBean postbean,BindingResult result,ModelMap map)
	{
		ModelAndView modelandview=new ModelAndView();
		PostBean postbean1=postservice.updatePost(postbean);
		CommentBean commentbean =new CommentBean();
		modelandview.setViewName("display");
		modelandview.addObject("commentbean",commentbean);
		return modelandview;
	}
	@RequestMapping(value = "addcomment.html",method=RequestMethod.GET)
	public ModelAndView comment(@RequestParam("postid") Long postid)
	{
//		String postid=request.getParameter("id");
		ModelAndView modelanddview=new ModelAndView();
		CommentBean commentbean=new CommentBean();
//		commentbean=commentservice.updatepost(postid);
		modelanddview.setViewName("comment");
		modelanddview.addObject("commentbean", commentbean);
		modelanddview.addObject("postid",postid);
		return modelanddview;
	}
	
	
	@ModelAttribute("postlist")
	public List<PostBean> generateList()  {		
		List<PostBean> postlist =postservice.getpostlist();		
		return postlist;
	}
	
	@ModelAttribute("commentlist")
	public List<CommentBean> generateList1()
	{
		List<CommentBean> commentlist=commentservice.getcommentlist();
		return commentlist;
	}
	@ModelAttribute("replylist")
	public List<ReplyBean> generateList2()
	{
		List<ReplyBean> replylist=commentservice.getreplylist();
		return replylist;
	}
	
	@RequestMapping(value = "postcomment.html",method=RequestMethod.GET)
	public ModelAndView showPost(@RequestParam("postid") Long postid)
	{
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("postComment");
		modelandview.addObject("postid",postid);
		return modelandview;
	}
	@RequestMapping(value = "reply.html",method=RequestMethod.GET)
	public ModelAndView reply(@RequestParam("commentid") Long commentid)
	{
		ModelAndView modelandview=new ModelAndView();
		ReplyBean replybean=new ReplyBean();
		modelandview.setViewName("reply");
		modelandview.addObject("replybean",replybean);
		modelandview.addObject("commentid",commentid);
		return modelandview;
	}
	@RequestMapping(value = "replycomment.html",method=RequestMethod.POST)
	public ModelAndView replycomment(@ModelAttribute("replybean") ReplyBean replybean,BindingResult result)
	{
		ModelAndView modelandview =new ModelAndView();
		ReplyBean replybean1=commentservice.updateReply(replybean);
		modelandview.setViewName("display");
		modelandview.addObject("replybean",replybean);
		return modelandview;
	}
	@RequestMapping(value="comment.html",method=RequestMethod.POST)
	public ModelAndView comment(@ModelAttribute("commentbean") CommentBean commentbean,BindingResult result)
	{
		ModelAndView modelandview=new ModelAndView();
		CommentBean commentbean1=commentservice.updateComment(commentbean);
		modelandview.setViewName("display");
		modelandview.addObject("commentbean",commentbean);
		return modelandview;
	}
	@RequestMapping(value = "back.html")
	public ModelAndView back()
	{
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("display");
		return modelandview;
		
	}
	

}
