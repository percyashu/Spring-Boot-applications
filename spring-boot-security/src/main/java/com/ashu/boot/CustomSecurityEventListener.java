package com.ashu.boot;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;
@Component
public class CustomSecurityEventListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {
	
	
	public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {
		System.out.println(event.getException().getMessage());
	}

}
