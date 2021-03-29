package com.koushik.mvc.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomValidator implements ConstraintValidator<PanCode, String>{
	
	private String panPrefix;
	
	@Override
	public void initialize(PanCode constraintAnnotation) {
//		ConstraintValidator.super.initialize(constraintAnnotation);
		panPrefix = constraintAnnotation.value();
		System.out.println("Pan Prefix is: "+panPrefix);
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean result;
		if(arg0 != null) {
			result = arg0.startsWith(panPrefix);
		}else {
			result = true;
		}
		return result;
	}

}
