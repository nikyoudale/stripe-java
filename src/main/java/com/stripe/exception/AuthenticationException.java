package com.stripe.exception;

public class AuthenticationException extends StripeException {


	public AuthenticationException(String message) {
		super(message, null);
	}

	private static final long serialVersionUID = 1L;

}
