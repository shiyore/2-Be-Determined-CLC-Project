package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Post;
import beans.User;
import data.PostDataService;

/**
 * This is our EJB for users
 */
@Stateless
@Local(PostBusinessInterface.class)
@LocalBean
public class PostBusinessService implements PostBusinessInterface{
	


    /**
     * Default constructor. 
     */
	Post post;
    public PostBusinessService() {
        // TODO Auto-generated constructor stub
    	post = new Post();
    	
    }
    
    public List<Post> getAllPosts()
    {
    	List<Post> posts = new ArrayList<Post>();
    	
    	PostDataService service = new PostDataService();
    	
    	posts = service.findAll();
    	
    	return posts;
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

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosts(List<Post> posts) {
		// TODO Auto-generated method stub
		
	}

}