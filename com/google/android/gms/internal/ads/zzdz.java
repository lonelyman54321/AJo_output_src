/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface zzdz {
    public static final ByteBuffer zza;

    static {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        zza = byteBuffer.order(byteOrder);
    }

    public zzdx zza(zzdx var1);

    public ByteBuffer zzb();

    public void zzc();

    public void zzd();

    public void zze(ByteBuffer var1);

    public void zzf();

    public boolean zzg();

    public boolean zzh();
}

