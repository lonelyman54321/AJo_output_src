/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.instreamads.vastparser.model.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public String a = null;
    public List b = null;
    public List c = null;
    public String d = null;
    public o e = null;
    public AdMetaData$AdParams f = null;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof f;
        if (!bl3) {
            return false;
        }
        object = (f)object;
        Object object2 = this.a;
        Object object3 = ((f)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((f)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((f)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((f)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((f)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object = ((f)object).f;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((o)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((AdMetaData$AdParams)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Linear(skipoffset=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", mediaFiles=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", trackingEvents=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", duration=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoClick=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", adParams=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

