/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfp;

public final class zzcft
extends zzcfp {
    public zzcft(zzcee zzcee2) {
        super(zzcee2);
    }

    public final void zzf() {
    }

    public final boolean zzt(String string2) {
        String string3 = zzf.zzf(string2);
        zzcee zzcee2 = (zzcee)this.zzc.get();
        if (zzcee2 != null && string3 != null) {
            zzcee2.zzt(string3, this);
        }
        zzm.zzj("VideoStreamNoopCache is doing nothing.");
        this.zzg(string2, string3, "noop", "Noop cache is a noop.");
        return false;
    }
}

