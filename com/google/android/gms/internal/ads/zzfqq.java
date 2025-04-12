/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqr;

public abstract class zzfqq
extends AsyncTask {
    private zzfqr zza;
    protected final zzfqi zzd;

    public zzfqq(zzfqi zzfqi2) {
        this.zzd = zzfqi2;
    }

    public void zza(String object) {
        object = this.zza;
        if (object != null) {
            ((zzfqr)object).zza(this);
        }
    }

    public final void zzb(zzfqr zzfqr2) {
        this.zza = zzfqr2;
    }
}

