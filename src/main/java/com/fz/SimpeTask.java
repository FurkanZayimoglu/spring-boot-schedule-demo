package com.fz;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpeTask {

	@Scheduled(fixedRate = 10000)
	public void timestamp() {
		System.out.println(LocalDateTime.now());
	}
	
}
