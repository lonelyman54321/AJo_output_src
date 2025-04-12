/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubComponent {
    private final Integer height;
    private final String imageUrl;
    private final Object name;
    private final String type;
    private final Double width;
    private final Double x;
    private final Double y;

    public SubComponent() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public SubComponent(Integer n3, String string2, Object object, String string3, Double d2, Double d5, Double d7) {
        this.height = n3;
        this.imageUrl = string2;
        this.name = object;
        this.type = string3;
        this.width = d2;
        this.x = d5;
        this.y = d7;
    }

    public /* synthetic */ SubComponent(Integer object, String object2, Object object3, String object4, Double object5, Double d2, Double d5, int n3, DefaultConstructorMarker object6) {
        Double d7;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n7 = n3 & 2;
        Object object7 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object8 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object9 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        Object object10 = n7 != 0 ? null : object5;
        n7 = n3 & 0x20;
        Double d9 = n7 != 0 ? null : d2;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            d7 = null;
        } else {
            d7 = d5;
        }
        object = this;
        object2 = object6;
        object3 = object7;
        object4 = object8;
        object5 = object9;
        d2 = object10;
        d5 = d9;
        this((Integer)object6, (String)object7, object8, (String)object9, (Double)object10, d9, d7);
    }

    public static /* synthetic */ SubComponent copy$default(SubComponent subComponent, Integer n3, String object, Object object2, String object3, Double object4, Double object5, Double d2, int n4, Object object6) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = subComponent.height;
        }
        if ((n7 = n4 & 2) != 0) {
            object = subComponent.imageUrl;
        }
        object6 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = subComponent.name;
        }
        Object object7 = object2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object3 = subComponent.type;
        }
        String string2 = object3;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            object4 = subComponent.width;
        }
        Double d5 = object4;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            object5 = subComponent.x;
        }
        Double d7 = object5;
        n8 = n4 & 0x40;
        if (n8 != 0) {
            d2 = subComponent.y;
        }
        Double d9 = d2;
        object = subComponent;
        object2 = n3;
        object3 = object6;
        object4 = object7;
        object5 = string2;
        d2 = d5;
        object6 = d9;
        return subComponent.copy(n3, (String)object3, object7, string2, d5, d7, d9);
    }

    public final Integer component1() {
        return this.height;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Object component3() {
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

    public final Double component7() {
        return this.y;
    }

    public final SubComponent copy(Integer n3, String string2, Object object, String string3, Double d2, Double d5, Double d7) {
        SubComponent subComponent = new SubComponent(n3, string2, object, string3, d2, d5, d7);
        return subComponent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubComponent;
        if (!bl3) {
            return false;
        }
        object = (SubComponent)object;
        Object object2 = this.height;
        Object object3 = ((SubComponent)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((SubComponent)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        object3 = ((SubComponent)object).name;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((SubComponent)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((SubComponent)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.x;
        object3 = ((SubComponent)object).x;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.y;
        object = ((SubComponent)object).y;
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

    public final Object getName() {
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

    public final Double getY() {
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
            n3 = object.hashCode();
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

    public String toString() {
        Integer n3 = this.height;
        String string2 = this.imageUrl;
        Object object = this.name;
        String string3 = this.type;
        Double d2 = this.width;
        Double d5 = this.x;
        Double d7 = this.y;
        StringBuilder stringBuilder = new StringBuilder("SubComponent(height=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", name=");
        stringBuilder.append(object);
        stringBuilder.append(", type=");
        stringBuilder.append(string3);
        stringBuilder.append(", width=");
        stringBuilder.append(d2);
        stringBuilder.append(", x=");
        stringBuilder.append(d5);
        stringBuilder.append(", y=");
        stringBuilder.append(d7);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

