/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import kotlin.jvm.internal.Intrinsics;

public final class AjiogramInterventions {
    public static final int $stable;
    private final Boolean master;
    private final Boolean pdp_tag_enabled;
    private final Boolean pdp_widget_autoscroll_enabled;
    private final String pdp_widget_cta;
    private final Boolean pdp_widget_enabled;
    private final String pdp_widget_title;
    private final Boolean plp_tag_enabled;
    private final String tag_bg_color;
    private final String tag_image;
    private final String tag_text;
    private final String tag_text_color;

    public AjiogramInterventions(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.master = bl2;
        this.plp_tag_enabled = bl3;
        this.pdp_tag_enabled = bl4;
        this.pdp_widget_enabled = bl5;
        this.pdp_widget_autoscroll_enabled = bl6;
        this.tag_image = string2;
        this.tag_text = string3;
        this.tag_bg_color = string4;
        this.tag_text_color = string5;
        this.pdp_widget_title = string6;
        this.pdp_widget_cta = string7;
    }

    public static /* synthetic */ AjiogramInterventions copy$default(AjiogramInterventions ajiogramInterventions, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6, String string7, int n3, Object object) {
        AjiogramInterventions ajiogramInterventions2 = ajiogramInterventions;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl7 = n7 != 0 ? ajiogramInterventions.master : bl2;
        int n8 = n4 & 2;
        Boolean bl8 = n8 != 0 ? ajiogramInterventions2.plp_tag_enabled : bl3;
        int n10 = n4 & 4;
        Boolean bl9 = n10 != 0 ? ajiogramInterventions2.pdp_tag_enabled : bl4;
        int n14 = n4 & 8;
        Boolean bl10 = n14 != 0 ? ajiogramInterventions2.pdp_widget_enabled : bl5;
        int n15 = n4 & 0x10;
        Boolean bl11 = n15 != 0 ? ajiogramInterventions2.pdp_widget_autoscroll_enabled : bl6;
        int n16 = n4 & 0x20;
        String string8 = n16 != 0 ? ajiogramInterventions2.tag_image : string2;
        int n17 = n4 & 0x40;
        String string9 = n17 != 0 ? ajiogramInterventions2.tag_text : string3;
        int n18 = n4 & 0x80;
        String string10 = n18 != 0 ? ajiogramInterventions2.tag_bg_color : string4;
        int n19 = n4 & 0x100;
        String string11 = n19 != 0 ? ajiogramInterventions2.tag_text_color : string5;
        int n20 = n4 & 0x200;
        String string12 = n20 != 0 ? ajiogramInterventions2.pdp_widget_title : string6;
        String string13 = (n4 &= 0x400) != 0 ? ajiogramInterventions2.pdp_widget_cta : string7;
        bl2 = bl7;
        bl3 = bl8;
        bl4 = bl9;
        bl5 = bl10;
        bl6 = bl11;
        string2 = string8;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        return ajiogramInterventions.copy(bl7, bl8, bl9, bl10, bl11, string8, string9, string10, string11, string12, string13);
    }

    public final Boolean component1() {
        return this.master;
    }

    public final String component10() {
        return this.pdp_widget_title;
    }

    public final String component11() {
        return this.pdp_widget_cta;
    }

    public final Boolean component2() {
        return this.plp_tag_enabled;
    }

    public final Boolean component3() {
        return this.pdp_tag_enabled;
    }

    public final Boolean component4() {
        return this.pdp_widget_enabled;
    }

    public final Boolean component5() {
        return this.pdp_widget_autoscroll_enabled;
    }

    public final String component6() {
        return this.tag_image;
    }

    public final String component7() {
        return this.tag_text;
    }

    public final String component8() {
        return this.tag_bg_color;
    }

    public final String component9() {
        return this.tag_text_color;
    }

    public final AjiogramInterventions copy(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6, String string7) {
        AjiogramInterventions ajiogramInterventions = new AjiogramInterventions(bl2, bl3, bl4, bl5, bl6, string2, string3, string4, string5, string6, string7);
        return ajiogramInterventions;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjiogramInterventions;
        if (!bl3) {
            return false;
        }
        object = (AjiogramInterventions)object;
        Object object2 = this.master;
        Object object3 = ((AjiogramInterventions)object).master;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plp_tag_enabled;
        object3 = ((AjiogramInterventions)object).plp_tag_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdp_tag_enabled;
        object3 = ((AjiogramInterventions)object).pdp_tag_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdp_widget_enabled;
        object3 = ((AjiogramInterventions)object).pdp_widget_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdp_widget_autoscroll_enabled;
        object3 = ((AjiogramInterventions)object).pdp_widget_autoscroll_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tag_image;
        object3 = ((AjiogramInterventions)object).tag_image;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tag_text;
        object3 = ((AjiogramInterventions)object).tag_text;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tag_bg_color;
        object3 = ((AjiogramInterventions)object).tag_bg_color;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tag_text_color;
        object3 = ((AjiogramInterventions)object).tag_text_color;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdp_widget_title;
        object3 = ((AjiogramInterventions)object).pdp_widget_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pdp_widget_cta;
        object = ((AjiogramInterventions)object).pdp_widget_cta;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getMaster() {
        return this.master;
    }

    public final Boolean getPdp_tag_enabled() {
        return this.pdp_tag_enabled;
    }

    public final Boolean getPdp_widget_autoscroll_enabled() {
        return this.pdp_widget_autoscroll_enabled;
    }

    public final String getPdp_widget_cta() {
        return this.pdp_widget_cta;
    }

    public final Boolean getPdp_widget_enabled() {
        return this.pdp_widget_enabled;
    }

    public final String getPdp_widget_title() {
        return this.pdp_widget_title;
    }

    public final Boolean getPlp_tag_enabled() {
        return this.plp_tag_enabled;
    }

    public final String getTag_bg_color() {
        return this.tag_bg_color;
    }

    public final String getTag_image() {
        return this.tag_image;
    }

    public final String getTag_text() {
        return this.tag_text;
    }

    public final String getTag_text_color() {
        return this.tag_text_color;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.master;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.plp_tag_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdp_tag_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdp_widget_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdp_widget_autoscroll_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tag_image;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tag_text;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tag_bg_color;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tag_text_color;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdp_widget_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pdp_widget_cta;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.master;
        Boolean bl3 = this.plp_tag_enabled;
        Boolean bl4 = this.pdp_tag_enabled;
        Boolean bl5 = this.pdp_widget_enabled;
        Boolean bl6 = this.pdp_widget_autoscroll_enabled;
        String string2 = this.tag_image;
        String string3 = this.tag_text;
        String string4 = this.tag_bg_color;
        String string5 = this.tag_text_color;
        String string6 = this.pdp_widget_title;
        String string7 = this.pdp_widget_cta;
        StringBuilder stringBuilder = new StringBuilder("AjiogramInterventions(master=");
        stringBuilder.append(bl2);
        stringBuilder.append(", plp_tag_enabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(", pdp_tag_enabled=");
        stringBuilder.append(bl4);
        stringBuilder.append(", pdp_widget_enabled=");
        stringBuilder.append(bl5);
        stringBuilder.append(", pdp_widget_autoscroll_enabled=");
        xi0_2.a(bl6, ", tag_image=", string2, ", tag_text=", stringBuilder);
        X50.a(stringBuilder, string3, ", tag_bg_color=", string4, ", tag_text_color=");
        X50.a(stringBuilder, string5, ", pdp_widget_title=", string6, ", pdp_widget_cta=");
        return h30_0.a(stringBuilder, string7, ")");
    }
}

