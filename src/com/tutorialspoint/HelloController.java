package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tutorialspoint.logic.Calculate;

import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class HelloController {
	
	Calculate cal = new Calculate() ;
   @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      int value= cal.calculate();
      model.addAttribute("value", value);
      return "hello";
   }
}