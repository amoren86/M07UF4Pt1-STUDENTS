package cat.institutmarianao.tickets.webclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelview = new ModelAndView("welcome");
		modelview.getModelMap().addAttribute("welcome", "Welcome to Tickets!");
		modelview.getModelMap().addAttribute("tagline", "A simple client to test the ticket reservation service");
		return modelview;
	}

}
