package com.integ.test;

/*
* Author: Manan
* Date: 18-01-2018 13:48
*/

import com.integ.test.api.HelloApi;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("webapp")
public class JerseyApp extends ResourceConfig {

    public JerseyApp() {
        register(HelloApi.class);
    }
}
