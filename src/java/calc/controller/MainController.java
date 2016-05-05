package calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping(value = {"/","calcolatriceGet"})
  public String index(ModelMap m) {
    return "index";
  }
  
  @RequestMapping(value = "calcolatricePost")
  public String calc2(ModelMap m) {
    return "calcolatrice2_post";
  }
  @RequestMapping(value = "/calcolatrice_Get", method = RequestMethod.GET)
  public @ResponseBody
  String getRisultatoM_GET(@RequestParam(value = "num1", required = true) float num1, 
          @RequestParam(value = "num2", required = true) float num2, @RequestParam(value = "op", required = true) char op) {
    return calcolaRis(num1, num2, op);
  }//getRisultatoM_GET

  
  @RequestMapping(value = "/calcolatrice_Post", method = RequestMethod.POST)
  public @ResponseBody
  String getRisultatoM_POST(@RequestParam(value = "num1", required = true) float num1, 
          @RequestParam(value = "num2", required = true) float num2, @RequestParam(value = "op", required = true) char op) {
    return calcolaRis(num1, num2, op);
  }//getRisultatoM_POST

  /**
   * metodo che calcola un'operazione data tra due numeri
   * @param n1 primo addendo
   * @param n2 secondo addendo
   * @param o operatore
   * @return il risultato se l'operazione è valida, altrimenti un messaggio di errore
   */
  private String calcolaRis(float n1, float n2, char o) {
    String r;
    float ris = 0;
    switch (o) {
      case '/':
        if (n2 == 0) {
          r = "Divisione per 0 non effettuata";
          return r;
        }
        ris = n1 / n2;
        break;
      case '-':
        ris = n1 - n2;
        break;
      case '*':
        ris = n1 * n2;
        break;
      default:
        ris = n1 + n2;
        break;
    }
    r = "Il risultato e': " + ris;
    return r;
  }//calcolaRisulato

}
