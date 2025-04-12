/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class zzamj
implements zzalv {
    private final zzfu zza;
    private final zzfu zzb;
    private final zzami zzc;
    private Inflater zzd;

    public zzamj() {
        Object object = new zzfu();
        this.zza = object;
        object = new zzfu();
        this.zzb = object;
        this.zzc = object = new zzami();
    }

    public final void zza(byte[] object, int n3, int n4, zzalu object2, zzev zzev2) {
        Object object3;
        object2 = this.zza;
        ((zzfu)object2).zzI((byte[])object, n4 += n3);
        this.zza.zzK(n3);
        object = this.zza;
        n3 = ((zzfu)object).zzb();
        if (n3 > 0 && (n3 = ((zzfu)object).zzf()) == (n4 = 120)) {
            Object object4;
            object3 = this.zzd;
            if (object3 == null) {
                this.zzd = object3 = new Inflater();
            }
            if ((n3 = (int)(zzgd.zzI((zzfu)object, (zzfu)(object3 = this.zzb), (Inflater)(object4 = this.zzd)) ? 1 : 0)) != 0) {
                object3 = this.zzb;
                object4 = ((zzfu)object3).zzM();
                n3 = ((zzfu)object3).zze();
                ((zzfu)object).zzI((byte[])object4, n3);
            }
        }
        object = this.zzc;
        ((zzami)object).zze();
        ArrayList<zzei> arrayList = new ArrayList<zzei>();
        while ((n3 = ((zzfu)(object = this.zza)).zzb()) >= (n4 = 3)) {
            object3 = this.zzc;
            n4 = ((zzfu)object).zze();
            int n7 = ((zzfu)object).zzm();
            int n8 = ((zzfu)object).zzq();
            int n10 = ((zzfu)object).zzd() + n8;
            zzei zzei2 = null;
            if (n10 > n4) {
                ((zzfu)object).zzK(n4);
            } else {
                n4 = 128;
                if (n7 != n4) {
                    switch (n7) {
                        default: {
                            break;
                        }
                        case 22: {
                            zzami.zzc((zzami)object3, (zzfu)object, n8);
                            break;
                        }
                        case 21: {
                            zzami.zzb((zzami)object3, (zzfu)object, n8);
                            break;
                        }
                        case 20: {
                            zzami.zzd((zzami)object3, (zzfu)object, n8);
                            break;
                        }
                    }
                } else {
                    zzei2 = ((zzami)object3).zza();
                    ((zzami)object3).zze();
                }
                ((zzfu)object).zzK(n10);
            }
            if (zzei2 == null) continue;
            arrayList.add(zzei2);
        }
        long l2 = -9223372036854775807L;
        object = new zzaln(arrayList, l2, l2);
        zzev2.zza(object);
    }
}

