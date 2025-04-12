/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzk;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

final class zzj
extends LinkedHashMap {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzk2) {
        this.zza = zzk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean removeEldestEntry(Map.Entry object) {
        zzk zzk2 = this.zza;
        synchronized (zzk2) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                zzk zzk3;
                int n3;
                try {
                    n3 = ((AbstractMap)this).size();
                    zzk3 = this.zza;
                    int n4 = zzk.zza(zzk3);
                    bl2 = false;
                    if (n3 <= n4) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Object object2 = zzk.zzc(zzk3);
                Object object3 = object.getKey();
                object3 = (String)object3;
                object = object.getValue();
                object = (Pair)object;
                object = ((Pair)object).second;
                object = (String)object;
                zzk3 = new Pair(object3, object);
                ((ArrayDeque)object2).add(zzk3);
                int n7 = ((AbstractMap)this).size();
                object2 = this.zza;
                n3 = zzk.zza((zzk)object2);
                if (n7 <= n3) return bl2;
                return true;
            }
            throw throwable2;
        }
    }
}

