package com.sendMessage.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Service
public class SendMessageService {
    public final SnsClient snsClient;

    @Autowired
    public SendMessageService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public String sendsms(String phoneNumber, String message) {
        PublishRequest request = PublishRequest.builder()
                .message(message)
                .phoneNumber(phoneNumber)
                .build();

        PublishResponse result = snsClient.publish(request);
        return result.messageId();
    }
}
