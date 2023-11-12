package org.nadim.repository;

import java.util.List;

import org.nadim.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookInfo, Integer> {
	
	//SQL : SELECT * FROM BOOK_INFO WHERE AUTHOR=?
	
	//findByVariableName(String variableName)
	List <BookInfo> findByAuthorName(String authorName);
	// (or)
	List<BookInfo> findByAuthorNameIs(String author);
	//(or)
	List<BookInfo> findByAuthorNameEquals(String author);
	
	
	//SQL:: SELECT * FROM BOOK_INFO WHERE book_price <1500;
	List<BookInfo> findByBookPriceLessThan(Double price);
	
	//SQL:: SELECT * FROM BOOK_INFO WHERE author_name is null;
	List<BookInfo> findByAuthorNameIsNull();
	
	//SQL:: SELECT * FROM BOOK_INFO WHERE author_name is not null;
	List<BookInfo> findByAuthorNameIsNotNull();
	
	// Fetch book which having author name end with k
	// SQL:: SELECT * FROM BOOK_INFO where author_name like '%k';
	List<BookInfo> findByAuthorNameLike(String expresion);
	//(or)
	List<BookInfo> findByAuthorNameEndingWith(String expresion);
	
	// Fetch a book which having price exactly 3 digit
	//SQL:: SELECT * FROM BOOK_INFO where book_price like '___';
	List<BookInfo> findByBookNameLike(String expresion);
	
	
}
