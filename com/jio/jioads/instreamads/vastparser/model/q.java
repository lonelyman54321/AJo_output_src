/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jio.jioads.instreamads.vastparser.model.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class q {
    public boolean a;
    public boolean b;
    public boolean c;
    public Integer d;
    public String e;
    public String f;
    public List g;
    public p h;
    public List i;
    public List j;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof q;
        if (!bl3) {
            return false;
        }
        object = (q)object;
        bl3 = this.a;
        boolean bl4 = ((q)object).a;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.b;
        bl4 = ((q)object).b;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.c;
        bl4 = ((q)object).c;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.d;
        Object object3 = ((q)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((q)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((q)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((q)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.h;
        object3 = ((q)object).h;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.i;
        object3 = ((q)object).i;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.j;
        object = ((q)object).j;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        object = null;
        bl5 = Intrinsics.areEqual(null, null);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        boolean bl2;
        boolean n3 = this.a;
        int n4 = 1;
        if (n3) {
            bl2 = true;
        }
        void var1_3 = bl2 * 31;
        int n7 = this.b;
        if (n7 != 0) {
            n7 = 1;
        }
        void var1_4 = (var1_3 + n7) * 31;
        n7 = this.c;
        if (n7 == 0) {
            n4 = n7;
        }
        void var1_5 = (var1_4 + n4) * 31;
        Object object = this.d;
        n7 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        void var1_6 = (var1_5 + n4) * 31;
        object = this.e;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        void var1_7 = (var1_6 + n4) * 31;
        object = this.f;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        void var1_8 = (var1_7 + n4) * 31;
        object = this.g;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        void var1_9 = (var1_8 + n4) * 31;
        object = this.h;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((p)object).hashCode();
        }
        void var1_10 = (var1_9 + n4) * 31;
        object = this.i;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        void var1_11 = (var1_10 + n4) * 31;
        object = this.j;
        if (object != null) {
            n7 = object.hashCode();
        }
        return (int)((var1_11 + n7) * 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WrappedElement(followAdditionalWrappers=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", allowMultipleAds=");
        bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", fallbackOnNoAd=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", fallbackIndex=");
        Object object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", adTagUri=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", errorUrl=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", impressionUrl=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", viewableImpression=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", creatives=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", extensions=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", omVerificationData=null)");
        return stringBuilder.toString();
    }
}

