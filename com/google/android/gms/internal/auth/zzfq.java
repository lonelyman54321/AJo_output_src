/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzew;
import com.google.android.gms.internal.auth.zzez;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzfq
extends LinkedHashMap {
    private static final zzfq zza;
    private boolean zzb = true;

    static {
        zzfq zzfq2;
        zza = zzfq2 = new zzfq();
        zzfq2.zzb = false;
    }

    private zzfq() {
    }

    private zzfq(Map map2) {
        super(map2);
    }

    public static zzfq zza() {
        return zza;
    }

    private static int zzf(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return zzez.zzb((byte[])object);
        }
        bl2 = object instanceof zzew;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    private final void zzg() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        this.zzg();
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
            int n7 = zzfq.zzf(k2);
            entry = entry.getValue();
            n3 = zzfq.zzf(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.zzg();
        zzez.zze(object);
        zzez.zze(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zzg();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            zzez.zze(object);
            object = map2.get(object);
            zzez.zze(object);
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zzg();
        return super.remove(object);
    }

    public final zzfq zzb() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        zzfq zzfq2 = bl2 ? new zzfq() : new zzfq((Map)this);
        return zzfq2;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzfq zzfq2) {
        this.zzg();
        boolean bl2 = ((AbstractMap)zzfq2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzfq2);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}

