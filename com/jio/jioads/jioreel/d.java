/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel;

import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final String a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;

    public d(String string2, Integer n3, String string3, String string4, String string5, Integer n4) {
        this.a = string2;
        this.b = n3;
        this.c = string3;
        this.d = n4;
        this.e = string4;
        this.f = string5;
    }

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
        object3 = this.b;
        object2 = ((d)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((d)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((d)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((d)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object = ((d)object).f;
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
        String string2 = this.a;
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
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VodVastModel(daterangeId=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", playTime=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", vast=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", time=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", pts=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", ts=");
        object = this.f;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

