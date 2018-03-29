package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/* RequestMapping(타입 + 메소드) */

@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping(value = "/join" , method = RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) {  // ModelAttribute를 사용하면 좋다.
													// 자바리플렉션을 통해 이름으로 필드를 매칭
													// vo랑 태그네임을 맞춰야 편하게 사용 가능하다.
		// 인코딩을 필터를 통해 한다.
		System.out.println(vo);
		return "UserController:join()";
	}
	
	
	
	@RequestMapping(value = "/join" , method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "UserController:loginform()";
	}
	
	@ResponseBody
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String login(
			// 파라미터가 없으면 널을 넣어준다.
			@RequestParam(value="email", required=false) String email, 
			// 파라미터가 없으면 디폴트 값을 넣어 준다.
			@RequestParam(value="pwd", required = true, defaultValue="") String password) {
		return "UserController:login():" + email + ":" + password;
	}
	
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") Long no) {
		return "UserController:loginform()" + no ;
	}

	
	
}
