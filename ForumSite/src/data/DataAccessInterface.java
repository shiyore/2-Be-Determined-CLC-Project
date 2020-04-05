package data;

import java.util.List;

import beans.Post;

public interface DataAccessInterface 
{
	public List<Post> findAll();
	
	public boolean create(Post post);
	public boolean update(Post post);
	public boolean delete(Post post);
}
