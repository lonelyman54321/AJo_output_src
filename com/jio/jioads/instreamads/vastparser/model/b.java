/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.instreamads.vastparser.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class b {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List i;
    public List j;
    public JSONObject k;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b;
        if (!bl3) {
            return false;
        }
        object = (b)object;
        Object object2 = this.a;
        Object object3 = ((b)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((b)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((b)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((b)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((b)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((b)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((b)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.h;
        object3 = ((b)object).h;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.i;
        object3 = ((b)object).i;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.j;
        object3 = ((b)object).j;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.k;
        object = ((b)object).k;
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
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Companion(staticResourceURL=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", hTMLResource=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", iframeResource=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", height=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", width=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", id=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", adSlotID=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", companionClickThrough=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(", companionClickTracking=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", trackingEvents=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", adParameters=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

