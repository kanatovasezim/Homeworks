package com.company;

import java.util.Date;

public class AuthUser {
    private String userlogin;
    private Date login_time;
    private String success;

    public AuthUser(String userlogin, Date login_time, String success) {
        this.userlogin = userlogin;
        this.login_time = login_time;
        this.success = success;
    }

    public AuthUser() {
    }

    public String getuserlogin() {
        return userlogin;
    }

    public void setuserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getSuccess(String success) {
        return this.success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
