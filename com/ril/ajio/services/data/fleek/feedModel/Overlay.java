/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Overlay {
    private Integer height;
    private String imageUrl;
    private String name;
    private String type;
    private Double width;
    private Double x;
    private Integer y;

    public Overlay() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Overlay(Integer n3, String string2, String string3, String string4, Double d2, Double d5, Integer n4) {
        this.height = n3;
        this.imageUrl = string2;
        this.name = string3;
        this.type = string4;
        this.width = d2;
        this.x = d5;
        this.y = n4;
    }

    public /* synthetic */ Overlay(Integer object, String object2, String string2, String string3, Double object3, Double d2, Integer number, int n3, DefaultConstructorMarker object4) {
        Integer n4;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n8 = n3 & 2;
        Object object5 = n8 != 0 ? null : object2;
        n8 = n3 & 4;
        String string4 = n8 != 0 ? null : string2;
        n8 = n3 & 8;
        String string5 = n8 != 0 ? null : string3;
        n8 = n3 & 0x10;
        Object object6 = n8 != 0 ? null : object3;
        n8 = n3 & 0x20;
        Double d5 = n8 != 0 ? null : d2;
        n8 = n3 & 0x40;
        if (n8 != 0) {
            n3 = 0;
            n4 = null;
        } else {
            n4 = number;
        }
        object = this;
        object2 = object4;
        string2 = object5;
        string3 = string4;
        object3 = string5;
        d2 = object6;
        number = d5;
        this((Integer)object4, (String)object5, string4, string5, (Double)object6, d5, n4);
    }

    public static /* synthetic */ Overlay copy$default(Overlay overlay, Integer n3, String object, String object2, String object3, Double object4, Double object5, Integer number, int n4, Object object6) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = overlay.height;
        }
        if ((n7 = n4 & 2) != 0) {
            object = overlay.imageUrl;
        }
        object6 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = overlay.name;
        }
        String string2 = object2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object3 = overlay.type;
        }
        String string3 = object3;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            object4 = overlay.width;
        }
        Double d2 = object4;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            object5 = overlay.x;
        }
        Double d5 = object5;
        n8 = n4 & 0x40;
        if (n8 != 0) {
            number = overlay.y;
        }
        Integer n10 = number;
        object = overlay;
        object2 = n3;
        object3 = object6;
        object4 = string2;
        object5 = string3;
        number = d2;
        object6 = n10;
        return overlay.copy(n3, (String)object3, string2, string3, d2, d5, n10);
    }

    public final Integer component1() {
        return this.height;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.type;
    }

    public final Double component5() {
        return this.width;
    }

    public final Double component6() {
        return this.x;
    }

    public final Integer component7() {
        return this.y;
    }

    public final Overlay copy(Integer n3, String string2, String string3, String string4, Double d2, Double d5, Integer n4) {
        Overlay overlay = new Overlay(n3, string2, string3, string4, d2, d5, n4);
        return overlay;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Overlay;
        if (!bl3) {
            return false;
        }
        object = (Overlay)object;
        Object object2 = this.height;
        Object object3 = ((Overlay)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((Overlay)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((Overlay)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Overlay)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Overlay)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.x;
        object3 = ((Overlay)object).x;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.y;
        object = ((Overlay)object).y;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
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

    public final Integer getY() {
        return this.y;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.height;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.name;
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
            n8 = object.hashCode();
        }
        return n4 + n8;
    }

    public final void setHeight(Integer n3) {
        this.height = n3;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
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

    public final void setY(Integer n3) {
        this.y = n3;
    }

    public String toString() {
        Integer n3 = this.height;
        String string2 = this.imageUrl;
        String string3 = this.name;
        String string4 = this.type;
        Double d2 = this.width;
        Double d5 = this.x;
        Integer n4 = this.y;
        StringBuilder stringBuilder = new StringBuilder("Overlay(height=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", name=");
        X50.a(stringBuilder, string3, ", type=", string4, ", width=");
        stringBuilder.append(d2);
        stringBuilder.append(", x=");
        stringBuilder.append(d5);
        stringBuilder.append(", y=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

