/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class JioReelAdMetaData {
    public String a;
    public String b;
    public int c;
    public long d;
    public boolean e;
    public AdMetaData$AdParams f;

    public JioReelAdMetaData(String string2, String string3, int n3, long l2, boolean bl2, AdMetaData$AdParams adMetaData$AdParams) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        this.a = string2;
        this.b = string3;
        this.c = n3;
        this.d = l2;
        this.e = bl2;
        this.f = adMetaData$AdParams;
    }

    public /* synthetic */ JioReelAdMetaData(String string2, String string3, int n3, long l2, boolean bl2, AdMetaData$AdParams adMetaData$AdParams, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        long l3;
        int n7;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n8 = 1;
            n7 = 1;
        } else {
            n7 = n3;
        }
        n8 = n4 & 8;
        long l4 = n8 != 0 ? (l3 = 0L) : l2;
        this(string2, string3, n7, l4, bl2, adMetaData$AdParams);
    }

    public static /* synthetic */ JioReelAdMetaData copy$default(JioReelAdMetaData jioReelAdMetaData, String string2, String object, int n3, long l2, boolean bl2, AdMetaData$AdParams adMetaData$AdParams, int n4, Object object2) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = jioReelAdMetaData.a;
        }
        if ((n7 = n4 & 2) != 0) {
            object = jioReelAdMetaData.b;
        }
        object2 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n3 = jioReelAdMetaData.c;
        }
        int n10 = n3;
        n8 = n4 & 8;
        if (n8 != 0) {
            l2 = jioReelAdMetaData.d;
        }
        long l3 = l2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            bl2 = jioReelAdMetaData.e;
        }
        boolean bl3 = bl2;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            adMetaData$AdParams = jioReelAdMetaData.f;
        }
        object = jioReelAdMetaData;
        Object object3 = object2;
        n4 = (int)(bl3 ? 1 : 0);
        object2 = adMetaData$AdParams;
        return jioReelAdMetaData.copy(string2, (String)object3, n10, l3, bl3, adMetaData$AdParams);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final long component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final AdMetaData$AdParams component6() {
        return this.f;
    }

    public final JioReelAdMetaData copy(String string2, String string3, int n3, long l2, boolean bl2, AdMetaData$AdParams adMetaData$AdParams) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        JioReelAdMetaData jioReelAdMetaData = new JioReelAdMetaData(string2, string3, n3, l2, bl2, adMetaData$AdParams);
        return jioReelAdMetaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof JioReelAdMetaData;
        if (n3 == 0) {
            return false;
        }
        object = (JioReelAdMetaData)object;
        Object object2 = this.a;
        String string2 = ((JioReelAdMetaData)object).a;
        n3 = Intrinsics.areEqual(object2, string2);
        if (n3 == 0) {
            return false;
        }
        object2 = this.b;
        string2 = ((JioReelAdMetaData)object).b;
        n3 = Intrinsics.areEqual(object2, string2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((JioReelAdMetaData)object).c;
        if (n3 != n4) {
            return false;
        }
        long l2 = this.d;
        long l3 = ((JioReelAdMetaData)object).d;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.e ? 1 : 0);
        n4 = (int)(((JioReelAdMetaData)object).e ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.f;
        object = ((JioReelAdMetaData)object).f;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final long getAdDuration() {
        return this.d;
    }

    public final String getAdId() {
        return this.a;
    }

    public final int getAdIndex() {
        return this.c;
    }

    public final String getAdTitle() {
        return this.b;
    }

    public final AdMetaData$AdParams getJioReelAdParameter() {
        return this.f;
    }

    public int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        Object object = this.b;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.c + n4) * 31;
        long l2 = this.d;
        long l3 = l2 >>> 32;
        n4 = ((int)(l2 ^= l3) + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((AdMetaData$AdParams)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isClickable() {
        return this.e;
    }

    public final void setAdDuration(long l2) {
        this.d = l2;
    }

    public final void setAdId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.a = string2;
    }

    public final void setAdIndex(int n3) {
        this.c = n3;
    }

    public final void setAdTitle(String string2) {
        this.b = string2;
    }

    public final void setClickable(boolean bl2) {
        this.e = bl2;
    }

    public final void setJioReelAdParameter(AdMetaData$AdParams adMetaData$AdParams) {
        this.f = adMetaData$AdParams;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("JioReelAdMetaData(adId=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", adTitle=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adIndex=");
        int bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", adDuration=");
        long l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", isClickable=");
        boolean bl3 = this.e;
        stringBuilder.append(bl3);
        stringBuilder.append(", jioReelAdParameter=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

