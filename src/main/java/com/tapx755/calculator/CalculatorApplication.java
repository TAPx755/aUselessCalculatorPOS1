package com.tapx755.calculator;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("---- A Useless Calculator ----");

		System.out.println("Bitte geben Sie die erste Zahl ein");
		int firstInput;
		firstInput = scan.nextInt();
		System.out.println("Ihre erste gewaehlte Zahl: "+firstInput);

		System.out.println("Bitte geben Sie die zweite Zahl ein");
		int secondInput;
		secondInput = scan.nextInt();
		System.out.println("Ihre zweite gewaehlte Zahl: "+secondInput);

		System.out.println("-------------------------------");
		System.out.println("Ergebnis: "+(firstInput+secondInput));
	}
}

