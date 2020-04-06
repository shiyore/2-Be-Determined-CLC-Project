package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class Post
{
	@NotNull(message = "Your title must be between 1 and 35 characters")
	@Size(min=1, max=35)
	String title = "";
	@NotNull(message = "Every post must have at least a little in the body!")
	@Size(min=2, max=300)
	String content = "";
    String username ="";
    int uid = 0;
    public Post() 
    {
        title = "Temp";
        content = "Temp";
        username = "temp";
        uid = 1;
    }
    
    public Post(String t, String c, int u) 
    {
        title = t;
        content = c;
        username = "uid found";
        uid = u;
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
	
	public int getUID()
	{
		return uid;
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