package com.cg.onlineshopping.services;

import java.util.Collection;

import com.cg.onlineshopping.dao.BooksDAO;
import com.cg.onlineshopping.dao.BooksDAOImpl;
import com.cg.onlineshopping.pojo.Books;

public class BooksServicesImpl implements BooksServices{

	private BooksDAO booksdao = new BooksDAOImpl();

	@Override
	public void addNewBook(Books book) {
		booksdao.addNewBook(book);
		
	}

	@Override
	public Collection<Books> viewAllBooks() {
		// TODO Auto-generated method stub
		return booksdao.viewAllBooks();
	}

	@Override
	public void getBookById(int itemID) {
		booksdao.getBookById(itemID);
		
	}
	@Override
	public Collection<Books> viewCart() {
		// TODO Auto-generated method stub
		return booksdao.viewCart();
	} 
}
