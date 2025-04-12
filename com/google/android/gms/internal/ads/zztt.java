/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CodecException
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zztp;

public final class zztt
extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zztp zzc;
    public final String zzd;
    public final zztt zze;

    public zztt(zzan zzan2, Throwable throwable, boolean bl2, int n3) {
        String string2 = zzan2.toString();
        StringBuilder stringBuilder = new StringBuilder("Decoder init failed: [");
        stringBuilder.append(n3);
        stringBuilder.append("], ");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        String string4 = zzan2.zzn;
        String string5 = hj0_0.a(Math.abs(n3), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        this(string3, throwable, string4, false, null, string5, null);
    }

    public zztt(zzan object, Throwable throwable, boolean bl2, zztp zztp2) {
        String string2 = zztp2.zza;
        String string3 = ((zzan)object).toString();
        String string4 = "Decoder init failed: ";
        String string5 = ", ";
        String string6 = UX.c(string4, string2, string5, string3);
        String string7 = ((zzan)object).zzn;
        int n3 = zzgd.zza;
        n3 = throwable instanceof MediaCodec.CodecException;
        if (n3 != 0) {
            object = throwable;
            object = ((MediaCodec.CodecException)throwable).getDiagnosticInfo();
        } else {
            n3 = 0;
            object = null;
        }
        this(string6, throwable, string7, false, zztp2, (String)object, null);
    }

    private zztt(String string2, Throwable throwable, String string3, boolean bl2, zztp zztp2, String string4, zztt zztt2) {
        super(string2, throwable);
        this.zza = string3;
        this.zzb = false;
        this.zzc = zztp2;
        this.zzd = string4;
        this.zze = zztt2;
    }

    public static /* bridge */ /* synthetic */ zztt zza(zztt zztt2, zztt zztt3) {
        zztp zztp2 = zztt2.zzc;
        String string2 = zztt2.zzd;
        String string3 = zztt2.getMessage();
        Throwable throwable = zztt2.getCause();
        String string4 = zztt2.zza;
        zztt zztt4 = new zztt(string3, throwable, string4, false, zztp2, string2, zztt3);
        return zztt4;
    }
}

