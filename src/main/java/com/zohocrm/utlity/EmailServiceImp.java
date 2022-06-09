package com.zohocrm.utlity;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImp implements EmailService {
	@Autowired
	 private  JavaMailSender emailSender;

	@Override
	public void sendMassge(String to,String subject, String text) {
		
		MimeMessage message = emailSender.createMimeMessage();
		try {
	          MimeMessageHelper massegeHelper=new MimeMessageHelper(message,true);
	          massegeHelper.setTo(to);
	          massegeHelper.setSubject(subject);
	          massegeHelper.setText(text);
			  emailSender.send(message);
			}catch(MessagingException e) {
				e.printStackTrace();
			}
		}



	}


