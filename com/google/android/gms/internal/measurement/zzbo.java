/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzbo
extends zzay {
    public zzbo() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zza;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzu;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzap;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaq;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzar;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaw;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzax;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaz;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzba;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbd;
        list.add(zzbv2);
    }

    public final zzaq zza(String object, zzh object2, List object3) {
        int[] nArray = zzbr.zza;
        zzbv zzbv2 = zzg.zza((String)object);
        int n3 = zzbv2.ordinal();
        int n4 = nArray[n3];
        double d2 = -1.0;
        int n7 = 2;
        int n8 = 1;
        switch (n4) {
            default: {
                return this.zza((String)object);
            }
            case 10: {
                zzg.zza(zzbv.zzbd, n7, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object3 = (zzaq)object3.get(n8);
                object2 = ((zzh)object2).zza((zzaq)object3);
                object2 = object2.zze() * d2;
                object3 = new zzai((Double)object2);
                double d5 = object.zze();
                object = object3.zze() + d5;
                object2 = new zzai((Double)object);
                return object2;
            }
            case 8: 
            case 9: {
                zzg.zza((String)object, n8, (List)object3);
                object = (zzaq)object3.get(0);
                return ((zzh)object2).zza((zzaq)object);
            }
            case 6: 
            case 7: {
                zzg.zza((String)object, n7, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object3 = (zzaq)object3.get(n8);
                ((zzh)object2).zza((zzaq)object3);
                return object;
            }
            case 5: {
                zzg.zza(zzbv.zzar, n8, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object = object.zze() * d2;
                object2 = new zzai((Double)object);
                return object2;
            }
            case 4: {
                zzg.zza(zzbv.zzaq, n7, (List)object3);
                object = (zzaq)object3.get(0);
                double d7 = ((zzh)object2).zza((zzaq)object).zze();
                object = (zzaq)object3.get(n8);
                double d9 = ((zzh)object2).zza((zzaq)object).zze();
                object = d7 * d9;
                object3 = new zzai((Double)object);
                return object3;
            }
            case 3: {
                zzg.zza(zzbv.zzap, n7, (List)object3);
                object = (zzaq)object3.get(0);
                double d12 = ((zzh)object2).zza((zzaq)object).zze();
                object = (zzaq)object3.get(n8);
                double d13 = ((zzh)object2).zza((zzaq)object).zze();
                object = d12 % d13;
                object3 = new zzai((Double)object);
                return object3;
            }
            case 2: {
                zzg.zza(zzbv.zzu, n7, (List)object3);
                object = (zzaq)object3.get(0);
                double d14 = ((zzh)object2).zza((zzaq)object).zze();
                object = (zzaq)object3.get(n8);
                double d15 = ((zzh)object2).zza((zzaq)object).zze();
                object = d14 / d15;
                object3 = new zzai((Double)object);
                return object3;
            }
            case 1: 
        }
        zzg.zza(zzbv.zza, n7, (List)object3);
        object = (zzaq)object3.get(0);
        object = ((zzh)object2).zza((zzaq)object);
        object3 = (zzaq)object3.get(n8);
        object2 = ((zzh)object2).zza((zzaq)object3);
        boolean bl2 = object instanceof zzak;
        if (!(bl2 || (bl2 = object instanceof zzas) || (bl2 = object2 instanceof zzak) || (bl2 = object2 instanceof zzas))) {
            double d16 = object.zze();
            object = object2.zze() + d16;
            object3 = new zzai((Double)object);
            return object3;
        }
        object = ((zzaq)object).zzf();
        object2 = ((zzaq)object2).zzf();
        object = Ft2.a((String)object, (String)object2);
        object3 = new zzas((String)object);
        return object3;
    }
}

