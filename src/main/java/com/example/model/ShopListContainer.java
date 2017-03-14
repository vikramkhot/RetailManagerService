package com.example.model;

import java.util.LinkedList;
import java.util.List;

public class ShopListContainer {

	 private List<Shop> shopList = new LinkedList<Shop>();

	/**
	 * @param shopList
	 */
	public ShopListContainer() {
		//this.shopList = shopList;
	}

	/**
	 * @return the shopList
	 */
	public List<Shop> getShopList() {
		return this.shopList;
	}

	/**
	 * @param shopList the shopList to set
	 */
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	 
	 
}
