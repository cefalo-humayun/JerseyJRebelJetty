/*
 * $Header$
 *
 * Copyright (C) 2013 Escenic AS.
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Escenic AS.  This notice must be included on all
 * copies, modifications and derivatives of this work.
 */
package com.shadesh.myapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author <a href="mailto:humayun@cefalo.no">Your Name</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World PLAIN text";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?><hello> Hello World XML, YAY!!!</hello>";
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html>" +
                "<title>Hello World HTML</title>" +
                "<body>" +
                "<h1>Hello World HTML JRebel Rules!</h1>" +
                "<h2>Testing for JRebel</h2>" +
                "</body>" +
                "</html>";
    }

    @POST
    @Consumes({"text/xml", "text/plain", MediaType.TEXT_HTML})
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPostHello() {
        return "Hello World Post!";
    }
}
