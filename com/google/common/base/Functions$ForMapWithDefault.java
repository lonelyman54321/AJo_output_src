/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Function;
import com.google.common.base.NullnessCasts;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;

class Functions$ForMapWithDefault
implements Function,
Serializable {
    private static final long serialVersionUID;
    final Object defaultValue;
    final Map map;

    public Functions$ForMapWithDefault(Map map2, Object object) {
        this.map = map2 = (Map)Preconditions.checkNotNull(map2);
        this.defaultValue = object;
    }

    public Object apply(Object object) {
        Map map2;
        boolean bl2;
        Object v4 = this.map.get(object);
        object = v4 == null && !(bl2 = (map2 = this.map).containsKey(object)) ? this.defaultValue : NullnessCasts.uncheckedCastNullableTToT(v4);
        return object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Functions$ForMapWithDefault;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (Functions$ForMapWithDefault)object;
            Object object2 = this.map;
            Map map2 = ((Functions$ForMapWithDefault)object).map;
            bl2 = object2.equals(map2);
            if (bl2 && (bl4 = Objects.equal(object2 = this.defaultValue, object = ((Functions$ForMapWithDefault)object).defaultValue))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        Map map2 = this.map;
        Object object = this.defaultValue;
        Object[] objectArray = new Object[]{map2, object};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Functions.forMap(");
        Object object = this.map;
        stringBuilder.append(object);
        stringBuilder.append(", defaultValue=");
        object = this.defaultValue;
        return fK.a(stringBuilder, object, ")");
    }
}

