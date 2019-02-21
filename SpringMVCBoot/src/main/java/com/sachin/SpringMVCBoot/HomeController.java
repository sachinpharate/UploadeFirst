package com.sachin.SpringMVCBoot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/home")
	public ModelAndView Home(Alion Ali) {
//String name =req.getParameter("Myname");
		/*
		 * System.out.println("hiiiii"); session.setAttribute("name", Myname);
		 */

		ModelAndView mv = new ModelAndView();
		mv.addObject("Obj", Ali);
		mv.setViewName("home");
		return mv;
	}
}
