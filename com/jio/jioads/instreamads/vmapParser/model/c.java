/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapParser.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final Map a;
    public final String b;

    public c(String string2, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "adBreakMap");
        Intrinsics.checkNotNullParameter(string2, "version");
        this.a = linkedHashMap;
        this.b = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof c;
        if (!bl3) {
            return false;
        }
        object = (c)object;
        Map map2 = this.a;
        Object object2 = ((c)object).a;
        bl3 = Intrinsics.areEqual(map2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((c)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)this.a).hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Vmap(adBreakMap=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", version=");
        object = this.b;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

