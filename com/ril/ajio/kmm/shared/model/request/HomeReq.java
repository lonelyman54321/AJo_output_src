/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.request;

import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HomeReq {
    private String apiVersion;
    private String city;
    private boolean isExternalAdEnabled;
    private boolean isImageSearchEnabled;
    private boolean isOlpCardsEnabled;
    private boolean isProductWidgetEnabled;
    private boolean isRecentlyViewedEnabled;
    private boolean isSTLEnabled;
    private boolean isSimilarProductWidgetEnabledPDP;
    private boolean isTrendingCategoryEnabled;
    private boolean isVideoEnableOnCMS;
    private boolean isVideoEnableOnSTL;
    private boolean isWishListEnableOnSearch;
    private String loggedIn;
    private Integer pageID;
    private String pageUrl;
    private String pcGroup;
    private String pincode;
    private CMSRequestType requestType;
    private String state;
    private String store;
    private String timeStamp;
    private String userType;
    private String zone;

    public HomeReq(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer n3, String string10, boolean bl2, boolean bl3, boolean bl4, String string11, boolean bl5, boolean bl6, CMSRequestType cMSRequestType, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, String string12) {
        Intrinsics.checkNotNullParameter((Object)cMSRequestType, "requestType");
        this.pageUrl = string2;
        this.loggedIn = string3;
        this.userType = string4;
        this.city = string5;
        this.state = string6;
        this.zone = string7;
        this.pincode = string8;
        this.timeStamp = string9;
        this.pageID = n3;
        this.store = string10;
        this.isProductWidgetEnabled = bl2;
        this.isSTLEnabled = bl3;
        this.isRecentlyViewedEnabled = bl4;
        this.apiVersion = string11;
        this.isTrendingCategoryEnabled = bl5;
        this.isImageSearchEnabled = bl6;
        this.requestType = cMSRequestType;
        this.isVideoEnableOnSTL = bl7;
        this.isVideoEnableOnCMS = bl8;
        this.isWishListEnableOnSearch = bl9;
        this.isOlpCardsEnabled = bl10;
        this.isExternalAdEnabled = bl11;
        this.isSimilarProductWidgetEnabledPDP = bl12;
        this.pcGroup = string12;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ HomeReq(String string2, String object, String string3, String string4, String string5, String string6, String string7, String string8, Integer object2, String string9, boolean bl2, boolean bl3, boolean bl4, String string10, boolean bl5, boolean bl6, CMSRequestType cMSRequestType, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, String string11, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var60_91;
        void var52_65;
        void var48_55;
        void var59_87;
        void var58_83;
        void var57_79;
        void var56_75;
        void var53_69;
        void var49_59;
        void var46_50;
        String string12;
        String string13;
        Object object3;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        Object object4;
        int n4 = n3;
        int n7 = n3 & 2;
        if (n7 != 0) {
            n7 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n8 = n4 & 4;
        if (n8 != 0) {
            n8 = 0;
            string19 = null;
        } else {
            string19 = string3;
        }
        int n10 = n4 & 8;
        if (n10 != 0) {
            n10 = 0;
            string18 = null;
        } else {
            string18 = string4;
        }
        int n14 = n4 & 0x10;
        if (n14 != 0) {
            n14 = 0;
            string17 = null;
        } else {
            string17 = string5;
        }
        int n15 = n4 & 0x20;
        if (n15 != 0) {
            n15 = 0;
            string16 = null;
        } else {
            string16 = string6;
        }
        int n16 = n4 & 0x40;
        if (n16 != 0) {
            n16 = 0;
            string15 = null;
        } else {
            string15 = string7;
        }
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            n17 = 0;
            string14 = null;
        } else {
            string14 = string8;
        }
        int n18 = n4 & 0x100;
        if (n18 != 0) {
            n18 = 0;
            object3 = null;
        } else {
            object3 = object2;
        }
        int n19 = n4 & 0x200;
        String string20 = n19 != 0 ? "AJIO" : string9;
        int n20 = n4 & 0x400;
        boolean bl13 = false;
        if (n20 != 0) {
            boolean bl14 = false;
        } else {
            boolean bl15 = bl2;
        }
        int n21 = n4 & 0x800;
        if (n21 != 0) {
            boolean bl16 = false;
        } else {
            boolean bl17 = bl3;
        }
        int n22 = n4 & 0x1000;
        if (n22 != 0) {
            boolean bl18 = false;
        } else {
            boolean bl19 = bl4;
        }
        int n24 = n4 & 0x2000;
        if (n24 != 0) {
            n24 = 0;
            string13 = null;
        } else {
            string13 = string10;
        }
        int n25 = n4 & 0x4000;
        if (n25 != 0) {
            boolean bl20 = false;
        } else {
            boolean bl21 = bl5;
        }
        int n26 = n4 & 0x8000;
        if (n26 != 0) {
            boolean bl22 = false;
        } else {
            boolean bl23 = bl6;
        }
        int n27 = n4 & 0x10000;
        CMSRequestType cMSRequestType2 = n27 != 0 ? CMSRequestType.REQUEST_TYPE_HOME : cMSRequestType;
        int n28 = n4 & 0x20000;
        if (n28 != 0) {
            boolean bl24 = false;
        } else {
            boolean bl25 = bl7;
        }
        int n29 = n4 & 0x40000;
        if (n29 != 0) {
            boolean bl26 = false;
        } else {
            boolean bl27 = bl8;
        }
        int n30 = n4 & 0x80000;
        if (n30 != 0) {
            boolean bl28 = false;
        } else {
            boolean bl29 = bl9;
        }
        int n32 = n4 & 0x100000;
        if (n32 != 0) {
            boolean bl30 = false;
        } else {
            boolean bl31 = bl10;
        }
        int n34 = n4 & 0x200000;
        if (n34 != 0) {
            boolean bl32 = false;
        } else {
            boolean bl33 = bl11;
        }
        int n35 = n4 & 0x400000;
        if (n35 == 0) {
            bl13 = bl12;
        }
        n35 = 0x800000;
        if ((n4 &= n35) != 0) {
            n4 = 0;
            string12 = null;
        } else {
            string12 = string11;
        }
        object = this;
        string3 = string2;
        string4 = object4;
        string5 = string19;
        string6 = string18;
        string7 = string17;
        string8 = string16;
        object2 = string15;
        string9 = string14;
        bl4 = var46_50;
        bl5 = var49_59;
        bl7 = var53_69;
        bl9 = var56_75;
        bl10 = var57_79;
        bl11 = var58_83;
        bl12 = var59_87;
        boolean bl34 = bl13;
        this(string2, (String)object4, string19, string18, string17, string16, string15, string14, (Integer)object3, string20, (boolean)var46_50, (boolean)var48_55, (boolean)var49_59, string13, (boolean)var52_65, (boolean)var53_69, cMSRequestType2, (boolean)var56_75, (boolean)var57_79, (boolean)var58_83, (boolean)var59_87, (boolean)var60_91, bl13, string12);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ HomeReq copy$default(HomeReq homeReq, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer n3, String string10, boolean bl2, boolean bl3, boolean bl4, String string11, boolean bl5, boolean bl6, CMSRequestType object, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, String string12, int n4, Object object2) {
        void var52_86;
        void var51_60;
        void var50_56;
        void var49_52;
        void var52_83;
        void var52_80;
        void var52_77;
        void var52_74;
        void var52_71;
        void var52_68;
        void var52_65;
        HomeReq homeReq2 = homeReq;
        int n7 = n4;
        int n8 = n4 & 1;
        String string13 = n8 != 0 ? homeReq.pageUrl : string2;
        int n10 = n7 & 2;
        String string14 = n10 != 0 ? homeReq2.loggedIn : string3;
        int n14 = n7 & 4;
        String string15 = n14 != 0 ? homeReq2.userType : string4;
        int n15 = n7 & 8;
        String string16 = n15 != 0 ? homeReq2.city : string5;
        int n16 = n7 & 0x10;
        String string17 = n16 != 0 ? homeReq2.state : string6;
        int n17 = n7 & 0x20;
        String string18 = n17 != 0 ? homeReq2.zone : string7;
        int n18 = n7 & 0x40;
        String string19 = n18 != 0 ? homeReq2.pincode : string8;
        int n19 = n7 & 0x80;
        String string20 = n19 != 0 ? homeReq2.timeStamp : string9;
        int n20 = n7 & 0x100;
        Integer n21 = n20 != 0 ? homeReq2.pageID : n3;
        int n22 = n7 & 0x200;
        String string21 = n22 != 0 ? homeReq2.store : string10;
        int bl13 = n7 & 0x400;
        if (bl13 != 0) {
            boolean bl14 = homeReq2.isProductWidgetEnabled;
        } else {
            boolean bl15 = bl2;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            boolean bl16 = homeReq2.isSTLEnabled;
        } else {
            boolean bl17 = bl3;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            boolean bl18 = homeReq2.isRecentlyViewedEnabled;
        } else {
            boolean bl19 = bl4;
        }
        int n26 = n7 & 0x2000;
        Object object3 = n26 != 0 ? homeReq2.apiVersion : string11;
        string11 = object3;
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            boolean bl20 = homeReq2.isTrendingCategoryEnabled;
        } else {
            boolean bl21 = bl5;
        }
        int n28 = n7 & 0x8000;
        bl5 = var52_65;
        if (n28 != 0) {
            boolean bl22 = homeReq2.isImageSearchEnabled;
        } else {
            boolean bl23 = bl6;
        }
        n28 = n7 & 0x10000;
        bl6 = var52_68;
        object3 = n28 != 0 ? homeReq2.requestType : object;
        n28 = n7 & 0x20000;
        object = object3;
        if (n28 != 0) {
            boolean bl24 = homeReq2.isVideoEnableOnSTL;
        } else {
            boolean bl25 = bl7;
        }
        n28 = n7 & 0x40000;
        bl7 = var52_71;
        if (n28 != 0) {
            boolean bl26 = homeReq2.isVideoEnableOnCMS;
        } else {
            boolean bl27 = bl8;
        }
        n28 = n7 & 0x80000;
        bl8 = var52_74;
        if (n28 != 0) {
            boolean bl28 = homeReq2.isWishListEnableOnSearch;
        } else {
            boolean bl29 = bl9;
        }
        n28 = n7 & 0x100000;
        bl9 = var52_77;
        if (n28 != 0) {
            boolean bl30 = homeReq2.isOlpCardsEnabled;
        } else {
            boolean bl31 = bl10;
        }
        n28 = n7 & 0x200000;
        bl10 = var52_80;
        if (n28 != 0) {
            boolean bl32 = homeReq2.isExternalAdEnabled;
        } else {
            boolean bl33 = bl11;
        }
        n28 = n7 & 0x400000;
        bl11 = var52_83;
        if (n28 != 0) {
            boolean bl34 = homeReq2.isSimilarProductWidgetEnabledPDP;
        } else {
            boolean bl35 = bl12;
        }
        n28 = 0x800000;
        String string22 = (n7 &= n28) != 0 ? homeReq2.pcGroup : string12;
        string2 = string13;
        string3 = string14;
        string4 = string15;
        string5 = string16;
        string6 = string17;
        string7 = string18;
        string8 = string19;
        string9 = string20;
        n3 = n21;
        string10 = string21;
        bl2 = var49_52;
        bl3 = var50_56;
        bl4 = var51_60;
        bl12 = var52_86;
        string12 = string22;
        return homeReq.copy(string13, string14, string15, string16, string17, string18, string19, string20, n21, string21, (boolean)var49_52, (boolean)var50_56, (boolean)var51_60, string11, bl5, bl6, (CMSRequestType)((Object)object), bl7, bl8, bl9, bl10, bl11, (boolean)var52_86, string22);
    }

    public final String component1() {
        return this.pageUrl;
    }

    public final String component10() {
        return this.store;
    }

    public final boolean component11() {
        return this.isProductWidgetEnabled;
    }

    public final boolean component12() {
        return this.isSTLEnabled;
    }

    public final boolean component13() {
        return this.isRecentlyViewedEnabled;
    }

    public final String component14() {
        return this.apiVersion;
    }

    public final boolean component15() {
        return this.isTrendingCategoryEnabled;
    }

    public final boolean component16() {
        return this.isImageSearchEnabled;
    }

    public final CMSRequestType component17() {
        return this.requestType;
    }

    public final boolean component18() {
        return this.isVideoEnableOnSTL;
    }

    public final boolean component19() {
        return this.isVideoEnableOnCMS;
    }

    public final String component2() {
        return this.loggedIn;
    }

    public final boolean component20() {
        return this.isWishListEnableOnSearch;
    }

    public final boolean component21() {
        return this.isOlpCardsEnabled;
    }

    public final boolean component22() {
        return this.isExternalAdEnabled;
    }

    public final boolean component23() {
        return this.isSimilarProductWidgetEnabledPDP;
    }

    public final String component24() {
        return this.pcGroup;
    }

    public final String component3() {
        return this.userType;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.zone;
    }

    public final String component7() {
        return this.pincode;
    }

    public final String component8() {
        return this.timeStamp;
    }

    public final Integer component9() {
        return this.pageID;
    }

    public final HomeReq copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer n3, String string10, boolean bl2, boolean bl3, boolean bl4, String string11, boolean bl5, boolean bl6, CMSRequestType cMSRequestType, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, String string12) {
        Intrinsics.checkNotNullParameter((Object)cMSRequestType, "requestType");
        HomeReq homeReq = new HomeReq(string2, string3, string4, string5, string6, string7, string8, string9, n3, string10, bl2, bl3, bl4, string11, bl5, bl6, cMSRequestType, bl7, bl8, bl9, bl10, bl11, bl12, string12);
        return homeReq;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HomeReq;
        if (!bl3) {
            return false;
        }
        object = (HomeReq)object;
        Object object2 = this.pageUrl;
        Object object3 = ((HomeReq)object).pageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loggedIn;
        object3 = ((HomeReq)object).loggedIn;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userType;
        object3 = ((HomeReq)object).userType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.city;
        object3 = ((HomeReq)object).city;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.state;
        object3 = ((HomeReq)object).state;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zone;
        object3 = ((HomeReq)object).zone;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pincode;
        object3 = ((HomeReq)object).pincode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timeStamp;
        object3 = ((HomeReq)object).timeStamp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageID;
        object3 = ((HomeReq)object).pageID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.store;
        object3 = ((HomeReq)object).store;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isProductWidgetEnabled;
        boolean bl4 = ((HomeReq)object).isProductWidgetEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isSTLEnabled;
        bl4 = ((HomeReq)object).isSTLEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isRecentlyViewedEnabled;
        bl4 = ((HomeReq)object).isRecentlyViewedEnabled;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.apiVersion;
        object3 = ((HomeReq)object).apiVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isTrendingCategoryEnabled;
        bl4 = ((HomeReq)object).isTrendingCategoryEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isImageSearchEnabled;
        bl4 = ((HomeReq)object).isImageSearchEnabled;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.requestType;
        object3 = ((HomeReq)object).requestType;
        if (object2 != object3) {
            return false;
        }
        bl3 = this.isVideoEnableOnSTL;
        bl4 = ((HomeReq)object).isVideoEnableOnSTL;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isVideoEnableOnCMS;
        bl4 = ((HomeReq)object).isVideoEnableOnCMS;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isWishListEnableOnSearch;
        bl4 = ((HomeReq)object).isWishListEnableOnSearch;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isOlpCardsEnabled;
        bl4 = ((HomeReq)object).isOlpCardsEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isExternalAdEnabled;
        bl4 = ((HomeReq)object).isExternalAdEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isSimilarProductWidgetEnabledPDP;
        bl4 = ((HomeReq)object).isSimilarProductWidgetEnabledPDP;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.pcGroup;
        object = ((HomeReq)object).pcGroup;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getLoggedIn() {
        return this.loggedIn;
    }

    public final Integer getPageID() {
        return this.pageID;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getPcGroup() {
        return this.pcGroup;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final CMSRequestType getRequestType() {
        return this.requestType;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.pageUrl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.loggedIn;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.city;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.state;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.zone;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pincode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timeStamp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageID;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.store;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isProductWidgetEnabled ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSTLEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isRecentlyViewedEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.apiVersion;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isTrendingCategoryEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isImageSearchEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.requestType;
        n3 = (object.hashCode() + n4) * 31;
        n4 = (int)(this.isVideoEnableOnSTL ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isVideoEnableOnCMS ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isWishListEnableOnSearch ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isOlpCardsEnabled ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isExternalAdEnabled ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isSimilarProductWidgetEnabledPDP ? 1 : 0);
        if (n4 != 0) {
            n8 = 1231;
        }
        n3 = (n3 + n8) * 31;
        string2 = this.pcGroup;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n3 + n7;
    }

    public final boolean isExternalAdEnabled() {
        return this.isExternalAdEnabled;
    }

    public final boolean isImageSearchEnabled() {
        return this.isImageSearchEnabled;
    }

    public final boolean isOlpCardsEnabled() {
        return this.isOlpCardsEnabled;
    }

    public final boolean isProductWidgetEnabled() {
        return this.isProductWidgetEnabled;
    }

    public final boolean isRecentlyViewedEnabled() {
        return this.isRecentlyViewedEnabled;
    }

    public final boolean isSTLEnabled() {
        return this.isSTLEnabled;
    }

    public final boolean isSimilarProductWidgetEnabledPDP() {
        return this.isSimilarProductWidgetEnabledPDP;
    }

    public final boolean isTrendingCategoryEnabled() {
        return this.isTrendingCategoryEnabled;
    }

    public final boolean isVideoEnableOnCMS() {
        return this.isVideoEnableOnCMS;
    }

    public final boolean isVideoEnableOnSTL() {
        return this.isVideoEnableOnSTL;
    }

    public final boolean isWishListEnableOnSearch() {
        return this.isWishListEnableOnSearch;
    }

    public final void setApiVersion(String string2) {
        this.apiVersion = string2;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setExternalAdEnabled(boolean bl2) {
        this.isExternalAdEnabled = bl2;
    }

    public final void setImageSearchEnabled(boolean bl2) {
        this.isImageSearchEnabled = bl2;
    }

    public final void setLoggedIn(String string2) {
        this.loggedIn = string2;
    }

    public final void setOlpCardsEnabled(boolean bl2) {
        this.isOlpCardsEnabled = bl2;
    }

    public final void setPageID(Integer n3) {
        this.pageID = n3;
    }

    public final void setPageUrl(String string2) {
        this.pageUrl = string2;
    }

    public final void setPcGroup(String string2) {
        this.pcGroup = string2;
    }

    public final void setPincode(String string2) {
        this.pincode = string2;
    }

    public final void setProductWidgetEnabled(boolean bl2) {
        this.isProductWidgetEnabled = bl2;
    }

    public final void setRecentlyViewedEnabled(boolean bl2) {
        this.isRecentlyViewedEnabled = bl2;
    }

    public final void setRequestType(CMSRequestType cMSRequestType) {
        Intrinsics.checkNotNullParameter((Object)cMSRequestType, "<set-?>");
        this.requestType = cMSRequestType;
    }

    public final void setSTLEnabled(boolean bl2) {
        this.isSTLEnabled = bl2;
    }

    public final void setSimilarProductWidgetEnabledPDP(boolean bl2) {
        this.isSimilarProductWidgetEnabledPDP = bl2;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setStore(String string2) {
        this.store = string2;
    }

    public final void setTimeStamp(String string2) {
        this.timeStamp = string2;
    }

    public final void setTrendingCategoryEnabled(boolean bl2) {
        this.isTrendingCategoryEnabled = bl2;
    }

    public final void setUserType(String string2) {
        this.userType = string2;
    }

    public final void setVideoEnableOnCMS(boolean bl2) {
        this.isVideoEnableOnCMS = bl2;
    }

    public final void setVideoEnableOnSTL(boolean bl2) {
        this.isVideoEnableOnSTL = bl2;
    }

    public final void setWishListEnableOnSearch(boolean bl2) {
        this.isWishListEnableOnSearch = bl2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.pageUrl;
        String string2 = this.loggedIn;
        String string3 = this.userType;
        String string4 = this.city;
        String string5 = this.state;
        String string6 = this.zone;
        String string7 = this.pincode;
        String string8 = this.timeStamp;
        Integer n3 = this.pageID;
        String string9 = this.store;
        boolean bl2 = this.isProductWidgetEnabled;
        boolean bl3 = this.isSTLEnabled;
        boolean bl4 = this.isRecentlyViewedEnabled;
        String string10 = this.apiVersion;
        boolean bl5 = this.isTrendingCategoryEnabled;
        boolean bl6 = this.isImageSearchEnabled;
        CMSRequestType cMSRequestType = this.requestType;
        boolean bl7 = this.isVideoEnableOnSTL;
        boolean bl8 = this.isVideoEnableOnCMS;
        boolean bl9 = this.isWishListEnableOnSearch;
        boolean bl10 = this.isOlpCardsEnabled;
        boolean bl11 = this.isExternalAdEnabled;
        boolean bl12 = this.isSimilarProductWidgetEnabledPDP;
        String string11 = this.pcGroup;
        object = og_1.a("HomeReq(pageUrl=", object2, ", loggedIn=", string2, ", userType=");
        X50.a((StringBuilder)object, string3, ", city=", string4, ", state=");
        X50.a((StringBuilder)object, string5, ", zone=", string6, ", pincode=");
        X50.a((StringBuilder)object, string7, ", timeStamp=", string8, ", pageID=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", store=");
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", isProductWidgetEnabled=");
        I81.a(", isSTLEnabled=", ", isRecentlyViewedEnabled=", (StringBuilder)object, bl2, bl3);
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", apiVersion=");
        object2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(", isTrendingCategoryEnabled=");
        I81.a(", isImageSearchEnabled=", ", requestType=", (StringBuilder)object, bl5, bl6);
        object2 = cMSRequestType;
        ((StringBuilder)object).append((Object)cMSRequestType);
        ((StringBuilder)object).append(", isVideoEnableOnSTL=");
        ((StringBuilder)object).append(bl7);
        ((StringBuilder)object).append(", isVideoEnableOnCMS=");
        I81.a(", isWishListEnableOnSearch=", ", isOlpCardsEnabled=", (StringBuilder)object, bl8, bl9);
        I81.a(", isExternalAdEnabled=", ", isSimilarProductWidgetEnabledPDP=", (StringBuilder)object, bl10, bl11);
        ((StringBuilder)object).append(bl12);
        ((StringBuilder)object).append(", pcGroup=");
        object2 = string11;
        ((StringBuilder)object).append(string11);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

