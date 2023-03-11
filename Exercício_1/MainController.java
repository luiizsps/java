package br.edu.ufrb.gcet236.exercicios.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrb.gcet236.exercicios.Fatura;
import br.edu.ufrb.gcet236.exercicios.ListaFaturas;

@RestController
@RequestMapping("api")
public class MainController {

  private ListaFaturas listaFaturas = new ListaFaturas();

  @PostMapping(value = "/fatura")
  public ResponseEntity<Double> main(@RequestBody Fatura fatura) {
    this.listaFaturas.adicionaFatura(fatura);
    return ResponseEntity.ok(fatura.getTotalFatura());
  }

  @GetMapping(value = "/fatura")
  public Fatura[] getLista() {
    return this.listaFaturas.getListaFaturas();
  }
}
