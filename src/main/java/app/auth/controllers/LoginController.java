package app.auth.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @GetMapping("/ping")
  public String loginUser() {
    return "pong";
  }

  // @GetMapping("/user")
  // public String getUserData(){
 
  // }
}