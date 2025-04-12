/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzde;
import com.google.android.gms.internal.icing.zzdh;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzdy
extends LinkedHashMap {
    private static final zzdy zzb;
    private boolean zza = true;

    static {
        zzdy zzdy2;
        zzb = zzdy2 = new zzdy();
        zzdy2.zza = false;
    }

    private zzdy() {
    }

    private zzdy(Map map2) {
        super(map2);
    }

    private static int zze(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return zzdh.zzg((byte[])object);
        }
        bl2 = object instanceof zzde;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    private final void zzf() {
        boolean bl2 = this.zza;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        this.zzf();
        super.clear();
    }

    public final Set entrySet() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        Set<Object> set = bl2 ? Collections.emptySet() : super.entrySet();
        return set;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Map;
        if (n3 != 0) {
            if (this != (object = (Map)object)) {
                int n4;
                n3 = this.size();
                if (n3 == (n4 = object.size())) {
                    Iterator iterator = this.entrySet().iterator();
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        Map.Entry entry = iterator.next();
                        Object object2 = entry.getKey();
                        boolean bl2 = object.containsKey(object2);
                        if (bl2) {
                            object2 = entry.getValue();
                            entry = entry.getKey();
                            entry = object.get(entry);
                            boolean bl3 = object2 instanceof byte[];
                            if (bl3 && (bl3 = entry instanceof byte[])) {
                                object2 = (byte[])object2;
                                entry = (Map.Entry)((byte[])entry);
                                n4 = (int)(Arrays.equals(object2, (byte[])entry) ? 1 : 0);
                            } else {
                                n4 = (int)(object2.equals(entry) ? 1 : 0);
                            }
                            if (n4 != 0) continue;
                        }
                        break;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        Iterator iterator = this.entrySet().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            int n7 = zzdy.zze(k2);
            entry = entry.getValue();
            n3 = zzdy.zze(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.zzf();
        zzdh.zza(object);
        zzdh.zza(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zzf();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            zzdh.zza(object);
            object = map2.get(object);
            zzdh.zza(object);
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zzf();
        return super.remove(object);
    }

    public final void zza(zzdy zzdy2) {
        this.zzf();
        boolean bl2 = ((AbstractMap)zzdy2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzdy2);
        }
    }

    public final zzdy zzb() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        zzdy zzdy2 = bl2 ? new zzdy() : new zzdy((Map)this);
        return zzdy2;
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }
}

