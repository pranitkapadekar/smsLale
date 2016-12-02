package com.lale.app.bo;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACacdc5f05c7ffb447753aeb49b9dae517";
  public static final String AUTH_TOKEN = "d18a8aec2e9f8ef963252b0e0eaf08dd";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+12134472302"),
        new PhoneNumber("+14249032764"), 
        "This is a test message").create();

    System.out.println(message.getSid());
  }
}