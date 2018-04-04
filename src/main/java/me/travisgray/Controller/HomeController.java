package me.travisgray.Controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import me.travisgray.Models.CoWorkingCoffee.RootObject;
import me.travisgray.Models.User;
import me.travisgray.Repositories.MASAICoWorkingRepository;
import me.travisgray.Repositories.RoleRepository;
import me.travisgray.Repositories.UserRepository;
import me.travisgray.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;


import javax.validation.Valid;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

import static javafx.scene.input.KeyCode.X;

/**
 * Created by ${TravisGray} on 4/3/2018.
 */
@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @Autowired
    MASAICoWorkingRepository masaiCoWorkingRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/register")
    public String showRegistrationPage(Model model){
        model.addAttribute("user",new User());
        return "registration";
    }

    @PostMapping("/register")
    public String processregistration(@ModelAttribute("user")User user, BindingResult result, Model model ){


        if(result.hasErrors()){
            return "registration";
        }else{
            userService.saveUser(user);
            model.addAttribute("message","User Account Successfully Created");
        }
        return "index";
    }



    @RequestMapping("/coworkingapi")
    public String showcoworkingapi(Model model) throws UnirestException {
        HttpResponse<com.mashape.unirest.http.JsonNode> response = Unirest.get("https://card4b-masai-masai-coworkingcoffee-stg-v1.p.mashape.com/coworkingspace/api/discovery/getCoWorkingSpaces?City=Lisboa%2C%20Protugal")
                .header("X-Mashape-Key", "ShedIfdxswmsh7n7BWdKbLix2oxep1oKrryjsnl9MPWgR9vWwa")
                .header("accept", "application/json")
                .asJson();
        RestTemplate restTemplate = new RestTemplate();
        RootObject rootObject = restTemplate.getForObject("https://card4b-masai-masai-coworkingcoffee-stg-v1.p.mashape.com/coworkingspace/api/discovery/getCoWorkingSpaces?City=Lisboa%2C%20Protugal",RootObject .class);
        rootObject.getHost();
        rootObject.getInfo();
        return "list";

    }


}
