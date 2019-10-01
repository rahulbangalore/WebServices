package com.zensar.webservice.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		return ("WELCOME TO ZENSAR HELLO SERVICE");
	}
@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String HtmlHello() {
		return "<h1>WELCOME 2 ZENSAR HTML</h1>";
	}
@Path("/xml")
@GET
@Produces(MediaType.TEXT_XML)
public String XmlHello() {
	return "<?xml version='1.0'?><hello>welcome to zensar technologies</hello>";
}

}
