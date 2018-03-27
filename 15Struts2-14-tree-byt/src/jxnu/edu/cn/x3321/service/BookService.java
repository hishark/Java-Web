package jxnu.edu.cn.x3321.service;

import java.util.List;

import jxnu.edu.cn.x3321.bean.Book;

public interface BookService {
	public List<Book> getBookList();

	public int addBook(Book book);

	public int deleteBook(int bookId);

	public Book getBookByBookId(int bookId);

	public int updateBook(Book book);

	public int getRecordSize();

	public List<Book> getBookListByPage(int pageNow, int pageSize);

}
