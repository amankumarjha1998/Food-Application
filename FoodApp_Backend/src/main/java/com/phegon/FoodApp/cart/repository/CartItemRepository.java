package com.phegon.FoodApp.cart.repository;

import com.phegon.FoodApp.cart.entity.Cart;
import com.phegon.FoodApp.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
