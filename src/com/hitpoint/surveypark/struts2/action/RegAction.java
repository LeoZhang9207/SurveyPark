package com.hitpoint.surveypark.struts2.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hitpoint.surveypark.model.User;

@Controller
@Scope("prototype")//表示action是原型bean
public class RegAction extends BaseAction<User> {
	/**
	 * 用于反序列化
	 */
	private static final long serialVersionUID = 6354516232060456701L;
	private User model;
		
	public User getModel() {
		return model;
	}

	public String toRegPage(){
		return "regPage";
	}
}
