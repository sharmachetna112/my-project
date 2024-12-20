package com.bookinventory.service;

import java.util.List;

import com.bookinventory.entity.Book;
import com.bookinventory.entity.ShoppingCart;

public interface ShoppingCartService {
	ShoppingCart addShoppingCart(ShoppingCart shoppingCart);

    // Get ShoppingCart entries by userId
    List<Book> getBooksByUserId(int userId);

    // Update ISBN for a ShoppingCart entry by userId
    String updateIsbnByUserId(String isbn, int userId);
   
}