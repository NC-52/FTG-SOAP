package com.example.demo;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.soap.example.GetPersonRequest;
import io.soap.example.GetPersonResponse;
import io.soap.example.Person;


@Endpoint
public class PersonEndpoint {
	private static final String NAMESPACE_URI = "http://www.soap.io/example";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
	@ResponsePayload
	public GetPersonResponse getPerson() {
		Person p = new Person();
		p.setAddress("Logpom");
		p.setEmail("test@yahoo.com");
		p.setId(1);
		p.setName("ibm");
		GetPersonResponse resp = new GetPersonResponse();
		resp.setPerson(p);
		return resp;
	}
}
