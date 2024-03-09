package xyz.ianmd.spreadsheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpreadsheetApplication {

    enum Env {
        PORT, CLIENT_URL, OKTA_OAUTH2_ISSUER, OKTA_OAUTH2_AUDIENCE
    }
    public static void main(String[] args) {
        SpringApplication.run(SpreadsheetApplication.class, args);
    }

}
