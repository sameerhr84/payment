package com.retail.ecom.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.ecom.payment.bootstrap.PaymentApplication;
import com.retail.ecom.payment.pojo.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	Environment environment;
	
	
	@RequestMapping("/createpayment")
    public  Payment  createpayment(@RequestBody Payment payment) {	
		payment.setId(PaymentApplication.paymentId++);
		PaymentApplication.payments.put(payment.getId(), payment);
		
		String port = environment.getProperty("local.server.port");
		payment.setHostName(PaymentApplication.hostName+":"+port);
		
		return payment;
    }
	
	@RequestMapping("/authorizepayment")
    public  Payment  authorizepayment(@RequestParam(value="id") Integer id) {
		Payment payment=PaymentApplication.payments.get(id);
		payment.setAuthId(payment.getId()*12+"");
		
		String port = environment.getProperty("local.server.port");
		payment.setHostName(PaymentApplication.hostName+":"+port);
		
		return payment;
    }

}
