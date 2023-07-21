package com.sugar.mainApplication.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelPractice {
	/*	
	 * Just like the Model interface above, ModelMap is also used to pass values to render a view.
		The advantage of ModelMap is it gives us the ability to pass a collection of values and treat these values as if they were within a Map:
	*/
	@GetMapping("/printViewPage")
	public String passParametersWithModelMap(ModelMap map) {
	    map.addAttribute("welcomeMessage", "welcome");
	    map.addAttribute("message", "Baeldung");
	    return "view/viewPage";
	}
}
