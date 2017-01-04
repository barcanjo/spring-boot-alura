package br.com.alura.enviador.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public void enviar(String nome, String emailDestinatario) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dev.katecafe@gmail.com", "Impacta@2015"));
			email.setStartTLSRequired(true);
			
			email.setFrom("dev.katecafe@gmail.com");
			email.setSubject("Você foi convidado pelo Lista VIP");
			email.setMsg("Olá " + nome + ", você acaba de ser convidado pelo Lista VIP");
			email.addTo(emailDestinatario);
			
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
