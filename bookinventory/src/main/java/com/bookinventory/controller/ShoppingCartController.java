package com.bookinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookinventory.entity.Book;
import com.bookinventory.entity.ShoppingCart;
import com.bookinventory.service.ShoppingCartService;

@RestController
@RequestMapping("/api/shoppingcart")
public class ShoppingCartController {
	
	 @Autowired
	    private ShoppingCartService shoppingCartService;

	    // POST: Add a new ShoppingCart
	    @PostMapping("/post")
	    public ResponseEntity<String> addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
	        shoppingCartService.addShoppingCart(shoppingCart);
	        return ResponseEntity.ok("Shopping cart added successfully");
	    }
	    
	    
	    // GET: Get list of books by userId
	    @GetMapping("/{userId}")
	    public ResponseEntity<List<Book>> getBooksByUserId(@PathVariable Integer userId) {
	        List<Book> books = shoppingCartService.getBooksByUserId(userId);
	        if (books.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(books);
	    }
	    
	    // PUT: Update ISBN of ShoppingCart by userId
	    @PutMapping("/{userId}")
	    public ResponseEntity<String> updateIsbnByUserId(@PathVariable Integer userId, @RequestParam("isbn") String isbn) {
	        String response = shoppingCartService.updateIsbnByUserId(isbn, userId);
	        return ResponseEntity.ok(response);
	    }

   }

