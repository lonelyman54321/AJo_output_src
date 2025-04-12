/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate.internal;

import com.google.android.play.core.appupdate.internal.zzm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzi {
    private static final Set zza;
    private static final Set zzb;
    private static final Map zzc;
    private static final zzm zzd;

    static {
        List<String> list = Arrays.asList("app_update", "review");
        Object object = new HashSet(list);
        zza = object;
        list = Arrays.asList("native", "unity");
        object = new HashSet(list);
        zzb = object;
        zzc = object = new HashMap();
        zzd = object = new zzm("PlayCoreVersion");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Map zza(String object) {
        object = zzi.class;
        synchronized (object) {
            try {
                Map<String, HashMap<String, Integer>> map2 = zzc;
                String string2 = "app_update";
                boolean bl2 = map2.containsKey(string2);
                if (bl2) return map2.get(string2);
                HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
                String string3 = "java";
                int n3 = 11004;
                Integer n4 = n3;
                hashMap.put(string3, n4);
                map2.put(string2, hashMap);
                return map2.get(string2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

