/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerTypeEnum;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerData {
    private int actualHeight;
    private int actualWidth;
    private String adSpotId;
    private String altText;
    private AudioSettings audioSettings;
    private int bannerAdIndex;
    private BannerAdsMetaData bannerAdsMetaData;
    private String bannerType;
    private BannerTypeEnum bannerTypeEnum;
    private String bannerUrl;
    private CTASettings ctaSettings;
    private Long duration;
    private DynamicPageMetadata dynamicPageMetadata;
    private Boolean enableAdsOnPlp;
    private String extendedUrl;
    private String feedLogic;
    private int height;
    private List hotspots;
    private Boolean isAdBanner;
    private boolean isAnalyticsEventPushed;
    private BannerTypeEnum mediaType;
    private Integer noOfproducts;
    private Integer productCount;
    private String productIds;
    private Boolean showDefault;
    private boolean showTimer;
    private List subComponents;
    private String thumbnailImage;
    private Long timerEndTime;
    private String timerLabel;
    private String uuid;
    private VideoSetting videoSettings;
    private String widgetLevel;
    private int width;

    public BannerData(String string2, int n3, int n4, boolean bl2, Long l2, List list, List list2, boolean bl3, String string3, Integer n7, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, BannerTypeEnum bannerTypeEnum, Long l3, BannerTypeEnum bannerTypeEnum2, String string8, Boolean bl4, String string9, String string10, Integer n8, Boolean bl5, String string11, int n10, int n14, int n15, String string12, Boolean bl6, BannerAdsMetaData bannerAdsMetaData) {
        this.bannerUrl = string2;
        this.width = n3;
        this.height = n4;
        this.showTimer = bl2;
        this.timerEndTime = l2;
        this.hotspots = list;
        this.subComponents = list2;
        this.isAnalyticsEventPushed = bl3;
        this.productIds = string3;
        this.productCount = n7;
        this.dynamicPageMetadata = dynamicPageMetadata;
        this.uuid = string4;
        this.timerLabel = string5;
        this.bannerType = string6;
        this.thumbnailImage = string7;
        this.videoSettings = videoSetting;
        this.audioSettings = audioSettings;
        this.ctaSettings = cTASettings;
        this.bannerTypeEnum = bannerTypeEnum;
        this.duration = l3;
        this.mediaType = bannerTypeEnum2;
        this.extendedUrl = string8;
        this.enableAdsOnPlp = bl4;
        this.widgetLevel = string9;
        this.feedLogic = string10;
        this.noOfproducts = n8;
        this.isAdBanner = bl5;
        this.adSpotId = string11;
        this.actualWidth = n10;
        this.actualHeight = n14;
        this.bannerAdIndex = n15;
        this.altText = string12;
        this.showDefault = bl6;
        this.bannerAdsMetaData = bannerAdsMetaData;
    }

    public /* synthetic */ BannerData(String string2, int n3, int n4, boolean bl2, Long l2, List list, List list2, boolean bl3, String string3, Integer n7, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, BannerTypeEnum bannerTypeEnum, Long l3, BannerTypeEnum bannerTypeEnum2, String string8, Boolean bl4, String string9, String string10, Integer n8, Boolean bl5, String string11, int n10, int n14, int n15, String string12, Boolean bl6, BannerAdsMetaData bannerAdsMetaData, int n16, int n17, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl7;
        boolean bl8;
        Boolean bl9;
        int n18 = n16;
        int n19 = n16 & 1;
        String string13 = n19 != 0 ? null : string2;
        n19 = n18 & 0x10;
        Long l4 = n19 != 0 ? null : l2;
        n19 = n18 & 0x20;
        List list3 = n19 != 0 ? null : list;
        n19 = n18 & 0x40;
        List list4 = n19 != 0 ? null : list2;
        n19 = n18 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            bl9 = null;
            bl8 = false;
        } else {
            bl8 = bl3;
        }
        n19 = n18 & 0x100;
        String string14 = n19 != 0 ? null : string3;
        n19 = n18 & 0x200;
        Integer n20 = n19 != 0 ? null : n7;
        n19 = n18 & 0x400;
        DynamicPageMetadata dynamicPageMetadata2 = n19 != 0 ? null : dynamicPageMetadata;
        n19 = n18 & 0x800;
        String string15 = n19 != 0 ? null : string4;
        n19 = n18 & 0x1000;
        String string16 = n19 != 0 ? null : string5;
        n19 = n18 & 0x2000;
        String string17 = n19 != 0 ? null : string6;
        n19 = n18 & 0x4000;
        String string18 = n19 != 0 ? null : string7;
        n19 = 0x8000 & n18;
        VideoSetting videoSetting2 = n19 != 0 ? null : videoSetting;
        n19 = 0x10000 & n18;
        AudioSettings audioSettings2 = n19 != 0 ? null : audioSettings;
        n19 = 0x20000 & n18;
        CTASettings cTASettings2 = n19 != 0 ? null : cTASettings;
        n19 = 0x40000 & n18;
        BannerTypeEnum bannerTypeEnum3 = n19 != 0 ? null : bannerTypeEnum;
        n19 = 0x80000 & n18;
        Long l7 = n19 != 0 ? null : l3;
        n19 = 0x100000 & n18;
        BannerTypeEnum bannerTypeEnum4 = n19 != 0 ? null : bannerTypeEnum2;
        n19 = 0x200000 & n18;
        String string19 = n19 != 0 ? null : string8;
        n19 = 0x400000 & n18;
        Boolean bl10 = n19 != 0 ? (bl9 = Boolean.TRUE) : bl4;
        n19 = 0x800000 & n18;
        String string20 = n19 != 0 ? null : string9;
        n19 = 0x1000000 & n18;
        String string21 = n19 != 0 ? null : string10;
        n19 = 0x2000000 & n18;
        Integer n21 = n19 != 0 ? null : n8;
        n19 = 0x4000000 & n18;
        Boolean bl11 = n19 != 0 ? (bl9 = Boolean.FALSE) : bl5;
        n19 = 0x8000000 & n18;
        String string22 = n19 != 0 ? null : string11;
        n19 = -1 << -1;
        String string23 = (n18 &= n19) != 0 ? null : string12;
        n18 = n17 & 1;
        Boolean bl12 = n18 != 0 ? (bl7 = Boolean.FALSE) : bl6;
        n18 = n17 & 2;
        BannerAdsMetaData bannerAdsMetaData2 = n18 != 0 ? null : bannerAdsMetaData;
        this(string13, n3, n4, bl2, l4, list3, list4, bl8, string14, n20, dynamicPageMetadata2, string15, string16, string17, string18, videoSetting2, audioSettings2, cTASettings2, bannerTypeEnum3, l7, bannerTypeEnum4, string19, bl10, string20, string21, n21, bl11, string22, n10, n14, n15, string23, bl12, bannerAdsMetaData2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BannerData copy$default(BannerData bannerData, String string2, int n3, int n4, boolean bl2, Long l2, List list, List list2, boolean bl3, String string3, Integer n7, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting object, AudioSettings object2, CTASettings object3, BannerTypeEnum object4, Long object5, BannerTypeEnum object6, String object7, Boolean object8, String object9, String object10, Integer object11, Boolean object12, String object13, int n8, int n10, int n14, String string8, Boolean object14, BannerAdsMetaData object15, int n15, int n16, Object object16) {
        void var51_57;
        void var44_47;
        BannerData bannerData2 = bannerData;
        int n17 = n15;
        int n18 = n15 & 1;
        String string9 = n18 != 0 ? bannerData.bannerUrl : string2;
        int n19 = n17 & 2;
        n19 = n19 != 0 ? bannerData2.width : n3;
        int n20 = n17 & 4;
        n20 = n20 != 0 ? bannerData2.height : n4;
        int bl4 = n17 & 8;
        if (bl4 != 0) {
            boolean bl5 = bannerData2.showTimer;
        } else {
            boolean bl6 = bl2;
        }
        int n21 = n17 & 0x10;
        Long l3 = n21 != 0 ? bannerData2.timerEndTime : l2;
        int n22 = n17 & 0x20;
        List list3 = n22 != 0 ? bannerData2.hotspots : list;
        int n24 = n17 & 0x40;
        List list4 = n24 != 0 ? bannerData2.subComponents : list2;
        int n25 = n17 & 0x80;
        if (n25 != 0) {
            boolean bl7 = bannerData2.isAnalyticsEventPushed;
        } else {
            boolean bl8 = bl3;
        }
        int n26 = n17 & 0x100;
        String string10 = n26 != 0 ? bannerData2.productIds : string3;
        int n27 = n17 & 0x200;
        Integer n28 = n27 != 0 ? bannerData2.productCount : n7;
        int n29 = n17 & 0x400;
        DynamicPageMetadata dynamicPageMetadata2 = n29 != 0 ? bannerData2.dynamicPageMetadata : dynamicPageMetadata;
        int n30 = n17 & 0x800;
        String string11 = n30 != 0 ? bannerData2.uuid : string4;
        int n32 = n17 & 0x1000;
        String string12 = n32 != 0 ? bannerData2.timerLabel : string5;
        int n34 = n17 & 0x2000;
        Object object17 = n34 != 0 ? bannerData2.bannerType : string6;
        string6 = object17;
        n34 = n17 & 0x4000;
        object17 = n34 != 0 ? bannerData2.thumbnailImage : string7;
        int n35 = n17 & 0x8000;
        string7 = object17;
        object17 = n35 != 0 ? bannerData2.videoSettings : object;
        n35 = n17 & 0x10000;
        object = object17;
        object17 = n35 != 0 ? bannerData2.audioSettings : object2;
        n35 = n17 & 0x20000;
        object2 = object17;
        object17 = n35 != 0 ? bannerData2.ctaSettings : object3;
        n35 = n17 & 0x40000;
        object3 = object17;
        object17 = n35 != 0 ? bannerData2.bannerTypeEnum : object4;
        n35 = n17 & 0x80000;
        object4 = object17;
        object17 = n35 != 0 ? bannerData2.duration : object5;
        n35 = n17 & 0x100000;
        object5 = object17;
        object17 = n35 != 0 ? bannerData2.mediaType : object6;
        n35 = n17 & 0x200000;
        object6 = object17;
        object17 = n35 != 0 ? bannerData2.extendedUrl : object7;
        n35 = n17 & 0x400000;
        object7 = object17;
        object17 = n35 != 0 ? bannerData2.enableAdsOnPlp : object8;
        n35 = n17 & 0x800000;
        object8 = object17;
        object17 = n35 != 0 ? bannerData2.widgetLevel : object9;
        n35 = n17 & 0x1000000;
        object9 = object17;
        object17 = n35 != 0 ? bannerData2.feedLogic : object10;
        n35 = n17 & 0x2000000;
        object10 = object17;
        object17 = n35 != 0 ? bannerData2.noOfproducts : object11;
        n35 = n17 & 0x4000000;
        object11 = object17;
        object17 = n35 != 0 ? bannerData2.isAdBanner : object12;
        n35 = n17 & 0x8000000;
        object12 = object17;
        object17 = n35 != 0 ? bannerData2.adSpotId : object13;
        n35 = n17 & 0x10000000;
        object13 = object17;
        n34 = n35 != 0 ? bannerData2.actualWidth : n8;
        n35 = n17 & 0x20000000;
        n8 = n34;
        n34 = n35 != 0 ? bannerData2.actualHeight : n10;
        n35 = n17 & 0x40000000;
        n10 = n34;
        n34 = n35 != 0 ? bannerData2.bannerAdIndex : n14;
        n35 = -1 << -1;
        Object object18 = (n17 &= n35) != 0 ? bannerData2.altText : string8;
        n35 = n16 & 1;
        string8 = object18;
        object18 = n35 != 0 ? bannerData2.showDefault : object14;
        n35 = n16 & 2;
        object14 = object18;
        object18 = n35 != 0 ? bannerData2.bannerAdsMetaData : object15;
        string2 = string9;
        n3 = n19;
        n4 = n20;
        bl2 = var44_47;
        l2 = l3;
        list = list3;
        list2 = list4;
        bl3 = var51_57;
        string3 = string10;
        n7 = n28;
        dynamicPageMetadata = dynamicPageMetadata2;
        string4 = string11;
        string5 = string12;
        n14 = n34;
        object15 = object18;
        return bannerData.copy(string9, n19, n20, (boolean)var44_47, l3, list3, list4, (boolean)var51_57, string10, n28, dynamicPageMetadata2, string11, string12, string6, string7, (VideoSetting)object, (AudioSettings)object2, (CTASettings)object3, (BannerTypeEnum)((Object)object4), (Long)object5, (BannerTypeEnum)((Object)object6), (String)object7, (Boolean)object8, (String)object9, (String)object10, (Integer)object11, (Boolean)object12, (String)object13, n8, n10, n34, string8, (Boolean)object14, (BannerAdsMetaData)object18);
    }

    public final String component1() {
        return this.bannerUrl;
    }

    public final Integer component10() {
        return this.productCount;
    }

    public final DynamicPageMetadata component11() {
        return this.dynamicPageMetadata;
    }

    public final String component12() {
        return this.uuid;
    }

    public final String component13() {
        return this.timerLabel;
    }

    public final String component14() {
        return this.bannerType;
    }

    public final String component15() {
        return this.thumbnailImage;
    }

    public final VideoSetting component16() {
        return this.videoSettings;
    }

    public final AudioSettings component17() {
        return this.audioSettings;
    }

    public final CTASettings component18() {
        return this.ctaSettings;
    }

    public final BannerTypeEnum component19() {
        return this.bannerTypeEnum;
    }

    public final int component2() {
        return this.width;
    }

    public final Long component20() {
        return this.duration;
    }

    public final BannerTypeEnum component21() {
        return this.mediaType;
    }

    public final String component22() {
        return this.extendedUrl;
    }

    public final Boolean component23() {
        return this.enableAdsOnPlp;
    }

    public final String component24() {
        return this.widgetLevel;
    }

    public final String component25() {
        return this.feedLogic;
    }

    public final Integer component26() {
        return this.noOfproducts;
    }

    public final Boolean component27() {
        return this.isAdBanner;
    }

    public final String component28() {
        return this.adSpotId;
    }

    public final int component29() {
        return this.actualWidth;
    }

    public final int component3() {
        return this.height;
    }

    public final int component30() {
        return this.actualHeight;
    }

    public final int component31() {
        return this.bannerAdIndex;
    }

    public final String component32() {
        return this.altText;
    }

    public final Boolean component33() {
        return this.showDefault;
    }

    public final BannerAdsMetaData component34() {
        return this.bannerAdsMetaData;
    }

    public final boolean component4() {
        return this.showTimer;
    }

    public final Long component5() {
        return this.timerEndTime;
    }

    public final List component6() {
        return this.hotspots;
    }

    public final List component7() {
        return this.subComponents;
    }

    public final boolean component8() {
        return this.isAnalyticsEventPushed;
    }

    public final String component9() {
        return this.productIds;
    }

    public final BannerData copy(String string2, int n3, int n4, boolean bl2, Long l2, List list, List list2, boolean bl3, String string3, Integer n7, DynamicPageMetadata dynamicPageMetadata, String string4, String string5, String string6, String string7, VideoSetting videoSetting, AudioSettings audioSettings, CTASettings cTASettings, BannerTypeEnum bannerTypeEnum, Long l3, BannerTypeEnum bannerTypeEnum2, String string8, Boolean bl4, String string9, String string10, Integer n8, Boolean bl5, String string11, int n10, int n14, int n15, String string12, Boolean bl6, BannerAdsMetaData bannerAdsMetaData) {
        BannerData bannerData = new BannerData(string2, n3, n4, bl2, l2, list, list2, bl3, string3, n7, dynamicPageMetadata, string4, string5, string6, string7, videoSetting, audioSettings, cTASettings, bannerTypeEnum, l3, bannerTypeEnum2, string8, bl4, string9, string10, n8, bl5, string11, n10, n14, n15, string12, bl6, bannerAdsMetaData);
        return bannerData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof BannerData;
        if (n3 == 0) {
            return false;
        }
        object = (BannerData)object;
        Object object2 = this.bannerUrl;
        Object object3 = ((BannerData)object).bannerUrl;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.width;
        int n4 = ((BannerData)object).width;
        if (n3 != n4) {
            return false;
        }
        n3 = this.height;
        n4 = ((BannerData)object).height;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showTimer ? 1 : 0);
        n4 = (int)(((BannerData)object).showTimer ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.timerEndTime;
        object3 = ((BannerData)object).timerEndTime;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.hotspots;
        object3 = ((BannerData)object).hotspots;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.subComponents;
        object3 = ((BannerData)object).subComponents;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isAnalyticsEventPushed ? 1 : 0);
        n4 = (int)(((BannerData)object).isAnalyticsEventPushed ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.productIds;
        object3 = ((BannerData)object).productIds;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productCount;
        object3 = ((BannerData)object).productCount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.dynamicPageMetadata;
        object3 = ((BannerData)object).dynamicPageMetadata;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.uuid;
        object3 = ((BannerData)object).uuid;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.timerLabel;
        object3 = ((BannerData)object).timerLabel;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bannerType;
        object3 = ((BannerData)object).bannerType;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.thumbnailImage;
        object3 = ((BannerData)object).thumbnailImage;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.videoSettings;
        object3 = ((BannerData)object).videoSettings;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.audioSettings;
        object3 = ((BannerData)object).audioSettings;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.ctaSettings;
        object3 = ((BannerData)object).ctaSettings;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bannerTypeEnum;
        object3 = ((BannerData)object).bannerTypeEnum;
        if (object2 != object3) {
            return false;
        }
        object2 = this.duration;
        object3 = ((BannerData)object).duration;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.mediaType;
        object3 = ((BannerData)object).mediaType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.extendedUrl;
        object3 = ((BannerData)object).extendedUrl;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.enableAdsOnPlp;
        object3 = ((BannerData)object).enableAdsOnPlp;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.widgetLevel;
        object3 = ((BannerData)object).widgetLevel;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.feedLogic;
        object3 = ((BannerData)object).feedLogic;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.noOfproducts;
        object3 = ((BannerData)object).noOfproducts;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isAdBanner;
        object3 = ((BannerData)object).isAdBanner;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.adSpotId;
        object3 = ((BannerData)object).adSpotId;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.actualWidth;
        n4 = ((BannerData)object).actualWidth;
        if (n3 != n4) {
            return false;
        }
        n3 = this.actualHeight;
        n4 = ((BannerData)object).actualHeight;
        if (n3 != n4) {
            return false;
        }
        n3 = this.bannerAdIndex;
        n4 = ((BannerData)object).bannerAdIndex;
        if (n3 != n4) {
            return false;
        }
        object2 = this.altText;
        object3 = ((BannerData)object).altText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.showDefault;
        object3 = ((BannerData)object).showDefault;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bannerAdsMetaData;
        object = ((BannerData)object).bannerAdsMetaData;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int getActualHeight() {
        return this.actualHeight;
    }

    public final int getActualWidth() {
        return this.actualWidth;
    }

    public final String getAdSpotId() {
        return this.adSpotId;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final AudioSettings getAudioSettings() {
        return this.audioSettings;
    }

    public final int getBannerAdIndex() {
        return this.bannerAdIndex;
    }

    public final BannerAdsMetaData getBannerAdsMetaData() {
        return this.bannerAdsMetaData;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final BannerTypeEnum getBannerTypeEnum() {
        return this.bannerTypeEnum;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final CTASettings getCtaSettings() {
        return this.ctaSettings;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final DynamicPageMetadata getDynamicPageMetadata() {
        return this.dynamicPageMetadata;
    }

    public final Boolean getEnableAdsOnPlp() {
        return this.enableAdsOnPlp;
    }

    public final String getExtendedUrl() {
        return this.extendedUrl;
    }

    public final String getFeedLogic() {
        return this.feedLogic;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List getHotspots() {
        return this.hotspots;
    }

    public final BannerTypeEnum getMediaType() {
        return this.mediaType;
    }

    public final Integer getNoOfproducts() {
        return this.noOfproducts;
    }

    public final Integer getProductCount() {
        return this.productCount;
    }

    public final String getProductIds() {
        return this.productIds;
    }

    public final Boolean getShowDefault() {
        return this.showDefault;
    }

    public final boolean getShowTimer() {
        return this.showTimer;
    }

    public final List getSubComponents() {
        return this.subComponents;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final Long getTimerEndTime() {
        return this.timerEndTime;
    }

    public final String getTimerLabel() {
        return this.timerLabel;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final VideoSetting getVideoSettings() {
        return this.videoSettings;
    }

    public final String getWidgetLevel() {
        return this.widgetLevel;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        String string2 = this.bannerUrl;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.width;
        n3 = (n3 + n7) * 31;
        n7 = this.height;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.showTimer ? 1 : 0);
        int n8 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        Object object = this.timerEndTime;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.hotspots;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.subComponents;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.isAnalyticsEventPushed ? 1 : 0);
        if (n7 != 0) {
            n8 = 1231;
        }
        n3 = (n3 + n8) * 31;
        object = this.productIds;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.productCount;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.dynamicPageMetadata;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((DynamicPageMetadata)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.uuid;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.timerLabel;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.bannerType;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.thumbnailImage;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.videoSettings;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((VideoSetting)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.audioSettings;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((AudioSettings)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.ctaSettings;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((CTASettings)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.bannerTypeEnum;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.duration;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.mediaType;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.extendedUrl;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.enableAdsOnPlp;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.widgetLevel;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.feedLogic;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.noOfproducts;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.isAdBanner;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.adSpotId;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        n7 = this.actualWidth;
        n3 = (n3 + n7) * 31;
        n7 = this.actualHeight;
        n3 = (n3 + n7) * 31;
        n7 = this.bannerAdIndex;
        n3 = (n3 + n7) * 31;
        object = this.altText;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.showDefault;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        object = this.bannerAdsMetaData;
        if (object != null) {
            n4 = ((BannerAdsMetaData)object).hashCode();
        }
        return n3 + n4;
    }

    public final Boolean isAdBanner() {
        return this.isAdBanner;
    }

    public final boolean isAnalyticsEventPushed() {
        return this.isAnalyticsEventPushed;
    }

    public final void setActualHeight(int n3) {
        this.actualHeight = n3;
    }

    public final void setActualWidth(int n3) {
        this.actualWidth = n3;
    }

    public final void setAdBanner(Boolean bl2) {
        this.isAdBanner = bl2;
    }

    public final void setAdSpotId(String string2) {
        this.adSpotId = string2;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setAnalyticsEventPushed(boolean bl2) {
        this.isAnalyticsEventPushed = bl2;
    }

    public final void setAudioSettings(AudioSettings audioSettings) {
        this.audioSettings = audioSettings;
    }

    public final void setBannerAdIndex(int n3) {
        this.bannerAdIndex = n3;
    }

    public final void setBannerAdsMetaData(BannerAdsMetaData bannerAdsMetaData) {
        this.bannerAdsMetaData = bannerAdsMetaData;
    }

    public final void setBannerType(String string2) {
        this.bannerType = string2;
    }

    public final void setBannerTypeEnum(BannerTypeEnum bannerTypeEnum) {
        this.bannerTypeEnum = bannerTypeEnum;
    }

    public final void setBannerUrl(String string2) {
        this.bannerUrl = string2;
    }

    public final void setCtaSettings(CTASettings cTASettings) {
        this.ctaSettings = cTASettings;
    }

    public final void setDuration(Long l2) {
        this.duration = l2;
    }

    public final void setDynamicPageMetadata(DynamicPageMetadata dynamicPageMetadata) {
        this.dynamicPageMetadata = dynamicPageMetadata;
    }

    public final void setEnableAdsOnPlp(Boolean bl2) {
        this.enableAdsOnPlp = bl2;
    }

    public final void setExtendedUrl(String string2) {
        this.extendedUrl = string2;
    }

    public final void setFeedLogic(String string2) {
        this.feedLogic = string2;
    }

    public final void setHeight(int n3) {
        this.height = n3;
    }

    public final void setHotspots(List list) {
        this.hotspots = list;
    }

    public final void setMediaType(BannerTypeEnum bannerTypeEnum) {
        this.mediaType = bannerTypeEnum;
    }

    public final void setNoOfproducts(Integer n3) {
        this.noOfproducts = n3;
    }

    public final void setProductCount(Integer n3) {
        this.productCount = n3;
    }

    public final void setProductIds(String string2) {
        this.productIds = string2;
    }

    public final void setShowDefault(Boolean bl2) {
        this.showDefault = bl2;
    }

    public final void setShowTimer(boolean bl2) {
        this.showTimer = bl2;
    }

    public final void setSubComponents(List list) {
        this.subComponents = list;
    }

    public final void setThumbnailImage(String string2) {
        this.thumbnailImage = string2;
    }

    public final void setTimerEndTime(Long l2) {
        this.timerEndTime = l2;
    }

    public final void setTimerLabel(String string2) {
        this.timerLabel = string2;
    }

    public final void setUuid(String string2) {
        this.uuid = string2;
    }

    public final void setVideoSettings(VideoSetting videoSetting) {
        this.videoSettings = videoSetting;
    }

    public final void setWidgetLevel(String string2) {
        this.widgetLevel = string2;
    }

    public final void setWidth(int n3) {
        this.width = n3;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.bannerUrl;
        int n3 = this.width;
        int n4 = this.height;
        int n7 = this.showTimer;
        Long l2 = this.timerEndTime;
        List list = this.hotspots;
        List list2 = this.subComponents;
        boolean bl2 = this.isAnalyticsEventPushed;
        String string2 = this.productIds;
        Integer n8 = this.productCount;
        DynamicPageMetadata dynamicPageMetadata = this.dynamicPageMetadata;
        String string3 = this.uuid;
        String string4 = this.timerLabel;
        String string5 = this.bannerType;
        String string6 = this.thumbnailImage;
        VideoSetting videoSetting = this.videoSettings;
        AudioSettings audioSettings = this.audioSettings;
        CTASettings cTASettings = this.ctaSettings;
        BannerTypeEnum bannerTypeEnum = this.bannerTypeEnum;
        Long l3 = this.duration;
        BannerTypeEnum bannerTypeEnum2 = this.mediaType;
        String string7 = this.extendedUrl;
        Boolean bl3 = this.enableAdsOnPlp;
        String string8 = this.widgetLevel;
        String string9 = this.feedLogic;
        Integer n10 = this.noOfproducts;
        Boolean bl4 = this.isAdBanner;
        String string10 = this.adSpotId;
        int n14 = this.actualWidth;
        int n15 = this.actualHeight;
        int n16 = this.bannerAdIndex;
        String string11 = this.altText;
        Boolean bl5 = this.showDefault;
        BannerAdsMetaData bannerAdsMetaData = this.bannerAdsMetaData;
        object = oe3_0.a(n3, "BannerData(bannerUrl=", (String)object2, ", width=", ", height=");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", showTimer=");
        ((StringBuilder)object).append(n7 != 0);
        ((StringBuilder)object).append(", timerEndTime=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(", hotspots=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", subComponents=");
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", isAnalyticsEventPushed=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", productIds=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", productCount=");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(", dynamicPageMetadata=");
        ((StringBuilder)object).append(dynamicPageMetadata);
        ((StringBuilder)object).append(", uuid=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", timerLabel=");
        X50.a((StringBuilder)object, string4, ", bannerType=", string5, ", thumbnailImage=");
        object2 = string6;
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", videoSettings=");
        object2 = videoSetting;
        ((StringBuilder)object).append(videoSetting);
        ((StringBuilder)object).append(", audioSettings=");
        object2 = audioSettings;
        ((StringBuilder)object).append(audioSettings);
        ((StringBuilder)object).append(", ctaSettings=");
        object2 = cTASettings;
        ((StringBuilder)object).append(cTASettings);
        ((StringBuilder)object).append(", bannerTypeEnum=");
        object2 = bannerTypeEnum;
        ((StringBuilder)object).append((Object)bannerTypeEnum);
        ((StringBuilder)object).append(", duration=");
        object2 = l3;
        ((StringBuilder)object).append(l3);
        ((StringBuilder)object).append(", mediaType=");
        object2 = bannerTypeEnum2;
        ((StringBuilder)object).append((Object)bannerTypeEnum2);
        ((StringBuilder)object).append(", extendedUrl=");
        object2 = string7;
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", enableAdsOnPlp=");
        xi0_2.a(bl3, ", widgetLevel=", string8, ", feedLogic=", (StringBuilder)object);
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", noOfproducts=");
        object2 = n10;
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append(", isAdBanner=");
        xi0_2.a(bl4, ", adSpotId=", string10, ", actualWidth=", (StringBuilder)object);
        n4 = n14;
        n7 = n15;
        m10.a((StringBuilder)object, n14, ", actualHeight=", n15, ", bannerAdIndex=");
        n4 = n16;
        h30_0.b((StringBuilder)object, n16, ", altText=", string11, ", showDefault=");
        object2 = bl5;
        ((StringBuilder)object).append(bl5);
        ((StringBuilder)object).append(", bannerAdsMetaData=");
        object2 = bannerAdsMetaData;
        ((StringBuilder)object).append(bannerAdsMetaData);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

