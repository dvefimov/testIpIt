package com.springapp.data;

/**
 * Created with IntelliJ IDEA.
 * User: техно сити
 * Date: 16.11.14
 * Time: 1:19
 * To change this template use File | Settings | File Templates.
 */
public class Page2Stub {
    private Long id;
    private String email;
    private String loginName;

    public Page2Stub() {
    }

    public Page2Stub(LoginInfo info) {
        id = info.getId();
        email = info.getEmail();
        loginName = info.getLoginName();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }
}
