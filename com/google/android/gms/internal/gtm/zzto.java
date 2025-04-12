/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztg;
import com.google.android.gms.internal.gtm.zzti;
import com.google.android.gms.internal.gtm.zztp;
import com.google.android.gms.internal.gtm.zztw;
import com.google.android.gms.internal.gtm.zzty;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class zzto
implements Map,
Serializable {
    private transient zztp zza;
    private transient zztp zzb;
    private transient zzti zzc;

    public static zzto zzc(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        zztg.zza(object, object2);
        zztg.zza(object3, object4);
        zztg.zza(object5, object6);
        zztg.zza(object7, object8);
        zztg.zza(object9, object10);
        object12 = "&cu";
        zztg.zza(object11, object12);
        Object[] objectArray = new Object[12];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        int n3 = 6;
        objectArray[n3] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        return zztw.zzg(n3, objectArray, null);
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

    public final boolean equals(Object set) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (this != set) break block2;
                    bl2 = true;
                    break block3;
                }
                boolean bl3 = set instanceof Map;
                if (bl3) break block4;
                bl2 = false;
                set = null;
            }
            return bl2;
        }
        set = (Map)((Object)set);
        Set set2 = this.entrySet();
        set = set.entrySet();
        return ((Object)set2).equals(set);
    }

    public abstract Object get(Object var1);

    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    public final int hashCode() {
        return zzty.zza(this.zzf());
    }

    public final boolean isEmpty() {
        return false;
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
        int n3 = this.size();
        if (n3 >= 0) {
            boolean bl2;
            long l2 = n3;
            long l3 = 8;
            l2 *= l3;
            long l4 = 0x40000000L;
            l2 = Math.min(l2, l4);
            int n4 = (int)l2;
            StringBuilder stringBuilder = new StringBuilder(n4);
            n3 = 123;
            stringBuilder.append((char)n3);
            Iterator iterator = this.entrySet().iterator();
            n4 = 1;
            while (bl2 = iterator.hasNext()) {
                String string2;
                Map.Entry entry = iterator.next();
                if (n4 == 0) {
                    string2 = ", ";
                    stringBuilder.append(string2);
                }
                string2 = entry.getKey();
                stringBuilder.append((Object)string2);
                stringBuilder.append('=');
                string2 = entry.getValue();
                stringBuilder.append((Object)string2);
                n4 = 0;
                string2 = null;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
        String string3 = hj0_0.a(n3, "size cannot be negative but was: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public abstract zzti zza();

    public final zzti zzb() {
        zzti zzti2 = this.zzc;
        if (zzti2 == null) {
            this.zzc = zzti2 = this.zza();
        }
        return zzti2;
    }

    public abstract zztp zzd();

    public abstract zztp zze();

    public final zztp zzf() {
        zztp zztp2 = this.zza;
        if (zztp2 == null) {
            this.zza = zztp2 = this.zzd();
        }
        return zztp2;
    }
}

