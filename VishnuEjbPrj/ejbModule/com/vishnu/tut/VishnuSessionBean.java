package com.vishnu.tut;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class VishnuSessionBean {

	public String VishnuSessionBeanMethod() {

		return "This is a test VishnuSessionBeanMethod executed... ";

	}

	public String VishnuSessionBeanMethodTwo() {

		return "This is a test VishnuSessionBeanMethod two executed... ";

	}

	public int VishnuSessionBeanMethodSUM(int a, int b) {

		return a + b;

	}

}
