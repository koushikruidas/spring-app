package com.koushik.mvc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyCustomValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PanCode {

	public String value() default "KOU";
	public String message() default "Must start with KOU";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
