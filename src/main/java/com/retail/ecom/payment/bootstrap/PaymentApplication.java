package com.retail.ecom.payment.bootstrap;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.retail.ecom.payment.pojo.Payment;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.retail"})
public class PaymentApplication {
	
	public static int paymentId=1;
	public static Map<Integer,Payment> payments=new HashMap<Integer,Payment>();

	public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}
