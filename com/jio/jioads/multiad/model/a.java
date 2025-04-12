/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad.model;

import com.jio.jioads.multiad.model.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public String a;
    public String b;
    public List c;
    public String d;
    public b e;
    public long f;

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
        object2 = null;
        bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((a)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((a)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((a)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((a)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        long l2 = this.f;
        long l3 = ((a)object).f;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 961;
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
            n3 = object.hashCode();
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
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        long l2 = this.f;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ad(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", latencyPerAd=null, ad=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", surl=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", trgtExpression=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", adConfig=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", skipExpiry=");
        long l2 = this.f;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

