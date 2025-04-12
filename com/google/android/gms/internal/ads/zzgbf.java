/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgbz;
import com.google.android.gms.internal.ads.zzgct;
import com.google.android.gms.internal.ads.zzgde;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class zzgbf
implements Map,
Serializable {
    private transient zzgbh zza;
    private transient zzgbh zzb;
    private transient zzgax zzc;

    public static zzgbf zzc(Map object) {
        int n3 = (object = object.entrySet()) instanceof Collection;
        n3 = n3 != 0 ? ((Collection)object).size() : 4;
        zzgbe zzgbe2 = new zzgbe(n3);
        zzgbe2.zzb((Iterable)object);
        return zzgbe2.zzc();
    }

    public static zzgbf zzd() {
        return zzgct.zza;
    }

    public static zzgbf zze(Object object, Object object2) {
        object = "dialog_not_shown_reason";
        zzfzz.zzb(object, object2);
        Object[] objectArray = new Object[2];
        objectArray[0] = object;
        int n3 = 1;
        objectArray[n3] = object2;
        return zzgct.zzj(n3, objectArray, null);
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean containsKey(Object object) {
        return (object = this.get(object)) != null;
    }

    public final boolean containsValue(Object object) {
        return this.zzb().contains(object);
    }

    public final boolean equals(Object object) {
        return zzgbz.zzb(this, object);
    }

    public abstract Object get(Object var1);

    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    public final int hashCode() {
        return zzgde.zza(this.zzh());
    }

    public final boolean isEmpty() {
        int n3 = this.size();
        return n3 == 0;
    }

    public final Object put(Object object, Object object2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void putAll(Map object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Object remove(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final String toString() {
        boolean bl2;
        int c2 = this.size();
        String string2 = "size";
        zzfzz.zza(c2, string2);
        long l2 = c2;
        long l3 = 8;
        l2 *= l3;
        long l4 = 0x40000000L;
        l2 = Math.min(l2, l4);
        int n3 = (int)l2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        char c3 = '{';
        stringBuilder.append(c3);
        Iterator iterator = this.entrySet().iterator();
        n3 = 1;
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (n3 == 0) {
                string2 = ", ";
                stringBuilder.append(string2);
            }
            string2 = entry.getKey();
            stringBuilder.append((Object)string2);
            stringBuilder.append('=');
            string2 = entry.getValue();
            stringBuilder.append((Object)string2);
            n3 = 0;
            string2 = null;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public abstract zzgax zza();

    public final zzgax zzb() {
        zzgax zzgax2 = this.zzc;
        if (zzgax2 == null) {
            this.zzc = zzgax2 = this.zza();
        }
        return zzgax2;
    }

    public abstract zzgbh zzf();

    public abstract zzgbh zzg();

    public final zzgbh zzh() {
        zzgbh zzgbh2 = this.zza;
        if (zzgbh2 == null) {
            this.zza = zzgbh2 = this.zzf();
        }
        return zzgbh2;
    }

    public final zzgbh zzi() {
        zzgbh zzgbh2 = this.zzb;
        if (zzgbh2 == null) {
            this.zzb = zzgbh2 = this.zzg();
        }
        return zzgbh2;
    }
}

