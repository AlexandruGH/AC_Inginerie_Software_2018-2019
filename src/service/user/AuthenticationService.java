package service.user;

import model.User;

public interface AuthenticationService {

    boolean register(String username, String password);


    //Authentificare(login = username passwrod) !=  Autorizare(privilegiile = rolulul userului)

    User login(String username, String password);

    boolean logout(User user);

}