package ServiceImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Service.BookService;
import bean.Book;
import db.DbConnection;

public class BookServiceImp implements BookService {
	//�����ݿ���ȡ����Ҫ��db���һ����ѯ������
	DbConnection db = new DbConnection();
	
	//ȡ������Ҫ�ŵ������ͷ ����db��ѯ�õ�����һ��resultset�����
	ResultSet rs = null;
	
	//ҵ���߼��㣡ȡ���ݵ�ҵ���߼�������
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
