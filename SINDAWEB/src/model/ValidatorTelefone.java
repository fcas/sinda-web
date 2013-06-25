package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "telefoneValidator")
public class ValidatorTelefone implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		  	String telefone = String.valueOf(value);
		    boolean valid = true;

		if ((telefone.length() < 8)) {
			valid = false;
		}
		
		if (!valid) {
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Telefone", "Insira um telefone válido");
            throw new ValidatorException(message);
        }

		
	}

}
