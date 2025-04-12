/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import java.io.Serializable;

public class ValidateOTPData
implements Serializable {
    private String desc;
    private String status;

    public String getDesc() {
        return this.desc;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDesc(String string2) {
        this.desc = string2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }
}

