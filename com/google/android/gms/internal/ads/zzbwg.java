/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzr;

public final class zzbwg
implements Runnable {
    public final /* synthetic */ zzr zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbwg(zzr zzr2, String string2) {
        this.zza = zzr2;
        this.zzb = string2;
    }

    public final void run() {
        zzr zzr2 = this.zza;
        String string2 = this.zzb;
        zzr2.zza(string2);
    }
}

