/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.auth-api;

import android.util.Base64;
import java.security.SecureRandom;

public final class zbbj {
    private static final SecureRandom zba;

    static {
        SecureRandom secureRandom;
        zba = secureRandom = new SecureRandom();
    }

    public static String zba() {
        byte[] byArray = new byte[16];
        zba.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)11);
    }
}

