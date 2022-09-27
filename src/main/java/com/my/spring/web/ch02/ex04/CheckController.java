package com.my.spring.web.ch02.ex04;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ch02/ex04")
public class CheckController {
	@GetMapping
	public String main() {
		return "ch02/ex04/main";
	}
	
	@GetMapping("choice")
	public String choice(int kind) {
		String view = "ch02/ex04/";
		
		switch(kind) {
		case 1: view += "radioIn"; break;
		case 2: view += "checkboxIn";
		}
		return view;
	}
	
	// 핸들러 맵핑 url 지정, 폼 전달 받은 파라메터 받을 수 있게 설정
//	@PostMapping("radio")
//	public String radio(String agree, Model model) {
//		model.addAttribute("agree", agree);
//		return "ch02/ex04/radioOut";
//	}
	
	@PostMapping("radio")
	public String radio(@ModelAttribute("agree") String agree) {
		return "ch02/ex04/radioOut";
	}
	
//	@PostMapping("checkbox")
//	public String checkbox(@RequestParam ArrayList<String> fruit) {
//		System.out.println(fruit);
//		return null;
//	}
	
//	@PostMapping("checkbox")
//	public String checkbox(@RequestParam("fruit") List<String> fruits) {
//		System.out.println(fruits);
//		return null;
//	}
	
	@PostMapping("checkbox")
	public String checkbox(@RequestParam("fruit") List<String> fruits, Model model) {
		model.addAttribute("fruits", fruits);
		return "ch02/ex04/checkboxOut";
	}
}