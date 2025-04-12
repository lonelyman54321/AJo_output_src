/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzeb;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzey;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class zzef
implements Serializable,
Map {
    private static final Map.Entry[] zza = new Map.Entry[0];
    private transient zzej zzb;
    private transient zzej zzc;
    private transient zzeb zzd;

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean containsKey(Object object) {
        return (object = this.get(object)) != null;
    }

    public boolean containsValue(Object object) {
        return ((zzeb)this.values()).contains(object);
    }

    public /* synthetic */ Set entrySet() {
        zzej zzej2 = this.zzb;
        if (zzej2 == null) {
            this.zzb = zzej2 = this.zza();
        }
        return zzej2;
    }

    public boolean equals(Object set) {
        if (this == set) {
            return true;
        }
        boolean bl2 = set instanceof Map;
        if (bl2) {
            set = (Map)((Object)set);
            Set set2 = this.entrySet();
            set = set.entrySet();
            return set2.equals(set);
        }
        return false;
    }

    public abstract Object get(Object var1);

    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    public int hashCode() {
        return zzey.zza((zzej)this.entrySet());
    }

    public boolean isEmpty() {
        int n3 = this.size();
        return n3 == 0;
    }

    public /* synthetic */ Set keySet() {
        zzej zzej2 = this.zzc;
        if (zzej2 == null) {
            this.zzc = zzej2 = this.zzb();
        }
        return zzej2;
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

    public String toString() {
        int n3 = this.size();
        if (n3 >= 0) {
            boolean bl2;
            long l2 = (long)n3 << 3;
            long l3 = 0x40000000L;
            l2 = Math.min(l2, l3);
            n3 = (int)l2;
            StringBuilder stringBuilder = new StringBuilder(n3);
            n3 = 123;
            stringBuilder.append((char)n3);
            Iterator iterator = this.entrySet().iterator();
            boolean bl3 = true;
            while (bl2 = iterator.hasNext()) {
                String string2;
                Map.Entry entry = iterator.next();
                if (!bl3) {
                    string2 = ", ";
                    stringBuilder.append(string2);
                }
                string2 = entry.getKey();
                stringBuilder.append((Object)string2);
                stringBuilder.append('=');
                string2 = entry.getValue();
                stringBuilder.append((Object)string2);
                bl3 = false;
                string2 = null;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
        String string3 = tk3_2.a("size".length() + 40, n3, "size cannot be negative but was: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public /* synthetic */ Collection values() {
        zzeb zzeb2 = this.zzd;
        if (zzeb2 == null) {
            this.zzd = zzeb2 = this.zzc();
        }
        return zzeb2;
    }

    public abstract zzej zza();

    public abstract zzej zzb();

    public abstract zzeb zzc();
}

