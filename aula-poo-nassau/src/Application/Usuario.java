package Application;

public class Usuario {
    private String name;
    private String login;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario(String name, String login, String senha) {
        this.name = name;
        this.login = login;
        this.senha = senha;


    }

    public boolean login(String login, String senha) {
        if (senha == this.senha && login == this.login) {
            System.out.println("Connected sucessfully");
            return true;
        } else {
            System.out.println("Error trying to connect");
            return false;
        }

    }

}
