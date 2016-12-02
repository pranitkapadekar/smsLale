package com.lale.app.service;

import java.util.ArrayList;
import java.util.List;

import com.lale.app.bo.LaleMessage;
import com.lale.app.bo.LalePhoneNumber;
import com.lale.app.bo.SendMessage;

public class SendMessageServiceImpl implements SendMessageService{

   public SendMessageServiceImpl(){
	   
   }
	
	@Override
	public void sendMessage(String message, String number) {
		// create lalemessage 
		LaleMessage laleMessage = new LaleMessage(message);
		// create lalePhoneNumber
		LalePhoneNumber laleNumber = new LalePhoneNumber(number);
		SendMessage sendMessage = new SendMessage();
		sendMessage.sendMessage(laleMessage, laleNumber);
		
	}

	@Override
	public void broadCastMessage(String message, List<LalePhoneNumber> lalePhoneNumbers) {
		// TODO Auto-generated method stub
		// create lalemessage 
		LaleMessage laleMessage = new LaleMessage(message);
		SendMessage sendMessage = new SendMessage();
		sendMessage.broadCastMessage(laleMessage, lalePhoneNumbers);
	}
	
	public List<LalePhoneNumber> getListOfNumbers(List<String> phoneNumbers){
		ArrayList<LalePhoneNumber> numList = new ArrayList<LalePhoneNumber>();
		for(String num : phoneNumbers){
			numList.add(new LalePhoneNumber(num));
		}
		return numList;
	}

		
}
