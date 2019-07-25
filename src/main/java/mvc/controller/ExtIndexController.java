package mvc.controller;

import mvc.extannotation.ExtController;
import mvc.extannotation.ExtRequestMapping;

@ExtController
@ExtRequestMapping("/test")
public class ExtIndexController {

	@ExtRequestMapping("/index")
	public String test(String name,Integer age) {
		System.out.println("---- 纯手写SpringMVC框架 ----");
		return "index";
	}

}
