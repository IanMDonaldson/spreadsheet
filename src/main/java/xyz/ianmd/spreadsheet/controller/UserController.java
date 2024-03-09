package xyz.ianmd.spreadsheet.controller;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@CrossOrigin("https://localhost:3000")
@Controller
public class UserController {
//    @Value(value = "${com.auth0.management.clientSecret}")
//    private String managementClientSecret;
//
//    @Value(value = "${com.auth0.management.clientId}")
//    private String managementClientId;
//
//    @Value(value = "${com.auth0.domain}")
//    private String domain;
//
//    public String getManagementApiToken() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("client_id", managementClientId);
//        requestBody.put("client_secret", managementClientSecret);
//        requestBody.put("audience", "https://" + domain + "/api/v2/");
//        requestBody.put("grant_type", "client_credentials");
//
//        HttpEntity<String> request = new HttpEntity<String>(requestBody.toString(), headers);
//
//        RestTemplate restTemplate = new RestTemplate();
//        HashMap result = restTemplate
//            .postForObject("https://dev-0zovubyllloligu3.us.auth0.com/oauth/token", request, HashMap.class);
//        assert result != null;
//        return result.get("access_token").toString();
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<String> users(HttpServletRequest request, HttpServletResponse response) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Authorization", "Bearer " + getManagementApiToken());
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate
//            .exchange("https://" + domain + "/api/v2/users", HttpMethod.GET, entity, String.class);
//    }
//
//    @GetMapping(value = "/createUser")
//    public ResponseEntity<String> createUser(HttpServletResponse response) {
//        JSONObject request = new JSONObject();
//        request.put("email", "norman.lewis@email.com");
//        request.put("given_name", "Norman");
//        request.put("family_name", "Lewis");
//        request.put("connection", "Username-Password-Authentication");
//        request.put("password", "Pa33w0rd");
//
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate
//            .postForEntity("https://" + domain + "/api/v2/users", request.toString(), String.class);
//    }
}
