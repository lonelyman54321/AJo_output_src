/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqn;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

public final class zzgqo {
    private static final ThreadLocal zza;

    static {
        zzgqn zzgqn2 = new zzgqn();
        zza = zzgqn2;
    }

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandom = zzgqo.zzc();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzb(int n3) {
        byte[] byArray = new byte[n3];
        ((SecureRandom)zza.get()).nextBytes(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static SecureRandom zzc() {
        String string2 = "SHA1PRNG";
        Object object = "GmsCore_OpenSSL";
        try {
            return SecureRandom.getInstance(string2, (String)object);
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = "AndroidOpenSSL";
            try {
                return SecureRandom.getInstance(string2, (String)object);
            }
            catch (GeneralSecurityException generalSecurityException2) {
                object = "Conscrypt";
                try {
                    return SecureRandom.getInstance(string2, (String)object);
                }
                catch (GeneralSecurityException generalSecurityException3) {
                    object = "org.conscrypt.Conscrypt";
                    try {
                        void var0_6;
                        try {
                            object = Class.forName((String)object);
                            String string3 = "newProvider";
                            object = ((Class)object).getMethod(string3, null);
                            object = ((Method)object).invoke(null, null);
                            object = (Provider)object;
                            return SecureRandom.getInstance(string2, (Provider)object);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            // empty catch block
                        }
                        String string4 = "Failed to get Conscrypt provider";
                        object = new GeneralSecurityException(string4, (Throwable)var0_6);
                        throw object;
                    }
                    catch (GeneralSecurityException generalSecurityException4) {}
                    return new SecureRandom();
                }
            }
        }
    }
}

