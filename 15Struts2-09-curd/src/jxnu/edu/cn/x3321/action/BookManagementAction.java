package jxnu.edu.cn.x3321.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Service.BookService;
import ServiceImp.BookServiceImp;
import bean.Book;

public class BookManagementAction extends ActionSupport {
	List<Book> booksList = new ArrayList();
	BookService bs = new BookServiceImp();
	
	
	//控制层写完了
	
	//用getset方法 拦截器就会自动通过这个得到数据 设置数据blabla
	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	//定义一个方法 jsp调用时将数据显示到jsp
	public String getBookList() {
		String str = "bookListsucc";
		//调用bookservice的方法得到所有的书
		booksList = bs.getBookList();
		return str;
	}
	
}
