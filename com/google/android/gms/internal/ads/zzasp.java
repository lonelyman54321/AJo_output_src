/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzhka;
import com.google.android.gms.internal.ads.zzhkb;
import com.google.android.gms.internal.ads.zzhkh;
import java.io.Closeable;

public final class zzasp
extends zzhka
implements Closeable {
    private static final zzhkh zza = zzhkh.zzb(zzasp.class);

    public zzasp(zzhkb zzhkb2, zzaso zzaso2) {
        long l2 = zzhkb2.zzc();
        this.zzf(zzhkb2, l2, zzaso2);
    }

    public final void close() {
    }

    public final String toString() {
        String string2 = this.zzd.toString();
        int n3 = lE2.a(7, string2);
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append("model(");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

