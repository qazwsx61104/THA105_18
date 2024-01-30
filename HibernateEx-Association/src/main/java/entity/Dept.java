package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "department")
public class Dept {
	@Id
	@Column(name = "deptno", updatable = false)
	private Integer deptno;

	@Column(name = "dname")
	private String dname;

	@Column(name = "loc")
	private String loc;

	// fetch 預設為 LAZY
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	@OrderBy("empno asc")   // 多筆資料的排序
	private Set<Emp> emps;   //不重複

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

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}