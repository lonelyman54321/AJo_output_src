/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzanl;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzanb
implements zzalv {
    private final zzfu zza;

    public zzanb() {
        zzfu zzfu2;
        this.zza = zzfu2 = new zzfu();
    }

    public final void zza(byte[] object, int n3, int n4, zzalu object2, zzev zzev2) {
        Object object3;
        object2 = this.zza;
        ((zzfu)object2).zzI((byte[])object, n4 += n3);
        object = this.zza;
        ((zzfu)object).zzK(n3);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while ((n3 = ((zzfu)(object = this.zza)).zzb()) > 0) {
            int n7 = ((zzfu)object).zzb();
            n3 = 0;
            n4 = 1;
            int n8 = 8;
            if (n7 >= n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object = null;
            }
            object3 = "Incomplete Mp4Webvtt Top Level box header found.";
            zzeq.zze(n7 != 0, object3);
            object = this.zza;
            int n10 = ((zzfu)object).zzg() + -8;
            n7 = ((zzfu)object).zzg();
            int n14 = 1987343459;
            if (n7 == n14) {
                object = this.zza;
                n14 = 0;
                String string2 = null;
                zzeg zzeg2 = null;
                while (n10 > 0) {
                    int n15 = n10 >= n8 ? 1 : 0;
                    Object object4 = "Incomplete vtt cue box header found.";
                    zzeq.zze(n15 != 0, object4);
                    n15 = ((zzfu)object).zzg();
                    int n16 = ((zzfu)object).zzg();
                    n10 += -8;
                    Object object5 = ((zzfu)object).zzM();
                    int n17 = ((zzfu)object).zzd();
                    object5 = zzgd.zzB((byte[])object5, n17, n15 += -8);
                    ((zzfu)object).zzL(n15);
                    n17 = 1937011815;
                    if (n16 == n17) {
                        zzeg2 = zzanl.zzb((String)object5);
                    } else {
                        n17 = 1885436268;
                        if (n16 == n17) {
                            string2 = ((String)object5).trim();
                            object4 = Collections.emptyList();
                            string2 = zzanl.zza(null, string2, (List)object4);
                        }
                    }
                    n10 -= n15;
                }
                if (string2 == null) {
                    string2 = "";
                }
                if (zzeg2 != null) {
                    zzeg2.zzl(string2);
                    object = zzeg2.zzp();
                } else {
                    object = new zzank();
                    ((zzank)object).zzc = string2;
                    object = ((zzank)object).zza().zzp();
                }
                arrayList.add(object);
                continue;
            }
            object = this.zza;
            ((zzfu)object).zzL(n10);
        }
        long l2 = -9223372036854775807L;
        object3 = object;
        object = new zzaln(arrayList, l2, l2);
        zzev2.zza(object);
    }
}

