/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxo;
import com.google.android.gms.internal.ads.zzfyh;

public abstract class zzfxr
implements zzfyh {
    public static zzfxr zzc(char c2) {
        zzfxo zzfxo2 = new zzfxo(c2);
        return zzfxo2;
    }

    public final /* synthetic */ boolean zza(Object object) {
        char c2 = ((Character)object).charValue();
        return this.zzb(c2);
    }

    public abstract boolean zzb(char var1);
}

