package cat.itacademy.barcelonactiva.llombartroma.toni.s04.t01.n02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    /* greeting method */
    @GetMapping(value={"/greeting","/greeting/"})
    @ResponseBody
    public String greeting(@RequestParam(name="name",defaultValue = "UNKNOWN") String name) {
        return "Hi there, " +name+ ". You're executing a Gradle project.";
    }
    /* greeting2 method */
    @GetMapping(value={"/greeting2/{name}", "/greeting2", "/greeting2/"})
    @ResponseBody
    public String greeting2(@PathVariable(required = false) String name) {
        if(name!=null) {
            return "Hi there, " + name + ". You're executing a Gradle project.";
        }
        else {
            return "Hi there, UNKNOWN. You're executing a Gradle project.";
        }
    }
}
