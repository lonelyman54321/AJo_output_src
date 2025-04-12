/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.AudioSettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.CTASettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata$Companion;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.VideoSetting$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class DynamicPageMetadata {
    public static final DynamicPageMetadata$Companion Companion;
    private final AudioSettings audioSettings;
    private final CTASettings ctaSettings;
    private Long duration;
    private String extendedImageUrl;
    private final String extendedUrl;
    private final String mediaType;
    private final String subTitle;
    private final String title;
    private final VideoSetting videoSettings;

    static {
        DynamicPageMetadata$Companion dynamicPageMetadata$Companion;
        Companion = dynamicPageMetadata$Companion = new DynamicPageMetadata$Companion(null);
    }

    public DynamicPageMetadata() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ DynamicPageMetadata(int n3, String string2, String string3, String string4, String string5, String string6, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l2, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.title = n4 == 0 ? null : string2;
        int n7 = n3 & 2;
        this.subTitle = n7 == 0 ? null : string3;
        n7 = n3 & 4;
        this.extendedImageUrl = n7 == 0 ? null : string4;
        n7 = n3 & 8;
        this.extendedUrl = n7 == 0 ? null : string5;
        n7 = n3 & 0x10;
        this.mediaType = n7 == 0 ? null : string6;
        n7 = n3 & 0x20;
        this.videoSettings = n7 == 0 ? null : videoSetting;
        n7 = n3 & 0x40;
        this.audioSettings = n7 == 0 ? null : audioSettings;
        n7 = n3 & 0x80;
        this.ctaSettings = n7 == 0 ? null : cTASettings;
        this.duration = (n3 &= 0x100) == 0 ? null : l2;
    }

    public DynamicPageMetadata(String string2, String string3, String string4, String string5, String string6, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l2) {
        this.title = string2;
        this.subTitle = string3;
        this.extendedImageUrl = string4;
        this.extendedUrl = string5;
        this.mediaType = string6;
        this.videoSettings = videoSetting;
        this.audioSettings = audioSettings;
        this.ctaSettings = cTASettings;
        this.duration = l2;
    }

    public /* synthetic */ DynamicPageMetadata(String object, String string2, String string3, String string4, String string5, VideoSetting object2, AudioSettings object3, CTASettings object4, Long object5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        CTASettings cTASettings;
        AudioSettings audioSettings;
        VideoSetting videoSetting;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        int n4 = n3;
        int n7 = n3 & 1;
        Long l2 = null;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            videoSetting = null;
        } else {
            videoSetting = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            audioSettings = null;
        } else {
            audioSettings = object3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            cTASettings = null;
        } else {
            cTASettings = object4;
        }
        if ((n4 &= 0x100) == 0) {
            l2 = object5;
        }
        object = this;
        string2 = string10;
        string3 = string9;
        string4 = string8;
        string5 = string7;
        object2 = string6;
        object3 = videoSetting;
        object4 = audioSettings;
        object5 = cTASettings;
        this(string10, string9, string8, string7, string6, videoSetting, audioSettings, cTASettings, l2);
    }

    public static /* synthetic */ DynamicPageMetadata copy$default(DynamicPageMetadata dynamicPageMetadata, String string2, String string3, String string4, String string5, String string6, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l2, int n3, Object object) {
        DynamicPageMetadata dynamicPageMetadata2 = dynamicPageMetadata;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? dynamicPageMetadata.title : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? dynamicPageMetadata2.subTitle : string3;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? dynamicPageMetadata2.extendedImageUrl : string4;
        int n14 = n4 & 8;
        String string10 = n14 != 0 ? dynamicPageMetadata2.extendedUrl : string5;
        int n15 = n4 & 0x10;
        String string11 = n15 != 0 ? dynamicPageMetadata2.mediaType : string6;
        int n16 = n4 & 0x20;
        VideoSetting videoSetting2 = n16 != 0 ? dynamicPageMetadata2.videoSettings : videoSetting;
        int n17 = n4 & 0x40;
        AudioSettings audioSettings2 = n17 != 0 ? dynamicPageMetadata2.audioSettings : audioSettings;
        int n18 = n4 & 0x80;
        CTASettings cTASettings2 = n18 != 0 ? dynamicPageMetadata2.ctaSettings : cTASettings;
        Long l3 = (n4 &= 0x100) != 0 ? dynamicPageMetadata2.duration : l2;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        videoSetting = videoSetting2;
        audioSettings = audioSettings2;
        cTASettings = cTASettings2;
        l2 = l3;
        return dynamicPageMetadata.copy(string7, string8, string9, string10, string11, videoSetting2, audioSettings2, cTASettings2, l3);
    }

    public static final /* synthetic */ void write$Self$shared_release(DynamicPageMetadata object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((DynamicPageMetadata)object).title) != null) {
            object3 = pe3_2.a;
            object2 = ((DynamicPageMetadata)object).title;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((DynamicPageMetadata)object).subTitle) != null) {
            object3 = pe3_2.a;
            object2 = ((DynamicPageMetadata)object).subTitle;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((DynamicPageMetadata)object).extendedImageUrl) != null) {
            object3 = pe3_2.a;
            object2 = ((DynamicPageMetadata)object).extendedImageUrl;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((DynamicPageMetadata)object).extendedUrl) != null) {
            object3 = pe3_2.a;
            object2 = ((DynamicPageMetadata)object).extendedUrl;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object3 = ((DynamicPageMetadata)object).mediaType) != null) {
            object3 = pe3_2.a;
            object2 = ((DynamicPageMetadata)object).mediaType;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 5)) || (object3 = ((DynamicPageMetadata)object).videoSettings) != null) {
            object3 = VideoSetting$$serializer.INSTANCE;
            object2 = ((DynamicPageMetadata)object).videoSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 6)) || (object3 = ((DynamicPageMetadata)object).audioSettings) != null) {
            object3 = AudioSettings$$serializer.INSTANCE;
            object2 = ((DynamicPageMetadata)object).audioSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 7)) || (object3 = ((DynamicPageMetadata)object).ctaSettings) != null) {
            object3 = CTASettings$$serializer.INSTANCE;
            object2 = ((DynamicPageMetadata)object).ctaSettings;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 8)) || (object3 = ((DynamicPageMetadata)object).duration) != null) {
            object3 = mb1_2.a;
            object = ((DynamicPageMetadata)object).duration;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.extendedImageUrl;
    }

    public final String component4() {
        return this.extendedUrl;
    }

    public final String component5() {
        return this.mediaType;
    }

    public final VideoSetting component6() {
        return this.videoSettings;
    }

    public final AudioSettings component7() {
        return this.audioSettings;
    }

    public final CTASettings component8() {
        return this.ctaSettings;
    }

    public final Long component9() {
        return this.duration;
    }

    public final DynamicPageMetadata copy(String string2, String string3, String string4, String string5, String string6, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, Long l2) {
        DynamicPageMetadata dynamicPageMetadata = new DynamicPageMetadata(string2, string3, string4, string5, string6, videoSetting, audioSettings, cTASettings, l2);
        return dynamicPageMetadata;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DynamicPageMetadata;
        if (!bl3) {
            return false;
        }
        object = (DynamicPageMetadata)object;
        Object object2 = this.title;
        Object object3 = ((DynamicPageMetadata)object).title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subTitle;
        object3 = ((DynamicPageMetadata)object).subTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extendedImageUrl;
        object3 = ((DynamicPageMetadata)object).extendedImageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extendedUrl;
        object3 = ((DynamicPageMetadata)object).extendedUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mediaType;
        object3 = ((DynamicPageMetadata)object).mediaType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.videoSettings;
        object3 = ((DynamicPageMetadata)object).videoSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.audioSettings;
        object3 = ((DynamicPageMetadata)object).audioSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaSettings;
        object3 = ((DynamicPageMetadata)object).ctaSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.duration;
        object = ((DynamicPageMetadata)object).duration;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AudioSettings getAudioSettings() {
        return this.audioSettings;
    }

    public final CTASettings getCtaSettings() {
        return this.ctaSettings;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getExtendedImageUrl() {
        return this.extendedImageUrl;
    }

    public final String getExtendedUrl() {
        return this.extendedUrl;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final VideoSetting getVideoSettings() {
        return this.videoSettings;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.subTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extendedImageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extendedUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mediaType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.videoSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((VideoSetting)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.audioSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AudioSettings)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctaSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CTASettings)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.duration;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setDuration(Long l2) {
        this.duration = l2;
    }

    public final void setExtendedImageUrl(String string2) {
        this.extendedImageUrl = string2;
    }

    public String toString() {
        CharSequence charSequence = this.title;
        String string2 = this.subTitle;
        String string3 = this.extendedImageUrl;
        String string4 = this.extendedUrl;
        String string5 = this.mediaType;
        VideoSetting videoSetting = this.videoSettings;
        AudioSettings audioSettings = this.audioSettings;
        CTASettings cTASettings = this.ctaSettings;
        Long l2 = this.duration;
        charSequence = og_1.a("DynamicPageMetadata(title=", (String)charSequence, ", subTitle=", string2, ", extendedImageUrl=");
        X50.a((StringBuilder)charSequence, string3, ", extendedUrl=", string4, ", mediaType=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", videoSettings=");
        ((StringBuilder)charSequence).append(videoSetting);
        ((StringBuilder)charSequence).append(", audioSettings=");
        ((StringBuilder)charSequence).append(audioSettings);
        ((StringBuilder)charSequence).append(", ctaSettings=");
        ((StringBuilder)charSequence).append(cTASettings);
        ((StringBuilder)charSequence).append(", duration=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

