package jxnu.edu.cn.x3321.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Service.BookService;
import ServiceImp.BookServiceImp;
import bean.Book;

//���Ʋ�д����
public class BookManagementAction extends ActionSupport {
	List<Book> booksList = new ArrayList<Book>();
	BookService bs = new BookServiceImp();
	Book book = new Book();
	int bookId = 0;
	int bookIds[];

	/*
	 * ��ҳҪ����ı���
	 */
	int pageNow = 1;// ��ʾ��ǰ�ǵڼ�ҳ
	int pageSize = 5;// ÿҳҪ��ʾ�ļ�¼��
	int recordsize = 0;// ��ʾ�����ܵļ�¼��
	int pageCount = 0;// ��ʾ�ܵ�ҳ��
	// ������ҳ��Ҫ�õ��Ļ����Ҫ��setget��������

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

	// ��getset���� �������ͻ��Զ�ͨ������õ����� ��������blabla
	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	// ����һ������ jsp����ʱ��������ʾ��jsp
	public String getBookList() {
		String str = "bookListsucc";
		// ����bookservice�ķ����õ����е���
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

		//����ڵ�һҳ��ʱ�����һҳ
		if(pageNow<1) {
			pageNow = 1;
		}
		//��������һҳ��ʱ�����һҳ
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
