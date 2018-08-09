package com.cg.onlineshopping.services;

import java.util.Collection;

import com.cg.onlineshopping.pojo.Books;

public interface BooksServices {

	void addNewBook(Books book);
	 Collection<Books> viewAllBooks();
	 void getBookById(int itemID);
	Collection<Books> viewCart();
}
