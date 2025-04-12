/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.util.Set;

public final class zzty {
    public static int zza(Set object) {
        int n3;
        object = object.iterator();
        int n4 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Object e2 = object.next();
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }
}

