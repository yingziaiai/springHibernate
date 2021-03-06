package com.springHibernate.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "acct_user", catalog = "springhibernate")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AcctUser implements Serializable {

	private String id;
	private String nickName;
	private String telephone;
	private Date registerTime;
	/***/
//	private Set<AcctRole> acctRoles = new HashSet<AcctRole>(0);

	public AcctUser() {

	}

	public AcctUser(String id, String nickName) {
		this.id = id;
		this.nickName = nickName;
	}

	public AcctUser(String id, String nickName, String telephone,
			Date registerTime, Set<AcctRole> acctRoles) {
		this.id = id;
		this.nickName = nickName;
		this.telephone = telephone;
		this.registerTime = registerTime;
//		this.acctRoles = acctRoles;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "nick_name", nullable = false)
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_time", length = 19)
	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

//	@JsonIgnoreProperties(value = { "acctUsers", "acctAuthorities" })
//	@ManyToMany(fetch = FetchType.LAZY)
//	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//	@JoinTable(name = "acct_user_role", catalog = "springhibernate", joinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) })
//	public Set<AcctRole> getAcctRoles() {
//		return this.acctRoles;
//	}
//
//	public void setAcctRoles(Set<AcctRole> acctRoles) {
//		this.acctRoles = acctRoles;
//	}

}
