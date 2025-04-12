/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzdeh
implements zzdcg {
    private int zza;

    public zzdeh() {
        int n3;
        zzbeg zzbeg2 = zzbep.zzbh;
        this.zza = n3 = ((Integer)zzba.zzc().zza(zzbeg2)).intValue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzc() {
        synchronized (this) {
            return this.zza;
        }
    }

    public final void zzdn(zzbxu zzbxu2) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdo(zzfhf object) {
        synchronized (this) {
            Throwable throwable22;
            block6: {
                try {
                    Object object2 = zzbep.zzbi;
                    zzben zzben2 = zzba.zzc();
                    object2 = zzben2.zza((zzbeg)object2);
                    object2 = (Boolean)object2;
                    boolean bl2 = (Boolean)object2;
                    if (!bl2) break block6;
                    try {
                        int n3;
                        object = ((zzfhf)object).zzb;
                        object = ((zzfhe)object).zzb;
                        this.zza = n3 = ((zzfgw)object).zzc;
                        return;
                    }
                    catch (NullPointerException nullPointerException) {
                        return;
                    }
                }
                catch (Throwable throwable22) {}
            }
            return;
            throw throwable22;
        }
    }
}

