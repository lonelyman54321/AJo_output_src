/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzdez;
import java.util.Set;

public final class zzdef
extends zzdez
implements zzbkh {
    public zzdef(Set set) {
        super(set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String string2, String string3) {
        synchronized (this) {
            zzdee zzdee2 = new zzdee(string2, string3);
            this.zzq(zzdee2);
            return;
        }
    }
}

