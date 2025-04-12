/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhz;
import com.google.android.gms.internal.ads.zzdia;
import com.google.android.gms.internal.ads.zzdib;
import com.google.android.gms.internal.ads.zzdic;
import java.util.Set;

public final class zzdid
extends zzdez {
    private boolean zzb;

    public zzdid(Set set) {
        super(set);
    }

    public final void zza() {
        zzdia zzdia2 = new zzdia();
        this.zzq(zzdia2);
    }

    public final void zzb() {
        zzdhz zzdhz2 = new zzdhz();
        this.zzq(zzdhz2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                zzdey zzdey2;
                block3: {
                    try {
                        boolean bl2 = this.zzb;
                        if (bl2) break block3;
                        zzdey2 = new zzdib();
                        this.zzq(zzdey2);
                        this.zzb = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzdey2 = new zzdic();
                this.zzq(zzdey2);
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
    public final void zzd() {
        synchronized (this) {
            boolean bl2;
            zzdib zzdib2 = new zzdib();
            this.zzq(zzdib2);
            this.zzb = bl2 = true;
            return;
        }
    }
}

