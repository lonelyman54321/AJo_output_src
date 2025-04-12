/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Text {
    private String colour;
    private String fontFamily;
    private String fontSize;
    private String fontWeight;
    private String value;
    private Integer x;
    private Integer y;

    public Text() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Text(String string2, String string3, String string4, String string5, String string6, Integer n3, Integer n4) {
        this.colour = string2;
        this.fontFamily = string3;
        this.fontSize = string4;
        this.fontWeight = string5;
        this.value = string6;
        this.x = n3;
        this.y = n4;
    }

    public /* synthetic */ Text(String object, String object2, String string2, String string3, String string4, Integer object3, Integer n3, int n4, DefaultConstructorMarker object4) {
        Integer n7;
        int n8 = n4 & 1;
        if (n8 != 0) {
            n8 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n10 = n4 & 2;
        Object object5 = n10 != 0 ? null : object2;
        n10 = n4 & 4;
        String string5 = n10 != 0 ? null : string2;
        n10 = n4 & 8;
        String string6 = n10 != 0 ? null : string3;
        n10 = n4 & 0x10;
        String string7 = n10 != 0 ? null : string4;
        n10 = n4 & 0x20;
        Object object6 = n10 != 0 ? null : object3;
        n10 = n4 & 0x40;
        if (n10 != 0) {
            n4 = 0;
            n7 = null;
        } else {
            n7 = n3;
        }
        object = this;
        object2 = object4;
        string2 = object5;
        string3 = string5;
        string4 = string6;
        object3 = string7;
        n3 = object6;
        this((String)object4, (String)object5, string5, string6, string7, (Integer)object6, n7);
    }

    public static /* synthetic */ Text copy$default(Text text, String string2, String object, String string3, String object2, String string4, Integer object3, Integer object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = text.colour;
        }
        if ((n4 = n3 & 2) != 0) {
            object = text.fontFamily;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = text.fontSize;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = text.fontWeight;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = text.value;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object3 = text.x;
        }
        Integer n8 = object3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object4 = text.y;
        }
        Integer n10 = object4;
        object = text;
        string3 = string2;
        object2 = object5;
        string4 = string5;
        object3 = string6;
        object4 = string7;
        object5 = n10;
        return text.copy(string2, (String)object2, string5, string6, string7, n8, n10);
    }

    public final String component1() {
        return this.colour;
    }

    public final String component2() {
        return this.fontFamily;
    }

    public final String component3() {
        return this.fontSize;
    }

    public final String component4() {
        return this.fontWeight;
    }

    public final String component5() {
        return this.value;
    }

    public final Integer component6() {
        return this.x;
    }

    public final Integer component7() {
        return this.y;
    }

    public final Text copy(String string2, String string3, String string4, String string5, String string6, Integer n3, Integer n4) {
        Text text = new Text(string2, string3, string4, string5, string6, n3, n4);
        return text;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Text;
        if (!bl3) {
            return false;
        }
        object = (Text)object;
        Object object2 = this.colour;
        Object object3 = ((Text)object).colour;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fontFamily;
        object3 = ((Text)object).fontFamily;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fontSize;
        object3 = ((Text)object).fontSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fontWeight;
        object3 = ((Text)object).fontWeight;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object3 = ((Text)object).value;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.x;
        object3 = ((Text)object).x;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.y;
        object = ((Text)object).y;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getColour() {
        return this.colour;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final String getValue() {
        return this.value;
    }

    public final Integer getX() {
        return this.x;
    }

    public final Integer getY() {
        return this.y;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.colour;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.fontFamily;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fontSize;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fontWeight;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.value;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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

    public final void setColour(String string2) {
        this.colour = string2;
    }

    public final void setFontFamily(String string2) {
        this.fontFamily = string2;
    }

    public final void setFontSize(String string2) {
        this.fontSize = string2;
    }

    public final void setFontWeight(String string2) {
        this.fontWeight = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public final void setX(Integer n3) {
        this.x = n3;
    }

    public final void setY(Integer n3) {
        this.y = n3;
    }

    public String toString() {
        CharSequence charSequence = this.colour;
        String string2 = this.fontFamily;
        String string3 = this.fontSize;
        String string4 = this.fontWeight;
        String string5 = this.value;
        Integer n3 = this.x;
        Integer n4 = this.y;
        charSequence = og_1.a("Text(colour=", (String)charSequence, ", fontFamily=", string2, ", fontSize=");
        X50.a((StringBuilder)charSequence, string3, ", fontWeight=", string4, ", value=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", x=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", y=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

