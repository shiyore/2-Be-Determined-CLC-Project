package beans;

import java.util.HashSet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean
@ViewScoped
@XmlRootElement(name="Post")
public class Post
{
	
	private int ID = 0;
	@NotNull(message = "Titles are important, please don't leave this blank and make it less than 15 characters.")
	@Size(min=1,max=15)
    private String title = "";
	@NotNull(message = "Don't have an empty body of content for your post, you'll be boring! Maximum size is 300 characters")
	@Size(min=1,max=300)
    private String content = "";
    private String username ="";
    private int user_id = 0;
   
    public Post() 
    {
    	ID = 0;
        title = "Title";
        content = "Content";
        username = "Username";
        user_id = 1;
    }
    
    public Post(Integer ID) 
    {
    	this.ID = ID;
        title = "Title";
        content = "Content";
        username = "Username";
        user_id = 1;
    }
    
    public Post(String t, String c, int u) 
    {
        title = t;
        content = c;
        username = "uid found";
        user_id = u;
    }
    public Post(int id,String title, String content,int user_id)
    {
    	this.ID = id;
    	this.title = title;
    	this.content = content;
    	this.user_id = 1;
    }
    
    public Post(String t, String c)
    {
    	title = t;
    	content = c;
    	this.user_id = 1;
    }
    
    public void setID(HashSet id) {
        this.ID = (int)id.toArray()[0];
    }

	public String getUsername()
	{
		return username;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getUserID()
	{
		return user_id;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void setContent(String c)
	{
		this.content = c;
	}
	
	public void setTitle(String t)
	{
		this.title = t;
	}
	
	public void setUsername(String n)
	{
		this.username = n;
	}

    

}