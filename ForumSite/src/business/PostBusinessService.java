package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Post;
import beans.User;

/**
 * This is our EJB for users
 */
@Stateless
@Local(PostBusinessService.class)
@LocalBean
@Alternative
public class PostBusinessService{

    /**
     * Default constructor. 
     */
	Post post;
    public PostBusinessService() {
        // TODO Auto-generated constructor stub
    	post = new Post();
    	
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("Hello from the other side");
    }

    //the usual getters and setters
    public void setUsername(String name) 
    {
		post.setUsername(name);
	}
    
    public void setTitle(String pword) 
    {
		post.setTitle(pword);
	}
    
    public void setContent(String c)
    {
    	post.setContent(c);
    }
    
    public String getUsername() 
    {
		return post.getUsername();
	}
    
    public String getTitle() 
    {
		return post.getTitle();
	}
    public String getContent()
    {
    	return post.getContent();
    }

}