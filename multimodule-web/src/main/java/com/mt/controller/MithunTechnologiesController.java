package com.mt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MithunTechnologiesController {
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
	@ResponseBody
	String getData(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {
		System.out.println(":::Method calling:::");
		JSONObject js = new JSONObject();
		js.put("Name", "Mithun Reddy L");
		js.put("Technology", "DevOps  ");

		return js.toString();
	}
}
