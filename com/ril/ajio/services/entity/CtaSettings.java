/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CtaSettings {
    private final String bgColor;
    private final String ctaLink;
    private final String ctaText;
    private final Boolean enable;
    private final String textColor;

    public CtaSettings() {
        this(null, null, null, null, null, 31, null);
    }

    public CtaSettings(String string2, String string3, String string4, Boolean bl2, String string5) {
        this.bgColor = string2;
        this.ctaLink = string3;
        this.ctaText = string4;
        this.enable = bl2;
        this.textColor = string5;
    }

    public /* synthetic */ CtaSettings(String object, String object2, String string2, Boolean object3, String object4, int n3, DefaultConstructorMarker object5) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string4 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = object4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        object3 = string4;
        object4 = object7;
        this((String)object5, (String)object6, string4, (Boolean)object7, string3);
    }

    public static /* synthetic */ CtaSettings copy$default(CtaSettings ctaSettings, String string2, String object, String string3, Boolean object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = ctaSettings.bgColor;
        }
        if ((n4 = n3 & 2) != 0) {
            object = ctaSettings.ctaLink;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = ctaSettings.ctaText;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = ctaSettings.enable;
        }
        Boolean bl2 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = ctaSettings.textColor;
        }
        String string6 = string4;
        object = ctaSettings;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string6;
        return ctaSettings.copy(string2, (String)object2, string5, bl2, string6);
    }

    public final String component1() {
        return this.bgColor;
    }

    public final String component2() {
        return this.ctaLink;
    }

    public final String component3() {
        return this.ctaText;
    }

    public final Boolean component4() {
        return this.enable;
    }

    public final String component5() {
        return this.textColor;
    }

    public final CtaSettings copy(String string2, String string3, String string4, Boolean bl2, String string5) {
        CtaSettings ctaSettings = new CtaSettings(string2, string3, string4, bl2, string5);
        return ctaSettings;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CtaSettings;
        if (!bl3) {
            return false;
        }
        object = (CtaSettings)object;
        Object object2 = this.bgColor;
        Object object3 = ((CtaSettings)object).bgColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaLink;
        object3 = ((CtaSettings)object).ctaLink;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaText;
        object3 = ((CtaSettings)object).ctaText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enable;
        object3 = ((CtaSettings)object).enable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.textColor;
        object = ((CtaSettings)object).textColor;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getCtaLink() {
        return this.ctaLink;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getTextColor() {
        return this.textColor;
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
        Object object = this.ctaLink;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctaText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.textColor;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.bgColor;
        String string2 = this.ctaLink;
        String string3 = this.ctaText;
        Boolean bl2 = this.enable;
        String string4 = this.textColor;
        charSequence = og_1.a("CtaSettings(bgColor=", charSequence, ", ctaLink=", string2, ", ctaText=");
        vw0_1.a(bl2, string3, ", enable=", ", textColor=", (StringBuilder)charSequence);
        return h30_0.a((StringBuilder)charSequence, string4, ")");
    }
}

