/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzux;
import com.google.android.gms.internal.ads.zzxh;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.List;

public final class zzuy
implements zzxh {
    private final zzgbc zza;
    private long zzb;

    public zzuy(List list, List list2) {
        zzux zzux2;
        zzgaz zzgaz2 = new zzgaz();
        int n3 = list.size();
        int n4 = list2.size();
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            zzux2 = null;
        }
        zzeq.zzd(n3 != 0);
        while (n7 < (n3 = list.size())) {
            zzxh zzxh2 = (zzxh)list.get(n7);
            List list3 = (List)list2.get(n7);
            zzux2 = new zzux(zzxh2, list3);
            zzgaz2.zzf(zzux2);
            ++n7;
        }
        list = zzgaz2.zzi();
        this.zza = list;
        this.zzb = -9223372036854775807L;
    }

    public final long zzb() {
        long l2;
        long l3;
        int n3 = 0;
        long l4 = l3 = Long.MAX_VALUE;
        long l7 = l3;
        while (true) {
            int n4;
            Integer n7;
            Object object = this.zza;
            int n8 = ((AbstractCollection)object).size();
            l2 = Long.MIN_VALUE;
            if (n3 >= n8) break;
            object = (zzux)this.zza.get(n3);
            long l8 = ((zzux)object).zzb();
            Serializable serializable = ((zzux)object).zza();
            int n10 = serializable.contains(n7 = Integer.valueOf(n4 = 1));
            if ((n10 != 0 || (n10 = (serializable = ((zzux)object).zza()).contains(n7 = Integer.valueOf(n4 = 2))) != 0 || (n8 = (int)(((zzgbc)(object = ((zzux)object).zza())).contains(serializable = Integer.valueOf(n10 = 4)) ? 1 : 0)) != 0) && (n8 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1))) != 0) {
                l4 = Math.min(l4, l8);
            }
            if ((n8 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1))) != 0) {
                l7 = Math.min(l7, l8);
            }
            ++n3;
        }
        n3 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
        if (n3 != 0) {
            this.zzb = l4;
            return l4;
        }
        n3 = (int)(l7 == l3 ? 0 : (l7 < l3 ? -1 : 1));
        if (n3 != 0) {
            long l12 = this.zzb;
            long l14 = -9223372036854775807L;
            long l15 = l12 - l14;
            Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object != false) {
                return l12;
            }
            return l7;
        }
        return l2;
    }

    public final long zzc() {
        long l2;
        long l3;
        int n3 = 0;
        long l4 = l3 = Long.MAX_VALUE;
        while (true) {
            Object object = this.zza;
            int n4 = ((AbstractCollection)object).size();
            l2 = Long.MIN_VALUE;
            if (n3 >= n4) break;
            object = (zzux)this.zza.get(n3);
            long l7 = ((zzux)object).zzc();
            long l8 = l7 - l2;
            n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n4 != 0) {
                l4 = Math.min(l4, l7);
            }
            ++n3;
        }
        n3 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
        if (n3 == 0) {
            return l2;
        }
        return l4;
    }

    public final void zzm(long l2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.zza)).size()); ++i3) {
            object = (zzux)this.zza.get(i3);
            ((zzux)object).zzm(l2);
        }
    }

    public final boolean zzo(zzlo zzlo2) {
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2 = false;
        while ((l7 = (l4 = (l3 = this.zzc()) - (l2 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            Object object;
            int n3;
            int n4 = 0;
            for (l7 = (long)0; l7 < (n3 = ((AbstractCollection)(object = this.zza)).size()); ++l7) {
                long l8;
                long l12;
                long l14;
                object = (zzux)this.zza.get((int)l7);
                long l15 = ((zzux)object).zzc();
                long l16 = l15 - l2;
                Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                object2 = object2 != false && (l14 = (l12 = l15 - (l8 = zzlo2.zza)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) <= 0 ? (Object)1 : (Object)0;
                Object object3 = l15 == l3 ? 0 : (l15 < l3 ? -1 : 1);
                if (object3 != false && object2 == false) continue;
                object = (zzux)this.zza.get((int)l7);
                n3 = (int)(((zzux)object).zzo(zzlo2) ? 1 : 0);
                n4 |= n3;
            }
            bl2 |= n4;
            if (n4 != 0) continue;
        }
        return bl2;
    }

    public final boolean zzp() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.zza)).size()); ++i3) {
            object = (zzux)this.zza.get(i3);
            n3 = (int)(((zzux)object).zzp() ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }
}

