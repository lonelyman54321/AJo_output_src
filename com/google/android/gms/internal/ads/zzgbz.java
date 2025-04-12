/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzgbz {
    public static Object zza(Map map2, Object object) {
        map2.getClass();
        try {
            return map2.get(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
    }

    public static boolean zzb(Map object, Object set) {
        if (object == set) {
            return true;
        }
        boolean bl2 = set instanceof Map;
        if (bl2) {
            set = (Map)((Object)set);
            object = object.entrySet();
            set = set.entrySet();
            return object.equals(set);
        }
        return false;
    }
}

