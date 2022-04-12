package Application;

public class Calculadora {
    private Usuario user;
    private String login;
    private String senha;
    private double numA;
    private double numB;
    private double numX;

    public Calculadora(Usuario user) {
       user = user;
    }


    public String soma(double  numA, double  numB) {
        if (user.login(this.login, this.senha)) {
            return "a some é igual a: " + (numA + numB) ;
        } else {
            return "o usuário não tem acesso";
        }


    }

    public String subtrair(double numA, double numB) {
        if (user.login(this.login, this.senha)) {
            return "a subtração é igual a: " + (numA - numB);
        } else {
            return "o usuário não tem acesso";
        }

    }

    public String multiplicar(double numA, double numB) {
        if (user.login(this.login, this.senha)) {
            return "a multiplicação é igual a: " + (numA * numB);
        } else {
            return "o usuário não tem acesso";
        }


    }

    public String dividir(double numA, double numB) {
     if(user.login(this.login, this.senha)){
         return "A divisão é igual a: " + (numA / numB);
     }else{
         return "usuário não tem acesso";
     }
    }

    public String func(double numX, double numA, double numB) {
     if(user.login(this.login,this.senha)){
         return "A função é igual a: " + ((numX * numA) + numB);
     } else {
         return "usuário sem acesso";
     }
    }

    public String potencia(double numX, double pot) {
        this.numX = numX;
        double answer = 1;
        if(pot == 2){
            return "A potenciação é igual a: " + numX * numX;
        }else{
            for (double i = 1; i <= pot; i++) {
                answer = answer * numX;
            }}

        if(user.login(this.login,this.senha)){
            return "A potenciação é igual a: " + answer;
        }else{
            return "Usuário sem acesso";
        }

    }
}
