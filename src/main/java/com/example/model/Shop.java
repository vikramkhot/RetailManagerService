package com.example.model;

public class Shop {

    private String name;
    ShopAddress shopAddress;
    
    private double shopLongitude;
    private double shopLatitude;
    
	/**
	 * @return the shopLongitude
	 */
	public double getShopLongitude() {
		return shopLongitude;
	}
	/**
	 * @param shopLongitude the shopLongitude to set
	 */
	public void setShopLongitude(double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	/**
	 * @return the shopLatitude
	 */
	public double getShopLatitude() {
		return shopLatitude;
	}
	/**
	 * @param shopLatitude the shopLatitude to set
	 */
	public void setShopLatitude(double shopLatitude) {
		this.shopLatitude = shopLatitude;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shopAddress
	 */
	public ShopAddress getShopAddress() {
		return shopAddress;
	}
	/**
	 * @param shopAddress the shopAddress to set
	 */
	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}
    
}
