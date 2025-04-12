/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzagf;
import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Collections;
import java.util.List;

final class zzagb
extends zzagg {
    private static final int[] zzb = new int[]{5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzagb(zzafa zzafa2) {
        super(zzafa2);
    }

    public final boolean zza(zzfu object) {
        int n3 = this.zzc;
        int n4 = 1;
        if (n3 == 0) {
            int n7 = ((zzfu)object).zzm();
            this.zze = n3 = n7 >> 4;
            int n8 = 2;
            if (n3 == n8) {
                n7 >>= n8;
                Object object2 = zzb;
                n7 &= 3;
                n7 = object2[n7];
                object2 = new zzal;
                ((zzal)object2)();
                String string2 = "audio/mpeg";
                ((zzal)object2).zzX(string2);
                ((zzal)object2).zzy(n4);
                ((zzal)object2).zzY(n7);
                object = ((zzal)object2).zzad();
                object2 = this.zza;
                object2.zzl((zzan)object);
                this.zzd = n4;
            } else {
                n7 = 7;
                if (n3 != n7 && n3 != (n8 = 8)) {
                    n7 = 10;
                    if (n3 != n7) {
                        String string3 = hj0_0.a(n3, "Audio format not supported: ");
                        object = new zzagf(string3);
                        throw object;
                    }
                } else {
                    zzal zzal2 = new zzal();
                    object = n3 == n7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                    zzal2.zzX((String)object);
                    zzal2.zzy(n4);
                    n7 = 8000;
                    zzal2.zzY(n7);
                    object = zzal2.zzad();
                    zzafa zzafa2 = this.zza;
                    zzafa2.zzl((zzan)object);
                    this.zzd = n4;
                }
            }
            this.zzc = n4;
        } else {
            ((zzfu)object).zzL(n4);
        }
        return n4 != 0;
    }

    public final boolean zzb(zzfu object, long l2) {
        int n3;
        int n4 = this.zze;
        int n7 = 2;
        int n8 = 1;
        if (n4 == n7) {
            int n10 = ((zzfu)object).zzb();
            this.zza.zzq((zzfu)object, n10);
            this.zza.zzs(l2, 1, n10, 0, null);
            return n8 != 0;
        }
        n4 = ((zzfu)object).zzm();
        n7 = 0;
        if (n4 == 0 && (n3 = this.zzd) == 0) {
            int n14 = ((zzfu)object).zzb();
            byte[] byArray = new byte[n14];
            ((zzfu)object).zzG(byArray, 0, n14);
            object = zzacq.zza(byArray);
            zzal zzal2 = new zzal();
            zzal2.zzX("audio/mp4a-latm");
            String string2 = ((zzacp)object).zzc;
            zzal2.zzz(string2);
            n4 = ((zzacp)object).zzb;
            zzal2.zzy(n4);
            int n15 = ((zzacp)object).zza;
            zzal2.zzY(n15);
            object = Collections.singletonList(byArray);
            zzal2.zzL((List)object);
            object = zzal2.zzad();
            this.zza.zzl((zzan)object);
            this.zzd = n8;
            return false;
        }
        n3 = this.zze;
        int n16 = 10;
        if (n3 == n16 && n4 != n8) {
            return false;
        }
        int n17 = ((zzfu)object).zzb();
        this.zza.zzq((zzfu)object, n17);
        this.zza.zzs(l2, 1, n17, 0, null);
        return n8 != 0;
    }
}

