package com.integ.test.api;

/*
* Author: Manan
* Date: 18-01-2018 13:52
*/

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("hello")
public class HelloApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@QueryParam("name") String name) {
        return "Hello " + name;
    }
}
