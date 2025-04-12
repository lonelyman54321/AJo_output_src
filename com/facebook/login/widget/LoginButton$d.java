/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login.widget;

import com.facebook.login.widget.LoginButton$c;

public final class LoginButton$d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        LoginButton$c loginButton$c;
        int n7 = LoginButton$c.values().length;
        int[] nArray = new int[n7];
        try {
            loginButton$c = LoginButton$c.AUTOMATIC;
            n4 = loginButton$c.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            loginButton$c = LoginButton$c.DISPLAY_ALWAYS;
            n4 = loginButton$c.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            loginButton$c = LoginButton$c.NEVER_DISPLAY;
            n4 = loginButton$c.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

