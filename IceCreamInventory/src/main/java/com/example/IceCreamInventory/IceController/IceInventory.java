package com.example.IceCreamInventory.IceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IceInventory {

	@RequestMapping(value = "/Index", method = RequestMethod.GET)
	   public String index() 
        {
	      return "Index";
	   }
	
	
}
