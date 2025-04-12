/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.common;

import com.jio.jioads.multiad.model.d;
import com.jio.jioads.multiad.model.e;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final d a;
    public final e b;
    public e c;

    public a(d d2, e e2, e e5) {
        this.a = d2;
        this.b = e2;
        this.c = e5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof a;
        if (!bl3) {
            return false;
        }
        object = (a)object;
        Object object2 = this.a;
        Object object3 = ((a)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((a)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((a)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        d d2 = this.a;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = d2.hashCode();
        }
        n4 *= 31;
        e e2 = this.b;
        if (e2 == null) {
            n3 = 0;
            e2 = null;
        } else {
            n3 = e2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        e2 = this.c;
        if (e2 != null) {
            n7 = e2.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdDataStore(appConfig=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", masterConfigAsi=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", multiadAsi=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

