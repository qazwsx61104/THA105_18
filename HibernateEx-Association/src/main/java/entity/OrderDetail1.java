package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetail1")
public class OrderDetail1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Integer id;
	
	// fetch 預設為 EAGER
	@ManyToOne
	@JoinColumn(name = "bid", referencedColumnName = "id")
	private Book book;
	
	// fetch 預設為 EAGER
	@ManyToOne
	@JoinColumn(name = "oid", referencedColumnName = "id")
	private OrderMaster orderMaster;
	
	@Column(name = "amount")
	private Integer amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public OrderMaster getOrderMaster() {
		return orderMaster;
	}

	public void setOrderMaster(OrderMaster orderMaster) {
		this.orderMaster = orderMaster;
	}
	
}
