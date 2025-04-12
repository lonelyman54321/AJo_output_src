/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzj;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class zzk {
    private final Map zza;

    public /* synthetic */ zzk(Map map2, zzj zzj2) {
        this.zza = map2;
    }

    public final Map zza(Collection collection) {
        boolean bl2;
        HashMap hashMap = new HashMap();
        Iterator iterator = this.zza.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = this.zza;
            String string2 = (String)iterator.next();
            boolean bl3 = object.containsKey(string2);
            if (!bl3) {
                object = Collections.emptySet();
            } else {
                boolean bl4;
                object = new Object();
                Iterator iterator2 = ((Map)this.zza.get(string2)).entrySet().iterator();
                while (bl4 = iterator2.hasNext()) {
                    Map.Entry entry = iterator2.next();
                    Object k2 = entry.getKey();
                    boolean bl5 = collection.contains(k2);
                    if (!bl5) continue;
                    entry = (String)entry.getValue();
                    ((HashSet)object).add(entry);
                }
                object = Collections.unmodifiableSet(object);
            }
            hashMap.put(string2, object);
        }
        return hashMap;
    }
}

