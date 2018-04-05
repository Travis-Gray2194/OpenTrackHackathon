package me.travisgray.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.travisgray.Models.CoWorkingCoffee.Result;
import me.travisgray.Models.CoWorkingCoffee.RootObject;
import me.travisgray.Models.User;
import me.travisgray.Repositories.MASAICoWorkingRepository;
import me.travisgray.Repositories.RoleRepository;
import me.travisgray.Repositories.UserRepository;
import me.travisgray.Service.UserService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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

//    Curl Response
//    curl -X GET "https://card4b-masai-masai-coworkingcoffee-stg-v1.p.mashape.com/coworkingspace/api/discovery/getCoWorkingSpaces?City=Lisboa%2C%20Protugal"
// -H "accept: application/json" -H "X-Mashape-Key: ShedIfdxswmsh7n7BWdKbLix2oxep1oKrryjsnl9MPWgR9vWwa"

//    Can See APi Data Here as Json using APiKey
// http://apis.masai.teleticketing.eu/Sandbox-Doc/CoWorkingSpace/CoWorkingCoffee/#/CoWorkingCoffee

//    Curl is an utility to make HTTP method calls and receive HTTP response back.
//    If you dissect the curl command you posted, it places a Get request into a particular URI that is supposed to process the JSON request body you provide and give a response(likely to be a JSON response) back.
// A few pairs of http headers are also passed most likely to be app id, some kind of auth code and the http content type respectively.
//    You need to write a java program that can post an JSON request to a given URI along with the http headers and receive the JSON response back.
//    Use Apache HTTP library to make the HTTP Post call and receive the response string back. Use JSON.simple to construct the JSON request to send and then parse the JSON object back from the response string.

    @RequestMapping("/coworkingapi")
    public String showcoworkingapi(Model model) throws Exception{
        OkHttpClient client = new OkHttpClient();
    Result result = new Result();
        Request request = new Request.Builder()
                .url("https://card4b-masai-masai-coworkingcoffee-stg-v1.p.mashape.com/coworkingspace/api/discovery/getCoWorkingSpaces?City=Lisboa%2C%20Protugal")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("X-Mashape-Key", "ShedIfdxswmsh7n7BWdKbLix2oxep1oKrryjsnl9MPWgR9vWwa")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "1f2cd0ae-056b-4490-b1f9-e5a7ea0731d7")
                .build();

        Response response = client.newCall(request).execute();
//        Returning JSON properly
        //        use the responseBodyString as needed in your application since response.body,.string() can be consumed only once.
//       Answer:  https://stackoverflow.com/questions/28300359/cant-get-okhttps-response-body-tostring-to-return-a-string
        String responseBodyString = response.body().string();
//    .string(): This returns  response.
        System.out.println("This Is Response");
        System.out.print(responseBodyString);

        System.out.println("------------------------");

//    .toString(): This returns your object in string format.
        System.out.println("This Is Object of Response in String Format");
        System.out.print(responseBodyString.toString());


//        Because the Jackson JSON processing library is in the classpath,
// RestTemplate will use it (via a message converter) to convert the incoming JSON data into a Quote object. F
// rom there, the contents of the rootobject will be logged to the console.

        RestTemplate restTemplate = new RestTemplate();
        RootObject rootObject = restTemplate.getForObject(responseBodyString,RootObject .class);
        rootObject.getResults();


    return "list";

    }




}
