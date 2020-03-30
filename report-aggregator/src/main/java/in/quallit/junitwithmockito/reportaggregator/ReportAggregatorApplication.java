package in.quallit.junitwithmockito.reportaggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "in.quallit")
public class ReportAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportAggregatorApplication.class, args);
	}

}
