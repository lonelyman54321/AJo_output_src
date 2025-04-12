/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzfgu;
import java.util.ArrayList;
import java.util.List;

public final class zzfhu {
    public static zzq zza(Context context, List adSizeArray) {
        int n3;
        Object object = new ArrayList();
        adSizeArray = adSizeArray.iterator();
        while ((n3 = adSizeArray.hasNext()) != 0) {
            Object object2 = (zzfgu)adSizeArray.next();
            boolean bl2 = ((zzfgu)object2).zzc;
            if (bl2) {
                object2 = AdSize.FLUID;
                ((ArrayList)object).add(object2);
                continue;
            }
            int n4 = ((zzfgu)object2).zza;
            n3 = ((zzfgu)object2).zzb;
            AdSize adSize = new AdSize(n4, n3);
            ((ArrayList)object).add(adSize);
        }
        adSizeArray = new AdSize[((ArrayList)object).size()];
        adSizeArray = ((ArrayList)object).toArray(adSizeArray);
        object = new zzq(context, adSizeArray);
        return object;
    }

    public static zzfgu zzb(zzq object) {
        int n3 = ((zzq)object).zzi;
        if (n3 != 0) {
            object = new zzfgu(-3, 0, true);
            return object;
        }
        n3 = ((zzq)object).zze;
        int n4 = ((zzq)object).zzb;
        zzfgu zzfgu2 = new zzfgu(n3, n4, false);
        return zzfgu2;
    }
}

