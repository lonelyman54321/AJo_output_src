/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzcl {
    private static String zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza(Context object) {
        Class<zzcl> clazz = zzcl.class;
        synchronized (clazz) {
            Throwable throwable2;
            block8: {
                block7: {
                    block6: {
                        try {
                            String string2 = zza;
                            if (string2 != null) return zza;
                            if ((object = object.getContentResolver()) == null) {
                                object = null;
                            } else {
                                string2 = "android_id";
                                object = Settings.Secure.getString((ContentResolver)object, (String)string2);
                            }
                            if (object == null) break block6;
                            boolean bl2 = true;
                            if (!(bl2 = zzct.zza(bl2))) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object = "emulator";
                }
                object = zzcl.zzb((String)object);
                zza = object;
                return zza;
            }
            throw throwable2;
        }
    }

    private static String zzb(String string2) {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = 3); i3 += n4) {
            Object[] objectArray = "MD5";
            objectArray = MessageDigest.getInstance((String)objectArray);
            Object object = string2.getBytes();
            objectArray.update((byte[])object);
            object = "%032X";
            objectArray = objectArray.digest();
            BigInteger bigInteger = new BigInteger(n4, (byte[])objectArray);
            objectArray = new Object[n4];
            objectArray[0] = bigInteger;
            try {
                return String.format((String)object, objectArray);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                continue;
            }
            catch (ArithmeticException arithmeticException) {}
            break;
        }
        return "";
    }
}

