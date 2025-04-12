/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzaam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class zzaan {
    private static final Comparator zza;
    private static final Comparator zzb;
    private final ArrayList zzc;
    private final zzaam[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        Comparator comparator = new zzaaj();
        zza = comparator;
        comparator = new zzaak();
        zzb = comparator;
    }

    public zzaan(int n3) {
        Object object = new zzaam[5];
        this.zzd = object;
        this.zzc = object;
        this.zze = -1;
    }

    public final float zza(float f5) {
        ArrayList arrayList;
        int n3;
        Comparator comparator;
        ArrayList arrayList2;
        int n4 = this.zze;
        int n7 = 0;
        if (n4 != 0) {
            arrayList2 = this.zzc;
            comparator = zzb;
            Collections.sort(arrayList2, comparator);
            this.zze = 0;
        }
        n4 = this.zzg;
        f5 = n4;
        int n8 = 0;
        comparator = null;
        while (n7 < (n3 = (arrayList = this.zzc).size())) {
            float f6 = 0.5f * f5;
            zzaam zzaam2 = (zzaam)this.zzc.get(n7);
            int n10 = zzaam2.zzb;
            float f7 = n8 += n10;
            float f8 = f7 - f6;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 >= 0) {
                return zzaam2.zzc;
            }
            ++n7;
        }
        arrayList2 = this.zzc;
        n4 = (int)(arrayList2.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return 0.0f / 0.0f;
        }
        arrayList2 = this.zzc;
        n7 = arrayList2.size() + -1;
        return ((zzaam)arrayList2.get((int)n7)).zzc;
    }

    public final void zzb(int n3, float f5) {
        int n4;
        int n7;
        zzaam[] zzaamArray;
        zzaam[] zzaamArray2;
        int n8 = this.zze;
        int n10 = 1;
        if (n8 != n10) {
            zzaamArray2 = this.zzc;
            Comparator comparator = zza;
            Collections.sort(zzaamArray2, comparator);
            this.zze = n10;
        }
        if ((n8 = this.zzh) > 0) {
            zzaamArray = this.zzd;
            this.zzh = n8 += -1;
            zzaamArray2 = zzaamArray[n8];
        } else {
            n10 = 0;
            zzaamArray = null;
            zzaamArray2 = new zzaam(null);
        }
        n10 = this.zzf;
        this.zzf = n7 = n10 + 1;
        zzaamArray2.zza = n10;
        zzaamArray2.zzb = n3;
        zzaamArray2.zzc = f5;
        Object object = this.zzc;
        ((ArrayList)object).add(zzaamArray2);
        this.zzg = n4 = this.zzg + n3;
        while (true) {
            n3 = this.zzg;
            n4 = 2000;
            f5 = 2.803E-42f;
            if (n3 <= n4) break;
            object = this.zzc;
            n8 = 0;
            zzaamArray2 = null;
            object = (zzaam)((ArrayList)object).get(0);
            n10 = ((zzaam)object).zzb;
            if (n10 <= (n3 += -2000)) {
                this.zzg = n3 = this.zzg - n10;
                ArrayList arrayList = this.zzc;
                arrayList.remove(0);
                n3 = this.zzh;
                n8 = 5;
                if (n3 >= n8) continue;
                zzaamArray2 = this.zzd;
                this.zzh = n10 = n3 + 1;
                zzaamArray2[n3] = object;
                continue;
            }
            ((zzaam)object).zzb = n10 -= n3;
            this.zzg = n4 = this.zzg - n3;
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}

