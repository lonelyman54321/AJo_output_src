/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnk;
import javax.crypto.Cipher;

public final class zzgnl {
    public static final /* synthetic */ int zza;
    private static final ThreadLocal zzb;

    static {
        zzgnk zzgnk2 = new zzgnk();
        zzb = zzgnk2;
    }

    public static Cipher zza() {
        return (Cipher)zzb.get();
    }
}

