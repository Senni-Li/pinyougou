package com.pinyougou.pojo;

/**
 * TypeTemplate 实体类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018-07-25 08:44:21
 * @version 1.0
 */
public class TypeTemplate implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String specIds;
	private String brandIds;
	private String customAttributeItems;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSpecIds(String specIds){
		this.specIds = specIds;
	}
	public String getSpecIds(){
		return this.specIds;
	}
	public void setBrandIds(String brandIds){
		this.brandIds = brandIds;
	}
	public String getBrandIds(){
		return this.brandIds;
	}
	public void setCustomAttributeItems(String customAttributeItems){
		this.customAttributeItems = customAttributeItems;
	}
	public String getCustomAttributeItems(){
		return this.customAttributeItems;
	}

}