/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

public final class zzdun {
    /*
     * WARNING - void declaration
     */
    public static Bundle zza(Pair ... pairArray) {
        Bundle bundle = new Bundle();
        Object object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            int n4;
            void var4_6;
            boolean bl2 = false;
            object = null;
            while (var4_6 < (n4 = 2)) {
                long l2;
                long l3;
                long l4;
                long l7;
                object2 = pairArray[var4_6];
                Object object3 = (CharSequence)((Pair)object2).first;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl3 && (l7 = (l4 = (l3 = ((Long)(object3 = (Long)((Pair)object2).second)).longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                    object3 = (String)((Pair)object2).first;
                    object2 = (Long)((Pair)object2).second;
                    long l8 = (Long)object2;
                    bundle.putLong((String)object3, l8);
                }
                ++var4_6;
            }
        }
        return bundle;
    }
}

