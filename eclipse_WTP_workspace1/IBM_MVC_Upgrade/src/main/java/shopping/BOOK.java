package shopping;

import java.util.Objects;

public class BOOK implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	public BOOK() {
		name = "";
		author = "";
		publisher = "";
		price = 0.0;
		quantity = 0;
	}

	private String name;
	private String author;
	private String publisher;
	private Double price;
	private Integer quantity;

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

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BOOK [name=" + name + ", author=" + author + ", publisher=" + publisher + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BOOK other = (BOOK) obj;
		return Objects.equals(name, other.name);
	}
	



}