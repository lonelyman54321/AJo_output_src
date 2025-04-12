/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.Set;

public final class zzey {
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
            n4 = ~(~(n4 + n3));
        }
        return n4;
    }

    public static boolean zza(Set set, Object object) {
        block7: {
            boolean bl2 = true;
            if (set == object) {
                return bl2;
            }
            int n3 = object instanceof Set;
            if (n3 != 0) {
                object = (Set)object;
                n3 = set.size();
                int n4 = object.size();
                if (n3 != n4) break block7;
                try {
                    boolean bl3 = set.containsAll((Collection<?>)object);
                    if (bl3) {
                        return bl2;
                    }
                }
                catch (ClassCastException | NullPointerException runtimeException) {}
            }
        }
        return false;
    }
}

