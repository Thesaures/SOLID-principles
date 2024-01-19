package com.ilp.utility;

public class customers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayerInventory playerInventory = new PlayerInventory();

        // Player buys 5 hearts with diamonds
        Purchasable buyHeartsShop = new BuyHeartsWithDiamonds(playerInventory);
        buyHeartsShop.buy(5);

        // Player buys 20 diamonds with gold coins
        Purchasable buyDiamondsShop = new BuyDiamondsWithGoldCoins(playerInventory);
        buyDiamondsShop.buy(20);

        // Display player's current inventory
        System.out.println("Player's Inventory:");
        System.out.println("Hearts: " + playerInventory.getItemQuantity("hearts"));
        System.out.println("Diamonds: " + playerInventory.getItemQuantity("diamonds"));
        System.out.println("Gold Coins: " + playerInventory.getItemQuantity("goldCoins"));

	}

}
