package com.yedam.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String main() {
		System.out.println("main handler 실행됨.");
		return "젠킨스에 올렸다~~~~~";
	}
}
