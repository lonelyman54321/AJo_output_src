/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdsConfig
implements Serializable {
    private final Boolean bannerAdsClickEnabled;
    private final Boolean bannerAdsEnabled;
    private final Boolean isBannerClickEnabled;
    private final boolean isJioBannerAdsClickEnabled;
    private final boolean isJioBannerAdsEnabled;
    private final boolean isJioBannerDynamicAdsEnabled;
    private final Boolean isThirdPartyAdsBannerClickEnabled;
    private final Boolean isThirdPartyAdsEnabled;
    private final String jioAdsAsi;
    private final String jioAdsPageUrl;
    private final String jioAdsSdkAsi;
    private final List jioAdsSdkDimension;
    private final String pageUrl;

    public BannerAdsConfig() {
        this(null, null, null, null, null, null, false, false, null, false, null, null, null, 8191, null);
    }

    public BannerAdsConfig(Boolean bl2, Boolean bl3, String string2, Boolean bl4, Boolean bl5, Boolean bl6, boolean bl7, boolean bl8, String string3, boolean bl9, String string4, List list, String string5) {
        this.bannerAdsEnabled = bl2;
        this.bannerAdsClickEnabled = bl3;
        this.pageUrl = string2;
        this.isBannerClickEnabled = bl4;
        this.isThirdPartyAdsEnabled = bl5;
        this.isThirdPartyAdsBannerClickEnabled = bl6;
        this.isJioBannerAdsEnabled = bl7;
        this.isJioBannerAdsClickEnabled = bl8;
        this.jioAdsAsi = string3;
        this.isJioBannerDynamicAdsEnabled = bl9;
        this.jioAdsSdkAsi = string4;
        this.jioAdsSdkDimension = list;
        this.jioAdsPageUrl = string5;
    }

    /*
     * WARNING - void declaration
     */
    public BannerAdsConfig(Boolean serializable, Boolean bl2, String object, Boolean object2, Boolean bl3, Boolean bl4, boolean bl5, boolean bl6, String string2, boolean bl7, String string3, List object3, String object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var32_38;
        void var30_33;
        String string4;
        String string5;
        Object string6;
        int n4 = n3;
        int n7 = n3 & 1;
        Serializable bl8 = n7 != 0 ? Boolean.FALSE : serializable;
        int n8 = n4 & 2;
        Boolean bl9 = n8 != 0 ? Boolean.FALSE : bl2;
        int n10 = n4 & 4;
        Object string7 = null;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = object;
        }
        int n14 = n4 & 8;
        Object object5 = n14 != 0 ? Boolean.FALSE : object2;
        int n15 = n4 & 0x10;
        Object bl10 = n15 != 0 ? Boolean.FALSE : bl3;
        int n16 = n4 & 0x20;
        Boolean bl11 = n16 != 0 ? Boolean.FALSE : bl4;
        int bl12 = n4 & 0x40;
        boolean bl13 = false;
        if (bl12 != 0) {
            boolean bl14 = false;
        } else {
            boolean bl15 = bl5;
        }
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            boolean bl16 = false;
        } else {
            boolean bl17 = bl6;
        }
        int n18 = n4 & 0x100;
        if (n18 != 0) {
            n18 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int n19 = n4 & 0x200;
        if (n19 == 0) {
            bl13 = bl7;
        }
        n19 = n4 & 0x400;
        if (n19 != 0) {
            n19 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n20 = n4 & 0x800;
        Object object6 = n20 != 0 ? mz0_2.a : object3;
        if ((n4 &= 0x1000) == 0) {
            string7 = object4;
        }
        serializable = this;
        bl2 = bl8;
        object = bl9;
        object2 = string6;
        bl3 = object5;
        bl4 = bl10;
        bl6 = var30_33;
        object3 = string4;
        object4 = object6;
        this((Boolean)bl8, bl9, (String)string6, (Boolean)object5, (Boolean)bl10, bl11, (boolean)var30_33, (boolean)var32_38, string5, bl13, string4, (List)object6, (String)string7);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BannerAdsConfig copy$default(BannerAdsConfig bannerAdsConfig, Boolean bl2, Boolean bl3, String string2, Boolean bl4, Boolean bl5, Boolean bl6, boolean bl7, boolean bl8, String string3, boolean bl9, String string4, List list, String string5, int n3, Object object) {
        void var34_43;
        void var31_37;
        void var30_33;
        BannerAdsConfig bannerAdsConfig2 = bannerAdsConfig;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl10 = n7 != 0 ? bannerAdsConfig.bannerAdsEnabled : bl2;
        int n8 = n4 & 2;
        Boolean bl11 = n8 != 0 ? bannerAdsConfig2.bannerAdsClickEnabled : bl3;
        int n10 = n4 & 4;
        String string6 = n10 != 0 ? bannerAdsConfig2.pageUrl : string2;
        int n14 = n4 & 8;
        Boolean bl12 = n14 != 0 ? bannerAdsConfig2.isBannerClickEnabled : bl4;
        int n15 = n4 & 0x10;
        Boolean bl13 = n15 != 0 ? bannerAdsConfig2.isThirdPartyAdsEnabled : bl5;
        int n16 = n4 & 0x20;
        Boolean bl14 = n16 != 0 ? bannerAdsConfig2.isThirdPartyAdsBannerClickEnabled : bl6;
        int bl15 = n4 & 0x40;
        if (bl15 != 0) {
            boolean bl16 = bannerAdsConfig2.isJioBannerAdsEnabled;
        } else {
            boolean bl17 = bl7;
        }
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            boolean bl18 = bannerAdsConfig2.isJioBannerAdsClickEnabled;
        } else {
            boolean bl19 = bl8;
        }
        int n18 = n4 & 0x100;
        String string7 = n18 != 0 ? bannerAdsConfig2.jioAdsAsi : string3;
        int n19 = n4 & 0x200;
        if (n19 != 0) {
            boolean bl20 = bannerAdsConfig2.isJioBannerDynamicAdsEnabled;
        } else {
            boolean bl21 = bl9;
        }
        int n20 = n4 & 0x400;
        String string8 = n20 != 0 ? bannerAdsConfig2.jioAdsSdkAsi : string4;
        int n21 = n4 & 0x800;
        List list2 = n21 != 0 ? bannerAdsConfig2.jioAdsSdkDimension : list;
        String string9 = (n4 &= 0x1000) != 0 ? bannerAdsConfig2.jioAdsPageUrl : string5;
        bl2 = bl10;
        bl3 = bl11;
        string2 = string6;
        bl4 = bl12;
        bl5 = bl13;
        bl6 = bl14;
        bl7 = var30_33;
        bl8 = var31_37;
        string3 = string7;
        bl9 = var34_43;
        string4 = string8;
        list = list2;
        string5 = string9;
        return bannerAdsConfig.copy(bl10, bl11, string6, bl12, bl13, bl14, (boolean)var30_33, (boolean)var31_37, string7, (boolean)var34_43, string8, list2, string9);
    }

    public final Boolean component1() {
        return this.bannerAdsEnabled;
    }

    public final boolean component10() {
        return this.isJioBannerDynamicAdsEnabled;
    }

    public final String component11() {
        return this.jioAdsSdkAsi;
    }

    public final List component12() {
        return this.jioAdsSdkDimension;
    }

    public final String component13() {
        return this.jioAdsPageUrl;
    }

    public final Boolean component2() {
        return this.bannerAdsClickEnabled;
    }

    public final String component3() {
        return this.pageUrl;
    }

    public final Boolean component4() {
        return this.isBannerClickEnabled;
    }

    public final Boolean component5() {
        return this.isThirdPartyAdsEnabled;
    }

    public final Boolean component6() {
        return this.isThirdPartyAdsBannerClickEnabled;
    }

    public final boolean component7() {
        return this.isJioBannerAdsEnabled;
    }

    public final boolean component8() {
        return this.isJioBannerAdsClickEnabled;
    }

    public final String component9() {
        return this.jioAdsAsi;
    }

    public final BannerAdsConfig copy(Boolean bl2, Boolean bl3, String string2, Boolean bl4, Boolean bl5, Boolean bl6, boolean bl7, boolean bl8, String string3, boolean bl9, String string4, List list, String string5) {
        BannerAdsConfig bannerAdsConfig = new BannerAdsConfig(bl2, bl3, string2, bl4, bl5, bl6, bl7, bl8, string3, bl9, string4, list, string5);
        return bannerAdsConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerAdsConfig;
        if (!bl3) {
            return false;
        }
        object = (BannerAdsConfig)object;
        Object object2 = this.bannerAdsEnabled;
        Object object3 = ((BannerAdsConfig)object).bannerAdsEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerAdsClickEnabled;
        object3 = ((BannerAdsConfig)object).bannerAdsClickEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageUrl;
        object3 = ((BannerAdsConfig)object).pageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isBannerClickEnabled;
        object3 = ((BannerAdsConfig)object).isBannerClickEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isThirdPartyAdsEnabled;
        object3 = ((BannerAdsConfig)object).isThirdPartyAdsEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isThirdPartyAdsBannerClickEnabled;
        object3 = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isJioBannerAdsEnabled;
        boolean bl4 = ((BannerAdsConfig)object).isJioBannerAdsEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isJioBannerAdsClickEnabled;
        bl4 = ((BannerAdsConfig)object).isJioBannerAdsClickEnabled;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.jioAdsAsi;
        object3 = ((BannerAdsConfig)object).jioAdsAsi;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isJioBannerDynamicAdsEnabled;
        bl4 = ((BannerAdsConfig)object).isJioBannerDynamicAdsEnabled;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.jioAdsSdkAsi;
        object3 = ((BannerAdsConfig)object).jioAdsSdkAsi;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.jioAdsSdkDimension;
        object3 = ((BannerAdsConfig)object).jioAdsSdkDimension;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.jioAdsPageUrl;
        object = ((BannerAdsConfig)object).jioAdsPageUrl;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getBannerAdsClickEnabled() {
        return this.bannerAdsClickEnabled;
    }

    public final Boolean getBannerAdsEnabled() {
        return this.bannerAdsEnabled;
    }

    public final String getJioAdsAsi() {
        return this.jioAdsAsi;
    }

    public final String getJioAdsPageUrl() {
        return this.jioAdsPageUrl;
    }

    public final String getJioAdsSdkAsi() {
        return this.jioAdsSdkAsi;
    }

    public final List getJioAdsSdkDimension() {
        return this.jioAdsSdkDimension;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.bannerAdsEnabled;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.bannerAdsClickEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isBannerClickEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isThirdPartyAdsEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isThirdPartyAdsBannerClickEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isJioBannerAdsEnabled ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isJioBannerAdsClickEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.jioAdsAsi;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isJioBannerDynamicAdsEnabled ? 1 : 0);
        if (n3 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        object = this.jioAdsSdkAsi;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.jioAdsSdkDimension;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.jioAdsPageUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isBannerClickEnabled() {
        return this.isBannerClickEnabled;
    }

    public final boolean isJioBannerAdsClickEnabled() {
        return this.isJioBannerAdsClickEnabled;
    }

    public final boolean isJioBannerAdsEnabled() {
        return this.isJioBannerAdsEnabled;
    }

    public final boolean isJioBannerDynamicAdsEnabled() {
        return this.isJioBannerDynamicAdsEnabled;
    }

    public final Boolean isThirdPartyAdsBannerClickEnabled() {
        return this.isThirdPartyAdsBannerClickEnabled;
    }

    public final Boolean isThirdPartyAdsEnabled() {
        return this.isThirdPartyAdsEnabled;
    }

    public String toString() {
        Boolean bl2 = this.bannerAdsEnabled;
        Boolean bl3 = this.bannerAdsClickEnabled;
        String string2 = this.pageUrl;
        Boolean bl4 = this.isBannerClickEnabled;
        Boolean bl5 = this.isThirdPartyAdsEnabled;
        Boolean bl6 = this.isThirdPartyAdsBannerClickEnabled;
        boolean bl7 = this.isJioBannerAdsEnabled;
        boolean bl8 = this.isJioBannerAdsClickEnabled;
        String string3 = this.jioAdsAsi;
        boolean bl9 = this.isJioBannerDynamicAdsEnabled;
        String string4 = this.jioAdsSdkAsi;
        List list = this.jioAdsSdkDimension;
        String string5 = this.jioAdsPageUrl;
        StringBuilder stringBuilder = new StringBuilder("BannerAdsConfig(bannerAdsEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", bannerAdsClickEnabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(", pageUrl=");
        vw0_1.a(bl4, string2, ", isBannerClickEnabled=", ", isThirdPartyAdsEnabled=", stringBuilder);
        stringBuilder.append(bl5);
        stringBuilder.append(", isThirdPartyAdsBannerClickEnabled=");
        stringBuilder.append(bl6);
        stringBuilder.append(", isJioBannerAdsEnabled=");
        I81.a(", isJioBannerAdsClickEnabled=", ", jioAdsAsi=", stringBuilder, bl7, bl8);
        stringBuilder.append(string3);
        stringBuilder.append(", isJioBannerDynamicAdsEnabled=");
        stringBuilder.append(bl9);
        stringBuilder.append(", jioAdsSdkAsi=");
        stringBuilder.append(string4);
        stringBuilder.append(", jioAdsSdkDimension=");
        stringBuilder.append(list);
        stringBuilder.append(", jioAdsPageUrl=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

