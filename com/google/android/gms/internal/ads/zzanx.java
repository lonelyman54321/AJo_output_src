/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzanw;
import com.google.android.gms.internal.ads.zzany;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzanx
implements zzadu {
    public static final zzaea zza;
    private final zzany zzb;
    private final zzfu zzc;
    private final zzfu zzd;
    private final zzft zze;
    private zzadx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzanw zzanw2 = new zzanw();
        zza = zzanw2;
    }

    public zzanx() {
        throw null;
    }

    public zzanx(int n3) {
        zzft zzft2;
        Object object = new zzany(true, null, 0);
        this.zzb = object;
        this.zzc = object = new zzfu(2048);
        this.zzh = -1;
        this.zzd = object = new zzfu(10);
        object = ((zzfu)object).zzM();
        int n4 = ((Object)object).length;
        this.zze = zzft2 = new zzft((byte[])object, n4);
    }

    public final int zzb(zzadv object, zzaeq object2) {
        zzeq.zzb(this.zzf);
        object2 = this.zzc.zzM();
        int n3 = object.zza((byte[])object2, 0, 2048);
        int n4 = this.zzj;
        boolean bl2 = true;
        if (n4 == 0) {
            object2 = this.zzf;
            long l2 = -9223372036854775807L;
            long l3 = 0L;
            zzaes zzaes2 = new zzaes(l2, l3);
            object2.zzO(zzaes2);
            this.zzj = bl2;
        }
        if (n3 == (n4 = -1)) {
            return n4;
        }
        this.zzc.zzK(0);
        object2 = this.zzc;
        ((zzfu)object2).zzJ(n3);
        n3 = (int)(this.zzi ? 1 : 0);
        if (n3 == 0) {
            object = this.zzb;
            long l4 = this.zzg;
            n4 = 4;
            ((zzany)object).zzd(l4, n4);
            this.zzi = bl2;
        }
        object = this.zzb;
        object2 = this.zzc;
        ((zzany)object).zza((zzfu)object2);
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzf = zzadx2;
        zzapo zzapo2 = new zzapo(-1 << -1, 0, 1);
        this.zzb.zzb(zzadx2, zzapo2);
        zzadx2.zzD();
    }

    public final void zze(long l2, long l3) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzf(zzadv zzadv2) {
        int n3;
        long l2;
        int n4;
        zzadv zzadv3;
        Object object;
        int n7 = 0;
        while (true) {
            object = this.zzd.zzM();
            zzadv3 = zzadv2;
            zzadv3 = (zzadi)zzadv2;
            ((zzadi)zzadv3).zzm((byte[])object, 0, 10, false);
            this.zzd.zzK(0);
            object = this.zzd;
            int n8 = ((zzfu)object).zzo();
            n4 = 0x494433;
            if (n8 != n4) {
                zzadv2.zzj();
                object = zzadv2;
                object = (zzadi)zzadv2;
                ((zzadi)object).zzl(n7, false);
                long l3 = this.zzh;
                long l4 = -1;
                l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l2 == false) {
                    this.zzh = l3 = (long)n7;
                }
                break;
            }
            this.zzd.zzL(3);
            object = this.zzd;
            n8 = ((zzfu)object).zzl();
            n4 = n8 + 10;
            n7 += n4;
            ((zzadi)zzadv3).zzl(n8, false);
        }
        n4 = n7;
        int n10 = 0;
        zzadv3 = null;
        int n14 = 0;
        do {
            block12: {
                block11: {
                    int n15;
                    Object object2;
                    block10: {
                        object2 = this.zzd.zzM();
                        l2 = 2;
                        ((zzadi)object).zzm((byte[])object2, 0, (int)l2, false);
                        this.zzd.zzK(0);
                        object2 = this.zzd;
                        n3 = zzany.zzf(((zzfu)object2).zzq());
                        if (n3 != 0) break block10;
                        zzadv2.zzj();
                        ((zzadi)object).zzl(++n4, false);
                        break block11;
                    }
                    n3 = 1;
                    l2 = 4;
                    if ((n10 += n3) >= l2 && n14 > (n15 = 188)) {
                        return n3 != 0;
                    }
                    object2 = this.zzd.zzM();
                    ((zzadi)object).zzm((byte[])object2, 0, (int)l2, false);
                    this.zze.zzk(14);
                    object2 = this.zze;
                    n3 = ((zzft)object2).zzd(13);
                    l2 = 6;
                    if (n3 > l2) break block12;
                    zzadv2.zzj();
                    ((zzadi)object).zzl(++n4, false);
                }
                n10 = 0;
                zzadv3 = null;
                n14 = 0;
                continue;
            }
            l2 = n3 + -6;
            ((zzadi)object).zzl((int)l2, false);
            n14 += n3;
        } while ((n3 = n4 - n7) < (l2 = (long)8192));
        return false;
    }
}

