package com.departamental.tienda.config;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
@CrossOrigin
@Controller
@EnableWebSocketMessageBroker

public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     * Configuración general del socket
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //Se habilita el broker en la direccion /topic (Para escuchar paquetes)
        registry.enableSimpleBroker("/topic");
        //Se habilita el medio para publicar mensajes dentro del broker (Para publicar paquetes)
        registry.setApplicationDestinationPrefixes("/app");
    }
    /**
     * Configuración del enpoint
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //Añade la direccion /messages para la subscripcion de clientes (para conectar al WebSocket)
        registry.addEndpoint("/messages").setAllowedOrigins("*");
        registry.addEndpoint("/stats").setAllowedOrigins("*");
    }
}