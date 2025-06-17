package lk.udcreations.common.dto.auth;

import lk.udcreations.common.dto.user.UsersDTO;

public class LoginResponseDTO {

    private String token;
    private UsersDTO user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UsersDTO getUser() {
        return user;
    }

    public void setUser(UsersDTO user) {
        this.user = user;
    }
}
