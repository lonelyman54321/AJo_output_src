/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import kotlin.jvm.internal.Intrinsics;

public final class j {
    public Integer a;
    public int b;
    public JioMediationVideoController c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Integer k;
    public String l;
    public q m;
    public e n;
    public long o;
    public String p;
    public String q;
    public String r;
    public Integer s;

    public j() {
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "errorUrl");
        this.a = null;
        this.b = 0;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = string2;
        this.m = null;
        this.n = null;
        this.o = -1;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof j;
        if (n3 == 0) {
            return false;
        }
        object = (j)object;
        Object object2 = this.a;
        Object object3 = ((j)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((j)object).b;
        if (n3 != n4) {
            return false;
        }
        object2 = this.c;
        object3 = ((j)object).c;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.d ? 1 : 0);
        n4 = (int)(((j)object).d ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.e;
        object3 = ((j)object).e;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.f;
        object3 = ((j)object).f;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.g;
        object3 = ((j)object).g;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.h;
        object3 = ((j)object).h;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.i;
        object3 = ((j)object).i;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.j;
        object3 = ((j)object).j;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.k;
        object3 = ((j)object).k;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.l;
        object3 = ((j)object).l;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.m;
        object3 = ((j)object).m;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.n;
        object3 = ((j)object).n;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.o;
        long l3 = ((j)object).o;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        object2 = this.p;
        object3 = ((j)object).p;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.q;
        object3 = ((j)object).q;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.r;
        object3 = ((j)object).r;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.s;
        object = ((j)object).s;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        int n7 = 31;
        int n8 = (this.b + (n3 *= 31)) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n8 = (n8 + n3) * 31;
        n3 = (int)(this.d ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        n8 = (n8 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.j;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.k;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n8 = (n8 + n3) * 31;
        object = this.l;
        n3 = zy_2.b(n8, n7, (String)object);
        Object object2 = this.m;
        if (object2 == null) {
            n8 = 0;
            object2 = null;
        } else {
            n8 = ((q)object2).hashCode();
        }
        n3 = (n3 + n8) * 31;
        object2 = this.n;
        if (object2 == null) {
            n8 = 0;
            object2 = null;
        } else {
            n8 = ((e)object2).hashCode();
        }
        n3 = (n3 + n8) * 31;
        long l2 = this.o;
        int n10 = 32;
        long l3 = l2 >>> n10;
        int n14 = ((int)(l2 ^= l3) + n3) * 31;
        object = this.p;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n14 = (n14 + n3) * 31;
        object = this.q;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n14 = (n14 + n3) * 31;
        object = this.r;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n14 = (n14 + n3) * 31;
        object = this.s;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n14 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n            2.0\n            [VastAd(\n                medDuration=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(",\n                medSkipOffset=");
        int bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(",\n                medController=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(",\n                isMediationAd=");
        boolean bl3 = this.d;
        stringBuilder.append(bl3);
        stringBuilder.append(",\n                mediationUrl=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                medHeight=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                medWidth=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                id=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                campaignId=");
        object = this.i;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                campaignType=");
        object = this.j;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                sequence=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(",\n                errorUrl=");
        object = this.l;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                wrapper=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(",\n                inline=");
        object = this.n;
        stringBuilder.append(object);
        stringBuilder.append(",\n                pgmExpiry=");
        long l2 = this.o;
        stringBuilder.append(l2);
        stringBuilder.append(",\n                wrapperID=");
        object = this.p;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                adType=");
        object = this.q;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                firstLevelWrapperId=");
        object = this.r;
        stringBuilder.append((String)object);
        stringBuilder.append(",\n                campaignCategoryId=");
        object = this.s;
        stringBuilder.append(object);
        stringBuilder.append("\n            )]\n        ");
        return ee3_2.b(stringBuilder.toString());
    }
}

