package com.lale.app.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lale.app.bo.RequestWrapper;
import com.lale.app.service.SendMessageServiceImpl;

@RestController
@RequestMapping("/send")
public class SendMessageController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}
	
	@RequestMapping(value = "/{number}/{message}", method = RequestMethod.GET)
	public void sendMessage(@PathVariable String number, @PathVariable String message) {
		SendMessageServiceImpl service = new SendMessageServiceImpl();
		service.sendMessage(message, number);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<RequestWrapper> sendMessages(@RequestBody RequestWrapper requestWrapper){
		//System.out.println(requestWrapper.getLaleMessage().getMessage());
		SendMessageServiceImpl service = new SendMessageServiceImpl();
		service.broadCastMessage(requestWrapper.getLaleMessage().getMessage(), requestWrapper.getLalePhoneNumbers());
		return new ResponseEntity<RequestWrapper>(requestWrapper, HttpStatus.OK);
		
	}

}
