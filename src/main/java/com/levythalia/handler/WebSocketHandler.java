package com.levythalia.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {

	//ocorre quando ha nova conexão realizada
	@Override
	public void afterConnectionEstablished(WebSocketSession session) {
		System.out.println("[afterConnectionEstablished] session id = " + session.getId());
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) {
		System.out.println("[handleTextMessage] message = " + message.getPayload());
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
		System.out.println("[afterConnectionClosed] session id = "  + session.getId());
	}
	
	
}
