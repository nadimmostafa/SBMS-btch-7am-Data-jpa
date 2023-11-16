package org.nadim.repo;

import java.util.List;
import java.util.Optional;

import org.nadim.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<BookInfo, Integer> {
	
	// SQL:: SELECT * FROM BOOK_INFO WHERE author_name="Raghu";
	@Query("SELECT b FROM BookInfo b WHERE b.authorName=:author")
	//@Query("FROM BookInfo WHERE authorName=:author")
	List<BookInfo> findAllBooks(String author);
	
	// Fetch single column value
	//SQL:: SELECT author_name FROM book_info WHERE author_name is not null;
	@Query("SELECT authorName FROM BookInfo WHERE authorName is not null")
	List<String> fetchAllAuthorNames();
	
	// Fetch multiple column value
	@Query("SELECT bookName, bookPrice FROM BookInfo WHERE authorName is null")
	List<Object[]> fetchBooks();
	
	// Fetch multiple column and one row value
	@Query("SELECT bookName, bookPrice,authorName FROM BookInfo WHERE bookId=:id")
	Optional<Object[]> fetchBookById(Integer id);
}
