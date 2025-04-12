/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdbh;
import com.google.android.gms.internal.ads.zzdez;
import java.util.Set;

public final class zzdbi
extends zzdez {
    public zzdbi(Set set) {
        super(set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            zzdbh zzdbh2 = new zzdbh();
            this.zzq(zzdbh2);
            return;
        }
    }
}

