package com.retail.ecom.content.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.retail"})
public class PaymentApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}
