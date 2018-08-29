package com.retail.ecom.payment.bootstrap;

import java.net.InetAddress;
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
	
	public static  String hostName;

	public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
        
        try {
			hostName = InetAddress.getLocalHost().getHostName();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
