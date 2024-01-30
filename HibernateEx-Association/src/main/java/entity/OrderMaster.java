package entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "ordermaster")
public class OrderMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Integer id;
	
	@Column(name = "uid")
	private Integer uid;
	
	@Column(name = "ordertime", insertable = false, updatable = false)
	private Timestamp ordertime;
	
	// fetch 預設為 LAZY
	@OneToMany(mappedBy = "orderMaster", cascade = CascadeType.ALL)
	@OrderBy("id asc")
	private Set<OrderDetail1> details;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Timestamp getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	public Set<OrderDetail1> getDetails() {
		return details;
	}

	public void setDetails(Set<OrderDetail1> details) {
		this.details = details;
	}

}
