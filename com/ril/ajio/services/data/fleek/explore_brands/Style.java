/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.Padding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Style {
    private String bgColor;
    private Boolean fitToWidth;
    private Double height;
    private String isDefaultExpandable;
    private Boolean isPaddingEnable;
    private Padding padding;
    private String textColor;
    private String unit;
    private Double width;

    public Style() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public Style(String string2, Boolean bl2, Padding padding, String string3, Double d2, String string4, Double d5, Boolean bl3, String string5) {
        this.bgColor = string2;
        this.isPaddingEnable = bl2;
        this.padding = padding;
        this.textColor = string3;
        this.height = d2;
        this.isDefaultExpandable = string4;
        this.width = d5;
        this.fitToWidth = bl3;
        this.unit = string5;
    }

    public /* synthetic */ Style(String object, Boolean object2, Padding object3, String object4, Double object5, String object6, Double object7, Boolean comparable, String object8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl2;
        Double d2;
        String string2;
        Double d5;
        String string3;
        Padding padding;
        Boolean bl3;
        String string4;
        int n4 = n3;
        int n7 = n3 & 1;
        String string5 = null;
        if (n7 != 0) {
            n7 = 0;
            string4 = null;
        } else {
            string4 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            bl3 = null;
        } else {
            bl3 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            padding = null;
        } else {
            padding = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string3 = null;
        } else {
            string3 = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            d5 = null;
        } else {
            d5 = object5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string2 = null;
        } else {
            string2 = object6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            d2 = null;
        } else {
            d2 = object7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            bl2 = null;
        } else {
            bl2 = comparable;
        }
        if ((n4 &= 0x100) == 0) {
            string5 = object8;
        }
        object = this;
        object2 = string4;
        object3 = bl3;
        object4 = padding;
        object5 = string3;
        object6 = d5;
        object7 = string2;
        comparable = d2;
        object8 = bl2;
        this(string4, bl3, padding, string3, d5, string2, d2, bl2, string5);
    }

    public static /* synthetic */ Style copy$default(Style style2, String string2, Boolean bl2, Padding padding, String string3, Double d2, String string4, Double d5, Boolean bl3, String string5, int n3, Object object) {
        Style style3 = style2;
        int n4 = n3;
        int n7 = n3 & 1;
        String string6 = n7 != 0 ? style2.bgColor : string2;
        int n8 = n4 & 2;
        Boolean bl4 = n8 != 0 ? style3.isPaddingEnable : bl2;
        int n10 = n4 & 4;
        Padding padding2 = n10 != 0 ? style3.padding : padding;
        int n14 = n4 & 8;
        String string7 = n14 != 0 ? style3.textColor : string3;
        int n15 = n4 & 0x10;
        Double d7 = n15 != 0 ? style3.height : d2;
        int n16 = n4 & 0x20;
        String string8 = n16 != 0 ? style3.isDefaultExpandable : string4;
        int n17 = n4 & 0x40;
        Double d9 = n17 != 0 ? style3.width : d5;
        int n18 = n4 & 0x80;
        Boolean bl5 = n18 != 0 ? style3.fitToWidth : bl3;
        String string9 = (n4 &= 0x100) != 0 ? style3.unit : string5;
        string2 = string6;
        bl2 = bl4;
        padding = padding2;
        string3 = string7;
        d2 = d7;
        string4 = string8;
        d5 = d9;
        bl3 = bl5;
        string5 = string9;
        return style2.copy(string6, bl4, padding2, string7, d7, string8, d9, bl5, string9);
    }

    public final String component1() {
        return this.bgColor;
    }

    public final Boolean component2() {
        return this.isPaddingEnable;
    }

    public final Padding component3() {
        return this.padding;
    }

    public final String component4() {
        return this.textColor;
    }

    public final Double component5() {
        return this.height;
    }

    public final String component6() {
        return this.isDefaultExpandable;
    }

    public final Double component7() {
        return this.width;
    }

    public final Boolean component8() {
        return this.fitToWidth;
    }

    public final String component9() {
        return this.unit;
    }

    public final Style copy(String string2, Boolean bl2, Padding padding, String string3, Double d2, String string4, Double d5, Boolean bl3, String string5) {
        Style style2 = new Style(string2, bl2, padding, string3, d2, string4, d5, bl3, string5);
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
        Object object2 = this.bgColor;
        Object object3 = ((Style)object).bgColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isPaddingEnable;
        object3 = ((Style)object).isPaddingEnable;
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
        object2 = this.textColor;
        object3 = ((Style)object).textColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((Style)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isDefaultExpandable;
        object3 = ((Style)object).isDefaultExpandable;
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
        object2 = this.fitToWidth;
        object3 = ((Style)object).fitToWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.unit;
        object = ((Style)object).unit;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.bgColor;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.isPaddingEnable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.padding;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Padding)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.textColor;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.isDefaultExpandable;
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
        object = this.fitToWidth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.unit;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isDefaultExpandable() {
        return this.isDefaultExpandable;
    }

    public final Boolean isPaddingEnable() {
        return this.isPaddingEnable;
    }

    public final void setBgColor(String string2) {
        this.bgColor = string2;
    }

    public final void setDefaultExpandable(String string2) {
        this.isDefaultExpandable = string2;
    }

    public final void setFitToWidth(Boolean bl2) {
        this.fitToWidth = bl2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setPadding(Padding padding) {
        this.padding = padding;
    }

    public final void setPaddingEnable(Boolean bl2) {
        this.isPaddingEnable = bl2;
    }

    public final void setTextColor(String string2) {
        this.textColor = string2;
    }

    public final void setUnit(String string2) {
        this.unit = string2;
    }

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public String toString() {
        String string2 = this.bgColor;
        Boolean bl2 = this.isPaddingEnable;
        Padding padding = this.padding;
        String string3 = this.textColor;
        Double d2 = this.height;
        String string4 = this.isDefaultExpandable;
        Double d5 = this.width;
        Boolean bl3 = this.fitToWidth;
        String string5 = this.unit;
        StringBuilder stringBuilder = new StringBuilder("Style(bgColor=");
        stringBuilder.append(string2);
        stringBuilder.append(", isPaddingEnable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", padding=");
        stringBuilder.append(padding);
        stringBuilder.append(", textColor=");
        stringBuilder.append(string3);
        stringBuilder.append(", height=");
        stringBuilder.append(d2);
        stringBuilder.append(", isDefaultExpandable=");
        stringBuilder.append(string4);
        stringBuilder.append(", width=");
        stringBuilder.append(d5);
        stringBuilder.append(", fitToWidth=");
        stringBuilder.append(bl3);
        stringBuilder.append(", unit=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

