package com.socialbook.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.socialbook.pojo.Customer;

@Controller
@RequestMapping("/customer")
public class SignUpController {

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String addCustomer(@Valid Customer customer, BindingResult result) {

		if (result.hasErrors()) {
			return "signupform";
		} else {
			return "done";
		}

	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {

		model.addAttribute("customer", new Customer());
		return "signupform";

	}

}
