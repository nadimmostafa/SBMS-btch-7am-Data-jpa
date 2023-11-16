package org.nadim.repo;

import java.util.List;

import org.nadim.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<BookInfo, Integer> {
	
	/*
	//==================Positional Parameters (?1,?2..etc)============
	//SQL:: select * from book_info where author_name=?
	@Query("select b from BookInfo b where authorName=?1")
	List<BookInfo> getBookSByAuthorName(String author);
	
	@Query("select b from BookInfo b where b.authorName like ?1 or b.bookName like ?2")
	List<BookInfo> getBooks(String author, String bname);
	
	@Query("select b from BookInfo b where b.bookPrice < ?1")
	List<BookInfo> getBooksByPrice(Double price);
	
	@Query("Select b from BookInfo b where bookId in(?1)")
	List<BookInfo> getBooksById(List<Integer> id);
	
	*/
	//=============== Named Parameters (:abc, :empId, :myIds, :names ..etc) ===========
	
	@Query("select b from BookInfo b where authorName= :author")
	List<BookInfo> getBookSByAuthorName(String author);
	
	@Query("select b from BookInfo b where b.authorName like :author or b.bookName like :bname")
	List<BookInfo> getBooks(String author, String bname);
	
	@Query("select b from BookInfo b where b.bookPrice < :cost")
	List<BookInfo> getBooksByPrice(@Param("cost") Double price);
	
	@Query("Select b from BookInfo b where bookId in(:id)")
	List<BookInfo> getBooksById(List<Integer> id);
}
