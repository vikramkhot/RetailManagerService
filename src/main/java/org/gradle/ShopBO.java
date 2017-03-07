package org.gradle;

import org.springframework.stereotype.Service;
	
@Service
public class ShopBO {

	
	public Shop addShopDetail() {
		Shop shop = new Shop();
		ShopAddress shopAddress = new ShopAddress();
		
		shop.setName("Shop 1");
		shop.setShopAddress(shopAddress);
		
		return shop;
	}
}
