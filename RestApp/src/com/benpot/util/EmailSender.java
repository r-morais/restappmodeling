package com.benpot.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class EmailSender {

	private String mailSMTPServer;
	private String mailSMTPServerPort;
	private static String mailSender = "mx.morais@gmail.com";

	public EmailSender() {
		mailSMTPServer = "smtp.gmail.com";
		mailSMTPServerPort = "465";
	}

	public EmailSender(String mailSMTPServer, String mailSMTPServerPort) { 
		this.mailSMTPServer = mailSMTPServer;
		this.mailSMTPServerPort = mailSMTPServerPort;
	}

	public static void main(String[] args) {
		EmailSender es = new EmailSender();
		es.sendMail(mailSender, "rodrigom@jmsegs.com", "Teste", "Mensagem <b>negrito</b>");
	}
	
	public void sendMail(String from, String to, String subject, String message) {

		Properties props = new Properties();

		/*
		 * props.setProperty("proxySet","true");
		 * props.setProperty("socksProxyHost","192.168.155.1"); // IP do
		 * Servidor Proxy props.setProperty("socksProxyPort","1080"); // Porta
		 * do servidor Proxy
		 */

		props.put("mail.transport.protocol", "smtp"); 
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", mailSMTPServer); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.user", from); 
		props.put("mail.debug", "false");
		props.put("mail.smtp.port", mailSMTPServerPort); 
		props.put("mail.smtp.socketFactory.port", mailSMTPServerPort); 
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		SimpleAuth auth = new SimpleAuth("mx.morais@gmail.com", "daniedigo1812");

		Session session = Session.getDefaultInstance(props, auth);
		session.setDebug(true); 
		
		Message msg = new MimeMessage(session);

		try {
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setFrom(new InternetAddress(from));
			msg.setSubject(subject);
			msg.setContent(message, "text/html");

		} catch (Exception e) {
			System.out.println(">> Erro: Completar Mensagem");
			e.printStackTrace();
		}

		Transport tr;
		try {
			tr = session.getTransport("smtp"); 
			tr.connect(mailSMTPServer, "seuusuarioparalogin", "suasenhaparalogin");
			msg.saveChanges(); 
			
			tr.sendMessage(msg, msg.getAllRecipients());
			tr.close();
		} catch (Exception e) {			
			System.out.println(">> Erro: Envio Mensagem");
			e.printStackTrace();
		}

	}
}


class SimpleAuth extends Authenticator {
	public String username = null;
	public String password = null;

	public SimpleAuth(String user, String pwd) {
		username = user;
		password = pwd;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
	}
}