/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.HandlerThread
 *  android.os.Trace
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzta;
import com.google.android.gms.internal.ads.zzth;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zztn;
import java.nio.ByteBuffer;

final class zztb
implements zztm {
    private final MediaCodec zza;
    private final zzth zzb;
    private final zztn zzc;
    private boolean zzd;
    private int zze;

    public /* synthetic */ zztb(MediaCodec object, HandlerThread handlerThread, zztn zztn2, zzta zzta2) {
        this.zza = object;
        super(handlerThread);
        this.zzb = object;
        this.zzc = zztn2;
        this.zze = 0;
    }

    public static /* synthetic */ String zzd(int n3) {
        return zztb.zzr(n3, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int n3) {
        return zztb.zzr(n3, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* bridge */ /* synthetic */ void zzh(zztb zztb2, MediaFormat mediaFormat, Surface surface, MediaCrypto object, int n3) {
        object = zztb2.zzb;
        MediaCodec mediaCodec = zztb2.zza;
        ((zzth)((Object)object)).zzf(mediaCodec);
        Trace.beginSection((String)"configureCodec");
        zztb2.zza.configure(mediaFormat, surface, null, n3);
        Trace.endSection();
        zztb2.zzc.zzh();
        Trace.beginSection((String)"startCodec");
        zztb2.zza.start();
        Trace.endSection();
        zztb2.zze = 1;
    }

    private static String zzr(int n3, String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n4 = 1;
        if (n3 == n4) {
            String string3 = "Audio";
            stringBuilder.append(string3);
        } else {
            n4 = 2;
            if (n3 == n4) {
                String string4 = "Video";
                stringBuilder.append(string4);
            } else {
                string2 = "Unknown(";
                stringBuilder.append(string2);
                stringBuilder.append(n3);
                String string5 = ")";
                stringBuilder.append(string5);
            }
        }
        return stringBuilder.toString();
    }

    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    public final ByteBuffer zzf(int n3) {
        return this.zza.getInputBuffer(n3);
    }

    public final ByteBuffer zzg(int n3) {
        return this.zza.getOutputBuffer(n3);
    }

    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    public final void zzj(int n3, int n4, int n7, long l2, int n8) {
        this.zzc.zzd(n3, 0, n7, l2, n8);
    }

    public final void zzk(int n3, int n4, zzik zzik2, long l2, int n7) {
        this.zzc.zze(n3, 0, zzik2, l2, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl() {
        Throwable throwable2;
        int n3;
        block4: {
            Object object;
            int n4;
            block3: {
                n3 = 1;
                try {
                    n4 = this.zze;
                    if (n4 != n3) break block3;
                    object = this.zzc;
                    object.zzg();
                    object = this.zzb;
                    ((zzth)((Object)object)).zzg();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.zze = n4 = 2;
            n4 = (int)(this.zzd ? 1 : 0);
            if (n4 != 0) return;
            object = this.zza;
            object.release();
            this.zzd = n3;
            return;
        }
        boolean bl2 = this.zzd;
        if (bl2) {
            throw throwable2;
        }
        MediaCodec mediaCodec = this.zza;
        mediaCodec.release();
        this.zzd = n3;
        throw throwable2;
    }

    public final void zzm(int n3, long l2) {
        this.zza.releaseOutputBuffer(n3, l2);
    }

    public final void zzn(int n3, boolean bl2) {
        this.zza.releaseOutputBuffer(n3, false);
    }

    public final void zzo(Surface surface) {
        Jq.a(this.zza, surface);
    }

    public final void zzp(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    public final void zzq(int n3) {
        this.zza.setVideoScalingMode(n3);
    }
}

