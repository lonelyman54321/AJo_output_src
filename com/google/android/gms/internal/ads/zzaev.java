/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaew;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzu;
import java.util.List;

public final class zzaev
implements zzadu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadx zzf;
    private zzafa zzg;

    public zzaev(int n3, int n4, String string2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
    }

    public final int zzb(zzadv object, zzaeq object2) {
        int n3 = this.zze;
        int n4 = -1;
        int n7 = 2;
        int n8 = 1;
        if (n3 != n8) {
            if (n3 == n7) {
                return n4;
            }
            object = new IllegalStateException();
            throw object;
        }
        object2 = this.zzg;
        object2.getClass();
        int n10 = 1024;
        int n14 = zzaey.zza((zzafa)object2, (zzu)object, n10, n8 != 0);
        n3 = 0;
        object2 = null;
        if (n14 == n4) {
            this.zze = n7;
            zzafa zzafa2 = this.zzg;
            int n15 = this.zzd;
            long l2 = 0L;
            int n16 = 1;
            zzafa2.zzs(l2, n16, n15, 0, null);
            this.zzd = 0;
        } else {
            this.zzd = n4 = this.zzd + n14;
        }
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx object) {
        this.zzf = object;
        this.zzg = object = object.zzw(1024, 4);
        Object object2 = new zzal();
        String string2 = this.zzc;
        ((zzal)object2).zzX(string2);
        object2 = ((zzal)object2).zzad();
        object.zzl((zzan)object2);
        this.zzf.zzD();
        object = this.zzf;
        object2 = new zzaew(-9223372036854775807L);
        object.zzO((zzaet)object2);
        this.zze = 1;
    }

    public final void zze(long l2, long l3) {
        int n3;
        l3 = 0L;
        int n4 = 1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object != false && (n3 = this.zze) != n4) {
            return;
        }
        this.zze = n4;
        this.zzd = 0;
    }

    public final boolean zzf(zzadv zzadv2) {
        byte[] byArray;
        int n3 = this.zza;
        boolean bl2 = true;
        int n4 = -1;
        if (n3 != n4 && (n3 = this.zzb) != n4) {
            n3 = 1;
        } else {
            n3 = 0;
            byArray = null;
        }
        zzeq.zzf(n3 != 0);
        n3 = this.zzb;
        zzfu zzfu2 = new zzfu(n3);
        byArray = zzfu2.zzM();
        int n7 = this.zzb;
        zzadv2 = (zzadi)zzadv2;
        ((zzadi)zzadv2).zzm(byArray, 0, n7, false);
        int n8 = zzfu2.zzq();
        n3 = this.zza;
        if (n8 == n3) {
            return bl2;
        }
        return false;
    }
}

