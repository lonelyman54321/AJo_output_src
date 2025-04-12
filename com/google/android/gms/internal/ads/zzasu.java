/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasq;
import com.google.android.gms.internal.ads.zzhjy;
import com.google.android.gms.internal.ads.zzhkd;
import com.google.android.gms.internal.ads.zzhki;
import java.nio.ByteBuffer;
import java.util.Date;

public final class zzasu
extends zzhjy {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0;
    private float zzl = 1.0f;
    private zzhki zzm;
    private long zzn;

    public zzasu() {
        super("mvhd");
        zzhki zzhki2;
        this.zzm = zzhki2 = zzhki.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MovieHeaderBox[creationTime=");
        Object object = this.zza;
        stringBuilder.append(object);
        stringBuilder.append(";modificationTime=");
        object = this.zzh;
        stringBuilder.append(object);
        stringBuilder.append(";timescale=");
        long l2 = this.zzi;
        stringBuilder.append(l2);
        stringBuilder.append(";duration=");
        l2 = this.zzj;
        stringBuilder.append(l2);
        stringBuilder.append(";rate=");
        double d2 = this.zzk;
        stringBuilder.append(d2);
        stringBuilder.append(";volume=");
        float f5 = this.zzl;
        stringBuilder.append(f5);
        stringBuilder.append(";matrix=");
        object = this.zzm;
        stringBuilder.append(object);
        stringBuilder.append(";nextTrackId=");
        l2 = this.zzn;
        return jl0_0.b(stringBuilder, l2, "]");
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        long l2;
        float f5;
        double d2;
        Object object;
        zzasu zzasu2 = this;
        this.zzi(byteBuffer);
        int n3 = this.zzh();
        int n4 = 1;
        if (n3 == n4) {
            long l3;
            object = zzhkd.zza(zzasq.zzf(byteBuffer));
            this.zza = object;
            object = zzhkd.zza(zzasq.zzf(byteBuffer));
            this.zzh = object;
            this.zzi = l3 = zzasq.zze(byteBuffer);
            this.zzj = l3 = zzasq.zzf(byteBuffer);
        } else {
            long l4;
            object = zzhkd.zza(zzasq.zze(byteBuffer));
            this.zza = object;
            object = zzhkd.zza(zzasq.zze(byteBuffer));
            this.zzh = object;
            this.zzi = l4 = zzasq.zze(byteBuffer);
            this.zzj = l4 = zzasq.zze(byteBuffer);
        }
        zzasu2.zzk = d2 = zzasq.zzb(byteBuffer);
        object = new byte[2];
        byteBuffer.get((byte[])object);
        reference var10_9 = object[0] << 8;
        n3 = object[n4] & 0xFF;
        n4 = (short)(0xFF00 & var10_9);
        zzasu2.zzl = f5 = (float)((short)(n3 | n4)) / 256.0f;
        zzasq.zzd(byteBuffer);
        zzasq.zze(byteBuffer);
        zzasq.zze(byteBuffer);
        double d5 = zzasq.zzb(byteBuffer);
        double d7 = zzasq.zzb(byteBuffer);
        double d9 = zzasq.zza(byteBuffer);
        double d12 = zzasq.zzb(byteBuffer);
        double d13 = zzasq.zzb(byteBuffer);
        double d14 = zzasq.zza(byteBuffer);
        double d15 = zzasq.zzb(byteBuffer);
        double d16 = zzasq.zzb(byteBuffer);
        double d17 = zzasq.zza(byteBuffer);
        zzasu2.zzm = object = new zzhki(d5, d7, d12, d13, d9, d14, d17, d15, d16);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        zzasu2.zzn = l2 = zzasq.zze(byteBuffer);
    }
}

