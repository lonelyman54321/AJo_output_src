/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class p {
    public final String a;
    public List b = null;

    public p() {
        this.a = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof p;
        if (!bl3) {
            return false;
        }
        object = (p)object;
        String string2 = this.a;
        Object object2 = ((p)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((p)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        List list = this.b;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewableImpression(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", viewableImpressionUrlList=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

