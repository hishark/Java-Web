package Service;

import java.util.List;

import bean.Book;

public interface BookService {
	/*
	 * 系统提供的功能
	 */
	
	//得到所有的图书
	public List<Book> getBookList();
}
