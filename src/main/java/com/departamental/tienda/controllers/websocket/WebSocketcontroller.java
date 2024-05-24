package com.departamental.tienda.controllers.websocket;
import com.departamental.tienda.models.websocket.Message;
import com.departamental.tienda.models.websocket.Stats;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketcontroller {
    @MessageMapping("/messages")
    @SendTo("/topic/groupMessages")
    public Message sendMessage (Message message){
        return message;
    }
}