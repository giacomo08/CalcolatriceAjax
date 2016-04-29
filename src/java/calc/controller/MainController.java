package calc.controller;

import java.util.Date;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Giacomo
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String index(ModelMap m) {
    return "index";
  }

  @RequestMapping(value = "/calcola", method = RequestMethod.POST)
  public @ResponseBody String getTime(@RequestParam(value = "num1", required = true) int num1, @RequestParam(value = "num2", required = true) int num2, @RequestParam(value = "op", required = true) char op) {
    String r = "";
    int ris = 0;
    switch (op) {
      case '/':
        if (num2 == 0) {
          r = "Divisione per 0 non effettuata";
          return r;
        } ris = num1 / num2;
        //System.out.println("ho fatto la /");
        break;
      case '-':
        ris = num1 - num2;
        //System.out.println("ho fatto la -");
        break;
      case '*':
        ris = num1 * num2;
        //System.out.println("ho fatto la *");
        break;
      default:
        ris = num1 + num2;
        //System.out.println("ho fatto la +");
        break;
    }
    r = "Il risultato e': " + ris;
    System.out.println(num1 + " " + op + " " + num2);
    return r;
  }
}
