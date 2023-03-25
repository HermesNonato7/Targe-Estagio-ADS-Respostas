package targetestagio.desafioResposta1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioResposta1Application {

    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int cont = 0;

        while (cont < indice) {
            cont += 1;
            soma = soma + cont;
        }

        System.out.println(soma);

    }
}
