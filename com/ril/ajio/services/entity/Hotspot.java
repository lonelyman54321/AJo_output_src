/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Hotspot {
    private final Double height;
    private final String hotspotUrl;
    private final String type;
    private final Double width;
    private final Double x;
    private final Double y;

    public Hotspot() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Hotspot(Double d2, String string2, String string3, Double d5, Double d7, Double d9) {
        this.height = d2;
        this.hotspotUrl = string2;
        this.type = string3;
        this.width = d5;
        this.x = d7;
        this.y = d9;
    }

    public /* synthetic */ Hotspot(Double object, String object2, String string2, Double object3, Double d2, Double d5, int n3, DefaultConstructorMarker object4) {
        Double d7;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string3 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        Double d9 = n7 != 0 ? null : d2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            d7 = null;
        } else {
            d7 = d5;
        }
        object = this;
        object2 = object4;
        string2 = object5;
        object3 = string3;
        d2 = object6;
        d5 = d9;
        this((Double)object4, (String)object5, string3, (Double)object6, d9, d7);
    }

    public static /* synthetic */ Hotspot copy$default(Hotspot hotspot, Double d2, String object, String object2, Double object3, Double object4, Double d5, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = hotspot.height;
        }
        if ((n4 = n3 & 2) != 0) {
            object = hotspot.hotspotUrl;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = hotspot.type;
        }
        String string2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = hotspot.width;
        }
        Double d7 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = hotspot.x;
        }
        Double d9 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            d5 = hotspot.y;
        }
        Double d12 = d5;
        object = hotspot;
        object2 = d2;
        object3 = object5;
        object4 = string2;
        d5 = d7;
        object5 = d12;
        return hotspot.copy(d2, (String)object3, string2, d7, d9, d12);
    }

    public final Double component1() {
        return this.height;
    }

    public final String component2() {
        return this.hotspotUrl;
    }

    public final String component3() {
        return this.type;
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

    public final Hotspot copy(Double d2, String string2, String string3, Double d5, Double d7, Double d9) {
        Hotspot hotspot = new Hotspot(d2, string2, string3, d5, d7, d9);
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

    public String toString() {
        Double d2 = this.height;
        String string2 = this.hotspotUrl;
        String string3 = this.type;
        Double d5 = this.width;
        Double d7 = this.x;
        Double d9 = this.y;
        StringBuilder stringBuilder = new StringBuilder("Hotspot(height=");
        stringBuilder.append(d2);
        stringBuilder.append(", hotspotUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", type=");
        stringBuilder.append(string3);
        stringBuilder.append(", width=");
        stringBuilder.append(d5);
        stringBuilder.append(", x=");
        stringBuilder.append(d7);
        stringBuilder.append(", y=");
        stringBuilder.append(d9);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

