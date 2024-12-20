package com.bookinventory.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookinventory.entity.Book;
import com.bookinventory.entity.ShoppingCart;
import com.bookinventory.repository.ShoppingCartRepository;
import com.bookinventory.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Override
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public List<Book> getBooksByUserId(int userId) {
        // Retrieve the list of books associated with the given userId
        return shoppingCartRepository.findBooksByUserId(userId);
    }

    @Override
    public String updateIsbnByUserId(String isbn, int userId) {
        // Update the ISBN for the ShoppingCart entries associated with the given userId
        int status= shoppingCartRepository.updateIsbnByUserId(isbn, userId);
        if(status>1) {
    		return "updated sucessfully";
    	}
    	else
    		return "Not updated";
    }
    }





