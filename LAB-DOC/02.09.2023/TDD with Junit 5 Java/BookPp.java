package com.ems.entity;

public class BookPp 
{  
	private double bookPrice;
	private String bookPublisher;
	public BookPp(double bookPrice,String bookPublisher)             
	{
		super();
		this.bookPrice=bookPrice;
		this.bookPublisher=bookPublisher;
	}
	public double getBookPrice() 							//  method to get Book Price
	{
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) 				//  method to set Book Price
	{
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher()						//  method to get Books Publisher
	{
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher)  	//  method to set Books Publisher
	{
		this.bookPublisher = bookPublisher;
	}
}
