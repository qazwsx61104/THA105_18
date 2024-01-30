package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookisbn")
public class BookIsbn {
	@Id
	@Column(name = "bid")
	private Integer bid;
	
	// fetch 預設為 EAGER
	@OneToOne
	@MapsId // 代表關聯的Book ID也同時是自己的ID
	@JoinColumn(name = "bid", referencedColumnName = "id")
	private Book book;
	
	@Column(name = "isbn")
	private String isbn;
	
	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Category [isbn=" + isbn + "]";
	}

}
