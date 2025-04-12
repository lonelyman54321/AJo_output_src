/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzbg
extends zzay {
    public zzbg() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zzb;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzas;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzav;
        list.add(zzbv2);
    }

    public final zzaq zza(String object, zzh object2, List list) {
        Object object3 = zzbj.zza;
        int n3 = zzg.zza((String)object).ordinal();
        int n4 = object3[n3];
        n3 = 0;
        int n7 = 2;
        int n8 = 1;
        if (n4 != n8) {
            if (n4 != n7) {
                int n10 = 3;
                if (n4 != n10) {
                    return this.zza((String)object);
                }
                zzg.zza(zzbv.zzav, n7, list);
                object = (zzaq)list.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object3 = object.zzd();
                n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                if (n4 != 0) {
                    return object;
                }
                object = (zzaq)list.get(n8);
                return ((zzh)object2).zza((zzaq)object);
            }
            zzg.zza(zzbv.zzas, n8, list);
            object = (zzaq)list.get(0);
            object = ((zzh)object2).zza((zzaq)object);
            object = (object.zzd() ^ n8) != 0;
            object2 = new zzag((Boolean)object);
            return object2;
        }
        zzg.zza(zzbv.zzb, n7, list);
        object = (zzaq)list.get(0);
        object = ((zzh)object2).zza((zzaq)object);
        object3 = object.zzd();
        n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
        if (n4 == 0) {
            return object;
        }
        object = (zzaq)list.get(n8);
        return ((zzh)object2).zza((zzaq)object);
    }
}

