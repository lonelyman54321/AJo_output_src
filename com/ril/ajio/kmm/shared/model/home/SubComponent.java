/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.SubComponent$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class SubComponent {
    public static final SubComponent$Companion Companion;
    private Double height;
    private String imageUrl;
    private Double width;
    private Double x;
    private Double y;

    static {
        SubComponent$Companion subComponent$Companion;
        Companion = subComponent$Companion = new SubComponent$Companion(null);
    }

    public SubComponent() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ SubComponent(int n3, Double d2, String string2, Double d5, Double d7, Double d9, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.height = n4 == 0 ? null : d2;
        int n7 = n3 & 2;
        this.imageUrl = n7 == 0 ? null : string2;
        n7 = n3 & 4;
        this.width = n7 == 0 ? null : d5;
        n7 = n3 & 8;
        this.x = n7 == 0 ? null : d7;
        this.y = (n3 &= 0x10) == 0 ? null : d9;
    }

    public SubComponent(Double d2, String string2, Double d5, Double d7, Double d9) {
        this.height = d2;
        this.imageUrl = string2;
        this.width = d5;
        this.x = d7;
        this.y = d9;
    }

    public /* synthetic */ SubComponent(Double object, String object2, Double object3, Double d2, Double d5, int n3, DefaultConstructorMarker object4) {
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
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Double d9 = n7 != 0 ? null : d2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            d7 = null;
        } else {
            d7 = d5;
        }
        object = this;
        object2 = object4;
        object3 = object5;
        d2 = object6;
        d5 = d9;
        this((Double)object4, (String)object5, (Double)object6, d9, d7);
    }

    public static /* synthetic */ SubComponent copy$default(SubComponent subComponent, Double d2, String object, Double d5, Double object2, Double d7, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = subComponent.height;
        }
        if ((n4 = n3 & 2) != 0) {
            object = subComponent.imageUrl;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            d5 = subComponent.width;
        }
        Double d9 = d5;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = subComponent.x;
        }
        Double d12 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            d7 = subComponent.y;
        }
        Double d13 = d7;
        object = subComponent;
        d5 = d2;
        object2 = object3;
        d7 = d9;
        object3 = d13;
        return subComponent.copy(d2, (String)object2, d9, d12, d13);
    }

    public static final /* synthetic */ void write$Self$shared_release(SubComponent object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((SubComponent)object).height) != null) {
            object3 = os0_2.a;
            object2 = ((SubComponent)object).height;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((SubComponent)object).imageUrl) != null) {
            object3 = pe3_2.a;
            object2 = ((SubComponent)object).imageUrl;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((SubComponent)object).width) != null) {
            object3 = os0_2.a;
            object2 = ((SubComponent)object).width;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((SubComponent)object).x) != null) {
            object3 = os0_2.a;
            object2 = ((SubComponent)object).x;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object3 = ((SubComponent)object).y) != null) {
            object3 = os0_2.a;
            object = ((SubComponent)object).y;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final Double component1() {
        return this.height;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Double component3() {
        return this.width;
    }

    public final Double component4() {
        return this.x;
    }

    public final Double component5() {
        return this.y;
    }

    public final SubComponent copy(Double d2, String string2, Double d5, Double d7, Double d9) {
        SubComponent subComponent = new SubComponent(d2, string2, d5, d7, d9);
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

    public final Double getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
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
        Object object = this.imageUrl;
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

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
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
        String string2 = this.imageUrl;
        Double d5 = this.width;
        Double d7 = this.x;
        Double d9 = this.y;
        StringBuilder stringBuilder = new StringBuilder("SubComponent(height=");
        stringBuilder.append(d2);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string2);
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

