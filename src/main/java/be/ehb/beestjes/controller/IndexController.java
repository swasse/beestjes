package be.ehb.beestjes.controller;

import be.ehb.beestjes.model.Beast;
import be.ehb.beestjes.model.BeastDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashSet;

@Controller
public class IndexController {

    BeastDAO mBeastDAO;

    @Autowired
    public IndexController(BeastDAO mBeastDAO) {
        this.mBeastDAO = mBeastDAO;
    }

    /*Dit is voor elke requestmapping in de controller

    @ModelAttribute("pets")
    public HashSet<Beast> getAllBeasten(){
        return mBeastDAO.getPets();
    }
    */


    @GetMapping({"/", "/index"})
    public String openIndex(ModelMap map){
        //enkel voor deze requestmapping
        map.addAttribute("pets", mBeastDAO.getPets());
        return "index";
    }

}
