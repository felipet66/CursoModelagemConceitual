package com.felipeteles.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.felipeteles.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationEmailHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
}
