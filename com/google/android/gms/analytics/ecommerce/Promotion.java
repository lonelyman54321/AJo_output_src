/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Promotion {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";
    final Map zza;

    public Promotion() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public Promotion setCreative(String string2) {
        this.zzb("cr", string2);
        return this;
    }

    public Promotion setId(String string2) {
        this.zzb("id", string2);
        return this;
    }

    public Promotion setName(String string2) {
        this.zzb("nm", string2);
        return this;
    }

    public Promotion setPosition(String string2) {
        this.zzb("ps", string2);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map zza(String string2) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string3 = String.valueOf((String)object.getKey());
            object = (String)object.getValue();
            string3 = string2.concat(string3);
            hashMap.put(string3, object);
        }
        return hashMap;
    }

    public final void zzb(String string2, String string3) {
        Preconditions.checkNotNull(string2, "Name should be non-null");
        this.zza.put(string2, string3);
    }
}

