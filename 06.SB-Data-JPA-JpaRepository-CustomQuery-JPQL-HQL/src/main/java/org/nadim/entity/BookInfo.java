package org.nadim.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="book_info")
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer bookId;
	private String bookName;
	private String authorName;
	private Double bookPrice;
	private String bookType;
	private LocalDate published;
	public BookInfo(String bookName, String authorName, Double bookPrice, String bookType, LocalDate published) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.bookType = bookType;
		this.published = published;
	}
	
	
	
	
}
