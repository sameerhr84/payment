package com.retail.ecom.payment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public  ResponseEntity<?>  createpayment(@RequestBody Payment payment) {	
		payment.setId(PaymentApplication.paymentId++);
		PaymentApplication.payments.put(payment.getId(), payment);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }
	
	@RequestMapping("/authorizepayment")
    public  ResponseEntity<?>  authorizepayment(@RequestParam(value="id") String id) {
		Payment payment=PaymentApplication.payments.get(id);
		payment.setAuthId(payment.getId()*12+"");
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }

}
