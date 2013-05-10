package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "emailValidator")
public class ValidatorEmail implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
	    String email = String.valueOf(value);
	    boolean valid = true;
	
		if (!(email.contains("@"))
				|| email.isEmpty()
				|| email == null) {
			valid = false;
		}	
		
		if (!valid) {
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Email inválido", "Insira um email válido");
            throw new ValidatorException(message);
        }
		
	}

}
