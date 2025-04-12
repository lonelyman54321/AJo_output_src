/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.Signature
 */
package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.Signature;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AndroidUtilsLight {
    private static volatile int zza = 255;

    public static byte[] getPackageCertificateHashBytes(Context object, String object2) {
        int n3;
        object = Wrappers.packageManager(object);
        int n4 = 64;
        object = object.getPackageInfo((String)object2, n4);
        object2 = object.signatures;
        if (object2 != null && (n3 = ((Signature[])object2).length) == (n4 = 1) && (object2 = AndroidUtilsLight.zza("SHA1")) != null) {
            object = object.signatures[0].toByteArray();
            return ((MessageDigest)object2).digest((byte[])object);
        }
        return null;
    }

    public static MessageDigest zza(String string2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(string2);
                if (messageDigest == null) continue;
                return messageDigest;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        }
        return null;
    }
}

