package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alan on 21/06/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        System.out.println("Carregando os produtos");

        return "hello-world";
    }
}
