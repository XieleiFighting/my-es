package com.hades.es.web.sys.entity;

import javax.persistence.*;

import com.hades.es.common.entity.BaseEntity;
import com.hades.es.web.sys.entity.enums.UserStatus;

/**
 * <p>User: XieLei
 * <p>Date: 2016年10月17日 下午5:52:08
 * <p>Version: 1.0
 */
@Entity
@Table(name = "sys_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String username;
	
	private String email;
	
	@Column(name = "mobile_phone_number")
	private String mobilePhoneNumber;
	
	/**
     * 使用md5(username + original password + salt)加密存储
     */
	private String password;
	
	/**
     * 加密密码时使用的种子
     */
	private String salt;
	
	/**
     * 系统用户的状态
     */
	@Enumerated(EnumType.STRING)
	private UserStatus status = UserStatus.normal;
	
	/**
     * 是否是管理员
     */
	private Boolean admin = false;
	
	/**
     * 逻辑删除flag
     */
	private Boolean deleted = Boolean.FALSE;
	
	public User() {
    }

    public User(Long id) {
        setId(id);
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
    
}
