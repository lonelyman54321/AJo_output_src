/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.play.core.assetpacks.internal;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ah {
    public static String a(byte[] byArray) {
        Object object = "SHA-256";
        try {
            object = MessageDigest.getInstance((String)object);
            ((MessageDigest)object).update(byArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "";
        }
        return Base64.encodeToString((byte[])((MessageDigest)object).digest(), (int)11);
    }
}

