/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import java.io.Serializable;

public class User
implements Serializable {
    private String message;
    private String name;
    private String pwd;
    private boolean suspiciousUserAskForLogin;
    private String uid;

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isSuspiciousUserAskForLogin() {
        return this.suspiciousUserAskForLogin;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setPwd(String string2) {
        this.pwd = string2;
    }

    public void setSuspiciousUserAskForLogin(boolean bl2) {
        this.suspiciousUserAskForLogin = bl2;
    }

    public void setUid(String string2) {
        this.uid = string2;
    }
}

