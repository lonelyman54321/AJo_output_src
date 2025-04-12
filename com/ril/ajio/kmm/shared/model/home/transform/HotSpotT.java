/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HotSpotT {
    private int height;
    private String hotspotUrl;
    private HotSpotMetaData metadata;
    private String query;
    private String type;
    private int width;
    private int x;
    private int y;

    public HotSpotT(String string2, int n3, int n4, String string3, int n7, int n8, String string4, HotSpotMetaData hotSpotMetaData) {
        this.type = string2;
        this.width = n3;
        this.height = n4;
        this.hotspotUrl = string3;
        this.x = n7;
        this.y = n8;
        this.query = string4;
        this.metadata = hotSpotMetaData;
    }

    public /* synthetic */ HotSpotT(String string2, int n3, int n4, String string3, int n7, int n8, String string4, HotSpotMetaData hotSpotMetaData, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        int n14 = n10;
        int n15 = n10 & 8;
        String string5 = n15 != 0 ? null : string3;
        n15 = n14 & 0x40;
        String string6 = n15 != 0 ? null : string4;
        HotSpotMetaData hotSpotMetaData2 = (n14 &= 0x80) != 0 ? null : hotSpotMetaData;
        this(string2, n3, n4, string5, n7, n8, string6, hotSpotMetaData2);
    }

    public static /* synthetic */ HotSpotT copy$default(HotSpotT hotSpotT, String string2, int n3, int n4, String string3, int n7, int n8, String string4, HotSpotMetaData hotSpotMetaData, int n10, Object object) {
        HotSpotT hotSpotT2 = hotSpotT;
        int n14 = n10;
        int n15 = n10 & 1;
        String string5 = n15 != 0 ? hotSpotT.type : string2;
        int n16 = n14 & 2;
        n16 = n16 != 0 ? hotSpotT2.width : n3;
        int n17 = n14 & 4;
        n17 = n17 != 0 ? hotSpotT2.height : n4;
        int n18 = n14 & 8;
        String string6 = n18 != 0 ? hotSpotT2.hotspotUrl : string3;
        int n19 = n14 & 0x10;
        n19 = n19 != 0 ? hotSpotT2.x : n7;
        int n20 = n14 & 0x20;
        n20 = n20 != 0 ? hotSpotT2.y : n8;
        int n21 = n14 & 0x40;
        String string7 = n21 != 0 ? hotSpotT2.query : string4;
        HotSpotMetaData hotSpotMetaData2 = (n14 &= 0x80) != 0 ? hotSpotT2.metadata : hotSpotMetaData;
        string2 = string5;
        n3 = n16;
        n4 = n17;
        string3 = string6;
        n7 = n19;
        n8 = n20;
        string4 = string7;
        hotSpotMetaData = hotSpotMetaData2;
        return hotSpotT.copy(string5, n16, n17, string6, n19, n20, string7, hotSpotMetaData2);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final String component4() {
        return this.hotspotUrl;
    }

    public final int component5() {
        return this.x;
    }

    public final int component6() {
        return this.y;
    }

    public final String component7() {
        return this.query;
    }

    public final HotSpotMetaData component8() {
        return this.metadata;
    }

    public final HotSpotT copy(String string2, int n3, int n4, String string3, int n7, int n8, String string4, HotSpotMetaData hotSpotMetaData) {
        HotSpotT hotSpotT = new HotSpotT(string2, n3, n4, string3, n7, n8, string4, hotSpotMetaData);
        return hotSpotT;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HotSpotT;
        if (n3 == 0) {
            return false;
        }
        object = (HotSpotT)object;
        Object object2 = this.type;
        String string2 = ((HotSpotT)object).type;
        n3 = Intrinsics.areEqual(object2, string2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.width;
        int n4 = ((HotSpotT)object).width;
        if (n3 != n4) {
            return false;
        }
        n3 = this.height;
        n4 = ((HotSpotT)object).height;
        if (n3 != n4) {
            return false;
        }
        object2 = this.hotspotUrl;
        string2 = ((HotSpotT)object).hotspotUrl;
        n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.x;
        n4 = ((HotSpotT)object).x;
        if (n3 != n4) {
            return false;
        }
        n3 = this.y;
        n4 = ((HotSpotT)object).y;
        if (n3 != n4) {
            return false;
        }
        object2 = this.query;
        string2 = ((HotSpotT)object).query;
        n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.metadata;
        object = ((HotSpotT)object).metadata;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getHotspotUrl() {
        return this.hotspotUrl;
    }

    public final HotSpotMetaData getMetadata() {
        return this.metadata;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        int n3;
        String string2 = this.type;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.width;
        n3 = (n3 + n7) * 31;
        n7 = this.height;
        n3 = (n3 + n7) * 31;
        Object object = this.hotspotUrl;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        n7 = this.x;
        n3 = (n3 + n7) * 31;
        n7 = this.y;
        n3 = (n3 + n7) * 31;
        object = this.query;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.metadata;
        if (object != null) {
            n4 = ((HotSpotMetaData)object).hashCode();
        }
        return n3 + n4;
    }

    public final void setHeight(int n3) {
        this.height = n3;
    }

    public final void setHotspotUrl(String string2) {
        this.hotspotUrl = string2;
    }

    public final void setMetadata(HotSpotMetaData hotSpotMetaData) {
        this.metadata = hotSpotMetaData;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setWidth(int n3) {
        this.width = n3;
    }

    public final void setX(int n3) {
        this.x = n3;
    }

    public final void setY(int n3) {
        this.y = n3;
    }

    public String toString() {
        CharSequence charSequence = this.type;
        int n3 = this.width;
        int n4 = this.height;
        String string2 = this.hotspotUrl;
        int n7 = this.x;
        int n8 = this.y;
        String string3 = this.query;
        HotSpotMetaData hotSpotMetaData = this.metadata;
        charSequence = oe3_0.a(n3, "HotSpotT(type=", (String)charSequence, ", width=", ", height=");
        h30_0.b((StringBuilder)charSequence, n4, ", hotspotUrl=", string2, ", x=");
        m10.a((StringBuilder)charSequence, n7, ", y=", n8, ", query=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", metadata=");
        ((StringBuilder)charSequence).append(hotSpotMetaData);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

