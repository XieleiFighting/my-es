package com.hades.es.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.apache.commons.lang3.builder.HashCodeBuilder;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseEntity implements Comparable<BaseEntity>, Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "create_time", nullable = false)
	private Date createTime;
	
	@Column(name = "update_time", nullable = false)
	private Date updateTime;
	
	@PrePersist
	public void prePersist() {
		createTime = updateTime = new Date();
	}
	
	@PreUpdate
	public void preUpdate() {
		updateTime = new Date();
	}
	
	@Override
	public int compareTo(BaseEntity o) {
		return this.getId().compareTo(o.getId());
	}
	
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass())
			return false;
		return this.getId().equals(((BaseEntity) other).getId());
	}
	
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
