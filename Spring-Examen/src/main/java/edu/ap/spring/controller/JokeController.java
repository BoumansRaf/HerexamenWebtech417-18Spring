package edu.ap.spring.controller;

import edu.ap.spring.jpa.Joke;
import edu.ap.spring.jpa.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Scope("session")
public class JokeController {

    @Autowired
    JokeRepository repository;
   
   public JokeController() {
   }
       
   @RequestMapping("/joke")
   public String joke() {
	   return "joke";
   }

    @RequestMapping("/joke_post")
    public String joke_post() {
        return "";
    }

   @PostMapping("/joke")
   public String joke_post(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           Model model
                           ) {
       model.addAttribute("firstName", firstName);
       model.addAttribute("lastName", lastName);

       String joke  = "";
       model.addAttribute("joke", joke);

       repository.save(new Joke(firstName, lastName, joke));


	   return joke;
   }
   
   @RequestMapping("/")
   public String root() {
	   return "redirect:/joke";
   }
}
