/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.adinterfaces;

import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$Info;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class JioVmapAdsLoader$VMAPInfo
implements JioVmapAdsLoader$Info {
    public final JioAdsMetadata a;
    public final Integer b;
    public final ViewGroup c;
    public final String d;
    public String e;
    public String f;
    public String g;

    public JioVmapAdsLoader$VMAPInfo(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        Intrinsics.checkNotNullParameter(string2, "vmapUrl");
        this.a = jioAdsMetadata;
        this.b = n3;
        this.c = viewGroup;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
    }

    public /* synthetic */ JioVmapAdsLoader$VMAPInfo(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, String string3, String string4, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        Integer n7;
        int n8 = n4 & 2;
        if (n8 != 0) {
            Integer n10;
            n8 = 5;
            n7 = n10 = Integer.valueOf(n8);
        } else {
            n7 = n3;
        }
        n8 = n4 & 0x10;
        String string6 = n8 != 0 ? null : string3;
        n8 = n4 & 0x20;
        String string7 = n8 != 0 ? null : string4;
        n8 = n4 & 0x40;
        String string8 = n8 != 0 ? null : string5;
        this(jioAdsMetadata, n7, viewGroup, string2, string6, string7, string8);
    }

    public static /* synthetic */ JioVmapAdsLoader$VMAPInfo copy$default(JioVmapAdsLoader$VMAPInfo jioVmapAdsLoader$VMAPInfo, JioAdsMetadata jioAdsMetadata, Integer object, ViewGroup object2, String object3, String string2, String string3, String string4, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            jioAdsMetadata = jioVmapAdsLoader$VMAPInfo.a;
        }
        if ((n4 = n3 & 2) != 0) {
            object = jioVmapAdsLoader$VMAPInfo.b;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = jioVmapAdsLoader$VMAPInfo.c;
        }
        ViewGroup viewGroup = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = jioVmapAdsLoader$VMAPInfo.d;
        }
        String string5 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = jioVmapAdsLoader$VMAPInfo.e;
        }
        String string6 = string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = jioVmapAdsLoader$VMAPInfo.f;
        }
        String string7 = string3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            string4 = jioVmapAdsLoader$VMAPInfo.g;
        }
        String string8 = string4;
        object = jioVmapAdsLoader$VMAPInfo;
        object2 = jioAdsMetadata;
        object3 = object4;
        string2 = viewGroup;
        string3 = string5;
        string4 = string6;
        object4 = string8;
        return jioVmapAdsLoader$VMAPInfo.copy(jioAdsMetadata, (Integer)object3, viewGroup, string5, string6, string7, string8);
    }

    public final JioAdsMetadata component1() {
        return this.a;
    }

    public final Integer component2() {
        return this.b;
    }

    public final ViewGroup component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final JioVmapAdsLoader$VMAPInfo copy(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        Intrinsics.checkNotNullParameter(string2, "vmapUrl");
        JioVmapAdsLoader$VMAPInfo jioVmapAdsLoader$VMAPInfo = new JioVmapAdsLoader$VMAPInfo(jioAdsMetadata, n3, viewGroup, string2, string3, string4, string5);
        return jioVmapAdsLoader$VMAPInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof JioVmapAdsLoader$VMAPInfo;
        if (!bl3) {
            return false;
        }
        object = (JioVmapAdsLoader$VMAPInfo)object;
        Object object2 = this.a;
        Object object3 = ((JioVmapAdsLoader$VMAPInfo)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((JioVmapAdsLoader$VMAPInfo)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((JioVmapAdsLoader$VMAPInfo)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((JioVmapAdsLoader$VMAPInfo)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((JioVmapAdsLoader$VMAPInfo)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((JioVmapAdsLoader$VMAPInfo)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object = ((JioVmapAdsLoader$VMAPInfo)object).g;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ViewGroup getAdContainer() {
        return this.c;
    }

    public final JioAdsMetadata getAdTargetting() {
        return this.a;
    }

    public final String getMidrollCid() {
        return this.f;
    }

    public final String getPostrollCid() {
        return this.g;
    }

    public final String getPrerollCid() {
        return this.e;
    }

    public final Integer getThreshold() {
        return this.b;
    }

    public final String getVmapUrl() {
        return this.d;
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
            n4 = object.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        object = this.d;
        n4 = zy_2.b(n3, n8, (String)object);
        object2 = this.e;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
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
        String string2 = this.g;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setMidrollCid(String string2) {
        this.f = string2;
    }

    public final void setPostrollCid(String string2) {
        this.g = string2;
    }

    public final void setPrerollCid(String string2) {
        this.e = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VMAPInfo(adTargetting=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", threshold=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", adContainer=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", vmapUrl=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", prerollCid=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", midrollCid=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", postrollCid=");
        object = this.g;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

