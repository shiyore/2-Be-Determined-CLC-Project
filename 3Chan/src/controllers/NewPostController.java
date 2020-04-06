package controllers;

import beans.Post;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class NewPostController {
	
	public String onSubmit(Post post) {
		//Forward to Test Response View along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);
		return "NewPostMade.xhtml";
	}
	
}
