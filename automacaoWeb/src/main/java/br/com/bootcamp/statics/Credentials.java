package br.com.bootcamp.statics;

public class Credentials {
    static private String email = "";
    static private String senha = "";
    public Credentials(){}
    public Credentials(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    public static String getEmail() {
        return email;
    }
    public static String getSenha() {
        return senha;
    }
}
