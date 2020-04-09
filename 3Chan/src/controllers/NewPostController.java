package controllers;

import beans.Post;
import beans.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
//import javax.swing.Timer;


import business.UserBusinessInterface;

@ManagedBean
@ViewScoped
public class NewPostController {
	//User user;
	@Inject
	UserBusinessInterface service;

	
	public String onSubmit(Post post) {
		//Forward to Test Response View along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("post", post);
		return "NewPostMade.xhtml";
	}
	
}
