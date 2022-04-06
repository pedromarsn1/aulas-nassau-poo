package Application;

public class App {
    public static void main(String[] args) {
//        Usuario user = new Usuario("Pedro", "pe_1", "4002");
//        System.out.println( "Nome: " + user.getName() + "\nLogin: " +  user.getLogin() + "\nSenha: " + user.getSenha());
//        boolean retorno = user.login("pe_1", "4002");
//        System.out.println("\nLogin: " + retorno);

        Calculadora cal = new Calculadora(new Usuario(
                "Pedro", "pe_1", "15235"
        ));


//        int soma = cal.soma(8,5);
        float potencia = cal.potencia(5, 5);
        int subtracao = cal.subtrair(84, 4);
        int divisao = cal.dividir(16, 4);
        int multiplicacao = cal.multiplicar(9, 8);
        int funcao = cal.func(4, 5, 6);

//        System.out.println(soma);
        System.out.println(potencia);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        System.out.println(funcao);
    }
}
