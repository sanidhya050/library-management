package lm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lm.Repository.BookRepository;
import lm.entity.Book;

public class BookServiceImpl  implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> FindAll() {
		 return bookRepository.findAll();
	}

	@Override
	public void save(Book theBook) {
		 bookRepository.save(theBook);
		
	}

	@Override
	public void DeleteById(int id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public Book findById(int id) {
		Book book = bookRepository.findById(id).get();
		
		if(book == null)
			throw new RuntimeException ("Did not find th book id " +id);
		else 
			return book;
		
	}
	

	
	

}
