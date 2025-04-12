/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzehb;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfoj;

public final class zzcht
implements Runnable {
    public final /* synthetic */ zzehg zza;

    public /* synthetic */ zzcht(zzehg zzehg2) {
        this.zza = zzehg2;
    }

    public final void run() {
        Object object = this.zza;
        zzehb zzehb2 = zzu.zzA();
        object = ((zzehg)object).zza();
        zzehb2.zzi((zzfoj)object);
    }
}

