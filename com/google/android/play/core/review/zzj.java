/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review;

import com.google.android.play.core.review.internal.zzi;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class zzj {
    private static final Map zza;

    static {
        List<String> list = Arrays.asList("native", "unity");
        Cloneable cloneable = new Cloneable(list);
        cloneable = new Cloneable();
        zza = cloneable;
        new zzi("PlayCoreVersion");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Map zza() {
        Class<zzj> clazz = zzj.class;
        synchronized (clazz) {
            Map map2 = zza;
            String string2 = "java";
            int n3 = 20002;
            Integer n4 = n3;
            map2.put(string2, n4);
            return map2;
        }
    }
}

