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
@Table(name = "article")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	// fetch 預設為 LAZY
	// name為關聯的中介表格名稱
	// joinColumns裡的name代表自己被中介表格的關聯欄位名，referencedColumnName為自己關聯的欄位名
	// inverseJoinColumns裡的name代表另一個多方被中介表格的關聯欄位名, referencedColumnName為另一個多方關聯的欄位名
	@ManyToMany
	@JoinTable(
				name = "likerecord",
				joinColumns = { @JoinColumn(name = "aid", referencedColumnName = "id") },
				inverseJoinColumns = { @JoinColumn(name = "mid", referencedColumnName = "id") }
			  )
	private Set<MemberShip> members;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Set<MemberShip> getMembers() {
		return members;
	}
	public void setMembers(Set<MemberShip> members) {
		this.members = members;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
}
