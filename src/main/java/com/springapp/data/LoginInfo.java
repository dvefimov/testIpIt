package com.springapp.data;

import java.io.Serializable;

public class LoginInfo implements Serializable {
    /* page1 */
    private Long id;
    private String loginName;
    private String loginPass;
    /* page2 */
    private String email;
    /* page3 */
    private String address;
    private String sity;
    private String street;

    /* check for ready */
    private Boolean ready = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
