package com.ems.service;

import java.util.ArrayList;
import java.util.List;

import com.ems.entity.BookPp;
import com.ems.entity.Book;
import com.ems.exception.BookException;

public class BookService 
{
	private List<Book> book=new ArrayList<>();
	
	public void addBook(int bid, String bname, String bauthorName, double bprice, String bpublisher ) //to add Book into List
	{
		BookPp Bp=new BookPp(bprice, bpublisher);
		book.add(new Book(bid, bname, bauthorName,Bp));
	}
	
	public int lengthOfList()   // return the list length
	{
		return book.size();
	}
	
	public List<Book> displayAll()  // to get the all books
	{
		return book;
	}
	
	public Book displayById(long id)throws BookException    //to get the book by using BOOK ID
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
				return book.get(i);
			
		}
		if(i==book.size())
			throw new BookException("BOOK NOT FOUND");
		
		return null;
	}
	
	public Book updateById(long id)throws BookException    // update the books by using BOOK ID 
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
			{
				book.get(i).setBookName("Python");
				book.get(i).setBookAuthorName("pqr");
				book.get(i).Pp.setBookPrice(500);
				book.get(i).Pp.setBookPublisher("ABC");
				return book.get(i);
			}
		}
		if(i==book.size())
			throw new BookException("BOOK NOT FOUND");
		return null;
	}
	
	public List<Book> deleteById(long id)throws BookException  // delete the books by using BOOK ID 
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
			{
				book.remove(i);
				return book;
			}
		}
		if(i==book.size())
			throw new BookException("BOOK NOT FOUND");
		return null;
	}

}
