/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfka;
import java.util.AbstractCollection;
import java.util.LinkedList;

final class zzfjb {
    private final LinkedList zza;
    private final int zzb;
    private final int zzc;
    private final zzfka zzd;

    public zzfjb(int n3, int n4) {
        zzfka zzfka2;
        LinkedList linkedList;
        this.zza = linkedList = new LinkedList();
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = zzfka2 = new zzfka();
    }

    private final void zzi() {
        Object object;
        Object object2;
        while ((object2 = ((AbstractCollection)(object = this.zza)).isEmpty()) == 0) {
            object = (zzfjl)this.zza.getFirst();
            Clock clock = zzu.zzB();
            long l2 = clock.currentTimeMillis();
            long l3 = ((zzfjl)object).zzd;
            long l4 = (l2 -= l3) - (l3 = (long)this.zzc);
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) break;
            this.zzd.zzg();
            object = this.zza;
            ((LinkedList)object).remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        this.zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfjl zze() {
        this.zzd.zzf();
        this.zzi();
        Object object = this.zza;
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (bl2) {
            return null;
        }
        object = (zzfjl)this.zza.remove();
        if (object != null) {
            zzfka zzfka2 = this.zzd;
            zzfka2.zzh();
        }
        return object;
    }

    public final zzfjz zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfjl zzfjl2) {
        this.zzd.zzf();
        this.zzi();
        LinkedList linkedList = this.zza;
        int n3 = linkedList.size();
        int n4 = this.zzb;
        if (n3 == n4) {
            return false;
        }
        this.zza.add(zzfjl2);
        return true;
    }
}

