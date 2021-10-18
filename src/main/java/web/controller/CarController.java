package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "0") Integer count, ModelMap model){
            model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}
