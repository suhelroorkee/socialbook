
package com.socialbook.dao;

import java.util.List;

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


public interface BookDAO {
	
	boolean saveBook(Book book)throws Exception;
	
	boolean updateBook(Book book)throws Exception;
	
	boolean removeBook(int id)throws Exception;
	
	Book findBook(int id)throws Exception;
	
	Book findBookByUser(int id) throws Exception;
	
	List<Book> findBooksByTitle(String bookTitle, Integer pageNumber) throws Exception;
	
    boolean addBookRating(BookRating bookrating) throws Exception;
	
	List<BookRating> getBookRatings(int id, Integer pageNumber) throws Exception;
	
	double getBookAverageRating(int id) throws Exception;
	
	boolean addBookmark(Bookmark bookmark) throws Exception;
	
	List<Bookmark> getBookmarks(int id, Integer pageNumber) throws Exception;
	
	boolean addSuggestion(Suggestion suggestion) throws Exception;
	
	List<Suggestion> getSuggestionsByUser(int id, Integer pageNumber)throws Exception;
	
	boolean addFavouriteList(FavouriteList favouriteList) throws Exception;
	
	boolean removeFavouriteList(Integer favouriteListID) throws Exception;
	
    boolean saveGroupBook(GroupBook groupBook)throws Exception;
	
    GroupBook findGroupBook(int id)throws Exception;
	
	boolean updateGroupBook(GroupBook groupbook)throws Exception;
	
	boolean removeGroupBook(int id)throws Exception;
	
    boolean saveBookReviews(BookReviews bookreviews)throws Exception;
	
   	BookReviews findBookReviews(int id)throws Exception;
   	
   	boolean updateBookReviews(BookReviews bookreviews)throws Exception;
   	
   	boolean removeBookReviews(int id)throws Exception;
    
    boolean saveCategory(Category category)throws Exception;
	
	Category findCategory(int id)throws Exception;
	
	boolean updateCategory(Category category)throws Exception;
	
	boolean removeCategory(int id)throws Exception;
	
    boolean saveSubCategory(SubCategory subcategory)throws Exception;
	
	SubCategory findSubCategory(int id)throws Exception;
	
	boolean updateSubCategory(SubCategory subcategory)throws Exception;
	
	boolean removeSubCategory(int id)throws Exception;
	
	List<FavouriteList> getFavouriteLists(int id, Integer pageNumber) throws Exception;
	
	boolean addFavouriteListBook(FavouriteListBook favouriteListBook) throws Exception;
	
	boolean removeFavouriteListBook(Integer id) throws Exception;
	
	List<FavouriteListBook> getFavouriteListBooks(int id, Integer pageNumber) throws Exception;

	int getTotalFavouriteListBooks(int id);

	int getTotalBooksByTitle(String bookTitle);

	int getTotalBookRatings(int id);

	int getTotalBookmarks(int id);

	int getTotalSuggestions(int id);

	int getTotalFavouriteLists(int id);
	
	

	
}
