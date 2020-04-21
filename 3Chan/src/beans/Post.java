package beans;

import java.util.HashSet;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class Post
{
	private int ID = 0;
    private String title = "";
    private String content = "";
    private String username ="";
    private int userID = 0;
    public Post() 
    {
        title = "Temp";
        content = "Temp";
        username = "temp";
    }
    
    public Post(String t, String c, int u , int postID) 
    {
        title = t;
        content = c;
        username = "uid found";
        userID = u;
        ID = postID;
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
		return userID;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void setContent(String c)
	{
		this.content = c;
	}
	
	public void setTitle(String title)
	{
		System.out.println(title.substring(1,title.length()-1));

		this.title = title.substring(1,title.length()-1);
	}
	
	public void setUsername(String n)
	{
		this.username = n;
	}
	
	public void setID(HashSet id) {
		this.ID = (int	)id.toArray()[0];
	}

    

}