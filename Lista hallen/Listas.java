
import java.util.Scanner;

/**
 *
 * @author ian
 */
public class Listas {

    //Questão 1
    static void questao1(int quantidade) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[quantidade];
        double media = 0.0;
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a "+ (i+1) +"° nota");
            notas[i] = sc.nextDouble();
            media += notas[i]/quantidade;
        }

        if (media >= 9){
            System.out.println("Conceito A");
        } else if (media >= 8){
            System.out.println("Conceito B");
        } else if (media >= 7){
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito F");
        }
        System.out.println("A media foi:" + media);
}
    
    //Questão 2
    static float questao2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de camisas(1-5):");
        int quantidade = sc.nextInt();
            while (quantidade > 5 || quantidade < 1) {
                System.out.println("Digite um número válido(1-5):");
                quantidade = sc.nextInt();
            }

        float carrinho = quantidade * 30;
        System.out.println("Digite o estado que vc mora:");
        String estado = sc.next();

        if (estado != "BA" ) {
            carrinho += 20;
        }
        return carrinho;  
    }
    
    //Questão 3
    static void questao3() {
        for (int i = 1; i < 20; i+=2) {
            System.out.println(i);
        }
    }

    //Questão 4
    static void questao4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você vai passar em DS1? (1 = sim or 0 = não) ");
        int autoestima = sc.nextInt();
        while (autoestima != 1 && autoestima != 0) {
            System.out.println("Insira um número válido(1 or 0): ");
            autoestima = sc.nextInt();  
        }

        if (autoestima == 1) {
            System.out.println("Meus parabéns!!! \nÉ uma pena que vc esteja errado");
        } else {
            System.out.println("Continue assim \nVocê está certo");
        }
    }

    //Questão 5
    public class C_questao5{
        
        private static float somar(float a, float b) {
            a += b; return a;
        }
        private static float subtrair(float a, float b) {
            a -= b; return a;
        }
        private static float multiplicar(float a, float b) {
            a *= b; return a;
        }
        private static float dividir(float a, float b) {
            a /= b; return a;
        }

        static void questao5() {
            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            System.out.println("Escolha a operaçaõ desejada\n[ 0 ] Soma \n[ 1 ] Subtração \n[ 2 ] Multiplicação \n[ 3 ] Divisão");
            int operacao = sc.nextInt();
            if (operacao == 0) {
                System.out.println(somar(a,b));
            } else if ( operacao == 1) {
                System.out.println(subtrair(a, b));
            } else if ( operacao == 2) {
                System.out.println(multiplicar(a, b));
            } else if ( operacao == 3) {
                System.out.println(dividir(a, b));
            } else {
                System.out.println("Insira uma opção válida:");
                questao5();
            }
        }  
    }
    
    //Questão 6
    static void questao6() {
        Scanner sc = new Scanner(System.in);
        int lista[] = new int[5];
        int big_num = 0;
        int local = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Imforme o " + (i+1) + "° número: ");
            lista[i]= sc.nextInt();

            if (lista[i] < big_num){
                big_num = lista[i];
                local = i;
            }
        }
        System.out.println("O maior número digitado foi " + big_num + " na posição " + (local+1));
    }

    //Questão 7 sem condicional
    static void questao7() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double media = 0;
        double altura = 0;
        System.out.println("Insira uma altura:");
        altura = sc.nextDouble();
            while(altura > 1.50) {
                System.out.println("Insira uma altura:");
                altura = sc.nextDouble();
                while(altura > 1.50){
                    media += altura;
                    i++;
                }
            }
            System.out.println("A altura média é: " + media/i);
            System.out.println("Fim do programa");

    }

    public class Quadrado {
    
        private double lado;

        public Quadrado(double lado ){
            this.lado = lado;
        }

        public double getlado() {
            return this.lado;
        }

        public void setlado(double new_lado) {
            new_lado = 8;
        this.lado = new_lado;
        }

        public double area() {
            return this.lado * this.lado;
        }

    }

    public static void main(String[] args) {
  
    }
}
