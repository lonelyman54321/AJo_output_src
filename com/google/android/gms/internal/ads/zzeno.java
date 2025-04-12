/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

public final class zzeno
implements zzg {
    private zzg zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(View view) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzg zzg2 = this.zza;
                    if (zzg2 != null) {
                        zzg2.zza(view);
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
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzg zzg2 = this.zza;
                    if (zzg2 != null) {
                        zzg2.zzb();
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
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzg zzg2 = this.zza;
                    if (zzg2 != null) {
                        zzg2.zzc();
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
    public final void zzd(zzg zzg2) {
        synchronized (this) {
            this.zza = zzg2;
            return;
        }
    }
}

