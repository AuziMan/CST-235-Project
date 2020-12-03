package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import Business.BusinessInterface;
import Business.BusinessService;
import beans.User;

@ManagedBean
@ViewScoped
public class formController {

	@Inject
	BusinessInterface services;

    // When the submit button go through 
	public String onSubmit() {
		// Get user managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

        // prints a test message from the business service layer
		services.test();
        
		// Forward to Test Response view along with the user managed bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "LoginResponse.xhtml";
	}

	public String onSubmitsignin() {
        // Get user managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

		// Forward to Test Response view along with the user managed bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "SigninResponse.xhtml";
	}

	public BusinessInterface getservice() {
		return services;
	}
}
