package com.lale.app.service;

import java.util.List;

import com.lale.app.bo.LalePhoneNumber;

public interface SendMessageService {

	void sendMessage(String message, String number);

	void broadCastMessage(String message, List<LalePhoneNumber> number);

}
