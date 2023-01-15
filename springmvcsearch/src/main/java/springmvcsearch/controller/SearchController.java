package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view....");
		return"home";
	}
	@RequestMapping("/search")
	
	public RedirectView search(@RequestParam("querybox")String query) {
		System.out.println(query);
		
		String url="https://www.google.com/search?q="+query;  // google ki url h
		RedirectView redirectView =new RedirectView();
        redirectView.setUrl(url);
		return redirectView ;
		
	}
	
//------------------------------------------------------------------------------------------------	
	                                //@PathVariable Annotation--
	@RequestMapping("/user/{userId}")
public String getUserDetail(@PathVariable("userId") int userId) {
		System.out.println(userId);
	return"home";
}
}
