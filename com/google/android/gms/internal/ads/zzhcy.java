/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhcb;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzhcy
extends LinkedHashMap {
    private static final zzhcy zza;
    private boolean zzb = true;

    static {
        zzhcy zzhcy2;
        zza = zzhcy2 = new zzhcy();
        zzhcy2.zzb = false;
    }

    private zzhcy() {
    }

    private zzhcy(Map map2) {
        super(map2);
    }

    public static zzhcy zza() {
        return zza;
    }

    private static int zzf(Object object) {
        int n3 = object instanceof byte[];
        if (n3 != 0) {
            object = (byte[])object;
            n3 = ((Object)object).length;
            int n4 = zzhcb.zzb(n3, (byte[])object, 0, n3);
            if (n4 == 0) {
                n4 = 1;
            }
            return n4;
        }
        n3 = object instanceof zzhbs;
        if (n3 == 0) {
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
            int n7 = zzhcy.zzf(k2);
            entry = entry.getValue();
            n3 = zzhcy.zzf(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.zzg();
        object.getClass();
        object2.getClass();
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zzg();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            object.getClass();
            object = map2.get(object);
            object.getClass();
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zzg();
        return super.remove(object);
    }

    public final zzhcy zzb() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        zzhcy zzhcy2 = bl2 ? new zzhcy() : new zzhcy((Map)this);
        return zzhcy2;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzhcy zzhcy2) {
        this.zzg();
        boolean bl2 = ((AbstractMap)zzhcy2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzhcy2);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}

