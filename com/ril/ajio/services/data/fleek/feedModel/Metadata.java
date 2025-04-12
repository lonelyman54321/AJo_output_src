/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Metadata {
    private String altText;
    private String aspectRatio;
    private Boolean autoplay;
    private String carouselTimer;
    private String duration;
    private String event;
    private Double height;
    private Boolean mute;
    private String openInNewTab;
    private String player;
    private Double size;
    private String unit;
    private String videoDuration;
    private Double width;

    public Metadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public Metadata(String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, Double d2, Boolean bl3, Double d5, Double d7, String string8, String string9, String string10) {
        this.altText = string2;
        this.openInNewTab = string3;
        this.aspectRatio = string4;
        this.event = string5;
        this.player = string6;
        this.autoplay = bl2;
        this.duration = string7;
        this.height = d2;
        this.mute = bl3;
        this.size = d5;
        this.width = d7;
        this.carouselTimer = string8;
        this.videoDuration = string9;
        this.unit = string10;
    }

    public /* synthetic */ Metadata(String object, String string2, String string3, String string4, String string5, Boolean object2, String object3, Double object4, Boolean comparable, Double constable, Double d2, String object5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        Double d5;
        Double d7;
        Boolean bl2;
        Double d9;
        String string10;
        Boolean bl3;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = null;
        if (n7 != 0) {
            n7 = 0;
            string15 = null;
        } else {
            string15 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            bl3 = null;
        } else {
            bl3 = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string10 = null;
        } else {
            string10 = object3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            d9 = null;
        } else {
            d9 = object4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            bl2 = null;
        } else {
            bl2 = comparable;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            d7 = null;
        } else {
            d7 = constable;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            d5 = null;
        } else {
            d5 = d2;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string9 = null;
        } else {
            string9 = object5;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x2000) == 0) {
            string16 = string7;
        }
        object = this;
        string2 = string15;
        string3 = string14;
        string4 = string13;
        string5 = string12;
        object2 = string11;
        object3 = bl3;
        object4 = string10;
        comparable = d9;
        constable = bl2;
        d2 = d7;
        object5 = d5;
        string6 = string9;
        string7 = string8;
        this(string15, string14, string13, string12, string11, bl3, string10, d9, bl2, d7, d5, string9, string8, string16);
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, Double d2, Boolean bl3, Double d5, Double d7, String string8, String string9, String string10, int n3, Object object) {
        Metadata metadata2 = metadata;
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = n7 != 0 ? metadata.altText : string2;
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? metadata2.openInNewTab : string3;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? metadata2.aspectRatio : string4;
        int n14 = n4 & 8;
        String string14 = n14 != 0 ? metadata2.event : string5;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? metadata2.player : string6;
        int n16 = n4 & 0x20;
        Boolean bl4 = n16 != 0 ? metadata2.autoplay : bl2;
        int n17 = n4 & 0x40;
        String string16 = n17 != 0 ? metadata2.duration : string7;
        int n18 = n4 & 0x80;
        Double d9 = n18 != 0 ? metadata2.height : d2;
        int n19 = n4 & 0x100;
        Boolean bl5 = n19 != 0 ? metadata2.mute : bl3;
        int n20 = n4 & 0x200;
        Double d12 = n20 != 0 ? metadata2.size : d5;
        int n21 = n4 & 0x400;
        Double d13 = n21 != 0 ? metadata2.width : d7;
        int n22 = n4 & 0x800;
        String string17 = n22 != 0 ? metadata2.carouselTimer : string8;
        int n24 = n4 & 0x1000;
        String string18 = n24 != 0 ? metadata2.videoDuration : string9;
        String string19 = (n4 &= 0x2000) != 0 ? metadata2.unit : string10;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        bl2 = bl4;
        string7 = string16;
        d2 = d9;
        bl3 = bl5;
        d5 = d12;
        d7 = d13;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        return metadata.copy(string11, string12, string13, string14, string15, bl4, string16, d9, bl5, d12, d13, string17, string18, string19);
    }

    public final String component1() {
        return this.altText;
    }

    public final Double component10() {
        return this.size;
    }

    public final Double component11() {
        return this.width;
    }

    public final String component12() {
        return this.carouselTimer;
    }

    public final String component13() {
        return this.videoDuration;
    }

    public final String component14() {
        return this.unit;
    }

    public final String component2() {
        return this.openInNewTab;
    }

    public final String component3() {
        return this.aspectRatio;
    }

    public final String component4() {
        return this.event;
    }

    public final String component5() {
        return this.player;
    }

    public final Boolean component6() {
        return this.autoplay;
    }

    public final String component7() {
        return this.duration;
    }

    public final Double component8() {
        return this.height;
    }

    public final Boolean component9() {
        return this.mute;
    }

    public final Metadata copy(String string2, String string3, String string4, String string5, String string6, Boolean bl2, String string7, Double d2, Boolean bl3, Double d5, Double d7, String string8, String string9, String string10) {
        Metadata metadata = new Metadata(string2, string3, string4, string5, string6, bl2, string7, d2, bl3, d5, d7, string8, string9, string10);
        return metadata;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Metadata;
        if (!bl3) {
            return false;
        }
        object = (Metadata)object;
        Object object2 = this.altText;
        Object object3 = ((Metadata)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.openInNewTab;
        object3 = ((Metadata)object).openInNewTab;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.aspectRatio;
        object3 = ((Metadata)object).aspectRatio;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.event;
        object3 = ((Metadata)object).event;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.player;
        object3 = ((Metadata)object).player;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autoplay;
        object3 = ((Metadata)object).autoplay;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.duration;
        object3 = ((Metadata)object).duration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((Metadata)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mute;
        object3 = ((Metadata)object).mute;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.size;
        object3 = ((Metadata)object).size;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Metadata)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.carouselTimer;
        object3 = ((Metadata)object).carouselTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.videoDuration;
        object3 = ((Metadata)object).videoDuration;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.unit;
        object = ((Metadata)object).unit;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final Boolean getAutoplay() {
        return this.autoplay;
    }

    public final String getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getEvent() {
        return this.event;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final Boolean getMute() {
        return this.mute;
    }

    public final String getOpenInNewTab() {
        return this.openInNewTab;
    }

    public final String getPlayer() {
        return this.player;
    }

    public final Double getSize() {
        return this.size;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getVideoDuration() {
        return this.videoDuration;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.altText;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.openInNewTab;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.aspectRatio;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.event;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.player;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.autoplay;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.duration;
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
        object = this.mute;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.size;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.carouselTimer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.videoDuration;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.unit;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setAspectRatio(String string2) {
        this.aspectRatio = string2;
    }

    public final void setAutoplay(Boolean bl2) {
        this.autoplay = bl2;
    }

    public final void setCarouselTimer(String string2) {
        this.carouselTimer = string2;
    }

    public final void setDuration(String string2) {
        this.duration = string2;
    }

    public final void setEvent(String string2) {
        this.event = string2;
    }

    public final void setHeight(Double d2) {
        this.height = d2;
    }

    public final void setMute(Boolean bl2) {
        this.mute = bl2;
    }

    public final void setOpenInNewTab(String string2) {
        this.openInNewTab = string2;
    }

    public final void setPlayer(String string2) {
        this.player = string2;
    }

    public final void setSize(Double d2) {
        this.size = d2;
    }

    public final void setUnit(String string2) {
        this.unit = string2;
    }

    public final void setVideoDuration(String string2) {
        this.videoDuration = string2;
    }

    public final void setWidth(Double d2) {
        this.width = d2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.altText;
        String string3 = this.openInNewTab;
        String string4 = this.aspectRatio;
        String string5 = this.event;
        String string6 = this.player;
        Boolean bl2 = this.autoplay;
        String string7 = this.duration;
        Double d2 = this.height;
        Boolean bl3 = this.mute;
        Double d5 = this.size;
        Double d7 = this.width;
        String string8 = this.carouselTimer;
        String string9 = this.videoDuration;
        String string10 = this.unit;
        object = og_1.a("Metadata(altText=", string2, ", openInNewTab=", string3, ", aspectRatio=");
        X50.a((StringBuilder)object, string4, ", event=", string5, ", player=");
        vw0_1.a(bl2, string6, ", autoplay=", ", duration=", (StringBuilder)object);
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", height=");
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", mute=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", size=");
        ((StringBuilder)object).append(d5);
        ((StringBuilder)object).append(", width=");
        ((StringBuilder)object).append(d7);
        ((StringBuilder)object).append(", carouselTimer=");
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", videoDuration=");
        string4 = string9;
        return ko_0.a((StringBuilder)object, string9, ", unit=", string10, ")");
    }
}

