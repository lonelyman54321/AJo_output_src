/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login;

public final class LoginClient$Result$a
extends Enum {
    private static final /* synthetic */ LoginClient$Result$a[] $VALUES;
    public static final /* enum */ LoginClient$Result$a CANCEL;
    public static final /* enum */ LoginClient$Result$a ERROR;
    public static final /* enum */ LoginClient$Result$a SUCCESS;
    private final String loggingValue;

    private static final /* synthetic */ LoginClient$Result$a[] $values() {
        LoginClient$Result$a loginClient$Result$a = SUCCESS;
        loginClient$Result$a = CANCEL;
        loginClient$Result$a = ERROR;
        LoginClient$Result$a[] loginClient$Result$aArray = new LoginClient$Result$a[]{loginClient$Result$a, loginClient$Result$a, loginClient$Result$a};
        return loginClient$Result$aArray;
    }

    static {
        LoginClient$Result$a loginClient$Result$a;
        SUCCESS = loginClient$Result$a = new LoginClient$Result$a("SUCCESS", 0, "success");
        CANCEL = loginClient$Result$a = new LoginClient$Result$a("CANCEL", 1, "cancel");
        ERROR = loginClient$Result$a = new LoginClient$Result$a("ERROR", 2, "error");
        $VALUES = LoginClient$Result$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LoginClient$Result$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.loggingValue = var3_2;
    }

    public static LoginClient$Result$a valueOf(String string2) {
        return Enum.valueOf(LoginClient$Result$a.class, string2);
    }

    public static LoginClient$Result$a[] values() {
        return (LoginClient$Result$a[])$VALUES.clone();
    }

    public final String getLoggingValue() {
        return this.loggingValue;
    }
}

