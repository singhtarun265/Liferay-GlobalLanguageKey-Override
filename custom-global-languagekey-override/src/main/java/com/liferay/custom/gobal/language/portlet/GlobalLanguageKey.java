package com.liferay.custom.gobal.language.portlet;

import com.liferay.portal.kernel.language.UTF8Control;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

@Component(
		 property = { "language.id=en_US" }, 
		 service = ResourceBundle.class
		
		)
public class GlobalLanguageKey extends ResourceBundle{

	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		return _resourceBundle.getObject(key);
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return _resourceBundle.getKeys();
	}

	 private final ResourceBundle _resourceBundle = ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);
}
