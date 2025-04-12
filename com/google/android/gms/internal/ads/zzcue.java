/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbi;
import com.google.android.gms.internal.ads.zzfgt;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcue
implements zzdaz,
zzban {
    private final zzfgt zza;
    private final zzdad zzb;
    private final zzdbi zzc;
    private final AtomicBoolean zzd;
    private final AtomicBoolean zze;

    public zzcue(zzfgt zzfgt2, zzdad zzdad2, zzdbi zzdbi2) {
        AtomicBoolean atomicBoolean;
        this.zzd = atomicBoolean = new AtomicBoolean();
        this.zze = atomicBoolean = new AtomicBoolean();
        this.zza = zzfgt2;
        this.zzb = zzdad2;
        this.zzc = zzdbi2;
    }

    private final void zza() {
        Object object = this.zzd;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = this.zzb;
            ((zzdad)object).zza();
        }
    }

    public final void zzdp(zzbam object) {
        boolean bl2;
        zzfgt zzfgt2 = this.zza;
        int n3 = zzfgt2.zzf;
        int n4 = 1;
        if (n3 == n4 && (n3 = (int)(((zzbam)object).zzj ? 1 : 0))) {
            this.zza();
        }
        if (bl2 = ((zzbam)object).zzj) {
            object = this.zze;
            n3 = 0;
            zzfgt2 = null;
            bl2 = ((AtomicBoolean)object).compareAndSet(false, n4 != 0);
            if (bl2) {
                object = this.zzc;
                ((zzdbi)object).zza();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzs() {
        // MONITORENTER : this
        zzfgt zzfgt2 = this.zza;
        int n3 = zzfgt2.zzf;
        int n4 = 1;
        if (n3 == n4) return;
        this.zza();
        // MONITOREXIT : this
        return;
    }
}

