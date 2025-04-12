/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import java.util.Map;

abstract class zzfzw
implements Map.Entry {
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            boolean bl3;
            Object k2;
            object = (Map.Entry)object;
            Object object2 = this.getKey();
            bl2 = zzfya.zza(object2, k2 = object.getKey());
            if (bl2 && (bl3 = zzfya.zza(object2 = this.getValue(), object = object.getValue()))) {
                return true;
            }
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public final int hashCode() {
        int n3;
        Object object = this.getKey();
        Object object2 = this.getValue();
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 ^ n4;
    }

    public Object setValue(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final String toString() {
        String string2 = String.valueOf(this.getKey());
        String string3 = String.valueOf(this.getValue());
        return n1.a(string2, "=", string3);
    }
}

