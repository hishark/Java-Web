package jxnu.edu.cn.x3321.action;

import java.util.ArrayList;
import java.util.List;

import jxnu.edu.cn.x3321.bean.Book;
import jxnu.edu.cn.x3321.service.BookService;
import jxnu.edu.cn.x3321.serviceImpl.BookServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class BookManagementAction extends ActionSupport {
	List<Book> booksList=new ArrayList();
	BookService bs=new BookServiceImpl();
	Book book =new Book();
	int bookId=0;
	int bookIds[];
	int pageNow=1;//表示当前是第几页
	int pageSize=2;//每页要显示的记录数
	int recordsize=0;//表示表中总的记录数
	int pageCount=0;//总的页数
	
		public int getPageNow() {
		return pageNow;
	}


	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getRecordsize() {
		return recordsize;
	}


	public void setRecordsize(int recordsize) {
		this.recordsize = recordsize;
	}


	public int getPageCount() {
		return pageCount;
	}


	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}


	public int[] getBookIds() {
		return bookIds;
	}


	public void setBookIds(int[] bookIds) {
		this.bookIds = bookIds;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public List<Book> getBooksList() {
		return booksList;
	}


	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}


	public String getBookList(){
		String str="bookListsucc";
		booksList=bs.getBookList();
		return str;
	}
	
	public String add(){
		String str="bookAddFail";
		if(bs.addBook(book)!=0){
			str="bookAddSucc";
		}
		return str;
	}
	
	public String bookDelete(){
		String str="bookDeleteFail";
		if(bs.deleteBook(bookId)!=0){
			str="bookDeleteSucc";
		}
		return str;
	}
	
	public String bookDeletes(){
		String str="bookDeletesFail";
		for(int bookId:bookIds){
			if(bs.deleteBook(bookId)!=0){
				str="bookDeletesSucc";
			}
		}
				
		return str;
	}
	
	public String bookLoad(){
		String str="bookLoadSucc";
		book=bs.getBookByBookId(bookId);
				
		return str;
	}
	
	public String bookUpdate(){
		String str="bookUpdateFail";
		if(bs.updateBook(book)!=0){
			str="bookUpdateSucc";
		}
				
		return str;
	}
	
	public String getBooksByPage(){
		String str="fail";
		recordsize=bs.getRecordSize();
		if(recordsize%pageSize==0){
			pageCount=recordsize/pageSize;
		}else{
			pageCount=recordsize/pageSize+1;
		}
		if(pageNow<1){
			pageNow=1;
		}
		if(pageNow>pageCount){
			pageNow=pageCount;
		}
		booksList=bs.getBookListByPage(pageNow,pageSize);
		if(booksList.size()!=0){
			str="succ";
		}
		return str;
	}

}
