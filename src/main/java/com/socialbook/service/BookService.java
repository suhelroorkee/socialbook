package com.socialbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialbook.dao.BookDAO;
import com.socialbook.entity.Book;
import com.socialbook.entity.BookRating;
import com.socialbook.entity.BookReviews;
import com.socialbook.entity.Bookmark;
import com.socialbook.entity.Category;
import com.socialbook.entity.FavouriteList;
import com.socialbook.entity.FavouriteListBook;
import com.socialbook.entity.GroupBook;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.Suggestion;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDao;

	boolean saveBook(Book book)throws Exception {
	return bookDao.saveBook(book);
}
	
	boolean updateBook(Book book)throws Exception {
		return bookDao.updateBook(book);
	}
	
	boolean removeBook(int id)throws Exception {
		return bookDao.removeBook(id);
	}
	
	Book findBook(int id)throws Exception {
		return bookDao.findBook(id);
	}
	
	Book findBookByUser(int id) throws Exception {
		return bookDao.findBookByUser(id);
	}
	
	List<Book> findBooksByTitle(String bookTitle, Integer pageNumber) throws Exception {
		return bookDao.findBooksByTitle(bookTitle, pageNumber);
	}
	
    boolean addBookRating(BookRating bookRating) throws Exception {
		return bookDao.addBookRating(bookRating);
	}
	
	List<BookRating> getBookRatings(int bookID, Integer pageNumber) throws Exception {
		return bookDao.getBookRatings(bookID, pageNumber);
	}
	
	double getBookAverageRating(int bookID) throws Exception {
		return bookDao.getBookAverageRating(bookID);
	}
	
	boolean addBookmark(Bookmark bookmark) throws Exception {
		return bookDao.addBookmark(bookmark);
	}
	
	List<Bookmark> getBookmarks(int userID, Integer pageNumber) throws Exception {
		return bookDao.getBookmarks(userID, pageNumber);
	}
	
	boolean addSuggestion(Suggestion suggestion) throws Exception {
		return bookDao.addSuggestion(suggestion);
	}
	
	List<Suggestion> getSuggestionsByUser(int userID, Integer pageNumber) throws Exception {
		return bookDao.getSuggestionsByUser(userID, pageNumber);
	}
	
	boolean addFavouriteList(FavouriteList favouriteList) throws Exception {
		return bookDao.addFavouriteList(favouriteList);
	}
	
	boolean removeFavouriteList(Integer favouriteListID) throws Exception {
		return bookDao.removeFavouriteList(favouriteListID);
	}
	
	boolean saveGroupBook(GroupBook groupBook)throws Exception {
		return bookDao.saveGroupBook(groupBook);
	}
	
	GroupBook findGroupBook(int id)throws Exception {
		return bookDao.findGroupBook(id);
	}
	
	boolean updateGroupBook(GroupBook groupBook)throws Exception {
		return bookDao.updateGroupBook(groupBook);
	}
	
	boolean removeGroupBook(int id)throws Exception {
		return bookDao.removeGroupBook(id);
	}
    
    boolean saveBookReviews(BookReviews bookreviews)throws Exception {
		return bookDao.saveBookReviews(bookreviews);
	}
	
   	BookReviews findBookReviews(int id)throws Exception {
		return bookDao.findBookReviews(id);
	}
   	
   	boolean updateBookReviews(BookReviews bookreviews)throws Exception {
		return bookDao.updateBookReviews(bookreviews);
	}
   	
   	boolean removeBookReviews(int id)throws Exception {
		return bookDao.removeBookReviews(id);
	}
   	
    
    boolean saveCategory(Category category)throws Exception {
		return bookDao.saveCategory(category);
	}
	
	Category findCategory(int id)throws Exception {
		return bookDao.findCategory(id);
	}
	
	boolean updateCategory(Category category)throws Exception {
		return bookDao.updateCategory(category);
	}
	
	boolean removeCategory(int id)throws Exception {
		return bookDao.removeCategory(id);
	}
	
    boolean saveSubCategory(SubCategory subcategory)throws Exception {
		return bookDao.saveSubCategory(subcategory);
	}
	
	SubCategory findSubCategory(int id)throws Exception {
		return bookDao.findSubCategory(id);
	}
	
	boolean updateSubCategory(SubCategory subcategory)throws Exception {
		return bookDao.updateSubCategory(subcategory);
	}
	
	boolean removeSubCategory(int id)throws Exception {
		return bookDao.removeSubCategory(id);
	}
	
	List<FavouriteList> getFavouriteLists(int userID, Integer pageNumber) throws Exception {
		return bookDao.getFavouriteLists(userID, pageNumber);
	}
	
	boolean addFavouriteListBook(FavouriteListBook favouriteListBook) throws Exception {
		return bookDao.addFavouriteListBook(favouriteListBook);
	}
	
	boolean removeFavouriteListBook(Integer favouriteListBookID) throws Exception {
		return bookDao.removeFavouriteListBook(favouriteListBookID);
	}
	
	List<FavouriteListBook> getFavouriteListBooks(int favouriteListID, Integer pageNumber) throws Exception {
		return bookDao.getFavouriteListBooks(favouriteListID, pageNumber);
	}


	int getTotalFavouriteListBooks(int favouriteListID) {
		return bookDao.getTotalFavouriteListBooks(favouriteListID);
	}

	int getTotalBooksByTitle(String bookTitle) {
		return bookDao.getTotalBooksByTitle(bookTitle);
	}

	int getTotalBookRatings(int bookID) {
		return bookDao.getTotalBookRatings(bookID);
	}

	int getTotalBookmarks(int userID) {
		return bookDao.getTotalBookmarks(userID);
	}

	int getTotalSuggestions(int userID) {
		return bookDao.getTotalSuggestions(userID);
	}

	int getTotalFavouriteLists(int userID) {
		return bookDao.getTotalFavouriteLists(userID);
	}


}
