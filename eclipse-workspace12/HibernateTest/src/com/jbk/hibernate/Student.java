package com.jbk.hibernate;
// Generated Apr 23, 2020 11:49:24 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "test123")
public class Student implements java.io.Serializable {

	private Integer sid;
	private String sname;
	private int scontactno;

	public Student() {
	}

	public Student(String sname, int scontactno) {
		this.sname = sname;
		this.scontactno = scontactno;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sid", unique = true, nullable = false)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Column(name = "sname", nullable = false, length = 45)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "scontactno", nullable = false)
	public int getScontactno() {
		return this.scontactno;
	}

	public void setScontactno(int scontactno) {
		this.scontactno = scontactno;
	}

}
