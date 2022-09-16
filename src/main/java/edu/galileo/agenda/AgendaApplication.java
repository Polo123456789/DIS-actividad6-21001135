package edu.galileo.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AgendaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgendaApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "<div style=\"padding: 10px; margin: 10px; border: solid; border-radius: 10px; max-width: fit-content\"> <p><b>Nombre:</b>&nbsp; Pablo Sanchez Galdamez</p> <p><b>Carnet:</b>&nbsp; 21001135</p> </div>";

    }
}
