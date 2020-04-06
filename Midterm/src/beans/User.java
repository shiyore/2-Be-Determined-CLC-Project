package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	@NotNull(message = "You FOOL..... You triggered my trap card by not entering the first name, allowing me to place any card from my deck. I place the card POT OF GREED!")
	@Size(min=4,max=15)
    String firstName = "";
	@NotNull(message = "You FOOL..... You triggered my trap card by not entering the last name, allowing me to place any card from my deck. I place the card POT OF GREED!")
	@Size(min=4,max=15)
    String lastName = "";
    
    public User() {
        firstName = "Aiden";
        lastName = "Yoshioka";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}