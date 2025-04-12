/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbt;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzfgt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzdbu
extends zzdez
implements zzdaf,
zzdbk {
    private final zzfgt zzb;
    private final AtomicBoolean zzc;

    public zzdbu(Set object, zzfgt zzfgt2) {
        super((Set)object);
        this.zzc = object = new AtomicBoolean();
        this.zzb = zzfgt2;
    }

    private final void zzb() {
        Object object = zzbep.zzhT;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            int n4;
            object = this.zzc;
            int n7 = 0;
            zzben2 = null;
            boolean bl2 = true;
            boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
            if (bl3 && (object = this.zzb.zzaf) != null && (n4 = ((zzs)object).zza) == (n7 = 3)) {
                object = new zzdbt(this);
                this.zzq((zzdey)object);
            }
        }
    }

    public final /* synthetic */ void zza(zzdbw zzdbw2) {
        zzs zzs2 = this.zzb.zzaf;
        zzdbw2.zzh(zzs2);
    }

    public final void zzg() {
        zzfgt zzfgt2 = this.zzb;
        int n3 = zzfgt2.zzb;
        int n4 = 1;
        if (n3 == n4) {
            this.zzb();
        }
    }

    public final void zzr() {
        zzfgt zzfgt2 = this.zzb;
        int n3 = zzfgt2.zzb;
        int n4 = 2;
        if (n3 != n4 && n3 != (n4 = 5) && n3 != (n4 = 4) && n3 != (n4 = 6) && n3 != (n4 = 7)) {
            return;
        }
        this.zzb();
    }
}

