package entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "price")
	private BigDecimal price;
	
	// 因為 byte[] 會被 hibernate 視為 tinyblob 型別，所以跟DB裡的 longblob 不符，所以用 columnDefinition 定義
	@Column(name = "picture", columnDefinition = "longblob")
	private byte[] picture;
	
	// 因為 desc 在 MySQL 裡是個關鍵字，所以得用重音符號跳脫
	// 因為 String 會被 hibernate 視為 varchar 型別，所以跟DB裡的 longtext 不符，所以用 columnDefinition 定義
	@Column(name = "`desc`", columnDefinition = "longtext")
	private String desc;
	
	// fetch 預設為 EAGER
	@OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn // 代表 BookIsbn 的主鍵也同時是 Foreign Key
	private BookIsbn bookIsbn;
	
	// fetch 預設為 LAZY
	@OneToMany(mappedBy = "book")
	@OrderBy("id")
	private Set<OrderDetail1> details;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BookIsbn getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(BookIsbn bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Set<OrderDetail1> getDetails() {
		return details;
	}

	public void setDetails(Set<OrderDetail1> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
}
