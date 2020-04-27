package business;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import beans.Post;

@RequestScoped
@Path("/posts")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class PostRestService {
	
	@Inject
	PostBusinessInterface service;
	
	@GET
	@Path("/getjson")
	@Produces (MediaType.APPLICATION_JSON)
	public List<Post> getPosts(){
		return service.getPosts();
	}
	
	@GET
	@Path("/deletePost/{id}")
	@Produces (MediaType.APPLICATION_JSON)
	public Response deletePost(@PathParam("id") Integer id){
		List<Post> posts = service.getPosts();
		boolean found = false;
		for(Post post: posts) {
			if(post.getID() == id)
				found = true;
		}
		if(found) {
			service.deletePost(new Post(id));
			String message = "The post has been found and deleted";
		 
			return Response
					.status(Response.Status.OK)
					.entity(message)
					.type(MediaType.TEXT_PLAIN)
					.build();
		}
		else {
			String message = "No post found with ID: " + id;
			 
		    return Response
		      .status(Response.Status.OK)
		      .entity(message)
		      .type(MediaType.TEXT_PLAIN)
		      .build();
		}

		
	}
}
