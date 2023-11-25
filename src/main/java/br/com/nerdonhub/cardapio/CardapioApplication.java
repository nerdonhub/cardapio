package br.com.nerdonhub.cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardapioApplication {

	public static void main(String[] args) {
	  System.out.println("Iniciando aplicação...");
		SpringApplication.run(CardapioApplication.class, args);
		System.out.println("Aplicação iniciada como sucesso!");
	}

}
