/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbg;
import java.util.ArrayList;
import java.util.List;

public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbh(zzbf object, zzbg zzbg2) {
        int n3 = zzbf.zzc((zzbf)object).size();
        Object[] objectArray = zzbf.zze((zzbf)object);
        String[] stringArray = new String[n3];
        objectArray = objectArray.toArray(stringArray);
        this.zza = objectArray;
        objectArray = zzbh.zzc(zzbf.zzc((zzbf)object));
        this.zzb = (double[])objectArray;
        object = zzbh.zzc(zzbf.zzd((zzbf)object));
        this.zzc = (double[])object;
        object = new int[n3];
        this.zzd = (int[])object;
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int n3 = list.size();
        double[] dArray = new double[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2;
            Double d5 = (Double)list.get(i3);
            dArray[i3] = d2 = d5.doubleValue();
        }
        return dArray;
    }

    public final List zza() {
        Object[] objectArray;
        int n3;
        zzbh zzbh2 = this;
        String[] stringArray = this.zza;
        int n4 = stringArray.length;
        ArrayList<zzbe> arrayList = new ArrayList<zzbe>(n4);
        stringArray = null;
        for (n4 = 0; n4 < (n3 = (objectArray = zzbh2.zza).length); ++n4) {
            zzbe zzbe2;
            String string2 = objectArray[n4];
            objectArray = zzbh2.zzc;
            Object object = zzbh2.zzb;
            int[] nArray = zzbh2.zzd;
            String string3 = objectArray[n4];
            double d2 = object[n4];
            int n7 = nArray[n4];
            double d5 = n7;
            int n8 = zzbh2.zze;
            double d7 = n8;
            d7 = d5 / d7;
            object = zzbe2;
            zzbe2 = new zzbe(string2, (double)string3, d2, d7, n7);
            arrayList.add(zzbe2);
            zzbh2 = this;
        }
        return arrayList;
    }

    public final void zzb(double d2) {
        Object[] objectArray;
        int n3;
        int n4;
        this.zze = n4 = this.zze + 1;
        for (n4 = 0; n4 < (n3 = (objectArray = this.zzc).length); ++n4) {
            double d5;
            double d7;
            double d9 = objectArray[n4];
            double d12 = d9 - d2;
            Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
            if (object <= 0 && (object = (d7 = d2 - (d5 = (objectArray = this.zzb)[n4])) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
                double d13;
                objectArray = this.zzd;
                objectArray[n4] = d13 = objectArray[n4] + true;
            }
            if ((object = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1)) < 0) break;
        }
    }
}

