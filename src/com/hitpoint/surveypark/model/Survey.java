package com.hitpoint.surveypark.model;

import java.util.Date;

public class Survey {
	private Integer id;
	private String title = "δ����";
	private String preText = "��һ��";
	private String nextText = "��һ��";
	private String exitText = "�˳�";
	private String doneText = "���";
	private Date createTime = new Date();
	//������survey��user֮����1�Ĺ�����ϵ
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	//logo·��
	private String logoPhotoPath;
	
	//���ҳ��
	private String maxOrderno;
	//��Сҳ��
	private String minOrderno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPreText() {
		return preText;
	}
	public void setPreText(String preText) {
		this.preText = preText;
	}
	public String getNextText() {
		return nextText;
	}
	public void setNextText(String nextText) {
		this.nextText = nextText;
	}
	public String getExitText() {
		return exitText;
	}
	public void setExitText(String exitText) {
		this.exitText = exitText;
	}
	public String getDoneText() {
		return doneText;
	}
	public void setDoneText(String doneText) {
		this.doneText = doneText;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getLogoPhotoPath() {
		return logoPhotoPath;
	}
	public void setLogoPhotoPath(String logoPhotoPath) {
		this.logoPhotoPath = logoPhotoPath;
	}
	public String getMaxOrderno() {
		return maxOrderno;
	}
	public void setMaxOrderno(String maxOrderno) {
		this.maxOrderno = maxOrderno;
	}
	public String getMinOrderno() {
		return minOrderno;
	}
	public void setMinOrderno(String minOrderno) {
		this.minOrderno = minOrderno;
	}
	
}