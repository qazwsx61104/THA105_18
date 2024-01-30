package entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empno", updatable = false)
	private Integer empno;

	@Column(name = "ename")
	private String ename;

	@Column(name = "job")
	private String job;

	@Column(name = "hiredate")
	private Date hiredate;

	@Column(name = "sal")
	private BigDecimal sal;

	@Column(name = "comm")
	private BigDecimal comm;

	// fetch 預設為 EAGER
	@ManyToOne
	@JoinColumn(name = "empdeptno", referencedColumnName = "deptno")
	private Dept dept;
	
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getComm() {
		return comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + "]";
	}
	
	
}
