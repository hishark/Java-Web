package jxnu.edu.cn.x3321.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Service.BookService;
import ServiceImp.BookServiceImp;
import bean.Book;

//控制层写完了
public class BookManagementAction extends ActionSupport {
	List<Book> booksList = new ArrayList<Book>();
	BookService bs = new BookServiceImp();
	Book book = new Book();
	int bookId = 0;
	int bookIds[];

	/*
	 * 分页要定义的变量
	 */
	int pageNow = 1;// 表示当前是第几页
	int pageSize = 5;// 每页要显示的记录数
	int recordsize = 0;// 表示表中总的记录数
	int pageCount = 0;// 表示总的页数
	// 在其他页面要用到的话最好要用setget方法！！

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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int[] getBookIds() {
		return bookIds;
	}

	public void setBookIds(int[] bookIds) {
		this.bookIds = bookIds;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	// 用getset方法 拦截器就会自动通过这个得到数据 设置数据blabla
	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	// 定义一个方法 jsp调用时将数据显示到jsp
	public String getBookList() {
		String str = "bookListsucc";
		// 调用bookservice的方法得到所有的书
		booksList = bs.getBookList();

		return str;
	}

	public String add() {
		String str = "AddBookFail";
		if (bs.AddBook(book) != 0) {
			str = "AddBookSucc";
		}
		return str;
	}

	public String bookDelete() {
		String str = "bookDeleteFail";
		if (bs.deleteBook(bookId) != 0) {
			str = "bookDeleteSucc";
		}
		return str;
	}

	public String bookDeletes() {
		String str = "bookDeletesFail";

		for (int bookId : bookIds) {
			if (bs.deleteBook(bookId) != 0) {
				str = "bookDeletesSucc";
			}
		}

		return str;
	}

	public String bookLoad() {
		String str = "bookLoadSucc";
		book = bs.getBookById(bookId);
		return str;
	}

	public String BookUpdate() {
		String str = "bookUpdateFail";
		if (bs.updateBook(book) != 0) {
			str = "bookUpdateSucc";
		}
		return str;
	}

	public String getBooksByPage() {
		String str = "fail";
		recordsize = bs.getRecordSize();
		if (recordsize % pageSize == 0) {
			pageCount = recordsize / pageSize;
		} else {
			pageCount = recordsize / pageSize + 1;
		}

		//如果在第一页的时候点上一页
		if(pageNow<1) {
			pageNow = 1;
		}
		//如果在最后一页的时候点下一页
		if(pageNow>pageCount) {
			pageNow = pageCount;
		}
		
		booksList = bs.getBookListByPage(pageNow,pageSize);
		if(booksList.size()!=0) {
			str = "succ";
		}
		return str;
	}

	 

}
