package controllers;

import beans.User;
import business.UserBusinessService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class LoginController {
	//User user;
		@Inject
		UserBusinessService service;
		@EJB
	
	public String onSubmit(User user) {
		//Forward to Test Response View along with the User Managed Bean
		service.test();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "LoginResponse.xhtml";
	}
	
}
