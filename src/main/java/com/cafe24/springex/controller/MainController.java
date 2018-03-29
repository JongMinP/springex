package com.cafe24.springex.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* Method 단독 매핑 */
	
	@ResponseBody   // 텍스트 메세지를 넘길때 
	@RequestMapping({"/main","/m",""}) // URL 여러개
	public String main() {
		
		return "MainController:main()";
	}
	
	@ResponseBody    
	@RequestMapping("/a/b/c/main")
	public String main2(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session,
			Writer out
			) {
		
		return "MainController:main2()";
	}
	
	
	
	
}
