/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzd;
import java.nio.ByteBuffer;

final class zze {
    private final ByteBuffer zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final ByteBuffer zze;

    public /* synthetic */ zze(ByteBuffer byteBuffer, long l2, long l3, long l4, ByteBuffer byteBuffer2, zzd zzd2) {
        this.zza = byteBuffer;
        this.zzb = l2;
        this.zzc = l3;
        this.zzd = l4;
        this.zze = byteBuffer2;
    }

    public static /* bridge */ /* synthetic */ long zza(zze zze2) {
        return zze2.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzb(zze zze2) {
        return zze2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zzc(zze zze2) {
        return zze2.zzd;
    }

    public static /* bridge */ /* synthetic */ ByteBuffer zzd(zze zze2) {
        return zze2.zze;
    }

    public static /* bridge */ /* synthetic */ ByteBuffer zze(zze zze2) {
        return zze2.zza;
    }
}

