/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdi;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class zzbdf
extends PushbackInputStream {
    final /* synthetic */ zzbdg zza;

    public zzbdf(zzbdg zzbdg2, InputStream inputStream, int n3) {
        this.zza = zzbdg2;
        super(inputStream, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            Object object = this.zza;
            object = ((zzbdg)object).zzc;
            zzbdi.zze((zzbdi)object);
            super.close();
            return;
        }
    }
}

