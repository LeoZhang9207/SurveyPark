package com.hitpoint.surveypark.service;

import com.hitpoint.surveypark.model.User;

public interface UserService extends BaseService<User> {
	/**
	 * �ж�email�Ƿ�ռ��
	 */
	boolean isRegisted(String email);
	
}	
