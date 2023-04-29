package lm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lm.entity.Book;

@Service
public interface BookService {

	// view all books 
	public List<Book> FindAll();
	
	
	
	// Insert or update the data 
	public void save(Book theBook);
	
	
	
	// deleteById 
	public void DeleteById(int id);



	public Book findById(int id);
	
}
