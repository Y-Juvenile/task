package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "hello world";
	}
}
