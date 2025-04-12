/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpModel {
    public static final int $stable;
    private final String eventAction;
    private final String eventCategory;
    private final String eventLable;
    private final String imageSearchCategory;
    private final String pageType;
    private final String plpCategoryId;
    private final String plpPageTitle;
    private final String plpSource;
    private final String plpSourceDetails;
    private final String productId;
    private final String productName;
    private final String productSizeHit;
    private final String screenName;
    private final String searchTerm;
    private final String typeOfRedirection;

    public PlpModel(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16) {
        this.screenName = string2;
        this.eventCategory = string3;
        this.eventAction = string4;
        this.eventLable = string5;
        this.plpSource = string6;
        this.plpSourceDetails = string7;
        this.plpCategoryId = string8;
        this.plpPageTitle = string9;
        this.typeOfRedirection = string10;
        this.pageType = string11;
        this.searchTerm = string12;
        this.productId = string13;
        this.productName = string14;
        this.imageSearchCategory = string15;
        this.productSizeHit = string16;
    }

    public /* synthetic */ PlpModel(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3;
        int n7 = n3 & 0x200;
        String string17 = n7 != 0 ? null : string11;
        n7 = n4 & 0x400;
        String string18 = n7 != 0 ? null : string12;
        n7 = n4 & 0x800;
        String string19 = n7 != 0 ? null : string13;
        n7 = n4 & 0x1000;
        String string20 = n7 != 0 ? null : string14;
        n7 = n4 & 0x2000;
        String string21 = n7 != 0 ? null : string15;
        String string22 = (n4 &= 0x4000) != 0 ? null : string16;
        this(string2, string3, string4, string5, string6, string7, string8, string9, string10, string17, string18, string19, string20, string21, string22);
    }

    public static /* synthetic */ PlpModel copy$default(PlpModel plpModel, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, int n3, Object object) {
        PlpModel plpModel2 = plpModel;
        int n4 = n3;
        int n7 = n3 & 1;
        String string17 = n7 != 0 ? plpModel.screenName : string2;
        int n8 = n4 & 2;
        String string18 = n8 != 0 ? plpModel2.eventCategory : string3;
        int n10 = n4 & 4;
        String string19 = n10 != 0 ? plpModel2.eventAction : string4;
        int n14 = n4 & 8;
        String string20 = n14 != 0 ? plpModel2.eventLable : string5;
        int n15 = n4 & 0x10;
        String string21 = n15 != 0 ? plpModel2.plpSource : string6;
        int n16 = n4 & 0x20;
        String string22 = n16 != 0 ? plpModel2.plpSourceDetails : string7;
        int n17 = n4 & 0x40;
        String string23 = n17 != 0 ? plpModel2.plpCategoryId : string8;
        int n18 = n4 & 0x80;
        String string24 = n18 != 0 ? plpModel2.plpPageTitle : string9;
        int n19 = n4 & 0x100;
        String string25 = n19 != 0 ? plpModel2.typeOfRedirection : string10;
        int n20 = n4 & 0x200;
        String string26 = n20 != 0 ? plpModel2.pageType : string11;
        int n21 = n4 & 0x400;
        String string27 = n21 != 0 ? plpModel2.searchTerm : string12;
        int n22 = n4 & 0x800;
        String string28 = n22 != 0 ? plpModel2.productId : string13;
        int n24 = n4 & 0x1000;
        String string29 = n24 != 0 ? plpModel2.productName : string14;
        int n25 = n4 & 0x2000;
        String string30 = n25 != 0 ? plpModel2.imageSearchCategory : string15;
        String string31 = (n4 &= 0x4000) != 0 ? plpModel2.productSizeHit : string16;
        string2 = string17;
        string3 = string18;
        string4 = string19;
        string5 = string20;
        string6 = string21;
        string7 = string22;
        string8 = string23;
        string9 = string24;
        string10 = string25;
        string11 = string26;
        string12 = string27;
        string13 = string28;
        string14 = string29;
        string15 = string30;
        string16 = string31;
        return plpModel.copy(string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31);
    }

    public final String component1() {
        return this.screenName;
    }

    public final String component10() {
        return this.pageType;
    }

    public final String component11() {
        return this.searchTerm;
    }

    public final String component12() {
        return this.productId;
    }

    public final String component13() {
        return this.productName;
    }

    public final String component14() {
        return this.imageSearchCategory;
    }

    public final String component15() {
        return this.productSizeHit;
    }

    public final String component2() {
        return this.eventCategory;
    }

    public final String component3() {
        return this.eventAction;
    }

    public final String component4() {
        return this.eventLable;
    }

    public final String component5() {
        return this.plpSource;
    }

    public final String component6() {
        return this.plpSourceDetails;
    }

    public final String component7() {
        return this.plpCategoryId;
    }

    public final String component8() {
        return this.plpPageTitle;
    }

    public final String component9() {
        return this.typeOfRedirection;
    }

    public final PlpModel copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16) {
        PlpModel plpModel = new PlpModel(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16);
        return plpModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpModel;
        if (!bl3) {
            return false;
        }
        object = (PlpModel)object;
        String string2 = this.screenName;
        String string3 = ((PlpModel)object).screenName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.eventCategory;
        string3 = ((PlpModel)object).eventCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.eventAction;
        string3 = ((PlpModel)object).eventAction;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.eventLable;
        string3 = ((PlpModel)object).eventLable;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.plpSource;
        string3 = ((PlpModel)object).plpSource;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.plpSourceDetails;
        string3 = ((PlpModel)object).plpSourceDetails;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.plpCategoryId;
        string3 = ((PlpModel)object).plpCategoryId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.plpPageTitle;
        string3 = ((PlpModel)object).plpPageTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.typeOfRedirection;
        string3 = ((PlpModel)object).typeOfRedirection;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pageType;
        string3 = ((PlpModel)object).pageType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.searchTerm;
        string3 = ((PlpModel)object).searchTerm;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productId;
        string3 = ((PlpModel)object).productId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productName;
        string3 = ((PlpModel)object).productName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageSearchCategory;
        string3 = ((PlpModel)object).imageSearchCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productSizeHit;
        object = ((PlpModel)object).productSizeHit;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEventAction() {
        return this.eventAction;
    }

    public final String getEventCategory() {
        return this.eventCategory;
    }

    public final String getEventLable() {
        return this.eventLable;
    }

    public final String getImageSearchCategory() {
        return this.imageSearchCategory;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final String getPlpCategoryId() {
        return this.plpCategoryId;
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

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductSizeHit() {
        return this.productSizeHit;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final String getTypeOfRedirection() {
        return this.typeOfRedirection;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.screenName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.eventCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.eventAction;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.eventLable;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.plpSource;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.plpSourceDetails;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.plpCategoryId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.plpPageTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.typeOfRedirection;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pageType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.searchTerm;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.productId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.productName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.imageSearchCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.productSizeHit;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Object object = this;
        String string2 = this.screenName;
        String string3 = this.eventCategory;
        String string4 = this.eventAction;
        String string5 = this.eventLable;
        String string6 = this.plpSource;
        String string7 = this.plpSourceDetails;
        String string8 = this.plpCategoryId;
        String string9 = this.plpPageTitle;
        String string10 = this.typeOfRedirection;
        String string11 = this.pageType;
        String string12 = this.searchTerm;
        String string13 = this.productId;
        String string14 = this.productName;
        String string15 = this.imageSearchCategory;
        String string16 = this.productSizeHit;
        object = og_1.a("PlpModel(screenName=", string2, ", eventCategory=", string3, ", eventAction=");
        X50.a((StringBuilder)object, string4, ", eventLable=", string5, ", plpSource=");
        X50.a((StringBuilder)object, string6, ", plpSourceDetails=", string7, ", plpCategoryId=");
        X50.a((StringBuilder)object, string8, ", plpPageTitle=", string9, ", typeOfRedirection=");
        X50.a((StringBuilder)object, string10, ", pageType=", string11, ", searchTerm=");
        X50.a((StringBuilder)object, string12, ", productId=", string13, ", productName=");
        string4 = string14;
        X50.a((StringBuilder)object, string14, ", imageSearchCategory=", string15, ", productSizeHit=");
        string3 = string16;
        return h30_0.a((StringBuilder)object, string16, ")");
    }
}

