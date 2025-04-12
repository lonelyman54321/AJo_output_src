/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

public final class zzgbm {
    public static Object zza(Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            Object e2 = iterator.next();
            iterator.remove();
            return e2;
        }
        return null;
    }

    public static void zzb(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator iterator) {
        boolean bl2;
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = collection.add(e2);
            bl3 |= bl2;
        }
        return bl3;
    }
}

