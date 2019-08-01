package net.tzolov.poc.prometheusrsocketdemo;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrometheusRsocketDemoApplication implements CommandLineRunner {

	private Timer.Sample sample;

	public static void main(String[] args) {
		SpringApplication.run(PrometheusRsocketDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		this.sample = Timer.start(Metrics.globalRegistry);

		Thread.sleep(10 * 1000);

		System.out.println("Bingo");

		this.sample.stop(Timer.builder("net.tzolov.demo")
				.description("Task duration")
				.tag("my.simple.tag", "tag.tag")
				.register(Metrics.globalRegistry));
	}
}
