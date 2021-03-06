package com.pinyougou.pojo;

/**
 * SpecificationOption 实体类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018-07-25 08:44:21
 * @version 1.0
 */
public class SpecificationOption implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String optionName;
	private Long specId;
	private Integer orders;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setOptionName(String optionName){
		this.optionName = optionName;
	}
	public String getOptionName(){
		return this.optionName;
	}
	public void setSpecId(Long specId){
		this.specId = specId;
	}
	public Long getSpecId(){
		return this.specId;
	}
	public void setOrders(Integer orders){
		this.orders = orders;
	}
	public Integer getOrders(){
		return this.orders;
	}

}