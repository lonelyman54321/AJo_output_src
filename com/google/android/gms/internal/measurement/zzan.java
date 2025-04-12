/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzam;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzan {
    public static zzaq zza(zzak object, zzaq object2, zzh zzh2, List list) {
        String string2 = object2.zzf();
        boolean bl2 = object.zzc(string2);
        if (bl2) {
            string2 = object2.zzf();
            bl2 = (object = object.zza(string2)) instanceof zzal;
            if (bl2) {
                return ((zzal)object).zza(zzh2, list);
            }
            object2 = Ft2.a(object2.zzf(), " is not a function");
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        String string3 = "hasOwnProperty";
        string2 = object2.zzf();
        bl2 = string3.equals(string2);
        if (bl2) {
            zzg.zza(string3, 1, list);
            object2 = (zzaq)list.get(0);
            object2 = zzh2.zza((zzaq)object2).zzf();
            boolean bl3 = object.zzc((String)object2);
            if (bl3) {
                return zzaq.zzh;
            }
            return zzaq.zzi;
        }
        object2 = object2.zzf();
        object2 = kp1_0.c("Object has no function ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static Iterator zza(Map object) {
        object = object.keySet().iterator();
        zzam zzam2 = new zzam((Iterator)object);
        return zzam2;
    }
}

