package backend.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Date: 8/14/2024
 * @author LiamMcIntosh
 * Generic Controller class to handle Api end points which do not
 * require any authentication. End points do not perform any functions
 * accessing either db.
 */
@RestController
@RequestMapping("/backend/demo/default")
public class DefaultController {
	
	
	/**
	 * Date: 8/14/2024
	 * @author LiamMcIntosh
	 * @return String
	 * Simple hello message indicating the user should sign in
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, you haven't signed in yet so you can't access other end points. :(";
	}

}
