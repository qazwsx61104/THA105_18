package com.tibame.hellohibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")  //如果類別名稱 = table名稱 可以省略
public class Dept {
   @Id
//   @Column(name = "deptno")  //如果變數名稱 = table欄位名稱 可以省略
	private Integer deptno;
   
//   @Column(name = "dname") //如果變數名稱 = table欄位名稱 可以省略
	private String dname;
   
//   @Column(name = "loc")  //如果變數名稱 = table欄位名稱 可以省略
	private String loc;
	
	

	public Dept() {
		super();
	}

	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
