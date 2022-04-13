public class Tamagushi {
    String nome;
    int idade;
    int fome;
    int tedio;
    
    public Tamagushi(String init_nome, int init_idade) {
        this.nome = init_nome;
        this.idade = init_idade;
        fome = 3;
        tedio = 3;
    }

//=========================================================================

    public void darComida(String comida, int quantidade) {
        if(fome - quantidade >= 0) {
            fome -= quantidade;
            System.out.printf("Você deu %d %s(s) para %s.\n",quantidade,comida,nome);
            if(fome == 0) {
                System.out.printf("%s foi devidamente alimentado, antes de comer de novo ele(a) deve digerir a comida.\n",nome);
            } else {
                System.out.printf("%s ainda está com %d ponto(s) de fome.\n", nome, fome);
            }
        } else if(quantidade < 1) {
            System.out.println("Essa quantidade de comida é inválida.\n");
        } else {
            System.out.printf("Você só pode dar %d alimento(s) para %s, mais que isso ele(a) ficaria obeso.\n", fome, nome);
        }
    }

    public void digerir() {
        if(fome == 0) {
            fome += 3;
            System.out.printf("%s digeril a comida, agora ele(a) pode comer mais!\n",nome);
        } else {
            System.out.printf("%s só pode digerir a comida qunado estiver sem fome.\n%s inda tem %d ponto(s) de fome.\n",nome,nome,fome);
        }
    }

    public void brincar(int vezes) {
        if(tedio - vezes < 0) {
            System.out.printf("Você não pode bricar com %s mais de %d vez(es), se não ele(a) fica mimado.\n", nome, tedio);
        } else if(tedio - vezes == 0) {
            tedio -= vezes;
            System.out.printf("%s brincou o bastante, antes de brinca de novo ele(a) deve ler um livro.\n", nome);
        }else if(vezes - tedio> 0) {
            tedio -= vezes;
            System.out.printf("%s está mais feliz, mas ele(a) ainda pode bricar mais %d vez(es).\n",nome,tedio);
        }else {
            System.out.println("Número inválido.");
        }
    }

    public void ler() {
        tedio = 3;
        System.out.printf("%s ficou entediado depois de ler.\n",nome);
    }

    public void humor(){
        if(tedio + fome > 4) {
            System.out.printf("%s está de mal humor.\n",nome);
        } else if(tedio + fome > 2) {
            System.out.printf("%s está com humor médio.\n",nome);
        } else {
            System.out.printf("%s está de bom humor.\n",nome);
        }
    }

//=========================================================================

    public static void main(String[] args) {
        Tamagushi robertinho = new Tamagushi("Robertinho", 5);
        robertinho.brincar(-1);
        robertinho.brincar(3);
        robertinho.darComida("pizza", 1);
        robertinho.humor();
        robertinho.ler();
        robertinho.humor();
    }
}