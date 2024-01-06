package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayerController {
    //method to handle /showPlayerForm
    @RequestMapping("/showPlayerForm")
    public String showForm () {
        return "search-player-form";
    }

    //method to handle /processPlayerForm
    @RequestMapping("/processPlayerForm")
    public String processForm (HttpServletRequest request, Model model) {
        //  read the player name and store it in a variable pName:
        String pName = request.getParameter("playerName");
        // Add data to model with addAttribute:
        model.addAttribute("name", pName);
        // Now the attribute name will be available to the view.
        return "player-detail";
    }

}
