/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkj;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzlg
extends LinkedHashMap {
    private static final zzlg zza;
    private boolean zzb = true;

    static {
        zzlg zzlg2;
        zza = zzlg2 = new zzlg();
        zzlg2.zzb = false;
    }

    private zzlg() {
    }

    private zzlg(Map map2) {
        super(map2);
    }

    private static int zza(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return zzkj.zza((byte[])object);
        }
        bl2 = object instanceof zzki;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public static zzlg zza() {
        return zza;
    }

    private final void zze() {
        boolean bl2 = this.zzb;
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
            int n7 = zzlg.zza(k2);
            entry = entry.getValue();
            n3 = zzlg.zza(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.zze();
        zzkj.zza(object);
        zzkj.zza(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.zze();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            zzkj.zza(object);
            object = map2.get(object);
            zzkj.zza(object);
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.zze();
        return super.remove(object);
    }

    public final void zza(zzlg zzlg2) {
        this.zze();
        boolean bl2 = ((AbstractMap)zzlg2).isEmpty();
        if (!bl2) {
            this.putAll((Map)zzlg2);
        }
    }

    public final zzlg zzb() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        if (bl2) {
            zzlg zzlg2 = new zzlg();
            return zzlg2;
        }
        zzlg zzlg3 = new zzlg((Map)this);
        return zzlg3;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}

