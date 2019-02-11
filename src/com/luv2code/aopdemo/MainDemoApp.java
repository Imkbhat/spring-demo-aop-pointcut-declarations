package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext  ctxt = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean
		AccountDAO dao = ctxt.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO memDao =  ctxt.getBean("membershipDAO", MembershipDAO.class);
		
		//call  business method
		dao.addAccount(new Account(), true);
		memDao.addSilly();
		
		dao.doWork();
		memDao.goToSleep();
		
		//close  context
		ctxt.close();
	}

}
