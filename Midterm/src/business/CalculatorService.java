package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
import beans.Orders;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(CalculatorInterface.class)
@LocalBean
@Alternative
public class CalculatorService {

    /**
     * Default constructor. 
     */
	List<Order> orders = new ArrayList<Order>();
    public CalculatorService() {
        // TODO Auto-generated constructor stub
    	orders.add(new Order("00000002" , "Gold Monkey" , (float)1.00 , 1));
		orders.add(new Order("00000014" , "Dirty Handsoap" , (float)13.00 , 197));
		orders.add(new Order("00005023" , "A clove of garlic" , (float)900.23 , 1));
		orders.add(new Order("00000432" , "A Shaq\'s fist full of misc. candy" , (float)47.95 , 3));
		orders.add(new Order("00000300" , "Snicker Bar" , (float)27.40 , 58));
		orders.add(new Order("00006723" , "A 13mm mouse" , (float)0.57 , 3));
		orders.add(new Order("00302049" , "A small lump of hair" , (float)2.00 , 800));
		orders.add(new Order("00003051" , "A cup of spit" , (float)56.29 , 6));
		orders.add(new Order("00000230" , "A mysterious finger" , (float)98.20 , 4));
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("Hello from the other side");
    }

    public double getResult() {
    	return 35.8 * 92.4;
    }
    
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}


	public void setOrders(List<Orders> orders) {
		// TODO Auto-generated method stub
		
	}

}
