/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdx;
import com.google.android.gms.internal.icing.zzdy;
import java.util.AbstractMap;
import java.util.Map;

final class zzdz {
    public static final int zza(int n3, Object object, Object object2) {
        Object object3;
        boolean bl2;
        object = (zzdy)object;
        object2 = (zzdx)object2;
        n3 = (int)(((AbstractMap)object).isEmpty() ? 1 : 0);
        if (n3 != 0 || !(bl2 = (object3 = ((zzdy)object).entrySet().iterator()).hasNext())) {
            return 0;
        }
        object3 = (Map.Entry)object3.next();
        object3.getKey();
        object3.getValue();
        throw null;
    }
}

