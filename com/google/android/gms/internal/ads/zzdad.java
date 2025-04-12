/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdac;
import com.google.android.gms.internal.ads.zzdez;
import java.util.Set;

public final class zzdad
extends zzdez {
    private boolean zzb = false;

    public zzdad(Set set) {
        super(set);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzb;
                    if (!bl2) {
                        zzdac zzdac2 = new zzdac();
                        this.zzq(zzdac2);
                        this.zzb = bl2 = true;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

