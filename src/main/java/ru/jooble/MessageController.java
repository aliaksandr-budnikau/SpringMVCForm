package ru.jooble;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    public String showMessage(@RequestParam String author, @RequestParam String text, ModelMap model) {
        model.addAttribute("author", author);
        model.addAttribute("text", text);
        return "message";
    }
}