/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcj;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzdi
extends LinkedHashMap {
    private static final zzdi zzme;
    private boolean zzfa = true;

    static {
        zzdi zzdi2;
        zzme = zzdi2 = new zzdi();
        zzdi2.zzfa = false;
    }

    private zzdi() {
    }

    private zzdi(Map map2) {
        super(map2);
    }

    public static zzdi zzbz() {
        return zzme;
    }

    private final void zzcb() {
        boolean bl2 = this.zzfa;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private static int zzf(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return zzci.hashCode((byte[])object);
        }
        bl2 = object instanceof zzcj;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.zzcb();
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
            int n7 = zzdi.zzf(k2);
            entry = entry.getValue();
            n3 = zzdi.zzf(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final boolean isMutable() {
        return this.zzfa;
    }

    public final Object put(Object object, Object object2) {
        this.zzcb();
        zzci.checkNotNull(object);
        zzci.checkNotNull(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zzcb();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            zzci.checkNotNull(object);
            object = map2.get(object);
            zzci.checkNotNull(object);
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zzcb();
        return super.remove(object);
    }

    public final void zza(zzdi zzdi2) {
        this.zzcb();
        boolean bl2 = ((AbstractMap)zzdi2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzdi2);
        }
    }

    public final zzdi zzca() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        if (bl2) {
            zzdi zzdi2 = new zzdi();
            return zzdi2;
        }
        zzdi zzdi3 = new zzdi((Map)this);
        return zzdi3;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}

