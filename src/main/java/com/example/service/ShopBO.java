package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Shop;
import com.example.model.ShopAddress;
	
@Service
public class ShopBO {

	
	public Shop addShopDetail(String name, String number, String postCode, double shopLatitude, double shopLongitude) {
		Shop shop = new Shop();
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setNumber(number);
		shopAddress.setPostCode(postCode);
		
		shop.setName(name);
		shop.setShopAddress(shopAddress);
		
		shop.setShopLatitude(shopLatitude);
		shop.setShopLongitude(shopLongitude);
		return shop;
	}
}
