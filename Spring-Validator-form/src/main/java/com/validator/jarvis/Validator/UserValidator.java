package com.validator.jarvis.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.InitBinder;

import com.validator.jarvis.Model.User;

public class UserValidator implements Validator
{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.isAssignableFrom(User.class);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
			ValidationUtils.rejectIfEmpty(errors, "name","name.required" );
			ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required");
			ValidationUtils.rejectIfEmpty(errors, "mobile", "mobile.required");
			
			
	}

	

}
