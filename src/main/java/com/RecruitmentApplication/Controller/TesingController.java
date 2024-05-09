package com.RecruitmentApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
public class TesingController {
	@Autowired
    private JavaMailSender javaMailSender;

@GetMapping("/testing")
public String getValue() {
	return "RecruitmentApplication working";
}
@GetMapping("/email")
public String emailSend() {
	try {

MimeMessage mimeMessage=javaMailSender.createMimeMessage();
MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true);
mimeMessageHelper.setFrom("vinayak.vignan@gmail.com");
mimeMessageHelper.setTo("shashikumar.thotla@gigleaz.com");
mimeMessageHelper.setText("wellcome to GigLeaz shashikumar");
mimeMessageHelper.setSubject("Admin-Gigleaz");
javaMailSender.send(mimeMessage);

return "email send sucussfully";
	}
	catch(Exception e) {
		return "email not send";	
	}
}

}
