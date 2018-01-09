package com.newer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhaoxugui
 * @Description: com.newer.web
 * @Date: Created in 2018/1/8 14:57
 * @Version: 1.0.0
 */
@Controller
public class TestController {
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
}
