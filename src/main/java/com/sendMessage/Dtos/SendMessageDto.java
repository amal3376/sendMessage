package com.sendMessage.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendMessageDto {
    private String message;
    private String phoneNumber;
}
