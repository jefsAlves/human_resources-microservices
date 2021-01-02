package com.alvesjefs.hrusers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class MsHrUsersApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(MsHrUsersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("JRE@rt56"));
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("JRES84@k"));
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("OREA34@d"));
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("KRe43@ro"));
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("KRETR642"));
		System.out.println("PASS = " + bCryptPasswordEncoder.encode("PASre43@"));

	}

}
