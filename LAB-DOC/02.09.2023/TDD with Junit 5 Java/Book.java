package com.ems.entity;

public class Book {
	
	private int    bookId;
	private String bookName;	
	private String bookAuthorName;
    public BookPp Pp;
	public Book(int bookId, String bookName, String bookAuthorName,BookPp Pp) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthorName = bookAuthorName;
		this.Pp=Pp;
	}
	public long getBookId() 				 //  method to get Book ID no
	{
		return bookId;
	}
	public void setBookId(int bookId) 		 //  method to set Book ID no
	{
		this.bookId = bookId;
	}
	public String getBookName() 			 //  method to get Book Name 
	{
		return bookName;
	}
	public void setBookName(String bookName) //  method to set Book ID no
	{
		this.bookName = bookName;
	}
	public String getBookAuthorName()  		 //  method to get Book Authors Name
	{
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) 	//  method to set Book Authors Name
	{
		this.bookAuthorName = bookAuthorName;
	}
}
