package com.retail.ecom.payment.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.ecom.payment.bootstrap.PaymentApplication;
import com.retail.ecom.payment.pojo.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	@RequestMapping("/createpayment")
    public  Payment  createpayment(@RequestBody Payment payment) {	
		payment.setId(PaymentApplication.paymentId++);
		PaymentApplication.payments.put(payment.getId(), payment);
		return payment;
    }
	
	@RequestMapping("/authorizepayment")
    public  Payment  authorizepayment(@RequestParam(value="id") String id) {
		Payment payment=PaymentApplication.payments.get(id);
		payment.setAuthId(payment.getId()*12+"");
		return payment;
    }

}
