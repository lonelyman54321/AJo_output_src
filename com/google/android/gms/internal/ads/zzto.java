/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CodecException
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzil;
import com.google.android.gms.internal.ads.zztp;

public class zzto
extends zzil {
    public final zztp zza;
    public final String zzb;

    public zzto(Throwable throwable, zztp zztp2) {
        String string2 = null;
        String string3 = zztp2 == null ? null : zztp2.zza;
        string3 = String.valueOf(string3);
        String string4 = "Decoder failed: ";
        string3 = string4.concat(string3);
        super(string3, throwable);
        this.zza = zztp2;
        int n3 = zzgd.zza;
        n3 = throwable instanceof MediaCodec.CodecException;
        if (n3 != 0) {
            throwable = (MediaCodec.CodecException)throwable;
            string2 = throwable.getDiagnosticInfo();
        }
        this.zzb = string2;
    }
}

