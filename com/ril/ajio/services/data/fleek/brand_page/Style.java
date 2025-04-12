/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.brand_page;

import com.ril.ajio.services.data.fleek.brand_page.Padding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Style {
    private String fitToWidth;
    private Double height;
    private Padding padding;
    private Double width;

    public Style() {
        this(null, null, null, null, 15, null);
    }

    public Style(String string2, Padding padding, Double d2, Double d5) {
        this.fitToWidth = string2;
        this.padding = padding;
        this.width = d2;
        this.height = d5;
    }

    public /* synthetic */ Style(String string2, Padding padding, Double d2, Double d5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            padding = null;
        }
        if ((n4 = n3 & 4) != 0) {
            d2 = null;
        }
        if ((n3 &= 8) != 0) {
            d5 = null;
        }
        this(string2, padding, d2, d5);
    }

    public static /* synthetic */ Style copy$default(Style style2, String string2, Padding padding, Double d2, Double d5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = style2.fitToWidth;
        }
        if ((n4 = n3 & 2) != 0) {
            padding = style2.padding;
        }
        if ((n4 = n3 & 4) != 0) {
            d2 = style2.width;
        }
        if ((n3 &= 8) != 0) {
            d5 = style2.height;
        }
        return style2.copy(string2, padding, d2, d5);
    }

    public final String component1() {
        return this.fitToWidth;
    }

    public final Padding component2() {
        return this.padding;
    }

    public final Double component3() {
        return this.width;
    }

    public final Double component4() {
        return this.height;
    }

    public final Style copy(String string2, Padding padding, Double d2, Double d5) {
        Style style2 = new Style(string2, padding, d2, d5);
        return style2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Style;
        if (!bl3) {
            return false;
        }
        object = (Style)object;
        Object object2 = this.fitToWidth;
        Object object3 = ((Style)object).fitToWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.padding;
        object3 = ((Style)object).padding;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Style)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object = ((Style)object).height;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getFitToWidth() {
        return this.fitToWidth;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.fitToWidth;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.padding;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Padding)object).hashCode();
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
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setFitToWidth(String string2) {
        this.fitToWidth = string2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setPadding(Padding padding) {
        this.padding = padding;
    }

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public String toString() {
        String string2 = this.fitToWidth;
        Padding padding = this.padding;
        Double d2 = this.width;
        Double d5 = this.height;
        StringBuilder stringBuilder = new StringBuilder("Style(fitToWidth=");
        stringBuilder.append(string2);
        stringBuilder.append(", padding=");
        stringBuilder.append(padding);
        stringBuilder.append(", width=");
        stringBuilder.append(d2);
        stringBuilder.append(", height=");
        stringBuilder.append(d5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

