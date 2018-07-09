package com.retail.ecom.content.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.ecom.payment.pojo.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	@RequestMapping("/createpayment")
    public  ResponseEntity<?>  offer(@RequestParam(value="id") String id) {	
		Payment payment=new Payment();
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }
	
	@RequestMapping("/authorizepayment")
    public  ResponseEntity<?>  seller(@RequestParam(value="id") String id) {
		Payment payment=new Payment();
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }

}
