/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import java.util.Map;

abstract class zzdl
implements Map.Entry {
    public boolean equals(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            boolean bl3;
            Object k2;
            object = (Map.Entry)object;
            Object object2 = this.getKey();
            bl2 = zzcz.zza(object2, k2 = object.getKey());
            if (bl2 && (bl3 = zzcz.zza(object2 = this.getValue(), object = object.getValue()))) {
                return true;
            }
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
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

    public String toString() {
        String string2 = String.valueOf(this.getKey());
        String string3 = String.valueOf(this.getValue());
        int n3 = string2.length() + 1;
        int n4 = string3.length() + n3;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append(string2);
        stringBuilder.append("=");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }
}

