package com.ilp.service;

import java.util.Map;

import com.ilp.entity.PlayerInventory;
import com.ilp.entity.Shop;
import com.ilp.interfaces.purchaseHeart;

public class BuyHeartsWithDiamonds extends Shop implements purchaseHeart {
	
	public BuyHeartsWithDiamonds(PlayerInventory playerInventory) {
        super(playerInventory);
    }

    @Override
    public void buyHeart(int amount, Map<String, Integer> userData) {
    	int diamonds = userData.get("diamonds");
        if (diamonds >= amount * 10) {
            userData.put("diamonds", diamonds - amount * 10);
            userData.put("hearts", userData.get("hearts") + amount);
        } else {
            System.out.println("Insufficient diamonds");
        }
    }

}
