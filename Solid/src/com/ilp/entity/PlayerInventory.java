package com.ilp.entity;
import java.util.Map;

import com.ilp.interfaces.purchaseHeart;
import com.ilp.service.customerService;

public class PlayerInventory {
	    private Map<String, Integer> userData;

	    public PlayerInventory(Map<String, Integer> userData) {
	        this.userData = userData;
	    }

		public Map<String, Integer> getUserData() {
			return userData;
		}

		public void setUserData(Map<String, Integer> userData) {
			this.userData = userData;
		}
}


    







