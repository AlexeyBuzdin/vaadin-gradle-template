package com.github.larchaon.vaadin;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import com.vaadin.server.VaadinServlet;

@WebServlet(
    asyncSupported=false,
    urlPatterns={"/*","/VAADIN/*"},
    initParams={
        @WebInitParam(name="ui", value="com.github.larchaon.vaadin.MyVaadinApplicationUI")
    })
public class MyVaadinApplicationServlet extends VaadinServlet { }
