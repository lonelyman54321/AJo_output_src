/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ICoupon {
    public static final int $stable = 8;
    private Long activeDate;
    private String bannerImageURL;
    private p83_0 couponAttributes;
    private CouponValue couponValue;
    private Long expiryDate;
    private String extraLabel;
    private String gameType;
    private boolean isSelected;
    private String label;
    private Integer offerId;
    private String offerType;
    private String plpLink;
    private String rewardId;
    private String serialNumberId;
    private String status;

    public ICoupon() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, Short.MAX_VALUE, null);
    }

    public ICoupon(Long l2, String string2, p83_0 p83_02, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, boolean bl2) {
        this.activeDate = l2;
        this.bannerImageURL = string2;
        this.couponAttributes = p83_02;
        this.couponValue = couponValue;
        this.expiryDate = l3;
        this.extraLabel = string3;
        this.gameType = string4;
        this.label = string5;
        this.offerId = n3;
        this.offerType = string6;
        this.plpLink = string7;
        this.rewardId = string8;
        this.serialNumberId = string9;
        this.status = string10;
        this.isSelected = bl2;
    }

    public /* synthetic */ ICoupon(Long object, String object2, p83_0 object3, CouponValue object4, Long object5, String object6, String string2, String string3, Integer object7, String object8, String string4, String string5, String string6, String string7, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        String string10;
        String string11;
        Integer n4;
        String string12;
        String string13;
        String string14;
        Long l2;
        CouponValue couponValue;
        p83_0 p83_02;
        String string15;
        Long l3;
        int n7 = n3;
        int n8 = n3 & 1;
        String string16 = null;
        if (n8 != 0) {
            n8 = 0;
            l3 = null;
        } else {
            l3 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string15 = null;
        } else {
            string15 = object2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            p83_02 = null;
        } else {
            p83_02 = object3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            couponValue = null;
        } else {
            couponValue = object4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            l2 = null;
        } else {
            l2 = object5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string14 = null;
        } else {
            string14 = object6;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string13 = null;
        } else {
            string13 = string2;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            n4 = null;
        } else {
            n4 = object7;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string11 = null;
        } else {
            string11 = object8;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string10 = null;
        } else {
            string10 = string4;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string9 = null;
        } else {
            string9 = string5;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        int n26 = n7 & 0x2000;
        if (n26 == 0) {
            string16 = string7;
        }
        n7 = (n7 &= 0x4000) != 0 ? 0 : (int)(bl2 ? 1 : 0);
        object = this;
        object2 = l3;
        object3 = string15;
        object4 = p83_02;
        object5 = couponValue;
        object6 = l2;
        string2 = string14;
        string3 = string13;
        object7 = string12;
        object8 = n4;
        string4 = string11;
        string5 = string10;
        string6 = string9;
        string7 = string8;
        n3 = n7;
        this(l3, string15, p83_02, couponValue, l2, string14, string13, string12, n4, string11, string10, string9, string8, string16, n7 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ ICoupon copy$default(ICoupon iCoupon, Long l2, String string2, p83_0 p83_02, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, boolean bl2, int n4, Object object) {
        void var16_17;
        ICoupon iCoupon2 = iCoupon;
        int bl3 = var16_17;
        int n7 = var16_17 & 1;
        Long l4 = n7 != 0 ? iCoupon.activeDate : l2;
        int n8 = bl3 & 2;
        String string11 = n8 != 0 ? iCoupon2.bannerImageURL : string2;
        int n10 = bl3 & 4;
        p83_0 p83_03 = n10 != 0 ? iCoupon2.couponAttributes : p83_02;
        int n14 = bl3 & 8;
        CouponValue couponValue2 = n14 != 0 ? iCoupon2.couponValue : couponValue;
        int n15 = bl3 & 0x10;
        Long l7 = n15 != 0 ? iCoupon2.expiryDate : l3;
        int n16 = bl3 & 0x20;
        String string12 = n16 != 0 ? iCoupon2.extraLabel : string3;
        int n17 = bl3 & 0x40;
        String string13 = n17 != 0 ? iCoupon2.gameType : string4;
        int n18 = bl3 & 0x80;
        String string14 = n18 != 0 ? iCoupon2.label : string5;
        int n19 = bl3 & 0x100;
        Integer n20 = n19 != 0 ? iCoupon2.offerId : n3;
        int n21 = bl3 & 0x200;
        String string15 = n21 != 0 ? iCoupon2.offerType : string6;
        int n22 = bl3 & 0x400;
        String string16 = n22 != 0 ? iCoupon2.plpLink : string7;
        int n24 = bl3 & 0x800;
        String string17 = n24 != 0 ? iCoupon2.rewardId : string8;
        int n25 = bl3 & 0x1000;
        String string18 = n25 != 0 ? iCoupon2.serialNumberId : string9;
        int n26 = bl3 & 0x2000;
        String string19 = n26 != 0 ? iCoupon2.status : string10;
        bl3 = (bl3 &= 0x4000) ? (int)iCoupon2.isSelected : (int)bl2;
        l2 = l4;
        string2 = string11;
        p83_02 = p83_03;
        couponValue = couponValue2;
        l3 = l7;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        n3 = n20;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        int bl4 = bl3;
        return iCoupon.copy(l4, string11, p83_03, couponValue2, l7, string12, string13, string14, n20, string15, string16, string17, string18, string19, (boolean)bl3);
    }

    public final Long component1() {
        return this.activeDate;
    }

    public final String component10() {
        return this.offerType;
    }

    public final String component11() {
        return this.plpLink;
    }

    public final String component12() {
        return this.rewardId;
    }

    public final String component13() {
        return this.serialNumberId;
    }

    public final String component14() {
        return this.status;
    }

    public final boolean component15() {
        return this.isSelected;
    }

    public final String component2() {
        return this.bannerImageURL;
    }

    public final p83_0 component3() {
        return this.couponAttributes;
    }

    public final CouponValue component4() {
        return this.couponValue;
    }

    public final Long component5() {
        return this.expiryDate;
    }

    public final String component6() {
        return this.extraLabel;
    }

    public final String component7() {
        return this.gameType;
    }

    public final String component8() {
        return this.label;
    }

    public final Integer component9() {
        return this.offerId;
    }

    public final ICoupon copy(Long l2, String string2, p83_0 p83_02, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, boolean bl2) {
        ICoupon iCoupon = new ICoupon(l2, string2, p83_02, couponValue, l3, string3, string4, string5, n3, string6, string7, string8, string9, string10, bl2);
        return iCoupon;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ICoupon;
        if (!bl3) {
            return false;
        }
        object = (ICoupon)object;
        Object object2 = this.activeDate;
        Object object3 = ((ICoupon)object).activeDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerImageURL;
        object3 = ((ICoupon)object).bannerImageURL;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.couponAttributes;
        object3 = ((ICoupon)object).couponAttributes;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.couponValue;
        object3 = ((ICoupon)object).couponValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryDate;
        object3 = ((ICoupon)object).expiryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extraLabel;
        object3 = ((ICoupon)object).extraLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gameType;
        object3 = ((ICoupon)object).gameType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.label;
        object3 = ((ICoupon)object).label;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerId;
        object3 = ((ICoupon)object).offerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerType;
        object3 = ((ICoupon)object).offerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpLink;
        object3 = ((ICoupon)object).plpLink;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rewardId;
        object3 = ((ICoupon)object).rewardId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.serialNumberId;
        object3 = ((ICoupon)object).serialNumberId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object3 = ((ICoupon)object).status;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isSelected;
        boolean bl4 = ((ICoupon)object).isSelected;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getActiveDate() {
        return this.activeDate;
    }

    public final String getBannerImageURL() {
        return this.bannerImageURL;
    }

    public final p83_0 getCouponAttributes() {
        return this.couponAttributes;
    }

    public final CouponValue getCouponValue() {
        return this.couponValue;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    public final String getExtraLabel() {
        return this.extraLabel;
    }

    public final String getGameType() {
        return this.gameType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getOfferId() {
        return this.offerId;
    }

    public final String getOfferType() {
        return this.offerType;
    }

    public final String getPlpLink() {
        return this.plpLink;
    }

    public final String getRewardId() {
        return this.rewardId;
    }

    public final String getSerialNumberId() {
        return this.serialNumberId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        Long l2 = this.activeDate;
        int n7 = 0;
        if (l2 == null) {
            n4 = 0;
            l2 = null;
        } else {
            n4 = ((Object)l2).hashCode();
        }
        n4 *= 31;
        Object object = this.bannerImageURL;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.couponAttributes;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.couponValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CouponValue)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extraLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gameType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.label;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpLink;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rewardId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.serialNumberId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.status;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isSelected ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setActiveDate(Long l2) {
        this.activeDate = l2;
    }

    public final void setBannerImageURL(String string2) {
        this.bannerImageURL = string2;
    }

    public final void setCouponAttributes(p83_0 p83_02) {
        this.couponAttributes = p83_02;
    }

    public final void setCouponValue(CouponValue couponValue) {
        this.couponValue = couponValue;
    }

    public final void setExpiryDate(Long l2) {
        this.expiryDate = l2;
    }

    public final void setExtraLabel(String string2) {
        this.extraLabel = string2;
    }

    public final void setGameType(String string2) {
        this.gameType = string2;
    }

    public final void setLabel(String string2) {
        this.label = string2;
    }

    public final void setOfferId(Integer n3) {
        this.offerId = n3;
    }

    public final void setOfferType(String string2) {
        this.offerType = string2;
    }

    public final void setPlpLink(String string2) {
        this.plpLink = string2;
    }

    public final void setRewardId(String string2) {
        this.rewardId = string2;
    }

    public final void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public final void setSerialNumberId(String string2) {
        this.serialNumberId = string2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        Object object = this;
        Long l2 = this.activeDate;
        String string2 = this.bannerImageURL;
        p83_0 p83_02 = this.couponAttributes;
        CouponValue couponValue = this.couponValue;
        Long l3 = this.expiryDate;
        String string3 = this.extraLabel;
        String string4 = this.gameType;
        String string5 = this.label;
        Integer n3 = this.offerId;
        String string6 = this.offerType;
        String string7 = this.plpLink;
        String string8 = this.rewardId;
        String string9 = this.serialNumberId;
        String string10 = this.status;
        boolean bl2 = this.isSelected;
        object = new StringBuilder("ICoupon(activeDate=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(", bannerImageURL=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", couponAttributes=");
        ((StringBuilder)object).append(p83_02);
        ((StringBuilder)object).append(", couponValue=");
        ((StringBuilder)object).append(couponValue);
        ((StringBuilder)object).append(", expiryDate=");
        ((StringBuilder)object).append(l3);
        ((StringBuilder)object).append(", extraLabel=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", gameType=");
        X50.a((StringBuilder)object, string4, ", label=", string5, ", offerId=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", offerType=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", plpLink=");
        X50.a((StringBuilder)object, string7, ", rewardId=", string8, ", serialNumberId=");
        X50.a((StringBuilder)object, string9, ", status=", string10, ", isSelected=");
        return Vm.a(")", bl2, (StringBuilder)object);
    }
}

