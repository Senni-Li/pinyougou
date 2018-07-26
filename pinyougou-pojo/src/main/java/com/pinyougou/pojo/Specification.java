package com.pinyougou.pojo;

/**
 * Specification 实体类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018-07-25 08:44:21
 * @version 1.0
 */
public class Specification implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String specName;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setSpecName(String specName){
		this.specName = specName;
	}
	public String getSpecName(){
		return this.specName;
	}

}