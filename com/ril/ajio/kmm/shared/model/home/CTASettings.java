/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.CTASettings$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CTASettings {
    public static final CTASettings$Companion Companion;
    private final String bgColor;
    private final String ctaLink;
    private final String ctaText;
    private final Boolean enable;
    private final String textColor;

    static {
        CTASettings$Companion cTASettings$Companion;
        Companion = cTASettings$Companion = new CTASettings$Companion(null);
    }

    public CTASettings() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CTASettings(int n3, Boolean bl2, String string2, String string3, String string4, String string5, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.enable = n4 == 0 ? null : bl2;
        int n7 = n3 & 2;
        this.ctaText = n7 == 0 ? null : string2;
        n7 = n3 & 4;
        this.ctaLink = n7 == 0 ? null : string3;
        n7 = n3 & 8;
        this.bgColor = n7 == 0 ? null : string4;
        this.textColor = (n3 &= 0x10) == 0 ? null : string5;
    }

    public CTASettings(Boolean bl2, String string2, String string3, String string4, String string5) {
        this.enable = bl2;
        this.ctaText = string2;
        this.ctaLink = string3;
        this.bgColor = string4;
        this.textColor = string5;
    }

    public /* synthetic */ CTASettings(Boolean object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((Boolean)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ CTASettings copy$default(CTASettings cTASettings, Boolean bl2, String object, String object2, String object3, String string2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = cTASettings.enable;
        }
        if ((n4 = n3 & 2) != 0) {
            object = cTASettings.ctaText;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = cTASettings.ctaLink;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = cTASettings.bgColor;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = cTASettings.textColor;
        }
        String string5 = string2;
        object = cTASettings;
        object2 = bl2;
        object3 = object4;
        string2 = string3;
        object4 = string5;
        return cTASettings.copy(bl2, (String)object3, string3, string4, string5);
    }

    public static final /* synthetic */ void write$Self$shared_release(CTASettings object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((CTASettings)object).enable) != null) {
            object3 = cz_2.a;
            object2 = ((CTASettings)object).enable;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((CTASettings)object).ctaText) != null) {
            object3 = pe3_2.a;
            object2 = ((CTASettings)object).ctaText;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((CTASettings)object).ctaLink) != null) {
            object3 = pe3_2.a;
            object2 = ((CTASettings)object).ctaLink;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((CTASettings)object).bgColor) != null) {
            object3 = pe3_2.a;
            object2 = ((CTASettings)object).bgColor;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object3 = ((CTASettings)object).textColor) != null) {
            object3 = pe3_2.a;
            object = ((CTASettings)object).textColor;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final String component2() {
        return this.ctaText;
    }

    public final String component3() {
        return this.ctaLink;
    }

    public final String component4() {
        return this.bgColor;
    }

    public final String component5() {
        return this.textColor;
    }

    public final CTASettings copy(Boolean bl2, String string2, String string3, String string4, String string5) {
        CTASettings cTASettings = new CTASettings(bl2, string2, string3, string4, string5);
        return cTASettings;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CTASettings;
        if (!bl3) {
            return false;
        }
        object = (CTASettings)object;
        Object object2 = this.enable;
        Object object3 = ((CTASettings)object).enable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaText;
        object3 = ((CTASettings)object).ctaText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaLink;
        object3 = ((CTASettings)object).ctaLink;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bgColor;
        object3 = ((CTASettings)object).bgColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.textColor;
        object = ((CTASettings)object).textColor;
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
        Boolean bl2 = this.enable;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        String string2 = this.ctaText;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.ctaLink;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.bgColor;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.textColor;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        String string2 = this.ctaText;
        String string3 = this.ctaLink;
        String string4 = this.bgColor;
        String string5 = this.textColor;
        StringBuilder stringBuilder = new StringBuilder("CTASettings(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", ctaText=");
        stringBuilder.append(string2);
        stringBuilder.append(", ctaLink=");
        X50.a(stringBuilder, string3, ", bgColor=", string4, ", textColor=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

