package xyz.ianmd.spreadsheet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/public")
    public String getPublic() {
        return "Public Message";
    }

    @GetMapping("/protected")
    public String getProtected() {
        return "Protected message";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin's message";
    }
}

