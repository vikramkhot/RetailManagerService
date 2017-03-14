package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shop;
import com.example.model.ShopListContainer;
import com.example.service.ShopBO;

@RestController
@RequestMapping("/shop")
public class ShopDetailController {

	@Autowired
	ShopBO shopBO;
	
	public static ShopListContainer shopListContainer  = new ShopListContainer();
	
	
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public ShopListContainer addShopDetail(@RequestParam(value="name", required=false, defaultValue="Apollo Bunder") String name,
    		@RequestParam(value="number", required=false, defaultValue="1") String number,
    		@RequestParam(value="postCode", required=false, defaultValue="001") String postCode) {
    	
    	List<Shop> lsitOfShops = new ArrayList<>();
    	//this has to search using address and other details and return the longitude and latitude 
    	double shopLongitude = 18.92038860;
    	double shopLatitude = 72.83013059999999;
    			
    	lsitOfShops.add(shopBO.addShopDetail(name, number, postCode, shopLongitude, shopLatitude));
    	
    	shopListContainer.setShopList(lsitOfShops);
    	
    	return shopListContainer;
    }

}
