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
	
	
	//���Ʋ�д����
	
	//��getset���� �������ͻ��Զ�ͨ������õ����� ��������blabla
	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	//����һ������ jsp����ʱ��������ʾ��jsp
	public String getBookList() {
		String str = "bookListsucc";
		//����bookservice�ķ����õ����е���
		booksList = bs.getBookList();
		return str;
	}
	
}
