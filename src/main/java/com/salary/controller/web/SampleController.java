package com.salary.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.salary.common.JsonResult;
import com.salary.model.entity.UserInfo;
import com.salary.service.UserService;

@Controller
public class SampleController {

	private UserService userService;
	@RequestMapping("/index")
	public String index() {
		return "index.ftl";
	}
	
	@RequestMapping("/userinfo")
	@ResponseBody
	public JsonResult<UserInfo> getUserinfo(@RequestParam(defaultValue="1") int userId, Model model) {
		UserInfo userInfo = userService.getUserInfoById(userId);
		Boolean flag = true;
		String message = "success";
		
		return new JsonResult<UserInfo>(flag, message, userInfo);
	}
	
	@Autowired
	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
