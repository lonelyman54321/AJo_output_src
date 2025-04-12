/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaam;
import java.util.Comparator;

public final class zzaak
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (zzaam)object;
        object2 = (zzaam)object2;
        float f5 = ((zzaam)object).zzc;
        float f6 = ((zzaam)object2).zzc;
        return Float.compare(f5, f6);
    }
}

