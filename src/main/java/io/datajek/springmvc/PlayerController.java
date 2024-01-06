package io.datajek.springmvc;

import io.datajek.springdata.Player;
import io.datajek.springdata.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayerController {

    // injection of the PLayerService bean, we don’t have to create an instance of it.
    @Autowired
    PlayerService service;

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

        // Adding search functionality#
        Player player = service.getPlayerByName(pName);
        // Adding data to model
        model.addAttribute("name", pName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        // Now the attribute name will be available to the view.

        return "player-detail";
    }

}
