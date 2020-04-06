package beans;

import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Named
@ViewScoped
@Model
public class CalculatorModel {
	
    double firstOperand = 0;
    double secondOperand = 0;
	double result = 0;
    
    public CalculatorModel() {
    	firstOperand = 3.09;
    	secondOperand = 5.08;
    }

	public double getFirstOperand() {
		return firstOperand;
	}

	public void setFirstOperand(double firstOperand) {
		this.firstOperand = firstOperand;
	}

	public double getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(double secondOperand) {
		this.secondOperand = secondOperand;
	}
	
	//Operations
	public double add() {
		return result;
	}
	public double subtract() {
		return result;
	}
	public double multiply() {
		if(firstOperand>0)
			result = firstOperand / secondOperand;
		else {
			result = 0;
			System.out.println("Not a valid first operand");
		}
		return result;
	}
	public double divide() {
		return result;
	}

   

}