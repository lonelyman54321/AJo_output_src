/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgq;
import com.google.android.gms.internal.ads.zzgr;
import java.util.ArrayList;
import java.util.List;

public final class zzacx {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzacx(List list, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, float f5, String string2) {
        this.zza = list;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = n8;
        this.zzf = n10;
        this.zzg = n14;
        this.zzh = n15;
        this.zzi = n16;
        this.zzj = f5;
        this.zzk = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzacx zza(zzfu object) {
        block7: {
            int n3;
            float f5;
            Object object2;
            int n4;
            int n7;
            int n8;
            int n10;
            int n14;
            byte[] byArray;
            int n15;
            int n16;
            ArrayList<byte[]> arrayList;
            int n17;
            int n18;
            int n19 = 4;
            try {
                ((zzfu)object).zzL(n19);
                n19 = ((zzfu)object).zzm();
                n18 = 3;
                n17 = (n19 &= n18) + 1;
                if (n17 == n18) break block7;
                arrayList = new ArrayList<byte[]>();
                n18 = ((zzfu)object).zzm() & 0x1F;
                n16 = 0;
                for (n15 = 0; n15 < n18; ++n15) {
                    byArray = zzacx.zzb((zzfu)object);
                    arrayList.add(byArray);
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw zzch.zza("Error parsing AVC config", arrayIndexOutOfBoundsException);
            }
            n15 = ((zzfu)object).zzm();
            byArray = null;
            for (n14 = 0; n14 < n15; ++n14) {
                byte[] byArray2 = zzacx.zzb((zzfu)object);
                arrayList.add(byArray2);
            }
            if (n18 > 0) {
                object = arrayList.get(0);
                object = (byte[])object;
                Object object3 = arrayList.get(0);
                object3 = (byte[])object3;
                int n20 = ((Object)object).length;
                object = zzgr.zze(object3, n19 += 2, n20);
                n19 = ((zzgq)object).zze;
                n18 = ((zzgq)object).zzf;
                n16 = ((zzgq)object).zzh + 8;
                n15 = ((zzgq)object).zzi + 8;
                n14 = ((zzgq)object).zzj;
                n10 = ((zzgq)object).zzk;
                n8 = ((zzgq)object).zzl;
                float f6 = ((zzgq)object).zzg;
                n7 = ((zzgq)object).zza;
                n4 = ((zzgq)object).zzb;
                n20 = ((zzgq)object).zzc;
                object2 = object = zzes.zza(n7, n4, n20);
                n7 = n10;
                n4 = n8;
                f5 = f6;
                n10 = n16;
                n8 = n15;
                n3 = n14;
                n15 = n19;
                n14 = n18;
                return new zzacx(arrayList, n17, n15, n14, n10, n8, n3, n7, n4, f5, (String)object2);
            } else {
                int n21 = -1;
                n19 = 0;
                n18 = 1065353216;
                object2 = null;
                n15 = -1;
                n14 = -1;
                n10 = -1;
                n8 = -1;
                n3 = -1;
                float f7 = 0.0f / 0.0f;
                n7 = -1;
                n4 = -1;
                f5 = 1.0f;
            }
            return new zzacx(arrayList, n17, n15, n14, n10, n8, n3, n7, n4, f5, (String)object2);
        }
        object = new IllegalStateException();
        throw object;
    }

    private static byte[] zzb(zzfu zzfu2) {
        int n3 = zzfu2.zzq();
        int n4 = zzfu2.zzd();
        zzfu2.zzL(n3);
        return zzes.zzc(zzfu2.zzM(), n4, n3);
    }
}

