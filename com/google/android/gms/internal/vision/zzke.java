/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjf;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzke
extends LinkedHashMap {
    private static final zzke zzb;
    private boolean zza = true;

    static {
        zzke zzke2;
        zzb = zzke2 = new zzke();
        zzke2.zza = false;
    }

    private zzke() {
    }

    private zzke(Map map2) {
        super(map2);
    }

    private static int zza(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return zzjf.zzc((byte[])object);
        }
        bl2 = object instanceof zzje;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public static zzke zza() {
        return zzb;
    }

    private final void zze() {
        boolean bl2 = this.zza;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        this.zze();
        super.clear();
    }

    public final Set entrySet() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        if (bl2) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Map;
        if (!bl2) return false;
        object = (Map)object;
        bl2 = true;
        if (this != object) {
            int n3;
            int n4 = this.size();
            if (n4 != (n3 = object.size())) {
                return false;
            }
            Iterator iterator = this.entrySet().iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Map.Entry entry = iterator.next();
                Object k2 = entry.getKey();
                boolean bl3 = object.containsKey(k2);
                if (!bl3) return false;
                Object v4 = entry.getValue();
                entry = entry.getKey();
                entry = object.get(entry);
                boolean bl4 = v4 instanceof byte[];
                if (bl4 && (bl4 = entry instanceof byte[])) {
                    byte[] byArray = (byte[])v4;
                    entry = (Map.Entry)((byte[])entry);
                    n3 = (int)(Arrays.equals(byArray, (byte[])entry) ? 1 : 0);
                } else {
                    n3 = (int)(v4.equals(entry) ? 1 : 0);
                }
                if (n3 != 0) continue;
                return false;
            }
        }
        boolean bl5 = true;
        if (!bl5) return false;
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Iterator iterator = this.entrySet().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            int n7 = zzke.zza(k2);
            entry = entry.getValue();
            n3 = zzke.zza(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.zze();
        zzjf.zza(object);
        zzjf.zza(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zze();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            zzjf.zza(object);
            object = map2.get(object);
            zzjf.zza(object);
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zze();
        return super.remove(object);
    }

    public final void zza(zzke zzke2) {
        this.zze();
        boolean bl2 = ((AbstractMap)zzke2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzke2);
        }
    }

    public final zzke zzb() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        if (bl2) {
            zzke zzke2 = new zzke();
            return zzke2;
        }
        zzke zzke3 = new zzke((Map)this);
        return zzke3;
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }
}

