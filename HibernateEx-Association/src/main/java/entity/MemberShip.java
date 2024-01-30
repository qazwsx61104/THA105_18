package entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "membership")
public class MemberShip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	// fetch 預設為 LAZY
	// name為關聯的中介表格名稱
	// joinColumns裡的name代表自己被中介表格的關聯欄位名，referencedColumnName為自己關聯的欄位名
	// inverseJoinColumns裡的name代表另一個多方被中介表格的關聯欄位名, referencedColumnName為另一個多方關聯的欄位名
	@ManyToMany
	@JoinTable(
				name = "likerecord",
				joinColumns = { @JoinColumn(name = "mid", referencedColumnName = "id") },
				inverseJoinColumns = { @JoinColumn(name = "aid", referencedColumnName = "id") }
              )
	private Set<Article> articles;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "MemberShip [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
