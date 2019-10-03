package com.zensar.webservice.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.org.glassfish.gmbal.ParameterNames;

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

@GET
@Path("/{nm}")
@Produces("text/plain")
public String sayHelloUser(@PathParam("nm")String name) {
	return "dear "+name+" welcome to zen hello swerice";
}

@GET
@Path("res/{nm}")
@Produces("text/plain")
public Response sayHelloUserResponse(@PathParam("nm")String name) {
	Response res= Response.status(200).entity("dear "+name+" welcome to zen hello swerice").build();
	return res;
	
}

@GET
@Path("res/{nm}/{dd}/{mm}/{yy}")
@Produces("text/plain")
public Response sayHappyBday(@PathParam("nm")String name,@PathParam("dd")int day,@PathParam("mm")int month,@PathParam("yy")int year) {
	LocalDate birthdate=LocalDate.of(year, month, day);
	Response res= Response.status(200).entity("dear "+name+" happy fukin Bday on "+birthdate+" welcome to zensar hello service").build();
	return res;
	
}

}
