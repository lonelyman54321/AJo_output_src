/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData$$serializer;
import com.ril.ajio.kmm.shared.model.home.Hotspot$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Hotspot {
    public static final Hotspot$Companion Companion;
    private Double height;
    private String hotspotUrl;
    private HotSpotMetaData metadata;
    private String query;
    private String type;
    private Double width;
    private Double x;
    private Double y;

    static {
        Hotspot$Companion hotspot$Companion;
        Companion = hotspot$Companion = new Hotspot$Companion(null);
    }

    public Hotspot() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ Hotspot(int n3, String string2, Double d2, String string3, Double d5, Double d7, Double d9, String string4, HotSpotMetaData hotSpotMetaData, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.type = n4 == 0 ? null : string2;
        int n7 = n3 & 2;
        this.height = n7 == 0 ? null : d2;
        n7 = n3 & 4;
        this.hotspotUrl = n7 == 0 ? null : string3;
        n7 = n3 & 8;
        this.width = n7 == 0 ? null : d5;
        n7 = n3 & 0x10;
        this.x = n7 == 0 ? null : d7;
        n7 = n3 & 0x20;
        this.y = n7 == 0 ? null : d9;
        n7 = n3 & 0x40;
        this.query = n7 == 0 ? null : string4;
        this.metadata = (n3 &= 0x80) == 0 ? null : hotSpotMetaData;
    }

    public Hotspot(String string2, Double d2, String string3, Double d5, Double d7, Double d9, String string4, HotSpotMetaData hotSpotMetaData) {
        this.type = string2;
        this.height = d2;
        this.hotspotUrl = string3;
        this.width = d5;
        this.x = d7;
        this.y = d9;
        this.query = string4;
        this.metadata = hotSpotMetaData;
    }

    public /* synthetic */ Hotspot(String object, Double object2, String object3, Double object4, Double d2, Double d5, String object5, HotSpotMetaData object6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string2;
        Double d7;
        Double d9;
        Double d12;
        String string3;
        Double d13;
        String string4;
        int n4 = n3;
        int n7 = n3 & 1;
        HotSpotMetaData hotSpotMetaData = null;
        if (n7 != 0) {
            n7 = 0;
            string4 = null;
        } else {
            string4 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            d13 = null;
        } else {
            d13 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string3 = null;
        } else {
            string3 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            d12 = null;
        } else {
            d12 = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            d9 = null;
        } else {
            d9 = d2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            d7 = null;
        } else {
            d7 = d5;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string2 = null;
        } else {
            string2 = object5;
        }
        if ((n4 &= 0x80) == 0) {
            hotSpotMetaData = object6;
        }
        object = this;
        object2 = string4;
        object3 = d13;
        object4 = string3;
        d2 = d12;
        d5 = d9;
        object5 = d7;
        object6 = string2;
        this(string4, d13, string3, d12, d9, d7, string2, hotSpotMetaData);
    }

    public static /* synthetic */ Hotspot copy$default(Hotspot hotspot, String string2, Double d2, String string3, Double d5, Double d7, Double d9, String string4, HotSpotMetaData hotSpotMetaData, int n3, Object object) {
        Hotspot hotspot2 = hotspot;
        int n4 = n3;
        int n7 = n3 & 1;
        String string5 = n7 != 0 ? hotspot.type : string2;
        int n8 = n4 & 2;
        Double d12 = n8 != 0 ? hotspot2.height : d2;
        int n10 = n4 & 4;
        String string6 = n10 != 0 ? hotspot2.hotspotUrl : string3;
        int n14 = n4 & 8;
        Double d13 = n14 != 0 ? hotspot2.width : d5;
        int n15 = n4 & 0x10;
        Double d14 = n15 != 0 ? hotspot2.x : d7;
        int n16 = n4 & 0x20;
        Double d15 = n16 != 0 ? hotspot2.y : d9;
        int n17 = n4 & 0x40;
        String string7 = n17 != 0 ? hotspot2.query : string4;
        HotSpotMetaData hotSpotMetaData2 = (n4 &= 0x80) != 0 ? hotspot2.metadata : hotSpotMetaData;
        string2 = string5;
        d2 = d12;
        string3 = string6;
        d5 = d13;
        d7 = d14;
        d9 = d15;
        string4 = string7;
        hotSpotMetaData = hotSpotMetaData2;
        return hotspot.copy(string5, d12, string6, d13, d14, d15, string7, hotSpotMetaData2);
    }

    public static final /* synthetic */ void write$Self$shared_release(Hotspot object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((Hotspot)object).type) != null) {
            object3 = pe3_2.a;
            object2 = ((Hotspot)object).type;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((Hotspot)object).height) != null) {
            object3 = os0_2.a;
            object2 = ((Hotspot)object).height;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((Hotspot)object).hotspotUrl) != null) {
            object3 = pe3_2.a;
            object2 = ((Hotspot)object).hotspotUrl;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((Hotspot)object).width) != null) {
            object3 = os0_2.a;
            object2 = ((Hotspot)object).width;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object3 = ((Hotspot)object).x) != null) {
            object3 = os0_2.a;
            object2 = ((Hotspot)object).x;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 5)) || (object3 = ((Hotspot)object).y) != null) {
            object3 = os0_2.a;
            object2 = ((Hotspot)object).y;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 6)) || (object3 = ((Hotspot)object).query) != null) {
            object3 = pe3_2.a;
            object2 = ((Hotspot)object).query;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 7)) || (object3 = ((Hotspot)object).metadata) != null) {
            object3 = HotSpotMetaData$$serializer.INSTANCE;
            object = ((Hotspot)object).metadata;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final Double component2() {
        return this.height;
    }

    public final String component3() {
        return this.hotspotUrl;
    }

    public final Double component4() {
        return this.width;
    }

    public final Double component5() {
        return this.x;
    }

    public final Double component6() {
        return this.y;
    }

    public final String component7() {
        return this.query;
    }

    public final HotSpotMetaData component8() {
        return this.metadata;
    }

    public final Hotspot copy(String string2, Double d2, String string3, Double d5, Double d7, Double d9, String string4, HotSpotMetaData hotSpotMetaData) {
        Hotspot hotspot = new Hotspot(string2, d2, string3, d5, d7, d9, string4, hotSpotMetaData);
        return hotspot;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Hotspot;
        if (!bl3) {
            return false;
        }
        object = (Hotspot)object;
        Object object2 = this.type;
        Object object3 = ((Hotspot)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((Hotspot)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.hotspotUrl;
        object3 = ((Hotspot)object).hotspotUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Hotspot)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.x;
        object3 = ((Hotspot)object).x;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.y;
        object3 = ((Hotspot)object).y;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.query;
        object3 = ((Hotspot)object).query;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object = ((Hotspot)object).metadata;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getHeight() {
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

    public final Double getWidth() {
        return this.width;
    }

    public final Double getX() {
        return this.x;
    }

    public final Double getY() {
        return this.y;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.type;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.height;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.hotspotUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.width;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.x;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.y;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.query;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metadata;
        if (object != null) {
            n7 = ((HotSpotMetaData)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
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

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public final void setX(Double d2) {
        this.x = d2;
    }

    public final void setY(Double d2) {
        this.y = d2;
    }

    public String toString() {
        String string2 = this.type;
        Double d2 = this.height;
        String string3 = this.hotspotUrl;
        Double d5 = this.width;
        Double d7 = this.x;
        Double d9 = this.y;
        String string4 = this.query;
        HotSpotMetaData hotSpotMetaData = this.metadata;
        StringBuilder stringBuilder = new StringBuilder("Hotspot(type=");
        stringBuilder.append(string2);
        stringBuilder.append(", height=");
        stringBuilder.append(d2);
        stringBuilder.append(", hotspotUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", width=");
        stringBuilder.append(d5);
        stringBuilder.append(", x=");
        stringBuilder.append(d7);
        stringBuilder.append(", y=");
        stringBuilder.append(d9);
        stringBuilder.append(", query=");
        stringBuilder.append(string4);
        stringBuilder.append(", metadata=");
        stringBuilder.append(hotSpotMetaData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

