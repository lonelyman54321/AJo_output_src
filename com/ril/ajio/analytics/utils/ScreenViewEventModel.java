/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ScreenViewEventModel {
    public static final int $stable;
    private final String UID;
    private final String bannerThemeExtended;
    private final String clientId;
    private final String ecommPageType;
    private final String ecommProdid;
    private final String ecommTotalValue;
    private final String firebaseExperiment3;
    private final String hybrisId;
    private final String jioAdsEnabled;
    private final String networkType;
    private final Integer numberOfItemsOnCart;
    private final Integer numberResults;
    private final String plpPageTitle;
    private final String plpSource;
    private final String plpSourceDetails;
    private final String productSizeHit;
    private final String redirection;
    private final String screenName;
    private final String storeType;
    private final String timeOfTheDay;
    private final String typeOfRedirection;
    private final String userPersonalizationBucket;

    public ScreenViewEventModel(String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer n4, String string17, String string18, String string19, String string20, String string21) {
        this.ecommTotalValue = string2;
        this.numberResults = n3;
        this.plpSourceDetails = string3;
        this.bannerThemeExtended = string4;
        this.jioAdsEnabled = string5;
        this.networkType = string6;
        this.userPersonalizationBucket = string7;
        this.UID = string8;
        this.typeOfRedirection = string9;
        this.clientId = string10;
        this.productSizeHit = string11;
        this.timeOfTheDay = string12;
        this.storeType = string13;
        this.plpSource = string14;
        this.ecommProdid = string15;
        this.ecommPageType = string16;
        this.numberOfItemsOnCart = n4;
        this.hybrisId = string17;
        this.firebaseExperiment3 = string18;
        this.plpPageTitle = string19;
        this.redirection = string20;
        this.screenName = string21;
    }

    public /* synthetic */ ScreenViewEventModel(String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer n4, String string17, String string18, String string19, String string20, String string21, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7;
        int n10 = n7 & 0x40;
        String string22 = n10 != 0 ? null : string7;
        n10 = n8 & 0x80;
        String string23 = n10 != 0 ? null : string8;
        n10 = n8 & 0x100;
        String string24 = n10 != 0 ? null : string9;
        n10 = n8 & 0x200;
        String string25 = n10 != 0 ? null : string10;
        n10 = n8 & 0x400;
        String string26 = n10 != 0 ? null : string11;
        n10 = n8 & 0x800;
        String string27 = n10 != 0 ? null : string12;
        n10 = n8 & 0x1000;
        String string28 = n10 != 0 ? null : string13;
        n10 = n8 & 0x2000;
        String string29 = n10 != 0 ? null : string14;
        n10 = n8 & 0x4000;
        String string30 = n10 != 0 ? null : string15;
        n10 = 0x8000 & n8;
        String string31 = n10 != 0 ? null : string16;
        n10 = 0x10000 & n8;
        Integer n14 = n10 != 0 ? null : n4;
        n10 = 0x20000 & n8;
        String string32 = n10 != 0 ? null : string17;
        n10 = 0x40000 & n8;
        String string33 = n10 != 0 ? null : string18;
        n10 = 0x80000 & n8;
        String string34 = n10 != 0 ? null : string19;
        n10 = 0x100000 & n8;
        String string35 = n10 != 0 ? null : string20;
        n10 = 0x200000;
        String string36 = (n8 &= n10) != 0 ? null : string21;
        this(string2, n3, string3, string4, string5, string6, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, n14, string32, string33, string34, string35, string36);
    }

    public static /* synthetic */ ScreenViewEventModel copy$default(ScreenViewEventModel screenViewEventModel, String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer object, String object2, String object3, String object4, String object5, String string17, int n4, Object object6) {
        ScreenViewEventModel screenViewEventModel2 = screenViewEventModel;
        int n7 = n4;
        int n8 = n4 & 1;
        String string18 = n8 != 0 ? screenViewEventModel.ecommTotalValue : string2;
        int n10 = n7 & 2;
        Integer n14 = n10 != 0 ? screenViewEventModel2.numberResults : n3;
        int n15 = n7 & 4;
        String string19 = n15 != 0 ? screenViewEventModel2.plpSourceDetails : string3;
        int n16 = n7 & 8;
        String string20 = n16 != 0 ? screenViewEventModel2.bannerThemeExtended : string4;
        int n17 = n7 & 0x10;
        String string21 = n17 != 0 ? screenViewEventModel2.jioAdsEnabled : string5;
        int n18 = n7 & 0x20;
        String string22 = n18 != 0 ? screenViewEventModel2.networkType : string6;
        int n19 = n7 & 0x40;
        String string23 = n19 != 0 ? screenViewEventModel2.userPersonalizationBucket : string7;
        int n20 = n7 & 0x80;
        String string24 = n20 != 0 ? screenViewEventModel2.UID : string8;
        int n21 = n7 & 0x100;
        String string25 = n21 != 0 ? screenViewEventModel2.typeOfRedirection : string9;
        int n22 = n7 & 0x200;
        String string26 = n22 != 0 ? screenViewEventModel2.clientId : string10;
        int n24 = n7 & 0x400;
        String string27 = n24 != 0 ? screenViewEventModel2.productSizeHit : string11;
        int n25 = n7 & 0x800;
        String string28 = n25 != 0 ? screenViewEventModel2.timeOfTheDay : string12;
        int n26 = n7 & 0x1000;
        String string29 = n26 != 0 ? screenViewEventModel2.storeType : string13;
        int n27 = n7 & 0x2000;
        Object object7 = n27 != 0 ? screenViewEventModel2.plpSource : string14;
        string14 = object7;
        n27 = n7 & 0x4000;
        object7 = n27 != 0 ? screenViewEventModel2.ecommProdid : string15;
        int n28 = n7 & 0x8000;
        string15 = object7;
        object7 = n28 != 0 ? screenViewEventModel2.ecommPageType : string16;
        n28 = n7 & 0x10000;
        string16 = object7;
        object7 = n28 != 0 ? screenViewEventModel2.numberOfItemsOnCart : object;
        n28 = n7 & 0x20000;
        object = object7;
        object7 = n28 != 0 ? screenViewEventModel2.hybrisId : object2;
        n28 = n7 & 0x40000;
        object2 = object7;
        object7 = n28 != 0 ? screenViewEventModel2.firebaseExperiment3 : object3;
        n28 = n7 & 0x80000;
        object3 = object7;
        object7 = n28 != 0 ? screenViewEventModel2.plpPageTitle : object4;
        n28 = n7 & 0x100000;
        object4 = object7;
        object7 = n28 != 0 ? screenViewEventModel2.redirection : object5;
        n28 = 0x200000;
        String string30 = (n7 &= n28) != 0 ? screenViewEventModel2.screenName : string17;
        string2 = string18;
        n3 = n14;
        string3 = string19;
        string4 = string20;
        string5 = string21;
        string6 = string22;
        string7 = string23;
        string8 = string24;
        string9 = string25;
        string10 = string26;
        string11 = string27;
        string12 = string28;
        string13 = string29;
        object5 = object7;
        string17 = string30;
        return screenViewEventModel.copy(string18, n14, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string14, string15, string16, (Integer)object, (String)object2, (String)object3, (String)object4, (String)object7, string30);
    }

    public final String component1() {
        return this.ecommTotalValue;
    }

    public final String component10() {
        return this.clientId;
    }

    public final String component11() {
        return this.productSizeHit;
    }

    public final String component12() {
        return this.timeOfTheDay;
    }

    public final String component13() {
        return this.storeType;
    }

    public final String component14() {
        return this.plpSource;
    }

    public final String component15() {
        return this.ecommProdid;
    }

    public final String component16() {
        return this.ecommPageType;
    }

    public final Integer component17() {
        return this.numberOfItemsOnCart;
    }

    public final String component18() {
        return this.hybrisId;
    }

    public final String component19() {
        return this.firebaseExperiment3;
    }

    public final Integer component2() {
        return this.numberResults;
    }

    public final String component20() {
        return this.plpPageTitle;
    }

    public final String component21() {
        return this.redirection;
    }

    public final String component22() {
        return this.screenName;
    }

    public final String component3() {
        return this.plpSourceDetails;
    }

    public final String component4() {
        return this.bannerThemeExtended;
    }

    public final String component5() {
        return this.jioAdsEnabled;
    }

    public final String component6() {
        return this.networkType;
    }

    public final String component7() {
        return this.userPersonalizationBucket;
    }

    public final String component8() {
        return this.UID;
    }

    public final String component9() {
        return this.typeOfRedirection;
    }

    public final ScreenViewEventModel copy(String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer n4, String string17, String string18, String string19, String string20, String string21) {
        ScreenViewEventModel screenViewEventModel = new ScreenViewEventModel(string2, n3, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, n4, string17, string18, string19, string20, string21);
        return screenViewEventModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ScreenViewEventModel;
        if (!bl3) {
            return false;
        }
        object = (ScreenViewEventModel)object;
        Object object2 = this.ecommTotalValue;
        Object object3 = ((ScreenViewEventModel)object).ecommTotalValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numberResults;
        object3 = ((ScreenViewEventModel)object).numberResults;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpSourceDetails;
        object3 = ((ScreenViewEventModel)object).plpSourceDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerThemeExtended;
        object3 = ((ScreenViewEventModel)object).bannerThemeExtended;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.jioAdsEnabled;
        object3 = ((ScreenViewEventModel)object).jioAdsEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.networkType;
        object3 = ((ScreenViewEventModel)object).networkType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userPersonalizationBucket;
        object3 = ((ScreenViewEventModel)object).userPersonalizationBucket;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.UID;
        object3 = ((ScreenViewEventModel)object).UID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.typeOfRedirection;
        object3 = ((ScreenViewEventModel)object).typeOfRedirection;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clientId;
        object3 = ((ScreenViewEventModel)object).clientId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productSizeHit;
        object3 = ((ScreenViewEventModel)object).productSizeHit;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timeOfTheDay;
        object3 = ((ScreenViewEventModel)object).timeOfTheDay;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.storeType;
        object3 = ((ScreenViewEventModel)object).storeType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpSource;
        object3 = ((ScreenViewEventModel)object).plpSource;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ecommProdid;
        object3 = ((ScreenViewEventModel)object).ecommProdid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ecommPageType;
        object3 = ((ScreenViewEventModel)object).ecommPageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.numberOfItemsOnCart;
        object3 = ((ScreenViewEventModel)object).numberOfItemsOnCart;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.hybrisId;
        object3 = ((ScreenViewEventModel)object).hybrisId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.firebaseExperiment3;
        object3 = ((ScreenViewEventModel)object).firebaseExperiment3;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpPageTitle;
        object3 = ((ScreenViewEventModel)object).plpPageTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.redirection;
        object3 = ((ScreenViewEventModel)object).redirection;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.screenName;
        object = ((ScreenViewEventModel)object).screenName;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBannerThemeExtended() {
        return this.bannerThemeExtended;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getEcommPageType() {
        return this.ecommPageType;
    }

    public final String getEcommProdid() {
        return this.ecommProdid;
    }

    public final String getEcommTotalValue() {
        return this.ecommTotalValue;
    }

    public final String getFirebaseExperiment3() {
        return this.firebaseExperiment3;
    }

    public final String getHybrisId() {
        return this.hybrisId;
    }

    public final String getJioAdsEnabled() {
        return this.jioAdsEnabled;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final Integer getNumberOfItemsOnCart() {
        return this.numberOfItemsOnCart;
    }

    public final Integer getNumberResults() {
        return this.numberResults;
    }

    public final String getPlpPageTitle() {
        return this.plpPageTitle;
    }

    public final String getPlpSource() {
        return this.plpSource;
    }

    public final String getPlpSourceDetails() {
        return this.plpSourceDetails;
    }

    public final String getProductSizeHit() {
        return this.productSizeHit;
    }

    public final String getRedirection() {
        return this.redirection;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getStoreType() {
        return this.storeType;
    }

    public final String getTimeOfTheDay() {
        return this.timeOfTheDay;
    }

    public final String getTypeOfRedirection() {
        return this.typeOfRedirection;
    }

    public final String getUID() {
        return this.UID;
    }

    public final String getUserPersonalizationBucket() {
        return this.userPersonalizationBucket;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.ecommTotalValue;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.numberResults;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpSourceDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerThemeExtended;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.jioAdsEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.networkType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userPersonalizationBucket;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.UID;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.typeOfRedirection;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clientId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productSizeHit;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timeOfTheDay;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.storeType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpSource;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ecommProdid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ecommPageType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numberOfItemsOnCart;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.hybrisId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.firebaseExperiment3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpPageTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.redirection;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.screenName;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.ecommTotalValue;
        Integer n3 = this.numberResults;
        String string2 = this.plpSourceDetails;
        String string3 = this.bannerThemeExtended;
        String string4 = this.jioAdsEnabled;
        String string5 = this.networkType;
        String string6 = this.userPersonalizationBucket;
        String string7 = this.UID;
        String string8 = this.typeOfRedirection;
        String string9 = this.clientId;
        String string10 = this.productSizeHit;
        String string11 = this.timeOfTheDay;
        String string12 = this.storeType;
        String string13 = this.plpSource;
        String string14 = this.ecommProdid;
        String string15 = this.ecommPageType;
        Integer n4 = this.numberOfItemsOnCart;
        String string16 = this.hybrisId;
        String string17 = this.firebaseExperiment3;
        String string18 = this.plpPageTitle;
        String string19 = this.redirection;
        String string20 = this.screenName;
        object = new StringBuilder("ScreenViewEventModel(ecommTotalValue=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", numberResults=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", plpSourceDetails=");
        X50.a((StringBuilder)object, string2, ", bannerThemeExtended=", string3, ", jioAdsEnabled=");
        X50.a((StringBuilder)object, string4, ", networkType=", string5, ", userPersonalizationBucket=");
        X50.a((StringBuilder)object, string6, ", UID=", string7, ", typeOfRedirection=");
        X50.a((StringBuilder)object, string8, ", clientId=", string9, ", productSizeHit=");
        X50.a((StringBuilder)object, string10, ", timeOfTheDay=", string11, ", storeType=");
        X50.a((StringBuilder)object, string12, ", plpSource=", string13, ", ecommProdid=");
        string2 = string14;
        string3 = string15;
        X50.a((StringBuilder)object, string14, ", ecommPageType=", string15, ", numberOfItemsOnCart=");
        object2 = n4;
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", hybrisId=");
        object2 = string16;
        ((StringBuilder)object).append(string16);
        ((StringBuilder)object).append(", firebaseExperiment3=");
        string2 = string17;
        string3 = string18;
        X50.a((StringBuilder)object, string17, ", plpPageTitle=", string18, ", redirection=");
        string2 = string19;
        string3 = string20;
        return ko_0.a((StringBuilder)object, string19, ", screenName=", string20, ")");
    }
}

