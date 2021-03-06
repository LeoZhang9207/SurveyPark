package com.hitpoint.surveypark.service;

import java.util.List;
/**
 * 基本的service接口
 * @author leo.zhang
 *
 * @param <T>
 */
public interface BaseService<T> {
	//写操作
	public void saveEntity(T t);
	public void saveOrUpdateEntity(T t);
	public void updateEntity(T t);
	public void deleteEntity(T t);
	public void batchEntityByHQL(String hql,Object...objects);
	
	//读操作
	public T loadEntity(Integer id);
	public T getEntity(Integer id);
	public List<T> findEntityByHQL(String hql,Object...objects);
}
