package model;

/**
 * Created by jonathan on 3-9-15.
 */
public class User {

    public enum Role{

        HUURDER, VERHUURDER;
    }


    private String name, password;
        private final Role role;

    public User(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public boolean isHuurder(){

        return role == Role.HUURDER;
    }

    public boolean hasNameAndPass(String username, String pass){

        return name.equals(username) && password.equals(pass);
    }
}
