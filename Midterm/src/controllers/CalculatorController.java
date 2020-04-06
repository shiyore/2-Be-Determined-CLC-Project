package controllers;

import beans.CalculatorModel;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import business.CalculatorInterface;
import business.CalculatorService;
//import business.MyTimerService;

@ManagedBean
@ViewScoped
public class CalculatorController {
	CalculatorModel calc;
	@Inject
	CalculatorInterface service;

	//MyTimerService timer;
	public String onSubmit(CalculatorModel calc) {
		//Forward to Test Response View along with the User Managed Bean
		service.test();
		
		
		//timer.setTimer(10000);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("CalculatorModel", calc);
		return "CalculatorResultView.xhtml";
	}
	
	public CalculatorInterface getService() {
		return service;
	}
	
}
