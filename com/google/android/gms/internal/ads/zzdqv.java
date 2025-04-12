/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdqf;

public final class zzdqv
extends zzdqf
implements zzdhi {
    private zzdhi zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdG() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdhi zzdhi2 = this.zza;
                    if (zzdhi2 != null) {
                        zzdhi2.zzdG();
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdf() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdhi zzdhi2 = this.zza;
                    if (zzdhi2 != null) {
                        zzdhi2.zzdf();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(zza zza2, zzbkf zzbkf2, zzp zzp2, zzbkh zzbkh2, zzaa zzaa2, zzdhi zzdhi2) {
        synchronized (this) {
            this.zzh(zza2, zzbkf2, zzp2, zzbkh2, zzaa2);
            this.zza = zzdhi2;
            return;
        }
    }
}

