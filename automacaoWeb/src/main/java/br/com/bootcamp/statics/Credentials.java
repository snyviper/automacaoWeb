package br.com.bootcamp.statics;

public abstract class Credentials {
    static private String email = "";
    static private String senha = "";

    public static void setCredentials(String Email, String Senha){
        email = Email;
        senha = Senha;
    }

    public static String getEmail() {
        return email;
    }
    public static String getSenha() {
        return senha;
    }
}
