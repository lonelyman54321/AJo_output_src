/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad.model;

import com.jio.jioads.multiad.model.c;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e {
    public HashMap a;
    public c b;
    public String c;
    public List d;

    public /* synthetic */ e() {
        this(null, null, null, null);
    }

    public e(HashMap hashMap, c c2, String string2, List list) {
        this.a = hashMap;
        this.b = c2;
        this.c = string2;
        this.d = list;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof e;
        if (!bl3) {
            return false;
        }
        object = (e)object;
        Object object2 = this.a;
        Object object3 = ((e)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((e)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((e)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object = ((e)object).d;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        HashMap hashMap = this.a;
        int n7 = 0;
        if (hashMap == null) {
            n4 = 0;
            hashMap = null;
        } else {
            n4 = ((Object)hashMap).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Asi(campaigns=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", config=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", pacing=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", adOpportunity=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

