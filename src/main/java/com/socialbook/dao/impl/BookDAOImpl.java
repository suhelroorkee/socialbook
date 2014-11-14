package com.socialbook.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
import com.socialbook.utility.Data;

@Transactional
@Repository
public class BookDAOImpl extends HibernateUtil implements BookDAO{

	@Override
	public boolean saveBook(Book book) {
		Session session = getCurrentSession();
		
		session.save(book);
		return true;

	}

	@Override
	public boolean updateBook(Book book) {
        
		Session session = getCurrentSession();
		
		session.update(book);
		
		return true;
	}

	@Override
	public boolean removeBook(int id) throws Exception{
       
       boolean removed = false;
		
		Session session = getCurrentSession();
		
		Book book = (Book)session.get(Book.class, id);		// in case of primary key
		
		   if(book != null) {
			book.setStatus("removed");
			session.update(book);
			
			removed = true;
		}
				
		return removed;
	}

	@Override
	    public Book findBook(int id) {
		Session session = getCurrentSession();
		
		
		Book book = (Book)session.get(Book.class, id);
		
		return book;
	}

	@Override
	public Book findBookByUser(int id) {
		
		Session session = getCurrentSession();
		
		Book book =(Book)session.get(Book.class, id);
		
		return book;
	}
	@Override
	public List<Book> findBooksByTitle(String bookTitle, Integer pageNumber) throws Exception {
		
		Session session = getCurrentSession();
		
		String hql = "from Book as ui where ui.bookTitle like :bookTitle and ui.status='active'";
		
		Query query = session.createQuery(hql);
		query.setString("bookTitle", "%" + bookTitle + "%");
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<Book> books = query.list();
		
		return books;
	}

	@Override
	public boolean saveGroupBook(GroupBook groupbook) {
		Session session = getCurrentSession();
		
		session.save(groupbook);
		
		return true;
	}

	@Override
	public GroupBook findGroupBook(int id) {
		Session session = getCurrentSession();
		
		GroupBook groupBook = (GroupBook)session.get(GroupBook.class, id);
		
		return groupBook;


	}

	@Override
	public boolean updateGroupBook(GroupBook groupBook) {

         Session session = getCurrentSession();
         
         session.update(groupBook);
         
         return true;
	}

	@Override
	public boolean removeGroupBook(int id) {
		
		 boolean remove =false;
	     Session session = getCurrentSession();
	     
	     GroupBook groupBook = (GroupBook)session.get(GroupBook.class, id);
	     
	     if(groupBook != null) {
	    	 groupBook.setStatus("removed");
				session.update(groupBook);
				
				remove = true;
			}
	     
	     return remove;
	}

	@Override
	public boolean saveBookReviews(BookReviews bookreviews) {
		Session session = getCurrentSession();
		
		session.save(bookreviews);
		
		return true;
	}

	@Override
	public BookReviews findBookReviews(int id) {
		Session session = getCurrentSession();
		
		BookReviews bookReviews =(BookReviews)session.get(BookReviews.class, id);
		
		return bookReviews;
	}

	@Override
	public boolean updateBookReviews(BookReviews bookreviews) {
		Session session = getCurrentSession();
		
		session.update(bookreviews);
		
		return true;
	}

	@Override
	public boolean removeBookReviews(int id) {
		boolean removed =true;
        Session session = getCurrentSession();
		
		BookReviews bookReviews = (BookReviews)session.get(BookReviews.class, id);
		
		if(bookReviews!=null){
			bookReviews.setStatus("removed");
			
			removed = true;
		}
		
		
		return removed;
		
	}

	

	@Override
	public boolean saveCategory(Category category) {
		Session session = getCurrentSession();
		
		session.save(category);
		
		return true;
		
	}

	@Override
	public Category findCategory(int id) {
		Session session = getCurrentSession();
		
		Category category =(Category)session.get(Category.class, id);
		
		return category;
	}

	@Override
	public boolean updateCategory(Category category) {
		Session session = getCurrentSession();
		
		session.update(category);
		
		return true;
	}

	@Override
	public boolean removeCategory(int id) {
		boolean removed = false;
		Session session = getCurrentSession();
		
		Category category = (Category)session.get(Category.class, id);
		
		  if(category != null) {
			category.setStatus("removed");
			session.update(category);
			removed = true;
		  }
		  return removed;
		
	}

	

	@Override
	public boolean saveSubCategory(SubCategory subcategory) {
		Session session = getCurrentSession();
		
		session.save(subcategory);
		
		return true;
	}

	@Override
	public SubCategory findSubCategory(int id) {
		
		Session session = getCurrentSession();
		
		SubCategory subCategory = (SubCategory)session.get(SubCategory.class, id);
		
		return subCategory;
	}

	@Override
	public boolean updateSubCategory(SubCategory subcategory) {
		Session session = getCurrentSession();
		
		session.update(subcategory);
		
		return true;
	}

	@Override
	public boolean removeSubCategory(int id) {
		
		  boolean remove= false;
		   Session session = getCurrentSession();
		   
		   SubCategory subCategory = (SubCategory)session.get(SubCategory.class, id);
		   
		   if(subCategory!= null){
			   subCategory.setStatus("removed");
			   session.update(subCategory);
			   remove=true;
		   }
		   return remove;
		   
		   
			   
		  
	}

	@Override
	public boolean addBookRating(BookRating bookrating) throws Exception {
		  Session session = getCurrentSession();
		  
		  session.save(bookrating);
		  return true;
		
	}

	@Override
	public List<BookRating> getBookRatings(int id, Integer pageNumber) throws Exception {
         Session session = getCurrentSession();
		
		String hql = "from BookRating as br where br.bookID=:bookID";
		
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<BookRating> ratings = query.list();
		
		return ratings;
	}

	@Override
	public double getBookAverageRating(int id) throws Exception {
         Session session = getCurrentSession();
		
		String hql = "Select avg(rat.ratingValue) FROM BookRating rat where rat.bookID=:bookID";
		
		Query query = session.createQuery(hql);
		query.setInteger("bookID", id);
		
		double averageRating = Double.parseDouble(query.list().get(0).toString());

		return averageRating;
	}

	@Override
	public boolean addBookmark(Bookmark bookmark) throws Exception {
         Session session = getCurrentSession();
		
		session.save(bookmark);
		
		return true;
	}

	@Override
	public List<Bookmark> getBookmarks(int id, Integer pageNumber)
			throws Exception {
		Session session = getCurrentSession();
		
		String hql = "from Bookmark as bm where bm.userID=:userID and bm.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<Bookmark> bookmarks = query.list();
		
		return bookmarks;
	}

	@Override
	public boolean addSuggestion(Suggestion suggestion) throws Exception {
		Session session = getCurrentSession();
		
		session.save(suggestion);
		
		return true;
	}

	@Override
	public List<Suggestion> getSuggestionsByUser(int id, Integer pageNumber)throws Exception {
		Session session = getCurrentSession();
		
		String hql = "from Suggestion as sug where sug.suggestionFromUserID=:userID and sug.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<Suggestion> suggestions = query.list();
		
		return suggestions;
	}

	@Override
	public boolean addFavouriteList(FavouriteList favouriteList)
			throws Exception {
		Session session = getCurrentSession();
		
		session.save(favouriteList);
		
		return true;
	}

	@Override
	public boolean removeFavouriteList(Integer favouriteListID) throws Exception {
	       boolean removed = false;
	       Session session = getCurrentSession();
	       FavouriteList favouriteList =(FavouriteList)session.get(FavouriteList.class, favouriteListID);
	       
	       if(favouriteList!=null){
	    	   favouriteList.setStatus("removed");
	    	   session.update(favouriteList);
	    	   removed = true;
	       }
	       
	       return removed;
	}

	@Override
	public List<FavouriteList> getFavouriteLists(int userID, Integer pageNumber)
			throws Exception {
		Session session = getCurrentSession();
		
		String hql = "from FavouriteList as fl where fl.userID=:userID and fl.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("userID", userID);
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<FavouriteList> favouriteLists = query.list();
		
		return favouriteLists;
	}

	@Override
	public boolean addFavouriteListBook(FavouriteListBook favouriteListBook)
			throws Exception {
		Session session = getCurrentSession();
		
		session.save(favouriteListBook);
		
		return true;
	}

	@Override
	public boolean removeFavouriteListBook(Integer favouriteListBookID)
			throws Exception {
           boolean removed = false;
		
		Session session = getCurrentSession();
		
		FavouriteListBook favouriteListBook = (FavouriteListBook)session.get(FavouriteListBook.class, favouriteListBookID);
		
		if(favouriteListBook!= null) {
			favouriteListBook.setStatus("removed");
			session.update(favouriteListBook);
			
			removed = true;
		}
				
		return removed;
	}

	@Override
	public List<FavouriteListBook> getFavouriteListBooks(int favouriteListID, Integer pageNumber) throws Exception {
		
		 Session session = getCurrentSession();
		
		 String hql = "from FavouriteListBook as fl where fl.favouriteListID=:favouriteListID and fl.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("favouriteListID", favouriteListID);
		query.setFirstResult(pageNumber * Data.recordsPerPage);
		
		@SuppressWarnings("unchecked")
		List<FavouriteListBook> favouriteListBooks = query.list();
		
		return favouriteListBooks;

	}

	@Override
	public int getTotalFavouriteListBooks(int favouriteListID) {
		Session session = getCurrentSession();
		
		String hql = "from FavouriteListBook as fb where fb.favouriteListID=:favouriteListID and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("favouriteListID", favouriteListID);
		
		return query.list().size();
	}

	@Override
	public int getTotalBooksByTitle(String bookTitle) {
		Session session = getCurrentSession();
		
		String hql = "from BookInfo as bi where bi.bookName like bookName and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setString("bookTitle", bookTitle + "%");
		
		return query.list().size();
	}

	@Override
	public int getTotalBookRatings(int bookID) {
		Session session = getCurrentSession();
		
		String hql = "from BookRating as bi where bi.bookID=bookID and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("bookID", bookID);
		
		return query.list().size();
	}

	@Override
	public int getTotalBookmarks(int userID) {
		Session session = getCurrentSession();
		
		String hql = "from Bookmark as bi where bi.userID=userID and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("userID", userID);
		
		return query.list().size();
	}

	@Override
	public int getTotalSuggestions(int userID) {
		Session session = getCurrentSession();
		
		String hql = "from Suggestion as sg where sg.userID=userID and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("userID", userID);
		
		return query.list().size();
	}

	@Override
	public int getTotalFavouriteLists(int userID) {
		Session session = getCurrentSession();
		
		String hql = "from FavouriteList as fl where fl.userID=userID and fb.status='active'";
		
		Query query = session.createQuery(hql);
		query.setInteger("userID", userID);
		
		return query.list().size();
	
	}
}
