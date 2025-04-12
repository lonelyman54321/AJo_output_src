/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Comparator;

final class zzbh
implements Comparator {
    private final /* synthetic */ zzal zza;
    private final /* synthetic */ zzh zzb;

    public zzbh(zzal zzal2, zzh zzh2) {
        this.zza = zzal2;
        this.zzb = zzh2;
    }

    public final /* synthetic */ int compare(Object list, Object object) {
        int n3 = 1;
        list = (zzaq)((Object)list);
        object = (zzaq)object;
        zzal zzal2 = this.zza;
        zzh zzh2 = this.zzb;
        boolean bl2 = list instanceof zzax;
        if (bl2) {
            boolean bl3 = object instanceof zzax;
            if (!bl3) {
                return n3;
            }
            return 0;
        }
        bl2 = object instanceof zzax;
        if (bl2) {
            return -1;
        }
        if (zzal2 == null) {
            list = list.zzf();
            object = object.zzf();
            return ((String)((Object)list)).compareTo((String)object);
        }
        zzaq[] zzaqArray = new zzaq[2];
        zzaqArray[0] = list;
        zzaqArray[n3] = object;
        list = Arrays.asList(zzaqArray);
        return (int)zzg.zza(zzal2.zza(zzh2, list).zze());
    }
}

