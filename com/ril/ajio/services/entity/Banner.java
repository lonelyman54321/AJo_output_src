/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.services.entity.CtaSettings;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Banner {
    private final String adSpotId;
    private final String altText;
    private BannerAdsMetaData bannerAdsMetaData;
    private String bannerType;
    private String bannerUrl;
    private final CtaSettings ctaSettings;
    private final Boolean enableAdsOnPlp;
    private final String experimentId;
    private final Double height;
    private List hotspots;
    private final boolean isAdBanner;
    private boolean isAnalyticsEventPushed;
    private final boolean isCmsAdBanner;
    private final Boolean openInNewTab;
    private final Boolean showTimer;
    private String staticContent;
    private final List subComponents;
    private final List texts;
    private final String timerLabel;
    private final String timerType;
    private final Double width;

    public Banner(String string2, String string3, String string4, CtaSettings ctaSettings, Boolean bl2, String string5, Double d2, List list, boolean bl3, Boolean bl4, Boolean bl5, List list2, List list3, String string6, String string7, Double d5, boolean bl6, boolean bl7, String string8, BannerAdsMetaData bannerAdsMetaData, String string9) {
        this.altText = string2;
        this.bannerType = string3;
        this.bannerUrl = string4;
        this.ctaSettings = ctaSettings;
        this.enableAdsOnPlp = bl2;
        this.experimentId = string5;
        this.height = d2;
        this.hotspots = list;
        this.isAdBanner = bl3;
        this.openInNewTab = bl4;
        this.showTimer = bl5;
        this.subComponents = list2;
        this.texts = list3;
        this.timerLabel = string6;
        this.timerType = string7;
        this.width = d5;
        this.isAnalyticsEventPushed = bl6;
        this.isCmsAdBanner = bl7;
        this.adSpotId = string8;
        this.bannerAdsMetaData = bannerAdsMetaData;
        this.staticContent = string9;
    }

    public /* synthetic */ Banner(String string2, String string3, String string4, CtaSettings ctaSettings, Boolean bl2, String string5, Double d2, List list, boolean bl3, Boolean bl4, Boolean bl5, List list2, List list3, String string6, String string7, Double d5, boolean bl6, boolean bl7, String string8, BannerAdsMetaData bannerAdsMetaData, String string9, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? null : string2;
        n7 = n4 & 2;
        String string11 = n7 != 0 ? null : string3;
        n7 = n4 & 4;
        String string12 = n7 != 0 ? null : string4;
        n7 = n4 & 8;
        CtaSettings ctaSettings2 = n7 != 0 ? null : ctaSettings;
        n7 = n4 & 0x10;
        Boolean bl8 = n7 != 0 ? null : bl2;
        n7 = n4 & 0x20;
        String string13 = n7 != 0 ? null : string5;
        n7 = n4 & 0x40;
        Double d7 = n7 != 0 ? null : d2;
        n7 = n4 & 0x80;
        List list4 = n7 != 0 ? null : list;
        n7 = n4 & 0x100;
        boolean bl9 = n7 != 0 ? false : bl3;
        n7 = n4 & 0x200;
        Boolean bl10 = n7 != 0 ? null : bl4;
        n7 = n4 & 0x400;
        Boolean bl11 = n7 != 0 ? null : bl5;
        n7 = n4 & 0x800;
        List list5 = n7 != 0 ? null : list2;
        n7 = n4 & 0x1000;
        List list6 = n7 != 0 ? null : list3;
        n7 = n4 & 0x2000;
        String string14 = n7 != 0 ? null : string6;
        n7 = n4 & 0x4000;
        String string15 = n7 != 0 ? null : string7;
        n7 = 0x8000 & n4;
        Double d9 = n7 != 0 ? null : d5;
        n7 = 0x10000 & n4;
        boolean bl12 = n7 != 0 ? false : bl6;
        n7 = 0x40000 & n4;
        String string16 = n7 != 0 ? null : string8;
        n7 = 0x80000 & n4;
        BannerAdsMetaData bannerAdsMetaData2 = n7 != 0 ? null : bannerAdsMetaData;
        n7 = 0x100000;
        String string17 = (n4 &= n7) != 0 ? null : string9;
        this(string10, string11, string12, ctaSettings2, bl8, string13, d7, list4, bl9, bl10, bl11, list5, list6, string14, string15, d9, bl12, bl7, string16, bannerAdsMetaData2, string17);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Banner copy$default(Banner banner, String string2, String string3, String string4, CtaSettings ctaSettings, Boolean bl2, String string5, Double d2, List list, boolean bl3, Boolean bl4, Boolean bl5, List list2, List list3, String string6, String string7, Double object, boolean bl6, boolean bl7, String object2, BannerAdsMetaData object3, String string8, int n3, Object object4) {
        void var42_47;
        String string9;
        Object object5;
        Object object6;
        void var18_19;
        void var22_24;
        Banner banner2 = banner;
        int n4 = var22_24;
        int n7 = var22_24 & 1;
        String string10 = n7 != 0 ? banner.altText : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? banner2.bannerType : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? banner2.bannerUrl : string4;
        int n14 = n4 & 8;
        CtaSettings ctaSettings2 = n14 != 0 ? banner2.ctaSettings : ctaSettings;
        int n15 = n4 & 0x10;
        Boolean bl8 = n15 != 0 ? banner2.enableAdsOnPlp : bl2;
        int n16 = n4 & 0x20;
        String string13 = n16 != 0 ? banner2.experimentId : string5;
        int n17 = n4 & 0x40;
        Double d5 = n17 != 0 ? banner2.height : d2;
        int n18 = n4 & 0x80;
        List list4 = n18 != 0 ? banner2.hotspots : list;
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            boolean bl9 = banner2.isAdBanner;
        } else {
            boolean bl10 = bl3;
        }
        int n20 = n4 & 0x200;
        Boolean bl11 = n20 != 0 ? banner2.openInNewTab : bl4;
        int n21 = n4 & 0x400;
        Boolean bl12 = n21 != 0 ? banner2.showTimer : bl5;
        int n22 = n4 & 0x800;
        List list5 = n22 != 0 ? banner2.subComponents : list2;
        int n24 = n4 & 0x1000;
        List list6 = n24 != 0 ? banner2.texts : list3;
        boolean bl13 = n4 & 0x2000;
        Object object7 = bl13 ? banner2.timerLabel : string6;
        string6 = object7;
        bl13 = n4 & 0x4000;
        object7 = bl13 ? banner2.timerType : string7;
        int n25 = n4 & 0x8000;
        string7 = object7;
        object7 = n25 != 0 ? banner2.width : object;
        n25 = n4 & 0x10000;
        object = object7;
        bl13 = n25 != 0 ? (boolean)banner2.isAnalyticsEventPushed : (boolean)bl6;
        n25 = n4 & 0x20000;
        boolean bl14 = bl13;
        bl13 = n25 != 0 ? (boolean)banner2.isCmsAdBanner : var18_19;
        n25 = n4 & 0x40000;
        boolean bl15 = bl13;
        object7 = n25 != 0 ? banner2.adSpotId : object6;
        n25 = n4 & 0x80000;
        object6 = object7;
        object7 = n25 != 0 ? banner2.bannerAdsMetaData : object5;
        n25 = 0x100000;
        String string14 = (n4 &= n25) != 0 ? banner2.staticContent : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        ctaSettings = ctaSettings2;
        bl2 = bl8;
        string5 = string13;
        d2 = d5;
        list = list4;
        bl3 = var42_47;
        bl4 = bl11;
        bl5 = bl12;
        list2 = list5;
        list3 = list6;
        object5 = object7;
        string9 = string14;
        return banner.copy(string10, string11, string12, ctaSettings2, bl8, string13, d5, list4, (boolean)var42_47, bl11, bl12, list5, list6, string6, string7, (Double)object, bl14, bl15, (String)object6, (BannerAdsMetaData)object7, string14);
    }

    public final String component1() {
        return this.altText;
    }

    public final Boolean component10() {
        return this.openInNewTab;
    }

    public final Boolean component11() {
        return this.showTimer;
    }

    public final List component12() {
        return this.subComponents;
    }

    public final List component13() {
        return this.texts;
    }

    public final String component14() {
        return this.timerLabel;
    }

    public final String component15() {
        return this.timerType;
    }

    public final Double component16() {
        return this.width;
    }

    public final boolean component17() {
        return this.isAnalyticsEventPushed;
    }

    public final boolean component18() {
        return this.isCmsAdBanner;
    }

    public final String component19() {
        return this.adSpotId;
    }

    public final String component2() {
        return this.bannerType;
    }

    public final BannerAdsMetaData component20() {
        return this.bannerAdsMetaData;
    }

    public final String component21() {
        return this.staticContent;
    }

    public final String component3() {
        return this.bannerUrl;
    }

    public final CtaSettings component4() {
        return this.ctaSettings;
    }

    public final Boolean component5() {
        return this.enableAdsOnPlp;
    }

    public final String component6() {
        return this.experimentId;
    }

    public final Double component7() {
        return this.height;
    }

    public final List component8() {
        return this.hotspots;
    }

    public final boolean component9() {
        return this.isAdBanner;
    }

    public final Banner copy(String string2, String string3, String string4, CtaSettings ctaSettings, Boolean bl2, String string5, Double d2, List list, boolean bl3, Boolean bl4, Boolean bl5, List list2, List list3, String string6, String string7, Double d5, boolean bl6, boolean bl7, String string8, BannerAdsMetaData bannerAdsMetaData, String string9) {
        Banner banner = new Banner(string2, string3, string4, ctaSettings, bl2, string5, d2, list, bl3, bl4, bl5, list2, list3, string6, string7, d5, bl6, bl7, string8, bannerAdsMetaData, string9);
        return banner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Banner;
        if (!bl3) {
            return false;
        }
        object = (Banner)object;
        Object object2 = this.altText;
        Object object3 = ((Banner)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object3 = ((Banner)object).bannerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerUrl;
        object3 = ((Banner)object).bannerUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaSettings;
        object3 = ((Banner)object).ctaSettings;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableAdsOnPlp;
        object3 = ((Banner)object).enableAdsOnPlp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.experimentId;
        object3 = ((Banner)object).experimentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((Banner)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.hotspots;
        object3 = ((Banner)object).hotspots;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isAdBanner;
        boolean bl4 = ((Banner)object).isAdBanner;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.openInNewTab;
        object3 = ((Banner)object).openInNewTab;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showTimer;
        object3 = ((Banner)object).showTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subComponents;
        object3 = ((Banner)object).subComponents;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.texts;
        object3 = ((Banner)object).texts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerLabel;
        object3 = ((Banner)object).timerLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timerType;
        object3 = ((Banner)object).timerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object3 = ((Banner)object).width;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isAnalyticsEventPushed;
        bl4 = ((Banner)object).isAnalyticsEventPushed;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isCmsAdBanner;
        bl4 = ((Banner)object).isCmsAdBanner;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.adSpotId;
        object3 = ((Banner)object).adSpotId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerAdsMetaData;
        object3 = ((Banner)object).bannerAdsMetaData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.staticContent;
        object = ((Banner)object).staticContent;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAdSpotId() {
        return this.adSpotId;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final BannerAdsMetaData getBannerAdsMetaData() {
        return this.bannerAdsMetaData;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final CtaSettings getCtaSettings() {
        return this.ctaSettings;
    }

    public final Boolean getEnableAdsOnPlp() {
        return this.enableAdsOnPlp;
    }

    public final String getExperimentId() {
        return this.experimentId;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final List getHotspots() {
        return this.hotspots;
    }

    public final Boolean getOpenInNewTab() {
        return this.openInNewTab;
    }

    public final Boolean getShowTimer() {
        return this.showTimer;
    }

    public final String getStaticContent() {
        return this.staticContent;
    }

    public final List getSubComponents() {
        return this.subComponents;
    }

    public final List getTexts() {
        return this.texts;
    }

    public final String getTimerLabel() {
        return this.timerLabel;
    }

    public final String getTimerType() {
        return this.timerType;
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
        Object object = this.bannerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctaSettings;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CtaSettings)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enableAdsOnPlp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.experimentId;
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
        object = this.hotspots;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isAdBanner ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.openInNewTab;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.showTimer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subComponents;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.texts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timerType;
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
        n3 = (int)(this.isAnalyticsEventPushed ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isCmsAdBanner ? 1 : 0);
        if (n3 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        object = this.adSpotId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerAdsMetaData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((BannerAdsMetaData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.staticContent;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isAdBanner() {
        return this.isAdBanner;
    }

    public final boolean isAnalyticsEventPushed() {
        return this.isAnalyticsEventPushed;
    }

    public final boolean isCmsAdBanner() {
        return this.isCmsAdBanner;
    }

    public final void setAnalyticsEventPushed(boolean bl2) {
        this.isAnalyticsEventPushed = bl2;
    }

    public final void setBannerAdsMetaData(BannerAdsMetaData bannerAdsMetaData) {
        this.bannerAdsMetaData = bannerAdsMetaData;
    }

    public final void setBannerType(String string2) {
        this.bannerType = string2;
    }

    public final void setBannerUrl(String string2) {
        this.bannerUrl = string2;
    }

    public final void setHotspots(List list) {
        this.hotspots = list;
    }

    public final void setStaticContent(String string2) {
        this.staticContent = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.altText;
        String string2 = this.bannerType;
        String string3 = this.bannerUrl;
        CtaSettings ctaSettings = this.ctaSettings;
        Boolean bl2 = this.enableAdsOnPlp;
        String string4 = this.experimentId;
        Double d2 = this.height;
        List list = this.hotspots;
        boolean bl3 = this.isAdBanner;
        Boolean bl4 = this.openInNewTab;
        Boolean bl5 = this.showTimer;
        List list2 = this.subComponents;
        List list3 = this.texts;
        String string5 = this.timerLabel;
        String string6 = this.timerType;
        Double d5 = this.width;
        boolean bl6 = this.isAnalyticsEventPushed;
        boolean bl7 = this.isCmsAdBanner;
        String string7 = this.adSpotId;
        BannerAdsMetaData bannerAdsMetaData = this.bannerAdsMetaData;
        String string8 = this.staticContent;
        object = og_1.a("Banner(altText=", (String)object2, ", bannerType=", string2, ", bannerUrl=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", ctaSettings=");
        ((StringBuilder)object).append(ctaSettings);
        ((StringBuilder)object).append(", enableAdsOnPlp=");
        xi0_2.a(bl2, ", experimentId=", string4, ", height=", (StringBuilder)object);
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", hotspots=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", isAdBanner=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", openInNewTab=");
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", showTimer=");
        ((StringBuilder)object).append(bl5);
        ((StringBuilder)object).append(", subComponents=");
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", texts=");
        ((StringBuilder)object).append(list3);
        ((StringBuilder)object).append(", timerLabel=");
        object2 = string5;
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", timerType=");
        object2 = string6;
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", width=");
        object2 = d5;
        ((StringBuilder)object).append(d5);
        ((StringBuilder)object).append(", isAnalyticsEventPushed=");
        I81.a(", isCmsAdBanner=", ", adSpotId=", (StringBuilder)object, bl6, bl7);
        object2 = string7;
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", bannerAdsMetaData=");
        object2 = bannerAdsMetaData;
        ((StringBuilder)object).append(bannerAdsMetaData);
        ((StringBuilder)object).append(", staticContent=");
        string2 = string8;
        return h30_0.a((StringBuilder)object, string8, ")");
    }
}

