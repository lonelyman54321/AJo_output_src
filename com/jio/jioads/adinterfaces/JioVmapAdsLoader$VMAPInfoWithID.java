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
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class JioVmapAdsLoader$VMAPInfoWithID
implements JioVmapAdsLoader$Info {
    public final JioAdsMetadata a;
    public final Integer b;
    public final ViewGroup c;
    public final String d;
    public final ArrayList e;
    public final long f;
    public final String g;

    public JioVmapAdsLoader$VMAPInfoWithID(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, ArrayList arrayList, long l2, String string3) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        Intrinsics.checkNotNullParameter(string2, "vmapId");
        Intrinsics.checkNotNullParameter(arrayList, "cuePoints");
        Intrinsics.checkNotNullParameter(string3, "packageName");
        this.a = jioAdsMetadata;
        this.b = n3;
        this.c = viewGroup;
        this.d = string2;
        this.e = arrayList;
        this.f = l2;
        this.g = string3;
    }

    public /* synthetic */ JioVmapAdsLoader$VMAPInfoWithID(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, ArrayList arrayList, long l2, String string3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        long l3;
        Serializable serializable;
        Integer n7;
        Serializable serializable2;
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 5;
            n7 = serializable2 = Integer.valueOf(n8);
        } else {
            n7 = n3;
        }
        n8 = n4 & 0x10;
        if (n8 != 0) {
            serializable = serializable2;
        } else {
            serializable = arrayList;
        }
        n8 = n4 & 0x20;
        long l4 = n8 != 0 ? (l3 = 0L) : l2;
        this(jioAdsMetadata, n7, viewGroup, string2, (ArrayList)serializable, l4, string3);
    }

    public static /* synthetic */ JioVmapAdsLoader$VMAPInfoWithID copy$default(JioVmapAdsLoader$VMAPInfoWithID jioVmapAdsLoader$VMAPInfoWithID, JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, ArrayList arrayList, long l2, String string3, int n4, Object object) {
        JioVmapAdsLoader$VMAPInfoWithID jioVmapAdsLoader$VMAPInfoWithID2 = jioVmapAdsLoader$VMAPInfoWithID;
        int n7 = n4 & 1;
        JioAdsMetadata jioAdsMetadata2 = n7 != 0 ? jioVmapAdsLoader$VMAPInfoWithID.a : jioAdsMetadata;
        int n8 = n4 & 2;
        Integer n10 = n8 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.b : n3;
        int n14 = n4 & 4;
        ViewGroup viewGroup2 = n14 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.c : viewGroup;
        int n15 = n4 & 8;
        String string4 = n15 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.d : string2;
        int n16 = n4 & 0x10;
        ArrayList arrayList2 = n16 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.e : arrayList;
        int n17 = n4 & 0x20;
        long l3 = n17 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.f : l2;
        int n18 = n4 & 0x40;
        String string5 = n18 != 0 ? jioVmapAdsLoader$VMAPInfoWithID2.g : string3;
        jioAdsMetadata = jioAdsMetadata2;
        n3 = n10;
        viewGroup = viewGroup2;
        string2 = string4;
        arrayList = arrayList2;
        l2 = l3;
        string3 = string5;
        return jioVmapAdsLoader$VMAPInfoWithID.copy(jioAdsMetadata2, n10, viewGroup2, string4, arrayList2, l3, string5);
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

    public final ArrayList component5() {
        return this.e;
    }

    public final long component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final JioVmapAdsLoader$VMAPInfoWithID copy(JioAdsMetadata jioAdsMetadata, Integer n3, ViewGroup viewGroup, String string2, ArrayList arrayList, long l2, String string3) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        Intrinsics.checkNotNullParameter(string2, "vmapId");
        Intrinsics.checkNotNullParameter(arrayList, "cuePoints");
        Intrinsics.checkNotNullParameter(string3, "packageName");
        JioVmapAdsLoader$VMAPInfoWithID jioVmapAdsLoader$VMAPInfoWithID = new JioVmapAdsLoader$VMAPInfoWithID(jioAdsMetadata, n3, viewGroup, string2, arrayList, l2, string3);
        return jioVmapAdsLoader$VMAPInfoWithID;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof JioVmapAdsLoader$VMAPInfoWithID;
        if (!object2) {
            return false;
        }
        object = (JioVmapAdsLoader$VMAPInfoWithID)object;
        Object object3 = this.a;
        Object object4 = ((JioVmapAdsLoader$VMAPInfoWithID)object).a;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.b;
        object4 = ((JioVmapAdsLoader$VMAPInfoWithID)object).b;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.c;
        object4 = ((JioVmapAdsLoader$VMAPInfoWithID)object).c;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.d;
        object4 = ((JioVmapAdsLoader$VMAPInfoWithID)object).d;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.e;
        object4 = ((JioVmapAdsLoader$VMAPInfoWithID)object).e;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        long l2 = this.f;
        long l3 = ((JioVmapAdsLoader$VMAPInfoWithID)object).f;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.g;
        object = ((JioVmapAdsLoader$VMAPInfoWithID)object).g;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
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

    public final long getContentVideoLength() {
        return this.f;
    }

    public final ArrayList getCuePoints() {
        return this.e;
    }

    public final String getPackageName() {
        return this.g;
    }

    public final Integer getThreshold() {
        return this.b;
    }

    public final String getVmapId() {
        return this.d;
    }

    public int hashCode() {
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
        n3 *= 31;
        Integer n8 = this.b;
        if (n8 != null) {
            n4 = ((Object)n8).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (this.c.hashCode() + n3) * 31;
        object = this.d;
        n3 = zy_2.b(n4, n7, (String)object);
        n4 = (this.e.hashCode() + n3) * 31;
        long l2 = this.f;
        long l3 = l2 >>> 32;
        n3 = ((int)(l2 ^ l3) + n4) * 31;
        return this.g.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VMAPInfoWithID(adTargetting=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", threshold=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", adContainer=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", vmapId=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", cuePoints=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", contentVideoLength=");
        long l2 = this.f;
        stringBuilder.append(l2);
        stringBuilder.append(", packageName=");
        object = this.g;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

