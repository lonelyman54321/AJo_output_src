/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 */
package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzi;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpx;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzpm {
    public static zzpp zza(AudioManager object, zzk object2) {
        int n3;
        int n4;
        object2 = ((zzk)object2).zza().zza;
        object = nr_0.a((AudioManager)object, (AudioAttributes)object2);
        Object object3 = new HashMap();
        Object object4 = 2;
        int n7 = 12;
        Object object5 = zzgea.zzf(n7);
        Object object6 = new HashSet(object5);
        ((HashMap)object3).put(object4, object6);
        object4 = null;
        for (n4 = 0; n4 < (n3 = object.size()); ++n4) {
            Integer n8;
            Serializable serializable;
            int n10;
            object6 = er_0.a(object.get(n4));
            n7 = fr_0.a(object6);
            if (n7 == (n10 = 1) || (n10 = (int)(zzgd.zzK(n7 = gr_0.a(object6)) ? 1 : 0)) == 0 && (n10 = (int)((serializable = zzpp.zzb).containsKey(n8 = Integer.valueOf(n7)) ? 1 : 0)) == 0) continue;
            object5 = n7;
            n10 = (int)(((HashMap)object3).containsKey(object5) ? 1 : 0);
            if (n10 != 0) {
                object5 = (Set)((HashMap)object3).get(object5);
                object5.getClass();
                object6 = zzgea.zzf(hr_0.a(object6));
                object5.addAll(object6);
                continue;
            }
            object6 = zzgea.zzf(hr_0.a(object6));
            serializable = new HashSet(object6);
            ((HashMap)object3).put(object5, serializable);
        }
        object = new zzgaz();
        object3 = ((HashMap)object3).entrySet().iterator();
        while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object4 = (Map.Entry)object3.next();
            object5 = (Integer)object4.getKey();
            n7 = (Integer)object5;
            object4 = (Set)object4.getValue();
            object6 = new zzpn(n7, (Set)object4);
            ((zzgaz)object).zzf(object6);
        }
        object = ((zzgaz)object).zzi();
        object2 = new zzpp((List)object, null);
        return object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzpx zzb(AudioManager object, zzk object2) {
        if (object == null) throw null;
        try {
            object2 = ((zzk)object2).zza();
            object2 = ((zzi)object2).zza;
            object = lr_1.a((AudioManager)object, (AudioAttributes)object2);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return null;
        }
        object = mr_0.a(object.get(0));
        return new zzpx((AudioDeviceInfo)object);
    }
}

