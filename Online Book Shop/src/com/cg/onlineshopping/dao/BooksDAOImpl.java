package com.cg.onlineshopping.dao;

import java.util.Collection;
import java.util.HashMap;

import com.cg.onlineshopping.pojo.Books;

public class BooksDAOImpl implements BooksDAO {
	private HashMap<Integer, Books> booksDB = new HashMap<>();
	private HashMap<Integer, Books> booksforcartDB = new HashMap<>();
	
	@Override
	public void addNewBook(Books book) {
		booksforcartDB.put(book.getItemId(), book);
		
	}

	@Override
	public  Collection<Books> viewAllBooks() {
		// TODO Auto-generated method stub
		//return booksDB.values();
		booksDB.put(1, new Books(1,"The Archemist","Paulo Coelho",1100.0,"This book is written by Paulo Coelho"));
		booksDB.put(2, new Books(2,"One Indian Girl","Chetan Bhagat",220.0,"This book is written by Chetan Bhagat"));
		booksDB.put(3, new Books(3,"Target 3 Billion","A.P.J. Abdul Kalam",1500.0,"This book is written by Dr. A.P.J. Abdul Kalam"));
		return booksDB.values();
	}

	@Override
	public Books getBookById(int itemId) {
		// TODO Auto-generated method stub
		return booksDB.get(itemId);
	}

	@Override
	public Collection<Books> viewCart() {
		// TODO Auto-generated method stub
		return booksforcartDB.values();
	}

}
