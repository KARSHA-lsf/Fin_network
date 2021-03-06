package com.finnetwork.models;// default package
// Generated Sep 13, 2017 10:47:25 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * FeiiiInitData generated by hbm2java
 */
@Entity
@Table(name = "feiii_init_data", catalog = "fin_network")
public class FeiiiInitData implements java.io.Serializable {

	private Integer relationId;
	private Integer fillingData;
	private String fillerName;
	private String mentionedEntity;
	private String role;
	private Integer roleId;

	public FeiiiInitData() {
	}

	public FeiiiInitData(Integer fillingData, String fillerName,
			String mentionedEntity, String role, Integer roleId) {
		this.fillingData = fillingData;
		this.fillerName = fillerName;
		this.mentionedEntity = mentionedEntity;
		this.role = role;
		this.roleId = roleId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "relation_id", unique = true, nullable = false)
	public Integer getRelationId() {
		return this.relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	@Column(name = "filling_data")
	public Integer getFillingData() {
		return this.fillingData;
	}

	public void setFillingData(Integer fillingData) {
		this.fillingData = fillingData;
	}

	@Column(name = "filler_name")
	public String getFillerName() {
		return this.fillerName;
	}

	public void setFillerName(String fillerName) {
		this.fillerName = fillerName;
	}

	@Column(name = "mentioned_entity")
	public String getMentionedEntity() {
		return this.mentionedEntity;
	}

	public void setMentionedEntity(String mentionedEntity) {
		this.mentionedEntity = mentionedEntity;
	}

	@Column(name = "role")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "role_id")
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
