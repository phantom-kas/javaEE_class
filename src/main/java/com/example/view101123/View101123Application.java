package com.example.view101123;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class View101123Application {

	public static void main(String[] args) {
		SpringApplication.run(View101123Application.class, args);
	}

	@RequestMapping("/register")
	public String  resForm(){
		return "register";
	}

	@ResponseBody
	@RequestMapping("/checkusername")
	public Map<String,String> checkUsername(String username){
		Map<String,String> result = new HashMap<String,String>();
		System.out.print("Test!!!!!!!");
		boolean r  = true;
		if(!username.equals("admin")){
			result.put("available","yes");
		}
		else{
			result.put("available","no");
		}
		return result;
	}
	
}
