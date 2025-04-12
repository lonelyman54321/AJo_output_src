/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzhka;
import com.google.android.gms.internal.ads.zzhkb;
import java.nio.ByteBuffer;

public class zzhjx
extends zzhka
implements zzasr {
    zzass zza;
    protected final String zzb;

    public zzhjx(String string2) {
        this.zzb = "moov";
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzhkb zzhkb2, ByteBuffer byteBuffer, long l2, zzaso zzaso2) {
        long l3;
        long l4;
        zzhkb2.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhkb2;
        this.zzf = l4 = zzhkb2.zzb();
        l4 = zzhkb2.zzb() + l2;
        zzhkb2.zze(l4);
        this.zzg = l3 = zzhkb2.zzb();
        this.zzc = zzaso2;
    }

    public final void zzc(zzass zzass2) {
        this.zza = zzass2;
    }
}

