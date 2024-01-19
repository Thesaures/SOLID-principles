package com.ilp.entity;

import java.util.Map;

import com.ilp.service.customerService;

public class Shop {
	private PlayerInventory playerInventory;

	public Shop(PlayerInventory playerInventory) {
        this.playerInventory = playerInventory;
    }

	public PlayerInventory getPlayerInventory() {
		return playerInventory;
	}

	public void setPlayerInventory(PlayerInventory playerInventory) {
		this.playerInventory = playerInventory;
	}

    
}
