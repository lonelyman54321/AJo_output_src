/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwb;
import java.util.Comparator;

final class zzvv
implements Comparator {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compare(Object object, Object object2) {
        zzwb zzwb2;
        zzwb zzwb3 = zzwb.zza(object);
        if (zzwb3 != (zzwb2 = zzwb.zza(object2))) return zzwb3.compareTo(zzwb2);
        int n3 = zzwb3.ordinal();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) throw null;
                    object = (Double)object;
                    object2 = (Double)object2;
                    return ((Double)object).compareTo((Double)object2);
                }
                object = (Long)object;
                object2 = (Long)object2;
                return ((Long)object).compareTo((Long)object2);
            }
            object = (String)object;
            object2 = (String)object2;
            return ((String)object).compareTo((String)object2);
        }
        object = (Boolean)object;
        object2 = (Boolean)object2;
        return ((Boolean)object).compareTo((Boolean)object2);
    }
}

