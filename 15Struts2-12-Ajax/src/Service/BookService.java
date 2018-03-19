package Service;

import java.util.List;

import bean.Book;

public interface BookService {
	/*
	 * ϵͳ�ṩ�Ĺ���
	 */
	
	//�õ����е�ͼ��
	public List<Book> getBookList();
	
	public int AddBook(Book book);

	public int deleteBook(int bookId);

	public Book getBookById(int bookId);

	public int updateBook(Book book);

	public int getRecordSize();

	public List<Book> getBookListByPage(int pageNow, int pageSize);
}
