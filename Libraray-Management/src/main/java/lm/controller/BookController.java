package lm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lm.entity.Book;
import lm.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	/*
	 * find out the Resuorce uri /books/showFormforAdd /books/ShowFormForUpdate
	 * /books/Delete /books/Save /books/list--> display all books ( find out
	 * anythimg comman uri from all mapping and put on class level )
	 */
	@GetMapping("/ShowFormForAdd")
	public String ShowFormForAdd(Model theModel) {
		Book theBook = new Book();
		theModel.addAttribute("book", theBook);
		return "books/books-form";
	}

	@GetMapping("/list")
	public String listBooks(Model theModel) {
		bookService.FindAll();
		List<Book> theBooks = bookService.FindAll();
		theModel.addAttribute("books", theBooks);
		return "books/list-books";
	}

	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book theBook) {

		// save
		bookService.save(theBook);
		return "redirect:/books/list";

	}

	@PostMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int id) {

		bookService.DeleteById(id);
		return "redirect:/books/list";

	}
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int id , Model theModel) {
		
		 Book book = bookService.findById(id);
			theModel.addAttribute("book", book);
			return "books/books-form";
		 
	}

}
