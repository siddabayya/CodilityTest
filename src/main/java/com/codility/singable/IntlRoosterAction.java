package com.codility.singable;

import java.util.Locale;
import java.util.ResourceBundle;

public class IntlRoosterAction implements Singable {

	Locale aLocale = new Locale("en", "US");

	public void setaLocale(Locale aLocale) {
		this.aLocale = aLocale;
	}

	@Override
	public void sing() {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", aLocale);
		System.out.println("I am saying " + messages.getString("sing"));
	}

}
