package com.hades.es.web.sys.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hades.es.common.entity.BaseEntity;

@Entity
@Table(name = "sys_role")
public class Role extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 前端显示名称
	 */
	private String name;
	
	/**
	 * 系统中验证时使用的角色标识
	 */
	private String role;
	
	/**
	 * 详细描述
	 */
	private String description;
	
	/**
	 * 是否显示/可用
	 */
	private Boolean show = Boolean.FALSE;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}
	
}
