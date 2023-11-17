package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	public class gitItemEditController {
		@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
		public String doEditGet() {
			return "edit";
		}
		
		@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
		public String doEditPost() {
		return "gititemedit";
		}
	}
