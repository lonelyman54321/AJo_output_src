/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqy;

public final class zzgqz
extends RuntimeException {
    public zzgqz(String string2) {
        super(string2);
    }

    public zzgqz(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public zzgqz(Throwable throwable) {
        super(throwable);
    }

    public static Object zza(zzgqy zzgqy2) {
        try {
            return zzgqy2.zza();
        }
        catch (Exception exception) {
            zzgqz zzgqz2 = new zzgqz(exception);
            throw zzgqz2;
        }
    }
}

