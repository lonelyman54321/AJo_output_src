/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdView$AdDetails {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final List l;

    public JioAdView$AdDetails(String string2, String string3, String string4, String string5, String[] stringArray, String string6, String string7, String string8, String string9, int n3, String string10, List list) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = stringArray;
        this.f = string6;
        this.g = string7;
        this.h = string8;
        this.i = string9;
        this.j = n3;
        this.k = string10;
        this.l = list;
    }

    public static /* synthetic */ JioAdView$AdDetails copy$default(JioAdView$AdDetails jioAdView$AdDetails, String string2, String string3, String string4, String string5, String[] stringArray, String string6, String string7, String string8, String string9, int n3, String string10, List list, int n4, Object object) {
        JioAdView$AdDetails jioAdView$AdDetails2 = jioAdView$AdDetails;
        int n7 = n4;
        int n8 = n4 & 1;
        String string11 = n8 != 0 ? jioAdView$AdDetails.a : string2;
        int n10 = n7 & 2;
        String string12 = n10 != 0 ? jioAdView$AdDetails2.b : string3;
        int n14 = n7 & 4;
        String string13 = n14 != 0 ? jioAdView$AdDetails2.c : string4;
        int n15 = n7 & 8;
        String string14 = n15 != 0 ? jioAdView$AdDetails2.d : string5;
        int n16 = n7 & 0x10;
        String[] stringArray2 = n16 != 0 ? jioAdView$AdDetails2.e : stringArray;
        int n17 = n7 & 0x20;
        String string15 = n17 != 0 ? jioAdView$AdDetails2.f : string6;
        int n18 = n7 & 0x40;
        String string16 = n18 != 0 ? jioAdView$AdDetails2.g : string7;
        int n19 = n7 & 0x80;
        String string17 = n19 != 0 ? jioAdView$AdDetails2.h : string8;
        int n20 = n7 & 0x100;
        String string18 = n20 != 0 ? jioAdView$AdDetails2.i : string9;
        int n21 = n7 & 0x200;
        n21 = n21 != 0 ? jioAdView$AdDetails2.j : n3;
        int n22 = n7 & 0x400;
        String string19 = n22 != 0 ? jioAdView$AdDetails2.k : string10;
        List list2 = (n7 &= 0x800) != 0 ? jioAdView$AdDetails2.l : list;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        stringArray = stringArray2;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        n3 = n21;
        string10 = string19;
        list = list2;
        return jioAdView$AdDetails.copy(string11, string12, string13, string14, stringArray2, string15, string16, string17, string18, n21, string19, list2);
    }

    public final JioAdView$AdDetails copy(String string2, String string3, String string4, String string5, String[] stringArray, String string6, String string7, String string8, String string9, int n3, String string10, List list) {
        JioAdView$AdDetails jioAdView$AdDetails = new JioAdView$AdDetails(string2, string3, string4, string5, stringArray, string6, string7, string8, string9, n3, string10, list);
        return jioAdView$AdDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof JioAdView$AdDetails;
        if (n3 == 0) {
            return false;
        }
        object = (JioAdView$AdDetails)object;
        Object object2 = this.a;
        Object object3 = ((JioAdView$AdDetails)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.b;
        object3 = ((JioAdView$AdDetails)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.c;
        object3 = ((JioAdView$AdDetails)object).c;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.d;
        object3 = ((JioAdView$AdDetails)object).d;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.e;
        object3 = ((JioAdView$AdDetails)object).e;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.f;
        object3 = ((JioAdView$AdDetails)object).f;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.g;
        object3 = ((JioAdView$AdDetails)object).g;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.h;
        object3 = ((JioAdView$AdDetails)object).h;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.i;
        object3 = ((JioAdView$AdDetails)object).i;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.j;
        int n4 = ((JioAdView$AdDetails)object).j;
        if (n3 != n4) {
            return false;
        }
        object2 = this.k;
        object3 = ((JioAdView$AdDetails)object).k;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.l;
        object = ((JioAdView$AdDetails)object).l;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getAdSpotID() {
        return this.c;
    }

    public final String getBrandUrl() {
        return this.h;
    }

    public final String getCampaignId() {
        return this.a;
    }

    public final String getCcbString() {
        return this.k;
    }

    public final String getClickThroughUrl() {
        return this.g;
    }

    public final List getClickTrackerWithoutMacros() {
        return this.l;
    }

    public final String[] getClickTrackers() {
        return this.e;
    }

    public final String getClickUrl() {
        return this.d;
    }

    public final String getFbUrl() {
        return this.f;
    }

    public final int getSeq() {
        return this.j;
    }

    public final String getSizeKey() {
        return this.i;
    }

    public int hashCode() {
        int n3;
        int n4;
        Object object = this.a;
        int n7 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n4 *= 31;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.c;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.d;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.e;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = Arrays.hashCode((Object[])object2);
        }
        n4 = (n4 + n3) * 31;
        object2 = this.f;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.g;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.h;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.i;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.j + n4) * 31;
        object = this.k;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.l;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n3 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdDetails(campaignId_=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", adId_=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adSpotID_=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", clickUrl_=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", clickTrackers_=");
        object = Arrays.toString(this.e);
        stringBuilder.append((String)object);
        stringBuilder.append(", fbUrl_=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", clickThroughUrl_=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", brandUrl_=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(", sizeKey_=");
        object = this.i;
        stringBuilder.append((String)object);
        stringBuilder.append(", seq_=");
        int n3 = this.j;
        stringBuilder.append(n3);
        stringBuilder.append(", ccbString_=");
        object = this.k;
        stringBuilder.append((String)object);
        stringBuilder.append(", clickTrackerWithoutMacros_=");
        object = this.l;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

