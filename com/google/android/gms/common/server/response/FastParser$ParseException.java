/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.server.response;

public class FastParser$ParseException
extends Exception {
    public FastParser$ParseException(String string2) {
        super(string2);
    }

    public FastParser$ParseException(String string2, Throwable throwable) {
        super("Error instantiating inner object", throwable);
    }

    public FastParser$ParseException(Throwable throwable) {
        super(throwable);
    }
}

