/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public final class zzad {
    private static final ImmutableSet zza = ImmutableSet.of("_syn", "_err", "_el");
    private String zzb;
    private long zzc;
    private Map zzd;

    public zzad(String hashMap, long l2, Map map2) {
        this.zzb = hashMap;
        this.zzc = l2;
        this.zzd = hashMap = new HashMap();
        if (map2 != null) {
            hashMap.putAll(map2);
        }
    }

    public static Object zza(String string2, Object object, Object object2) {
        Object object3 = zza;
        boolean bl2 = ((ImmutableCollection)object3).contains(string2);
        if (bl2 && (bl2 = object2 instanceof Double)) {
            return Math.round((Double)object2);
        }
        object3 = "_";
        boolean bl3 = string2.startsWith((String)object3);
        if (bl3) {
            bl3 = object instanceof String;
            if (bl3) {
                return object2;
            }
            if (object != null) {
                return object;
            }
            return object2;
        }
        bl3 = object instanceof Double;
        if (bl3) {
            return object2;
        }
        bl3 = object instanceof Long;
        if (bl3) {
            return Math.round((Double)object2);
        }
        bl3 = object instanceof String;
        if (bl3) {
            return object2.toString();
        }
        return object2;
    }

    public final /* synthetic */ Object clone() {
        String string2 = this.zzb;
        long l2 = this.zzc;
        Map map2 = this.zzd;
        HashMap hashMap = new HashMap(map2);
        zzad zzad2 = new zzad(string2, l2, hashMap);
        return zzad2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = object instanceof zzad;
        if (!object2) {
            return false;
        }
        object = (zzad)object;
        long l2 = this.zzc;
        long l3 = ((zzad)object).zzc;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        Object object3 = this.zzb;
        String string2 = ((zzad)object).zzb;
        object2 = ((String)object3).equals(string2);
        if (!object2) {
            return false;
        }
        object3 = this.zzd;
        object = ((zzad)object).zzd;
        return object3.equals(object);
    }

    public final int hashCode() {
        int n3 = this.zzb.hashCode() * 31;
        long l2 = this.zzc;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        n3 = (n3 + n4) * 31;
        return ((Object)this.zzd).hashCode() + n3;
    }

    public final String toString() {
        String string2 = this.zzb;
        long l2 = this.zzc;
        String string3 = String.valueOf(this.zzd);
        StringBuilder stringBuilder = new StringBuilder("Event{name='");
        stringBuilder.append(string2);
        stringBuilder.append("', timestamp=");
        stringBuilder.append(l2);
        return BW0.b(stringBuilder, ", params=", string3, "}");
    }

    public final long zza() {
        return this.zzc;
    }

    public final Object zza(String string2) {
        Map map2 = this.zzd;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return this.zzd.get(string2);
        }
        return null;
    }

    public final void zza(String string2, Object object) {
        if (object == null) {
            this.zzd.remove(string2);
            return;
        }
        Object v4 = this.zzd.get(string2);
        object = zzad.zza(string2, v4, object);
        this.zzd.put(string2, object);
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzb(String string2) {
        this.zzb = string2;
    }

    public final Map zzc() {
        return this.zzd;
    }
}

