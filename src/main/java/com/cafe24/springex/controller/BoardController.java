package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/* RequestMapping (타입 단독 매핑) 별로 해놓으면 메소드 이름으로 매핑된다. */
@Controller
@RequestMapping("/board/*")
public class BoardController {
	

	@ResponseBody
	@RequestMapping
	public String list( // required 필요한 놈이냐?  jbolg 파라미터 정규표현식
			@RequestParam(value="p" , required = true, defaultValue ="1") Integer page ) {
		return "list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String insert() {
		return "insert()";
	}
	
	
	

}
