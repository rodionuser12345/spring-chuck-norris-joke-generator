package rodion.springframework.springchucknorrisjokegenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rodion.springframework.springchucknorrisjokegenerator.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/joke","/",""})
    public String getRandomJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
