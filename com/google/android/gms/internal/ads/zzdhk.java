/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhj;
import java.util.Set;

public final class zzdhk
extends zzdez {
    public zzdhk(Set set) {
        super(set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            zzdhj zzdhj2 = new zzdhj();
            this.zzq(zzdhj2);
            return;
        }
    }
}

