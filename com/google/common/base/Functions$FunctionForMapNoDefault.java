/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Function;
import com.google.common.base.NullnessCasts;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;

class Functions$FunctionForMapNoDefault
implements Function,
Serializable {
    private static final long serialVersionUID;
    final Map map;

    public Functions$FunctionForMapNoDefault(Map map2) {
        this.map = map2 = (Map)Preconditions.checkNotNull(map2);
    }

    public Object apply(Object object) {
        Map map2;
        boolean bl2;
        Object v4 = this.map.get(object);
        if (v4 == null && !(bl2 = (map2 = this.map).containsKey(object))) {
            bl2 = false;
            map2 = null;
        } else {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Key '%s' not present in map", object);
        return NullnessCasts.uncheckedCastNullableTToT(v4);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Functions$FunctionForMapNoDefault;
        if (bl2) {
            object = (Functions$FunctionForMapNoDefault)object;
            Map map2 = this.map;
            object = ((Functions$FunctionForMapNoDefault)object).map;
            return map2.equals(object);
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Functions.forMap(");
        Map map2 = this.map;
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

