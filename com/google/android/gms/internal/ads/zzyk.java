/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzyy;
import java.util.Comparator;
import java.util.List;

public final class zzyk
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        object = (zzyy)object.get(0);
        object2 = (zzyy)object2.get(0);
        return ((zzyy)object).zza((zzyy)object2);
    }
}

