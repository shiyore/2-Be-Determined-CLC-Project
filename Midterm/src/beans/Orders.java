package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {
	List<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		orders.add(new Order("00000002" , "Silver Monkey" , (float)1.00 , 1));
		orders.add(new Order("00000014" , "Dirty Handsoap" , (float)13.00 , 197));
		orders.add(new Order("00005023" , "A clove of garlic" , (float)900.23 , 1));
		orders.add(new Order("00000432" , "A Shaq\'s fist full of misc. candy" , (float)47.95 , 3));
		orders.add(new Order("00000300" , "Snicker Bar" , (float)27.40 , 58));
		orders.add(new Order("00006723" , "A 13mm mouse" , (float)0.57 , 3));
		orders.add(new Order("00302049" , "A small lump of hair" , (float)2.00 , 800));
		orders.add(new Order("00003051" , "A cup of spit" , (float)56.29 , 6));
		orders.add(new Order("00000230" , "A mysterious finger" , (float)98.20 , 4));
		orders.add(new Order("00000782" , "A turtle with a straw in it\'s nose" , (float)6.38 , 89));
		
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
