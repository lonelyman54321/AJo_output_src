/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghu;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzghv {
    private static final CopyOnWriteArrayList zza;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList;
        zza = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    public static zzghu zza(String string2) {
        boolean bl2;
        Object object = zza.iterator();
        while (bl2 = object.hasNext()) {
            zzghu zzghu2 = (zzghu)object.next();
            boolean bl3 = zzghu2.zza();
            if (!bl3) continue;
            return zzghu2;
        }
        string2 = String.valueOf(string2);
        string2 = "No KMS client does support: ".concat(string2);
        object = new GeneralSecurityException(string2);
        throw object;
    }
}

