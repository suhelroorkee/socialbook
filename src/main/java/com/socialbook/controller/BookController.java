package com.socialbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socialbook.entity.Book;
import com.socialbook.entity.BookRating;
import com.socialbook.entity.Bookmark;
import com.socialbook.entity.FavouriteList;
import com.socialbook.entity.GroupChat;
import com.socialbook.entity.Suggestion;
import com.socialbook.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookservice;
	public String saveBook(Book book){
		return null;
}
	public String updateBook(Book book){
		return null;
	}
	public String removeBook(int id){
		return null;
	}
	public String findBook(int id) throws Exception{
		return null;
	}
    public String findBookByUser(int id) throws Exception {
	    return null;
}
	
	List<Book> findBookByAuthor(String author)throws Exception {
		return null;
	}
	
	List<Book> findBookByTitle(String bookTitle, Integer pageNumber) throws Exception {
		return null;
	}
    public String addBookRating(BookRating bookRating) throws Exception {
		return null;
	}
	
	List<BookRating> getBookRating(int bookID, Integer pageNumber) throws Exception {
		return null;
	}
	
	public String getBookAverageRating(int bookID) throws Exception {
		return null;
	}
	
	public String addBookmark(Bookmark bookmark) throws Exception {
		return null;
	}
	
	List<Bookmark> getBookmark(int userID, Integer pageNumber) throws Exception {
		return null;
	}
	
	public String addSuggestion(Suggestion suggestion) throws Exception {
		return null;
	}
	
	List<Suggestion> getSuggestionsByUser(int userID, Integer pageNumber) throws Exception {
		return null;
	}
	
	public String addFavouriteList(FavouriteList favouriteList) throws Exception {
		return null;
	}
	
	public String removeFavouriteList(Integer favouriteListID) throws Exception {
		return null;
	}
	
    public String saveGroupBook(GroupChat groupchat)throws Exception {
		return null;
	}
	
	public String findGroupBook(int id)throws Exception {
		return null;
	}
	}
	