/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzym;
import java.util.Comparator;
import java.util.List;

public final class zzye
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        object = (zzym)object.get(0);
        object2 = (zzym)object2.get(0);
        return ((zzym)object).zza((zzym)object2);
    }
}

