/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgod {
    private static final Logger zza;
    private static final AtomicBoolean zzb;

    static {
        AtomicBoolean atomicBoolean;
        zza = Logger.getLogger(zzgod.class.getName());
        zzb = atomicBoolean = new AtomicBoolean(false);
    }

    private zzgod() {
    }

    public static Boolean zza() {
        Object object;
        Object object2 = "org.conscrypt.Conscrypt";
        try {
            object2 = Class.forName((String)object2);
            object = "isBoringSslFIPSBuild";
        }
        catch (Exception exception) {
            object2 = zza;
            object = Level.INFO;
            ((Logger)object2).logp((Level)object, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
        object2 = ((Class)object2).getMethod((String)object, null);
        object2 = ((Method)object2).invoke(null, null);
        return (Boolean)object2;
    }

    public static boolean zzb() {
        AtomicBoolean atomicBoolean = zzb;
        boolean bl2 = atomicBoolean.get();
        return bl2;
    }
}

