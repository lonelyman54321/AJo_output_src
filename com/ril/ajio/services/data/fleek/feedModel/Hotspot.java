/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Hotspot {
    private Double height;
    private String hotspotUrl;
    private MetaData metaData;
    private Metadata metadata;
    private String pageType;
    private String query;
    private String type;
    private Double width;
    private Double x;
    private Double y;

    public Hotspot() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public Hotspot(String string2, Metadata metadata, String string3, String string4, String string5, Double d2, Double d5, Double d7, Double d9, MetaData metaData) {
        this.hotspotUrl = string2;
        this.metadata = metadata;
        this.pageType = string3;
        this.query = string4;
        this.type = string5;
        this.width = d2;
        this.height = d5;
        this.x = d7;
        this.y = d9;
        this.metaData = metaData;
    }

    public /* synthetic */ Hotspot(String object, Metadata object2, String object3, String string2, String string3, Double object4, Double d2, Double d5, Double d7, MetaData object5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Double d9;
        Double d12;
        Double d13;
        Double d14;
        String string4;
        String string5;
        String string6;
        Metadata metadata;
        String string7;
        int n4 = n3;
        int n7 = n3 & 1;
        MetaData metaData = null;
        if (n7 != 0) {
            n7 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            metadata = null;
        } else {
            metadata = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            d14 = null;
        } else {
            d14 = object4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            d13 = null;
        } else {
            d13 = d2;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            d12 = null;
        } else {
            d12 = d5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            d9 = null;
        } else {
            d9 = d7;
        }
        if ((n4 &= 0x200) == 0) {
            metaData = object5;
        }
        object = this;
        object2 = string7;
        object3 = metadata;
        string2 = string6;
        string3 = string5;
        object4 = string4;
        d2 = d14;
        d5 = d13;
        d7 = d12;
        object5 = d9;
        this(string7, metadata, string6, string5, string4, d14, d13, d12, d9, metaData);
    }

    public static /* synthetic */ Hotspot copy$default(Hotspot hotspot, String string2, Metadata metadata, String string3, String string4, String string5, Double d2, Double d5, Double d7, Double d9, MetaData metaData, int n3, Object object) {
        Hotspot hotspot2 = hotspot;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? hotspot.hotspotUrl : string2;
        int n8 = n4 & 2;
        Metadata metadata2 = n8 != 0 ? hotspot2.metadata : metadata;
        int n10 = n4 & 4;
        String string7 = n10 != 0 ? hotspot2.pageType : string3;
        int n14 = n4 & 8;
        String string8 = n14 != 0 ? hotspot2.query : string4;
        int n15 = n4 & 0x10;
        String string9 = n15 != 0 ? hotspot2.type : string5;
        int n16 = n4 & 0x20;
        Double d12 = n16 != 0 ? hotspot2.width : d2;
        int n17 = n4 & 0x40;
        Double d13 = n17 != 0 ? hotspot2.height : d5;
        int n18 = n4 & 0x80;
        Double d14 = n18 != 0 ? hotspot2.x : d7;
        int n19 = n4 & 0x100;
        Double d15 = n19 != 0 ? hotspot2.y : d9;
        MetaData metaData2 = (n4 &= 0x200) != 0 ? hotspot2.metaData : metaData;
        string2 = string6;
        metadata = metadata2;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        d2 = d12;
        d5 = d13;
        d7 = d14;
        d9 = d15;
        metaData = metaData2;
        return hotspot.copy(string6, metadata2, string7, string8, string9, d12, d13, d14, d15, metaData2);
    }

    public final String component1() {
        return this.hotspotUrl;
    }

    public final MetaData component10() {
        return this.metaData;
    }

    public final Metadata component2() {
        return this.metadata;
    }

    public final String component3() {
        return this.pageType;
    }

    public final String component4() {
        return this.query;
    }

    public final String component5() {
        return this.type;
    }

    public final Double component6() {
        return this.width;
    }

    public final Double component7() {
        return this.height;
    }

    public final Double component8() {
        return this.x;
    }

    public final Double component9() {
        return this.y;
    }

    public final Hotspot copy(String string2, Metadata metadata, String string3, String string4, String string5, Double d2, Double d5, Double d7, Double d9, MetaData metaData) {
        Hotspot hotspot = new Hotspot(string2, metadata, string3, string4, string5, d2, d5, d7, d9, metaData);
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
        Object object2 = this.hotspotUrl;
        Object object3 = ((Hotspot)object).hotspotUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metadata;
        object3 = ((Hotspot)object).metadata;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageType;
        object3 = ((Hotspot)object).pageType;
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
        object2 = this.type;
        object3 = ((Hotspot)object).type;
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
        object2 = this.height;
        object3 = ((Hotspot)object).height;
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
        object2 = this.metaData;
        object = ((Hotspot)object).metaData;
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

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final String getPageType() {
        return this.pageType;
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
        String string2 = this.hotspotUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.metadata;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Metadata)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.type;
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
        object = this.height;
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
        object = this.metaData;
        if (object != null) {
            n7 = ((MetaData)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setHotspotUrl(String string2) {
        this.hotspotUrl = string2;
    }

    public final void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public final void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public final void setPageType(String string2) {
        this.pageType = string2;
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
        String string2 = this.hotspotUrl;
        Metadata metadata = this.metadata;
        String string3 = this.pageType;
        String string4 = this.query;
        String string5 = this.type;
        Double d2 = this.width;
        Double d5 = this.height;
        Double d7 = this.x;
        Double d9 = this.y;
        MetaData metaData = this.metaData;
        StringBuilder stringBuilder = new StringBuilder("Hotspot(hotspotUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", metadata=");
        stringBuilder.append(metadata);
        stringBuilder.append(", pageType=");
        X50.a(stringBuilder, string3, ", query=", string4, ", type=");
        stringBuilder.append(string5);
        stringBuilder.append(", width=");
        stringBuilder.append(d2);
        stringBuilder.append(", height=");
        stringBuilder.append(d5);
        stringBuilder.append(", x=");
        stringBuilder.append(d7);
        stringBuilder.append(", y=");
        stringBuilder.append(d9);
        stringBuilder.append(", metaData=");
        stringBuilder.append(metaData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

