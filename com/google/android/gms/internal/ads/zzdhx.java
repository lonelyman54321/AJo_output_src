/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzax;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhv;
import com.google.android.gms.internal.ads.zzdhw;
import java.util.Set;

public final class zzdhx
extends zzdez {
    public zzdhx(Set set) {
        super(set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzax zzax2) {
        synchronized (this) {
            zzdhv zzdhv2 = new zzdhv(zzax2);
            this.zzq(zzdhv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String string2) {
        synchronized (this) {
            zzdhw zzdhw2 = new zzdhw(string2);
            this.zzq(zzdhw2);
            return;
        }
    }
}

