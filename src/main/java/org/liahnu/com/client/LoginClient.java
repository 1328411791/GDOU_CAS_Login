package org.liahnu.com.client;

import org.liahnu.com.request.LoginRequest;

public class LoginClient {

    private final LoginRequest loginRequest;

    public LoginClient(String username, String password) throws Exception {
        loginRequest = new LoginRequest(username, password);
        loginRequest.postRequest();
        ;
    }

    public boolean isLoginCas() {
        if (loginRequest.getAuth() != null) {
            return true;
        }
        return false;
    }
}
