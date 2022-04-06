package Application;

public class Calculadora {
    private Usuario user;
    private String login;
    private String senha;
    private int numA;
    private int numB;
    private int numX;

    public Calculadora(Usuario user) {
       user = user;
    }


    public String soma(int numA, int numB) {
        if (user.login(this.login, this.senha)) {
            return "a some é igual a: " + (numA + numB) ;
        } else {
            return "o usuário não tem acesso";
        }


    }

    public int subtrair(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;

        return numA - numB;
    }

    public int multiplicar(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;

        return numA * numB;
    }

    public int dividir(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;

        return numA / numB;
    }

    public int func(int numX, int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
        this.numX = numX;

        return (numX * numA) + numB;
    }

    public float potencia(int numX, int pot) {
        this.numX = numX;
        int answer = 1;
//        float potencia = (float) Math.pow(numX,pot);
        if(pot == 2){
            return numX * numX;
        }else{
        for (int i = 1; i <= pot; i++) {
            answer = answer * numX;
        }}

        return answer;
    }
}
