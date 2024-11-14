package com.sendMessage.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sendMessage.Dtos.SendMessageDto;
import com.sendMessage.Services.SendMessageService;

@RestController
public class SendMessageController {
    private final SendMessageService sendMessageService;

    @Autowired
    public SendMessageController(SendMessageService sendMessageService) {
        this.sendMessageService = sendMessageService;
    }

    @GetMapping("/send-sms")
    public String sendSms(@RequestParam String phoneNumber, @RequestParam String message) {
        return sendMessageService.sendsms(phoneNumber, message);
    }

    @PostMapping("/send-sms")
    public String sendSms(@RequestBody SendMessageDto sendMessageDto) {
        return sendMessageService.sendsms(sendMessageDto.getPhoneNumber(), sendMessageDto.getMessage());
    }

}
