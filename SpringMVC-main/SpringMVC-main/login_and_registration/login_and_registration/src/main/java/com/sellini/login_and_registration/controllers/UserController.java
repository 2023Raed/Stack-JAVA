package com.sellini.login_and_registration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sellini.login_and_registration.models.LoginUser;
import com.sellini.login_and_registration.models.User;
import com.sellini.login_and_registration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	private UserService userServ;

	// === Display Route ===
	@GetMapping("/login")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}

	// ==== Action Route ====
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// 1. Execute the Service method
		userServ.register(newUser, result);

		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "login.jsp";
		} else {
//			System.out.println(newUser.getId());
			session.setAttribute("userID", newUser.getId());
			return "redirect:/success";
		}
	}

	// Display Route
	@GetMapping("/success")
	public String success(HttpSession s, Model model) {
		Long id = (Long) s.getAttribute("userID");
		if(id == null) {
			return "redirect:/login";
		}else {
			
			User loggedinUser = userServ.findOne(id);
			model.addAttribute("user", loggedinUser);
			return "success.jsp";
		}
	}
	
	// === Action Route === Login ===
	@PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        // Add once service is implemented:
         User user = userServ.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "login.jsp";
        }else {
        	session.setAttribute("userID", user.getId());
        	return "redirect:/success";
        }
   
    }
	
}
