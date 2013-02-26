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

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author <a href="mailto:humayun@cefalo.no">Your Name</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class StartJetty {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        WebAppContext context = new WebAppContext();
        context.setDescriptor("web/WEB-INF/web.xml");
        context.setResourceBase("web");
        context.setContextPath("/");
        context.setParentLoaderPriority(true);
        server.setHandler(context);
        server.start();
        server.join();

    }
}
