package com.lale.app.bo;

import java.io.Serializable;
import java.util.List;

public class RequestWrapper implements Serializable{
	
	private LaleMessage laleMessage;
	private List<LalePhoneNumber> lalePhoneNumbers;
	
	public RequestWrapper(){
		
	}

	public LaleMessage getLaleMessage() {
		return laleMessage;
	}

	public void setLaleMessage(LaleMessage laleMessage) {
		this.laleMessage = laleMessage;
	}

	public List<LalePhoneNumber> getLalePhoneNumbers() {
		return lalePhoneNumbers;
	}

	public void setLalePhoneNumbers(List<LalePhoneNumber> lalePhoneNumbers) {
		this.lalePhoneNumbers = lalePhoneNumbers;
	}

	
	
	
	

}
