/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import java.nio.charset.Charset;

final class zzaft
implements zzafj {
    public final String zza;

    private zzaft(String string2) {
        this.zza = string2;
    }

    public static zzaft zzb(zzfu object) {
        int n3 = ((zzfu)object).zzb();
        Charset charset = zzfxs.zzc;
        object = ((zzfu)object).zzA(n3, charset);
        zzaft zzaft2 = new zzaft((String)object);
        return zzaft2;
    }

    public final int zza() {
        return 1852994675;
    }
}

