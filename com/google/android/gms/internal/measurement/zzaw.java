/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzaz;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzaw
extends zzay {
    public zzaw() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zze;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzf;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzg;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzh;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzi;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzj;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzk;
        list.add(zzbv2);
    }

    public final zzaq zza(String object, zzh object2, List object3) {
        int[] nArray = zzaz.zza;
        zzbv zzbv2 = zzg.zza((String)object);
        int n3 = zzbv2.ordinal();
        int n4 = nArray[n3];
        long l2 = 31;
        int n7 = 2;
        int n8 = 1;
        switch (n4) {
            default: {
                return this.zza((String)object);
            }
            case 7: {
                zzg.zza(zzbv.zzk, n7, (List)object3);
                object = (zzaq)object3.get(0);
                int n10 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
                object3 = (zzaq)object3.get(n8);
                int n14 = zzg.zzb(((zzh)object2).zza((zzaq)object3).zze());
                object = (double)(n10 ^ n14);
                object3 = new zzai((Double)object);
                return object3;
            }
            case 6: {
                zzg.zza(zzbv.zzj, n7, (List)object3);
                object = (zzaq)object3.get(0);
                long l3 = zzg.zzc(((zzh)object2).zza((zzaq)object).zze());
                object = (zzaq)object3.get(n8);
                int n15 = (int)(zzg.zzc(((zzh)object2).zza((zzaq)object).zze()) & l2);
                object2 = (double)(l3 >>> n15);
                object = new zzai((Double)object2);
                return object;
            }
            case 5: {
                zzg.zza(zzbv.zzi, n7, (List)object3);
                object = (zzaq)object3.get(0);
                int n16 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
                object3 = (zzaq)object3.get(n8);
                int n17 = (int)(zzg.zzc(((zzh)object2).zza((zzaq)object3).zze()) & l2);
                object = (double)(n16 >> n17);
                object2 = new zzai((Double)object);
                return object2;
            }
            case 4: {
                zzg.zza(zzbv.zzh, n7, (List)object3);
                object = (zzaq)object3.get(0);
                int n18 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
                object3 = (zzaq)object3.get(n8);
                int n19 = zzg.zzb(((zzh)object2).zza((zzaq)object3).zze());
                object = (double)(n18 | n19);
                object3 = new zzai((Double)object);
                return object3;
            }
            case 3: {
                zzg.zza(zzbv.zzg, n8, (List)object3);
                object = (zzaq)object3.get(0);
                int n20 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
                object = (double)(~n20);
                object2 = new zzai((Double)object);
                return object2;
            }
            case 2: {
                zzg.zza(zzbv.zzf, n7, (List)object3);
                object = (zzaq)object3.get(0);
                int n21 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
                object3 = (zzaq)object3.get(n8);
                int n22 = (int)(zzg.zzc(((zzh)object2).zza((zzaq)object3).zze()) & l2);
                object = (double)(n21 << n22);
                object2 = new zzai((Double)object);
                return object2;
            }
            case 1: 
        }
        zzg.zza(zzbv.zze, n7, (List)object3);
        object = (zzaq)object3.get(0);
        int n24 = zzg.zzb(((zzh)object2).zza((zzaq)object).zze());
        object3 = (zzaq)object3.get(n8);
        int n25 = zzg.zzb(((zzh)object2).zza((zzaq)object3).zze());
        object = (double)(n24 & n25);
        object3 = new zzai((Double)object);
        return object3;
    }
}

