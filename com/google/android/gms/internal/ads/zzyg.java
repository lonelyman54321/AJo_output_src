/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzyl;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzyg
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        object = (zzyl)Collections.max(object);
        object2 = (zzyl)Collections.max(object2);
        return ((zzyl)object).zza((zzyl)object2);
    }
}

