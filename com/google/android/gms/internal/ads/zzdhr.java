/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdho;
import com.google.android.gms.internal.ads.zzdhp;
import com.google.android.gms.internal.ads.zzdhq;
import java.util.Set;

public final class zzdhr
extends zzdez
implements zzbmg {
    public zzdhr(Set set) {
        super(set);
    }

    public final void zza(zzbyt zzbyt2) {
        zzdhq zzdhq2 = new zzdhq(zzbyt2);
        this.zzq(zzdhq2);
    }

    public final void zzb() {
        zzdhp zzdhp2 = new zzdhp();
        this.zzq(zzdhp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            zzdho zzdho2 = new zzdho();
            this.zzq(zzdho2);
            return;
        }
    }
}

