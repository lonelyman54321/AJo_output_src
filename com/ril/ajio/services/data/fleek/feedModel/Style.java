/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Style {
    private String fitToWidth;
    private Double height;
    private String isPaddingEnable;
    private String textColor;
    private String unit;
    private Double width;

    public Style() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Style(String string2, String string3, Double d2, String string4, Double d5, String string5) {
        this.fitToWidth = string2;
        this.isPaddingEnable = string3;
        this.height = d2;
        this.textColor = string4;
        this.width = d5;
        this.unit = string5;
    }

    public /* synthetic */ Style(String object, String object2, Double object3, String object4, Double object5, String object6, int n3, DefaultConstructorMarker object7) {
        String string2;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object7 = null;
        } else {
            object7 = object;
        }
        int n7 = n3 & 2;
        Object object8 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object9 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object10 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        Object object11 = n7 != 0 ? null : object5;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string2 = null;
        } else {
            string2 = object6;
        }
        object = this;
        object2 = object7;
        object3 = object8;
        object4 = object9;
        object5 = object10;
        object6 = object11;
        this((String)object7, (String)object8, (Double)object9, (String)object10, (Double)object11, string2);
    }

    public static /* synthetic */ Style copy$default(Style style2, String string2, String object, Double object2, String object3, Double d2, String string3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = style2.fitToWidth;
        }
        if ((n4 = n3 & 2) != 0) {
            object = style2.isPaddingEnable;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = style2.height;
        }
        Double d5 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = style2.textColor;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            d2 = style2.width;
        }
        Double d7 = d2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = style2.unit;
        }
        String string5 = string3;
        object = style2;
        object2 = string2;
        object3 = object4;
        d2 = d5;
        string3 = string4;
        object4 = string5;
        return style2.copy(string2, (String)object3, d5, string4, d7, string5);
    }

    public final String component1() {
        return this.fitToWidth;
    }

    public final String component2() {
        return this.isPaddingEnable;
    }

    public final Double component3() {
        return this.height;
    }

    public final String component4() {
        return this.textColor;
    }

    public final Double component5() {
        return this.width;
    }

    public final String component6() {
        return this.unit;
    }

    public final Style copy(String string2, String string3, Double d2, String string4, Double d5, String string5) {
        Style style2 = new Style(string2, string3, d2, string4, d5, string5);
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
        object2 = this.isPaddingEnable;
        object3 = ((Style)object).isPaddingEnable;
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
        object2 = this.textColor;
        object3 = ((Style)object).textColor;
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
        object2 = this.unit;
        object = ((Style)object).unit;
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
        String string2 = this.fitToWidth;
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
        object = this.textColor;
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
        object = this.unit;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isPaddingEnable() {
        return this.isPaddingEnable;
    }

    public final void setFitToWidth(String string2) {
        this.fitToWidth = string2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setPaddingEnable(String string2) {
        this.isPaddingEnable = string2;
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
        CharSequence charSequence = this.fitToWidth;
        String string2 = this.isPaddingEnable;
        Double d2 = this.height;
        String string3 = this.textColor;
        Double d5 = this.width;
        String string4 = this.unit;
        charSequence = og_1.a("Style(fitToWidth=", (String)charSequence, ", isPaddingEnable=", string2, ", height=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(", textColor=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(d5);
        ((StringBuilder)charSequence).append(", unit=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

