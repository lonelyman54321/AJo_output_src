/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdya;
import java.util.Map;

public final class zzbmj
implements zzblp {
    private final zzdya zza;

    public zzbmj(zzdya zzdya2) {
        Preconditions.checkNotNull(zzdya2, "The Inspector Manager must not be null");
        this.zza = zzdya2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Object object, Map map2) {
        if (map2 == null) return;
        object = "extras";
        boolean bl2 = map2.containsKey(object);
        if (!bl2) {
            return;
        }
        Object object2 = "expires";
        boolean bl3 = map2.containsKey(object2);
        long l2 = Long.MAX_VALUE;
        if (bl3) {
            try {
                object2 = map2.get(object2);
                object2 = (String)object2;
                l2 = Long.parseLong((String)object2);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        object2 = this.zza;
        object = (String)map2.get(object);
        ((zzdya)object2).zzi((String)object, l2);
    }
}

