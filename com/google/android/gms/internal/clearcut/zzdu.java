/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzax;
import com.google.android.gms.internal.clearcut.zzay;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbu;
import com.google.android.gms.internal.clearcut.zzby;
import com.google.android.gms.internal.clearcut.zzca;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzct;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzeh;
import com.google.android.gms.internal.clearcut.zzex;
import com.google.android.gms.internal.clearcut.zzey;
import com.google.android.gms.internal.clearcut.zzfq;
import com.google.android.gms.internal.clearcut.zzfr;
import java.util.Map;

final class zzdu
implements zzef {
    private final zzdo zzmn;
    private final boolean zzmo;
    private final zzex zzmx;
    private final zzbu zzmy;

    private zzdu(zzex zzex2, zzbu zzbu2, zzdo zzdo2) {
        boolean bl2;
        this.zzmx = zzex2;
        this.zzmo = bl2 = zzbu2.zze(zzdo2);
        this.zzmy = zzbu2;
        this.zzmn = zzdo2;
    }

    public static zzdu zza(zzex zzex2, zzbu zzbu2, zzdo zzdo2) {
        zzdu zzdu2 = new zzdu(zzex2, zzbu2, zzdo2);
        return zzdu2;
    }

    public final boolean equals(Object object, Object object2) {
        Object object3;
        Object object4 = this.zzmx.zzq(object);
        boolean bl2 = object4.equals(object3 = this.zzmx.zzq(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.zzmo;
        if (bl2) {
            object = this.zzmy.zza(object);
            object2 = this.zzmy.zza(object2);
            return ((zzby)object).equals(object2);
        }
        return true;
    }

    public final int hashCode(Object object) {
        Object object2 = this.zzmx.zzq(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.zzmo;
        if (bl2) {
            zzbu zzbu2 = this.zzmy;
            object = zzbu2.zza(object);
            n3 *= 53;
            int n4 = ((zzby)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final Object newInstance() {
        return this.zzmn.zzbd().zzbi();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(Object object, zzfr zzfr2) {
        Object object2 = this.zzmy.zza(object).iterator();
        while (true) {
            boolean bl2;
            zzfq zzfq2;
            boolean bl3;
            if (!(bl3 = object2.hasNext())) {
                object2 = this.zzmx;
                object = ((zzex)object2).zzq(object);
                ((zzex)object2).zzc(object, zzfr2);
                return;
            }
            Object object3 = (Map.Entry)object2.next();
            zzca zzca2 = (zzca)object3.getKey();
            zzfq zzfq3 = zzca2.zzav();
            if (zzfq3 != (zzfq2 = zzfq.zzrf) || (bl2 = zzca2.zzaw()) || (bl2 = zzca2.zzax())) break;
            bl2 = object3 instanceof zzct;
            int n3 = zzca2.zzc();
            object3 = bl2 ? ((zzct)object3).zzbs().zzr() : object3.getValue();
            zzfr2.zza(n3, object3);
        }
        object = new IllegalStateException("Found invalid MessageSet item.");
        throw object;
    }

    public final void zza(Object object, byte[] byArray, int n3, int n4, zzay zzay2) {
        object = (zzcg)object;
        Object object2 = ((zzcg)object).zzjp;
        Object object3 = zzey.zzea();
        if (object2 == object3) {
            object2 = zzey.zzeb();
            ((zzcg)object).zzjp = object2;
        }
        object = object2;
        while (n3 < n4) {
            int n7;
            int n8 = zzax.zza(byArray, n3, zzay2);
            int n10 = zzay2.zzfd;
            n3 = 11;
            int n14 = 2;
            if (n10 != n3) {
                n3 = n10 & 7;
                if (n3 == n14) {
                    object3 = byArray;
                    n7 = n4;
                    n3 = zzax.zza(n10, byArray, n8, n4, (zzey)object, zzay2);
                    continue;
                }
                n3 = zzax.zza(n10, byArray, n8, n4, zzay2);
                continue;
            }
            n3 = 0;
            n10 = 0;
            object2 = null;
            while (n8 < n4) {
                n8 = zzax.zza(byArray, n8, zzay2);
                n7 = zzay2.zzfd;
                int n15 = n7 >>> 3;
                int n16 = n7 & 7;
                if (n15 != n14) {
                    int n17 = 3;
                    if (n15 == n17 && n16 == n14) {
                        n8 = zzax.zze(byArray, n8, zzay2);
                        object2 = (zzbb)zzay2.zzff;
                        continue;
                    }
                } else if (n16 == 0) {
                    n8 = zzax.zza(byArray, n8, zzay2);
                    n3 = zzay2.zzfd;
                    continue;
                }
                if (n7 == (n15 = 12)) break;
                n8 = zzax.zza(n7, byArray, n8, n4, zzay2);
            }
            if (object2 != null) {
                n3 = n3 << 3 | n14;
                ((zzey)object).zzb(n3, object2);
            }
            n3 = n8;
        }
        if (n3 == n4) {
            return;
        }
        throw zzco.zzbo();
    }

    public final void zzc(Object object) {
        this.zzmx.zzc(object);
        this.zzmy.zzc(object);
    }

    public final void zzc(Object object, Object object2) {
        Object object3 = this.zzmx;
        zzeh.zza((zzex)object3, object, object2);
        boolean bl2 = this.zzmo;
        if (bl2) {
            object3 = this.zzmy;
            zzeh.zza((zzbu)object3, object, object2);
        }
    }

    public final int zzm(Object object) {
        zzex zzex2 = this.zzmx;
        Object object2 = zzex2.zzq(object);
        int n3 = zzex2.zzr(object2);
        boolean bl2 = this.zzmo;
        if (bl2) {
            object2 = this.zzmy;
            object = ((zzbu)object2).zza(object);
            int n4 = ((zzby)object).zzat();
            n3 += n4;
        }
        return n3;
    }

    public final boolean zzo(Object object) {
        return this.zzmy.zza(object).isInitialized();
    }
}

