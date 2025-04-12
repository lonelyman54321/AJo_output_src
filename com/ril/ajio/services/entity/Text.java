/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Text {
    private final String colour;
    private final String fontFamily;
    private final String fontSize;
    private final Integer fontWeight;
    private final String value;
    private final Integer x;
    private final Integer y;

    public Text() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Text(String string2, String string3, String string4, Integer n3, String string5, Integer n4, Integer n7) {
        this.colour = string2;
        this.fontFamily = string3;
        this.fontSize = string4;
        this.fontWeight = n3;
        this.value = string5;
        this.x = n4;
        this.y = n7;
    }

    public /* synthetic */ Text(String object, String object2, String string2, Integer object3, String object4, Integer object5, Integer n3, int n4, DefaultConstructorMarker object6) {
        Integer n7;
        int n8 = n4 & 1;
        if (n8 != 0) {
            n8 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n10 = n4 & 2;
        Object object7 = n10 != 0 ? null : object2;
        n10 = n4 & 4;
        String string3 = n10 != 0 ? null : string2;
        n10 = n4 & 8;
        Object object8 = n10 != 0 ? null : object3;
        n10 = n4 & 0x10;
        Object object9 = n10 != 0 ? null : object4;
        n10 = n4 & 0x20;
        Object object10 = n10 != 0 ? null : object5;
        n10 = n4 & 0x40;
        if (n10 != 0) {
            n4 = 0;
            n7 = null;
        } else {
            n7 = n3;
        }
        object = this;
        object2 = object6;
        string2 = object7;
        object3 = string3;
        object4 = object8;
        object5 = object9;
        n3 = object10;
        this((String)object6, (String)object7, string3, (Integer)object8, (String)object9, (Integer)object10, n7);
    }

    public static /* synthetic */ Text copy$default(Text text, String string2, String object, String string3, Integer object2, String string4, Integer n3, Integer object3, int n4, Object object4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = text.colour;
        }
        if ((n7 = n4 & 2) != 0) {
            object = text.fontFamily;
        }
        object4 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            string3 = text.fontSize;
        }
        String string5 = string3;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = text.fontWeight;
        }
        Integer n10 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            string4 = text.value;
        }
        String string6 = string4;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            n3 = text.x;
        }
        Integer n14 = n3;
        n8 = n4 & 0x40;
        if (n8 != 0) {
            object3 = text.y;
        }
        Integer n15 = object3;
        object = text;
        string3 = string2;
        object2 = object4;
        string4 = string5;
        n3 = n10;
        object3 = string6;
        object4 = n15;
        return text.copy(string2, (String)object2, string5, n10, string6, n14, n15);
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

    public final Integer component4() {
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

    public final Text copy(String string2, String string3, String string4, Integer n3, String string5, Integer n4, Integer n7) {
        Text text = new Text(string2, string3, string4, n3, string5, n4, n7);
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

    public final Integer getFontWeight() {
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
            n3 = object.hashCode();
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

    public String toString() {
        CharSequence charSequence = this.colour;
        String string2 = this.fontFamily;
        String string3 = this.fontSize;
        Integer n3 = this.fontWeight;
        String string4 = this.value;
        Integer n4 = this.x;
        Integer n7 = this.y;
        charSequence = og_1.a("Text(colour=", (String)charSequence, ", fontFamily=", string2, ", fontSize=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", fontWeight=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", value=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", x=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(", y=");
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

