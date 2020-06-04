package br.com.data.covid19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DataCovid19Application {

    public static void main(String[] args) {
        SpringApplication.run(DataCovid19Application.class, args);
    }

}
