package com.departamental.tienda.controllers.websocket;
import com.departamental.tienda.models.websocket.Message;
import com.departamental.tienda.models.websocket.Stats;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketcontroller2 {
    @MessageMapping("/getStats")
    @SendTo("/topic/stats")
    public Stats sendStat(Stats stats){
        return stats;
    }
    //función get Stats
}