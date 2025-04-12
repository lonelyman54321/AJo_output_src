/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events.enum;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AppsFlyerEventsItem {
    public static final int $stable = 8;
    private String brick;
    private String content;
    private String contentId;
    private String contentType;
    private String currency;
    private String luxeBrickType;
    private String luxeCartQuantity;
    private String luxeContentType;
    private String luxeProductIds;
    private String luxeSegmentType;
    private String luxeTotalRevenue;
    private String orderId;
    private String price;
    private String quantity;
    private String revenue;
    private String segment;

    public AppsFlyerEventsItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (char)-1, null);
    }

    public AppsFlyerEventsItem(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17) {
        this.revenue = string2;
        this.price = string3;
        this.contentId = string4;
        this.contentType = string5;
        this.currency = string6;
        this.quantity = string7;
        this.segment = string8;
        this.brick = string9;
        this.orderId = string10;
        this.content = string11;
        this.luxeProductIds = string12;
        this.luxeCartQuantity = string13;
        this.luxeBrickType = string14;
        this.luxeContentType = string15;
        this.luxeSegmentType = string16;
        this.luxeTotalRevenue = string17;
    }

    public /* synthetic */ AppsFlyerEventsItem(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string32 = null;
        } else {
            string32 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string31 = null;
        } else {
            string31 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string30 = null;
        } else {
            string30 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string29 = null;
        } else {
            string29 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string28 = null;
        } else {
            string28 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string27 = null;
        } else {
            string27 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string26 = null;
        } else {
            string26 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string25 = null;
        } else {
            string25 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string24 = null;
        } else {
            string24 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string23 = null;
        } else {
            string23 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string22 = null;
        } else {
            string22 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string21 = null;
        } else {
            string21 = string12;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string20 = null;
        } else {
            string20 = string13;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string19 = null;
        } else {
            string19 = string14;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string18 = null;
        } else {
            string18 = string15;
        }
        int n27 = 32768;
        if ((n4 &= n27) != 0) {
            n4 = 0;
            string17 = null;
        } else {
            string17 = string16;
        }
        object = this;
        string2 = string32;
        string3 = string31;
        string4 = string30;
        string5 = string29;
        string6 = string28;
        string7 = string27;
        string8 = string26;
        string9 = string25;
        string10 = string24;
        string11 = string23;
        string12 = string22;
        string13 = string21;
        string14 = string20;
        string15 = string19;
        string16 = string18;
        this(string32, string31, string30, string29, string28, string27, string26, string25, string24, string23, string22, string21, string20, string19, string18, string17);
    }

    public static /* synthetic */ AppsFlyerEventsItem copy$default(AppsFlyerEventsItem appsFlyerEventsItem, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, int n3, Object object) {
        AppsFlyerEventsItem appsFlyerEventsItem2 = appsFlyerEventsItem;
        int n4 = n3;
        int n7 = n3 & 1;
        String string18 = n7 != 0 ? appsFlyerEventsItem.revenue : string2;
        int n8 = n4 & 2;
        String string19 = n8 != 0 ? appsFlyerEventsItem2.price : string3;
        int n10 = n4 & 4;
        String string20 = n10 != 0 ? appsFlyerEventsItem2.contentId : string4;
        int n14 = n4 & 8;
        String string21 = n14 != 0 ? appsFlyerEventsItem2.contentType : string5;
        int n15 = n4 & 0x10;
        String string22 = n15 != 0 ? appsFlyerEventsItem2.currency : string6;
        int n16 = n4 & 0x20;
        String string23 = n16 != 0 ? appsFlyerEventsItem2.quantity : string7;
        int n17 = n4 & 0x40;
        String string24 = n17 != 0 ? appsFlyerEventsItem2.segment : string8;
        int n18 = n4 & 0x80;
        String string25 = n18 != 0 ? appsFlyerEventsItem2.brick : string9;
        int n19 = n4 & 0x100;
        String string26 = n19 != 0 ? appsFlyerEventsItem2.orderId : string10;
        int n20 = n4 & 0x200;
        String string27 = n20 != 0 ? appsFlyerEventsItem2.content : string11;
        int n21 = n4 & 0x400;
        String string28 = n21 != 0 ? appsFlyerEventsItem2.luxeProductIds : string12;
        int n22 = n4 & 0x800;
        String string29 = n22 != 0 ? appsFlyerEventsItem2.luxeCartQuantity : string13;
        int n24 = n4 & 0x1000;
        String string30 = n24 != 0 ? appsFlyerEventsItem2.luxeBrickType : string14;
        int n25 = n4 & 0x2000;
        String string31 = n25 != 0 ? appsFlyerEventsItem2.luxeContentType : string15;
        string15 = string31;
        n25 = n4 & 0x4000;
        string31 = n25 != 0 ? appsFlyerEventsItem2.luxeSegmentType : string16;
        int n26 = 32768;
        String string32 = (n4 &= n26) != 0 ? appsFlyerEventsItem2.luxeTotalRevenue : string17;
        string2 = string18;
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
        string14 = string30;
        string16 = string31;
        string17 = string32;
        return appsFlyerEventsItem.copy(string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string15, string31, string32);
    }

    public final String component1() {
        return this.revenue;
    }

    public final String component10() {
        return this.content;
    }

    public final String component11() {
        return this.luxeProductIds;
    }

    public final String component12() {
        return this.luxeCartQuantity;
    }

    public final String component13() {
        return this.luxeBrickType;
    }

    public final String component14() {
        return this.luxeContentType;
    }

    public final String component15() {
        return this.luxeSegmentType;
    }

    public final String component16() {
        return this.luxeTotalRevenue;
    }

    public final String component2() {
        return this.price;
    }

    public final String component3() {
        return this.contentId;
    }

    public final String component4() {
        return this.contentType;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.quantity;
    }

    public final String component7() {
        return this.segment;
    }

    public final String component8() {
        return this.brick;
    }

    public final String component9() {
        return this.orderId;
    }

    public final AppsFlyerEventsItem copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17) {
        AppsFlyerEventsItem appsFlyerEventsItem = new AppsFlyerEventsItem(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17);
        return appsFlyerEventsItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AppsFlyerEventsItem;
        if (!bl3) {
            return false;
        }
        object = (AppsFlyerEventsItem)object;
        String string2 = this.revenue;
        String string3 = ((AppsFlyerEventsItem)object).revenue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.price;
        string3 = ((AppsFlyerEventsItem)object).price;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.contentId;
        string3 = ((AppsFlyerEventsItem)object).contentId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.contentType;
        string3 = ((AppsFlyerEventsItem)object).contentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.currency;
        string3 = ((AppsFlyerEventsItem)object).currency;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.quantity;
        string3 = ((AppsFlyerEventsItem)object).quantity;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.segment;
        string3 = ((AppsFlyerEventsItem)object).segment;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brick;
        string3 = ((AppsFlyerEventsItem)object).brick;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.orderId;
        string3 = ((AppsFlyerEventsItem)object).orderId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.content;
        string3 = ((AppsFlyerEventsItem)object).content;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeProductIds;
        string3 = ((AppsFlyerEventsItem)object).luxeProductIds;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeCartQuantity;
        string3 = ((AppsFlyerEventsItem)object).luxeCartQuantity;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeBrickType;
        string3 = ((AppsFlyerEventsItem)object).luxeBrickType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeContentType;
        string3 = ((AppsFlyerEventsItem)object).luxeContentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeSegmentType;
        string3 = ((AppsFlyerEventsItem)object).luxeSegmentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.luxeTotalRevenue;
        object = ((AppsFlyerEventsItem)object).luxeTotalRevenue;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrick() {
        return this.brick;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLuxeBrickType() {
        return this.luxeBrickType;
    }

    public final String getLuxeCartQuantity() {
        return this.luxeCartQuantity;
    }

    public final String getLuxeContentType() {
        return this.luxeContentType;
    }

    public final String getLuxeProductIds() {
        return this.luxeProductIds;
    }

    public final String getLuxeSegmentType() {
        return this.luxeSegmentType;
    }

    public final String getLuxeTotalRevenue() {
        return this.luxeTotalRevenue;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getRevenue() {
        return this.revenue;
    }

    public final String getSegment() {
        return this.segment;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.revenue;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.price;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.contentId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.contentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.currency;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.quantity;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.segment;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brick;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.orderId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.content;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeProductIds;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeCartQuantity;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeBrickType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeContentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeSegmentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.luxeTotalRevenue;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBrick(String string2) {
        this.brick = string2;
    }

    public final void setContent(String string2) {
        this.content = string2;
    }

    public final void setContentId(String string2) {
        this.contentId = string2;
    }

    public final void setContentType(String string2) {
        this.contentType = string2;
    }

    public final void setCurrency(String string2) {
        this.currency = string2;
    }

    public final void setLuxeBrickType(String string2) {
        this.luxeBrickType = string2;
    }

    public final void setLuxeCartQuantity(String string2) {
        this.luxeCartQuantity = string2;
    }

    public final void setLuxeContentType(String string2) {
        this.luxeContentType = string2;
    }

    public final void setLuxeProductIds(String string2) {
        this.luxeProductIds = string2;
    }

    public final void setLuxeSegmentType(String string2) {
        this.luxeSegmentType = string2;
    }

    public final void setLuxeTotalRevenue(String string2) {
        this.luxeTotalRevenue = string2;
    }

    public final void setOrderId(String string2) {
        this.orderId = string2;
    }

    public final void setPrice(String string2) {
        this.price = string2;
    }

    public final void setQuantity(String string2) {
        this.quantity = string2;
    }

    public final void setRevenue(String string2) {
        this.revenue = string2;
    }

    public final void setSegment(String string2) {
        this.segment = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.revenue;
        String string3 = this.price;
        String string4 = this.contentId;
        String string5 = this.contentType;
        String string6 = this.currency;
        String string7 = this.quantity;
        String string8 = this.segment;
        String string9 = this.brick;
        String string10 = this.orderId;
        String string11 = this.content;
        String string12 = this.luxeProductIds;
        String string13 = this.luxeCartQuantity;
        String string14 = this.luxeBrickType;
        String string15 = this.luxeContentType;
        String string16 = this.luxeSegmentType;
        String string17 = this.luxeTotalRevenue;
        object = og_1.a("AppsFlyerEventsItem(revenue=", string2, ", price=", string3, ", contentId=");
        X50.a((StringBuilder)object, string4, ", contentType=", string5, ", currency=");
        X50.a((StringBuilder)object, string6, ", quantity=", string7, ", segment=");
        X50.a((StringBuilder)object, string8, ", brick=", string9, ", orderId=");
        X50.a((StringBuilder)object, string10, ", content=", string11, ", luxeProductIds=");
        X50.a((StringBuilder)object, string12, ", luxeCartQuantity=", string13, ", luxeBrickType=");
        string4 = string14;
        X50.a((StringBuilder)object, string14, ", luxeContentType=", string15, ", luxeSegmentType=");
        string4 = string16;
        string5 = string17;
        return ko_0.a((StringBuilder)object, string16, ", luxeTotalRevenue=", string17, ")");
    }
}

