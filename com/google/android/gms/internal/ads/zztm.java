/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzik;
import java.nio.ByteBuffer;

public interface zztm {
    public int zza();

    public int zzb(MediaCodec.BufferInfo var1);

    public MediaFormat zzc();

    public ByteBuffer zzf(int var1);

    public ByteBuffer zzg(int var1);

    public void zzi();

    public void zzj(int var1, int var2, int var3, long var4, int var6);

    public void zzk(int var1, int var2, zzik var3, long var4, int var6);

    public void zzl();

    public void zzm(int var1, long var2);

    public void zzn(int var1, boolean var2);

    public void zzo(Surface var1);

    public void zzp(Bundle var1);

    public void zzq(int var1);
}

