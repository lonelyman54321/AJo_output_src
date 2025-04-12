/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

public final class FacebookRequestError$a
extends Enum {
    private static final /* synthetic */ FacebookRequestError$a[] $VALUES;
    public static final /* enum */ FacebookRequestError$a LOGIN_RECOVERABLE;
    public static final /* enum */ FacebookRequestError$a OTHER;
    public static final /* enum */ FacebookRequestError$a TRANSIENT;

    private static final /* synthetic */ FacebookRequestError$a[] $values() {
        FacebookRequestError$a facebookRequestError$a = LOGIN_RECOVERABLE;
        facebookRequestError$a = OTHER;
        facebookRequestError$a = TRANSIENT;
        FacebookRequestError$a[] facebookRequestError$aArray = new FacebookRequestError$a[]{facebookRequestError$a, facebookRequestError$a, facebookRequestError$a};
        return facebookRequestError$aArray;
    }

    static {
        FacebookRequestError$a facebookRequestError$a;
        LOGIN_RECOVERABLE = facebookRequestError$a = new FacebookRequestError$a("LOGIN_RECOVERABLE", 0);
        OTHER = facebookRequestError$a = new FacebookRequestError$a("OTHER", 1);
        TRANSIENT = facebookRequestError$a = new FacebookRequestError$a("TRANSIENT", 2);
        $VALUES = FacebookRequestError$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FacebookRequestError$a() {
        void var2_-1;
        void var1_-1;
    }

    public static FacebookRequestError$a valueOf(String string2) {
        return Enum.valueOf(FacebookRequestError$a.class, string2);
    }

    public static FacebookRequestError$a[] values() {
        return (FacebookRequestError$a[])$VALUES.clone();
    }
}

