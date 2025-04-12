/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.data.UserDetails;
import java.io.Serializable;

public class AccessProfileOtpResponse
implements Serializable {
    private long expiresIn;
    private String message;
    private String statusCode;
    private UserDetails userDetails;

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    public void setExpiresIn(long l2) {
        this.expiresIn = l2;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setStatusCode(String string2) {
        this.statusCode = string2;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}

