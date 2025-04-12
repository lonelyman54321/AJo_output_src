/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzane;
import java.util.Comparator;

public final class zzano
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (zzane)object;
        object2 = (zzane)object2;
        long l2 = ((zzane)object).zzb;
        long l3 = ((zzane)object2).zzb;
        return Long.compare(l2, l3);
    }
}

