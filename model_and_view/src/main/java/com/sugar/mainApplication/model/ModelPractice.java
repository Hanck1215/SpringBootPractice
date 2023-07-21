package com.sugar.mainApplication.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelPractice {
	/*	
	 * The final interface to pass values to a view is the ModelAndView.
		This interface allows us to pass all the information required by Spring MVC in one return:
	*/
	@GetMapping("/goToViewPage")
	public ModelAndView passParametersWithModelAndView() {
	    ModelAndView modelAndView = new ModelAndView("view/viewPage");
	    modelAndView.addObject("message", "Baeldung");
	    return modelAndView;
	}

}
