package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Post;
import business.PostBusinessInterface;


@ManagedBean
@ViewScoped
public class DeletePostController {
	
	@Inject 
	PostBusinessInterface service;
	
	public String onSubmit(Post post) {
		
		service.test();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);
		return "DeletedPost.xhtml";		
	}
	
	public PostBusinessInterface getService()
	{
		return service;
	}
}
