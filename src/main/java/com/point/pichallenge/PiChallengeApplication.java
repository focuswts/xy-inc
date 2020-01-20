package com.point.pichallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.point.pichallenge.entity.PI;

@SpringBootApplication
public class PiChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiChallengeApplication.class, args);
		
		PI pi = new PI();
		pi.setCordX(10);
		pi.setCordY(20);
		
		System.out.println("Coordenada x: " + pi.getCordX() + " CoordY: " + pi.getCordY() + " Calculated: " + pi.getCordCalculated());;
		
	}

}
