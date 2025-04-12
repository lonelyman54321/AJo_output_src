/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class k {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final JioMediationVideoController k;
    public final Integer l;
    public final Boolean m;
    public final String n;
    public final Integer o;
    public final String p;
    public final String q;
    public final Integer r;
    public final HashMap s;

    public k(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, Boolean bl2, JioMediationVideoController jioMediationVideoController, Integer n3, Boolean bl3, String string11, Integer n4, String string12, String string13, Integer n7, HashMap hashMap) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
        this.g = string8;
        this.h = string9;
        this.i = string10;
        this.j = bl2;
        this.k = jioMediationVideoController;
        this.l = n3;
        this.m = bl3;
        this.n = string11;
        this.o = n4;
        this.p = string12;
        this.q = string13;
        this.r = n7;
        this.s = hashMap;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof k;
        if (!bl3) {
            return false;
        }
        object = (k)object;
        Object object2 = this.a;
        Object object3 = ((k)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((k)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((k)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((k)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((k)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((k)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((k)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((k)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object2 = ((k)object).i;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.j;
        object2 = ((k)object).j;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.k;
        object2 = ((k)object).k;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.l;
        object2 = ((k)object).l;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.m;
        object2 = ((k)object).m;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.n;
        object2 = ((k)object).n;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.o;
        object2 = ((k)object).o;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.p;
        object2 = ((k)object).p;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.q;
        object2 = ((k)object).q;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.r;
        object2 = ((k)object).r;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.s;
        object = ((k)object).s;
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
            n3 = ((String)object).hashCode();
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
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.n;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.o;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.p;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.q;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.r;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.s;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VastDataModel(videoUrl=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoType=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adId=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", errorUrl=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoWidth=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoHeight=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", pgmExpiry=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", adSystem=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(", universalAdId=");
        object = this.i;
        stringBuilder.append((String)object);
        stringBuilder.append(", isMediationAd=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", mediationController=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(", mediation=");
        object = this.l;
        stringBuilder.append(object);
        stringBuilder.append(", isPartOfWrapper=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(", campaignId=");
        object = this.n;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoDuration=");
        object = this.o;
        stringBuilder.append(object);
        stringBuilder.append(", campaignType=");
        object = this.p;
        stringBuilder.append((String)object);
        stringBuilder.append(", firstLevelWrapperID=");
        object = this.q;
        stringBuilder.append((String)object);
        stringBuilder.append(", campaignCategoryID=");
        object = this.r;
        stringBuilder.append(object);
        stringBuilder.append(", omVerificationMapData=");
        object = this.s;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

