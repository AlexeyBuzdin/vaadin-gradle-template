package com.github.larchaon.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.Label;

import com.vaadin.annotations.Theme;

@Theme("MyVaadinApplication")
public class MyVaadinApplicationUI extends UI{
	
	@Override
	protected void init(VaadinRequest request){
		Label lbl = new Label("Hello vaadin");
		setContent(lbl);
	}
}
