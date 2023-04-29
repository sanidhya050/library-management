package lm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import lm.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	

}
