package ServiceImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Service.BookService;
import bean.Book;
import db.DbConnection;

public class BookServiceImp implements BookService {
	//从数据库里取数据要用db里的一个查询方法！
	DbConnection db = new DbConnection();
	
	//取数据先要放到这个里头 利用db查询得到的是一个resultset结果集
	ResultSet rs = null;
	
	//业务逻辑层！取数据的业务逻辑做完了
	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		String strSql="select top 20 * from book_table";
		rs = db.executeQuery(strSql);
		try {
			while(rs.next()) {
				Book book = new Book();
				book.setBoodId(rs.getInt("bookId"));
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
