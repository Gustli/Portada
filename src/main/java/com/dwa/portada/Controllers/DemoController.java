package com.dwa.portada.Controllers;

import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;


	@Controller
	public class DemoController {
		@GetMapping("/")
		public String Portada() {
			return "Portada";
		}
		

}
