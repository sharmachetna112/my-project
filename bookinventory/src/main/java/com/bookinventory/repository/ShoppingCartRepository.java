package com.bookinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bookinventory.entity.Book;
import com.bookinventory.entity.ShoppingCart;

import jakarta.transaction.Transactional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
	
	@Query("select s.book from ShoppingCart s where s.user.userID = ?1")
    List<Book> findBooksByUserId(Integer userId);
	
	@Transactional
	@Modifying
	 @Query("update ShoppingCart s set s.book.isbn = ?1 where s.user.userID = ?2")
    public int updateIsbnByUserId(String isbn, int userId);
}