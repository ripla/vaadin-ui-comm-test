package org.vaadin.risto;

import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/*", "/VAADIN/*"}, name = "MyUIServlet", asyncSupported = true, initParams = {
        @WebInitParam(name = "UIProvider", value = "org.vaadin.risto.MyUIProvider") })
public class MyUIServlet extends VaadinServlet {
}
