/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad.model;

import com.jio.jioads.multiad.model.d;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public HashMap a;
    public d b;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof h;
        if (!bl3) {
            return false;
        }
        object = (h)object;
        Object object2 = this.a;
        HashMap hashMap = ((h)object).a;
        bl3 = Intrinsics.areEqual(object2, hashMap);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((h)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        HashMap hashMap = this.a;
        int n4 = 0;
        if (hashMap == null) {
            n3 = 0;
            hashMap = null;
        } else {
            n3 = ((Object)hashMap).hashCode();
        }
        n3 *= 31;
        d d2 = this.b;
        if (d2 != null) {
            n4 = d2.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MasterConfig(adspots=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", appConfig=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

