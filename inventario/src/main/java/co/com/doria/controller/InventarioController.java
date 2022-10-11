package co.com.doria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("inventario")

public class InventarioController {

    @GetMapping ("/helloWorld")
    public String helloWorld (){
        return "Hello world";
    }
}

