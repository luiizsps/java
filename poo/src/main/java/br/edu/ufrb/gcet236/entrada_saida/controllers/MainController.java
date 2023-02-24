package br.edu.ufrb.gcet236.entrada_saida.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ufrb.gcet236.entrada_saida.requests.Entrada;
import br.edu.ufrb.gcet236.entrada_saida.responses.Saida;

@RestController
@RequestMapping("api")
public class MainController {

  @PostMapping(value = "/main")
  public Saida main(@RequestBody Entrada entrada) {
    int resultado = entrada.getNumero1() + entrada.getNumero2();
    Saida saida = new Saida(resultado);
    return saida;
  }
}