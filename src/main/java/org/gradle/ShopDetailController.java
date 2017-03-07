package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shop")
public class ShopDetailController {

	@Autowired
	ShopBO shopBO;
	
	
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public @ResponseBody ShopListContainer addShopDetail(@RequestParam(value="name", required=false, defaultValue="Vikram Khot Shop") String name,
    		@RequestParam(value="number", required=false, defaultValue="1") String number,
    		@RequestParam(value="postCode", required=false, defaultValue="001") String postCode) {
    	
    	List<Shop> lsitOfShops = new ArrayList<>();
    	
    	lsitOfShops.add(shopBO.addShopDetail());
    	
    	ShopListContainer shopListContainer = new ShopListContainer(lsitOfShops);
    	
    	return shopListContainer;
    }

}
