package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(
			@RequestParam("n") String name, Model model) { // 안걸려있으면 이름인 name을 찾아서 알아서 넣어준다.
		// RequestParam이 걸려있으면 걸려있는 것으로 찾아서 넣어 준다.
		// @AuthUser UserVo authUser,(세션을 쓰면 HttpSession 으로 받으면 기술침투 어노테이션을 만들어서 받는다)
		
		System.out.println(name);
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello.jsp";
	}

	@RequestMapping("/hello2")
	public ModelAndView hello(String name) { // modelandview는 new 해야되서 잘 안씀
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.setViewName("/WEB-INF/views/hello.jsp");

		return mav;
	}

}
