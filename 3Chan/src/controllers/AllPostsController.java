package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Post;
import business.PostBusinessInterface;
import business.PostBusinessService;

@ManagedBean
@ViewScoped
public class AllPostsController {
	
	@Inject PostBusinessService service;
	
	public String onSubmit(Post post) {
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);
		return "ViewAllPosts.xhtml";		
	}
}
