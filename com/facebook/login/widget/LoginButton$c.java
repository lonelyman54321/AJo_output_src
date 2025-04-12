/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login.widget;

import com.facebook.login.widget.LoginButton$c$a;

public final class LoginButton$c
extends Enum {
    private static final /* synthetic */ LoginButton$c[] $VALUES;
    public static final /* enum */ LoginButton$c AUTOMATIC;
    public static final LoginButton$c$a Companion;
    private static final LoginButton$c DEFAULT;
    public static final /* enum */ LoginButton$c DISPLAY_ALWAYS;
    public static final /* enum */ LoginButton$c NEVER_DISPLAY;
    private final int intValue;
    private final String stringValue;

    private static final /* synthetic */ LoginButton$c[] $values() {
        LoginButton$c loginButton$c = AUTOMATIC;
        loginButton$c = DISPLAY_ALWAYS;
        loginButton$c = NEVER_DISPLAY;
        LoginButton$c[] loginButton$cArray = new LoginButton$c[]{loginButton$c, loginButton$c, loginButton$c};
        return loginButton$cArray;
    }

    static {
        Object object;
        LoginButton$c loginButton$c;
        AUTOMATIC = loginButton$c = new LoginButton$c("AUTOMATIC", 0, "automatic", 0);
        int n3 = 1;
        DISPLAY_ALWAYS = object = new LoginButton$c("DISPLAY_ALWAYS", n3, "display_always", n3);
        n3 = 2;
        NEVER_DISPLAY = object = new LoginButton$c("NEVER_DISPLAY", n3, "never_display", n3);
        $VALUES = LoginButton$c.$values();
        object = new Object();
        Companion = object;
        DEFAULT = loginButton$c;
    }

    /*
     * WARNING - void declaration
     */
    private LoginButton$c() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.stringValue = var3_2;
        this.intValue = var4_1;
    }

    public static final /* synthetic */ LoginButton$c access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static LoginButton$c valueOf(String string2) {
        return Enum.valueOf(LoginButton$c.class, string2);
    }

    public static LoginButton$c[] values() {
        return (LoginButton$c[])$VALUES.clone();
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public String toString() {
        return this.stringValue;
    }
}

