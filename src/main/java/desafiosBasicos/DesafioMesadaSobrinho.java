package desafiosBasicos;
import java.util.Scanner;

/*Desafio
Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês,
ele quer saber quanto terá se juntar de dinheiro, sem gastar nada, durante alguns meses.
E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas
do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.

Entrada
A entrada será o número de meses que o sobrinho polpará o dinheiro.

Saída
A saída deve ser o valor que o sobrinho terá ao final dos meses.*/

public class DesafioMesadaSobrinho {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        int valor = 50 * entrada;

        System.out.println(valor);
    }
}
