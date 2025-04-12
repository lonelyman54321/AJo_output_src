/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzu
extends zzal {
    private boolean zzk;
    private boolean zzl;
    private final /* synthetic */ zzr zzm;

    public zzu(zzr zzr2, boolean bl2, boolean bl3) {
        this.zzm = zzr2;
        super("log");
        this.zzk = bl2;
        this.zzl = bl3;
    }

    public final zzaq zza(zzh zzh2, List object) {
        Object object2 = "log";
        int n3 = 1;
        zzg.zzb((String)object2, n3, (List)object);
        int n4 = object.size();
        int n7 = 0;
        zzv zzv2 = null;
        if (n4 == n3) {
            zzv zzv3 = zzr.zza(this.zzm);
            zzs zzs2 = zzs.zzc;
            object = (zzaq)object.get(0);
            String string2 = zzh2.zza((zzaq)object).zzf();
            List list = Collections.emptyList();
            boolean bl2 = this.zzk;
            boolean bl3 = this.zzl;
            zzv3.zza(zzs2, string2, list, bl2, bl3);
            return zzaq.zzc;
        }
        object2 = (zzaq)object.get(0);
        double d2 = zzh2.zza((zzaq)object2).zze();
        zzs zzs3 = zzs.zza(zzg.zzb(d2));
        object2 = (zzaq)object.get(n3);
        object2 = zzh2.zza((zzaq)object2);
        String string3 = object2.zzf();
        n4 = object.size();
        if (n4 == (n3 = 2)) {
            zzv2 = zzr.zza(this.zzm);
            List list = Collections.emptyList();
            boolean bl4 = this.zzk;
            boolean bl5 = this.zzl;
            zzv2.zza(zzs3, string3, list, bl4, bl5);
            return zzaq.zzc;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while (true) {
            n4 = object.size();
            n7 = 5;
            if (n3 >= (n4 = Math.min(n4, n7))) break;
            object2 = (zzaq)object.get(n3);
            object2 = zzh2.zza((zzaq)object2).zzf();
            arrayList.add(object2);
            ++n3;
        }
        zzv2 = zzr.zza(this.zzm);
        boolean bl6 = this.zzk;
        boolean bl7 = this.zzl;
        zzv2.zza(zzs3, string3, arrayList, bl6, bl7);
        return zzaq.zzc;
    }
}

