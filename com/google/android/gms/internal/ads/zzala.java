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
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzaky;
import com.google.android.gms.internal.ads.zzakz;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzala
implements zzadu {
    public static final zzaea zza;
    private zzadx zzb;
    private zzali zzc;
    private boolean zzd;

    static {
        zzakz zzakz2 = new zzakz();
        zza = zzakz2;
    }

    private final boolean zza(zzadv object) {
        block6: {
            boolean bl2;
            block5: {
                int n3;
                zzfu zzfu2;
                block4: {
                    block7: {
                        long l2;
                        long l3;
                        long l4;
                        zzalc zzalc2 = new zzalc();
                        bl2 = true;
                        int n4 = zzalc2.zzb((zzadv)object, bl2);
                        if (n4 == 0) break block6;
                        n4 = zzalc2.zza;
                        int n7 = 2;
                        if ((n4 &= n7) != n7) break block6;
                        int n8 = zzalc2.zze;
                        n4 = 8;
                        n8 = Math.min(n8, n4);
                        zzfu2 = new zzfu(n8);
                        byte[] byArray = zzfu2.zzM();
                        object = (zzadi)object;
                        ((zzadi)object).zzm(byArray, 0, n8, false);
                        zzfu2.zzK(0);
                        n3 = zzfu2.zzb();
                        n8 = 5;
                        if (n3 < n8 || (n3 = zzfu2.zzm()) != (n8 = 127) || (n3 = (int)((l4 = (l3 = zzfu2.zzu()) - (l2 = 1179402563L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) break block7;
                        this.zzc = object = new zzaky();
                        break block5;
                    }
                    zzfu2.zzK(0);
                    try {
                        n3 = (int)(zzafg.zzd((int)(bl2 ? 1 : 0), zzfu2, bl2) ? 1 : 0);
                        if (n3 == 0) break block4;
                        this.zzc = object = new zzalk();
                        break block5;
                    }
                    catch (zzch zzch2) {}
                }
                zzfu2.zzK(0);
                n3 = (int)(zzale.zzd(zzfu2) ? 1 : 0);
                if (n3 == 0) break block6;
                this.zzc = object = new zzale();
            }
            return bl2;
        }
        return false;
    }

    public final int zzb(zzadv zzadv2, zzaeq zzaeq2) {
        boolean bl2;
        zzeq.zzb(this.zzb);
        Object object = this.zzc;
        if (object == null) {
            bl2 = this.zza(zzadv2);
            if (bl2) {
                zzadv2.zzj();
            } else {
                throw zzch.zza("Failed to determine bitstream type", null);
            }
        }
        if (!(bl2 = this.zzd)) {
            object = this.zzb;
            int n3 = 1;
            object = object.zzw(0, n3);
            this.zzb.zzD();
            zzali zzali2 = this.zzc;
            zzadx zzadx2 = this.zzb;
            zzali2.zzh(zzadx2, (zzafa)object);
            this.zzd = n3;
        }
        return this.zzc.zze(zzadv2, zzaeq2);
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzb = zzadx2;
    }

    public final void zze(long l2, long l3) {
        zzali zzali2 = this.zzc;
        if (zzali2 != null) {
            zzali2.zzj(l2, l3);
        }
    }

    public final boolean zzf(zzadv zzadv2) {
        try {
            return this.zza(zzadv2);
        }
        catch (zzch zzch2) {
            return false;
        }
    }
}

