package jxnu.edu.cn.x3321.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jxnu.edu.cn.x3321.bean.Book;
import jxnu.edu.cn.x3321.service.BookService;
import jxnu.edu.cn.x3321.db.DbConnection;
public class BookServiceImpl implements BookService {
	DbConnection  db=new DbConnection();
	ResultSet rs=null;

	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList();
		String strSql="select top 20 * from book_table";
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				Book book=new Book();
				book.setBookId(rs.getInt("bookId"));
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getString("price"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int bl=0;
		String strSql="insert into book_table values('"+book.getIsbn()
				   +"','"+book.getTitle()+"','"+book.getPrice()+"')";
		bl=db.executeUpdate(strSql);
		return bl;
	}

	@Override
	public int deleteBook(int bookId) {
		// TODO Auto-generated method stub
		int bl=0;
		String strSql="delete from book_table where bookId="+bookId;
		bl=db.executeUpdate(strSql);
		return bl;
	}

	@Override
	public Book getBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		Book book=null;
		String strSql="select * from book_table where bookId="+bookId;
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				book=new Book();
				book.setBookId(rs.getInt("bookId"));
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getString("price"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		int bl=0;
		String strSql="update book_table set isbn='"+book.getIsbn()
		     +"',title='"+book.getTitle()+"',price='"+book.getPrice()+"'"
		     		+ " where bookId="+book.getBookId();
		bl=db.executeUpdate(strSql);
		return bl;
	}

	@Override
	public int getRecordSize() {
		// TODO Auto-generated method stub
		int count=0;
		String strSql="select count(*) from book_table";
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<Book> getBookListByPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList();
		String strSql="select top "+pageSize+" * from book_table where bookId not in "
				+ "(select top "+(pageNow-1)*pageSize+" bookId from book_table)";
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				Book book=new Book();
				book.setBookId(rs.getInt("bookId"));
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getString("price"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

}
