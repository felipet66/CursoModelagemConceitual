package com.felipeteles.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipeteles.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
