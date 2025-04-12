/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public List a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public List f;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof d;
        if (!bl3) {
            return false;
        }
        object = (d)object;
        Object object2 = this.a;
        Object object3 = ((d)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((d)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((d)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((d)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((d)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object = ((d)object).f;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        List list = this.a;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Extension(viewableImpressionList=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", deeplinkurl=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", brandurl=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", type=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", fallbackIndex=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", omVerificationData=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

