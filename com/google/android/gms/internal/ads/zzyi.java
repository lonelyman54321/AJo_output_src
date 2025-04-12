/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzzb;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzd;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzyi
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        zzgar zzgar2 = zzgar.zzk();
        Object object3 = new zzzb();
        object3 = (zzzd)Collections.max(object, object3);
        Object object4 = new zzzb();
        object4 = (zzzd)Collections.max(object2, object4);
        zzzb zzzb2 = new zzzb();
        zzgar2 = zzgar2.zzd(object3, object4, zzzb2);
        int n3 = object.size();
        int n4 = object2.size();
        zzgar2 = zzgar2.zzb(n3, n4);
        object3 = new zzzc();
        object = (zzzd)Collections.max(object, object3);
        object3 = new zzzc();
        object2 = (zzzd)Collections.max(object2, object3);
        object3 = new zzzc();
        return zzgar2.zzd(object, object2, (Comparator)object3).zza();
    }
}

