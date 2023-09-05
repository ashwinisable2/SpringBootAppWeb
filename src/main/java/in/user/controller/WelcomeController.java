package in.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/Welcome")
	public ModelAndView WelcomeMeg()
	{
		ModelAndView mav=new ModelAndView();
		//setting data to display in view
		mav.addObject("msg","Hello World ...!!!");
		
		//setting view file name(logical name)
		mav.setViewName("index");
		
		return mav;
	}

}

