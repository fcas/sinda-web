package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "dataValidator")
public class ValidatorData implements Validator {
	
	private int[] quebraData(String dataString) {
		String[] aux = dataString.split("/");
		int[] dataInt = new int[3];
		for (int i = 0; i < 3; i++) {
			dataInt[i] = Integer.parseInt(aux[i]);

		}
		return dataInt;
	}

	private boolean checaData(int[] dataInt) {
		int dia = dataInt[0];
		int mes = dataInt[1];
		int ano = dataInt[2];
		boolean bissexto = false;
		if (ano >= 1896 && ano <= 2020) { // se for um ano valido
			if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) { // se for bissexto
				bissexto = true;
			}

			if (mes >= 1 && mes <= 12) { // se for um mes valido

				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
						|| mes == 10 || mes == 12) { // se for um mes com 31 dias
					if (dia >= 1 && dia <= 31) { // se tiver 31 dias
						return true;
					}
				} else

					if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // se for
						// um mes com 30 dias
						if (dia >= 1 && dia <= 30) { // se tiver ate 30 dias
							return true;
						}
					} else

						if (mes == 2) { // se for o mes 2
							if (bissexto) { // se for bissexto
								if (dia >= 1 && dia <= 29) { // se tem ate 29 dias
									return true;
								}
							} else { // se nao for bissexto
								if (dia >= 1 && dia <= 28) { // se tem ate 28 dias
									return true;
								}
							}
						}
			}

		}
		return false;
	}


	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		  String data = String.valueOf(value);
		    boolean valid = true;
		    
		    if (data != null
					&& !data.isEmpty()) {
				if (!(checaData(quebraData(data)))) {
					valid = false;
				}
			}

			if (!valid) {
	            FacesMessage message = new FacesMessage(
	                    FacesMessage.SEVERITY_ERROR, "Data inválida", "Insira uma data válida");
	            throw new ValidatorException(message);
	        }
		
	}

}
