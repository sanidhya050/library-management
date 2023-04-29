package lm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	
	
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private int id ;

    @Column(name = "title" )
	private String title;

	
    @Column(name = "author" )
	private String author;

	private String category; 

    @Column(name = "category" )
//	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return getCategory();
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Book () {
		
	}

	public Book(String title, String author, String category) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
	}
    
    
	
    
}
