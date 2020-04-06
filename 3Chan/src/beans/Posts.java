package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Posts 
{
	List<Post> posts = new ArrayList<Post>();
	
	public Posts() 
	{
		
	}

	public List<Post> getOrders() 
	{
		return posts;
	}

	public void setOrders(List<Post> posts) 
	{
		this.posts = posts;
	}
	
	
}