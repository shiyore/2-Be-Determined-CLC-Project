package controllers;

import beans.User;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.swing.Timer;

import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {
	//User user;
	@Inject
	OrdersBusinessInterface service;
	@EJB
	MyTimerService timer;
	public String onSubmit(User user) {
		//Forward to Test Response View along with the User Managed Bean
		service.test();
		
		timer.setTimer(10000);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	public OrdersBusinessInterface getService() {
		return service;
	}
	
}
