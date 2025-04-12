/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Hotspot {
    private Double height;
    private String hotspotUrl;
    private MetaData metaData;
    private String pageType;
    private String query;
    private String type;
    private Double width;
    private Double x;
    private Double y;

    public Hotspot() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public Hotspot(Double d2, String string2, MetaData metaData, String string3, String string4, String string5, Double d5, Double d7, Double d9) {
        this.height = d2;
        this.hotspotUrl = string2;
        this.metaData = metaData;
        this.pageType = string3;
        this.query = string4;
        this.type = string5;
        this.width = d5;
        this.x = d7;
        this.y = d9;
    }

    public /* synthetic */ Hotspot(Double object, String object2, MetaData object3, String object4, String string2, String string3, Double object5, Double d2, Double d5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Double d7;
        Double d9;
        String string4;
        String string5;
        String string6;
        MetaData metaData;
        String string7;
        Double d12;
        int n4 = n3;
        int n7 = n3 & 1;
        Double d13 = null;
        if (n7 != 0) {
            n7 = 0;
            d12 = null;
        } else {
            d12 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            metaData = null;
        } else {
            metaData = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string6 = null;
        } else {
            string6 = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            d9 = null;
        } else {
            d9 = object5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            d7 = null;
        } else {
            d7 = d2;
        }
        if ((n4 &= 0x100) == 0) {
            d13 = d5;
        }
        object = this;
        object2 = d12;
        object3 = string7;
        object4 = metaData;
        string2 = string6;
        string3 = string5;
        object5 = string4;
        d2 = d9;
        d5 = d7;
        this(d12, string7, metaData, string6, string5, string4, d9, d7, d13);
    }

    public static /* synthetic */ Hotspot copy$default(Hotspot hotspot, Double d2, String string2, MetaData metaData, String string3, String string4, String string5, Double d5, Double d7, Double d9, int n3, Object object) {
        Hotspot hotspot2 = hotspot;
        int n4 = n3;
        int n7 = n3 & 1;
        Double d12 = n7 != 0 ? hotspot.height : d2;
        int n8 = n4 & 2;
        String string6 = n8 != 0 ? hotspot2.hotspotUrl : string2;
        int n10 = n4 & 4;
        MetaData metaData2 = n10 != 0 ? hotspot2.metaData : metaData;
        int n14 = n4 & 8;
        String string7 = n14 != 0 ? hotspot2.pageType : string3;
        int n15 = n4 & 0x10;
        String string8 = n15 != 0 ? hotspot2.query : string4;
        int n16 = n4 & 0x20;
        String string9 = n16 != 0 ? hotspot2.type : string5;
        int n17 = n4 & 0x40;
        Double d13 = n17 != 0 ? hotspot2.width : d5;
        int n18 = n4 & 0x80;
        Double d14 = n18 != 0 ? hotspot2.x : d7;
        Double d15 = (n4 &= 0x100) != 0 ? hotspot2.y : d9;
        d2 = d12;
        string2 = string6;
        metaData = metaData2;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        d5 = d13;
        d7 = d14;
        d9 = d15;
        return hotspot.copy(d12, string6, metaData2, string7, string8, string9, d13, d14, d15);
    }

    public final Double component1() {
        return this.height;
    }

    public final String component2() {
        return this.hotspotUrl;
    }

    public final MetaData component3() {
        return this.metaData;
    }

    public final String component4() {
        return this.pageType;
    }

    public final String component5() {
        return this.query;
    }

    public final String component6() {
        return this.type;
    }

    public final Double component7() {
        return this.width;
    }

    public final Double component8() {
        return this.x;
    }

    public final Double component9() {
        return this.y;
    }

    public final Hotspot copy(Double d2, String string2, MetaData metaData, String string3, String string4, String string5, Double d5, Double d7, Double d9) {
        Hotspot hotspot = new Hotspot(d2, string2, metaData, string3, string4, string5, d5, d7, d9);
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
        Object object2 = this.height;
        Object object3 = ((Hotspot)object).height;
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
        object2 = this.metaData;
        object3 = ((Hotspot)object).metaData;
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
        object2 = this.x;
        object3 = ((Hotspot)object).x;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.y;
        object = ((Hotspot)object).y;
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
        Double d2 = this.height;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Object object = this.hotspotUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.metaData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((MetaData)object).hashCode();
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
        object = this.x;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.y;
        if (object != null) {
            n7 = object.hashCode();
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
        Double d2 = this.height;
        String string2 = this.hotspotUrl;
        MetaData metaData = this.metaData;
        String string3 = this.pageType;
        String string4 = this.query;
        String string5 = this.type;
        Double d5 = this.width;
        Double d7 = this.x;
        Double d9 = this.y;
        StringBuilder stringBuilder = new StringBuilder("Hotspot(height=");
        stringBuilder.append(d2);
        stringBuilder.append(", hotspotUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", metaData=");
        stringBuilder.append(metaData);
        stringBuilder.append(", pageType=");
        stringBuilder.append(string3);
        stringBuilder.append(", query=");
        X50.a(stringBuilder, string4, ", type=", string5, ", width=");
        stringBuilder.append(d5);
        stringBuilder.append(", x=");
        stringBuilder.append(d7);
        stringBuilder.append(", y=");
        stringBuilder.append(d9);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

