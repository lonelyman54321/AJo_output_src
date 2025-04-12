/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.Coupon$Companion;
import com.ril.ajio.kmm.shared.bonanza.model.CouponValue;
import com.ril.ajio.kmm.shared.bonanza.model.CouponValue$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.Filters$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Coupon {
    private static final KSerializer[] $childSerializers;
    public static final Coupon$Companion Companion;
    private Long activeDate;
    private String bannerImageURL;
    private List couponAttributes;
    private CouponValue couponValue;
    private Long expiryDate;
    private String extraLabel;
    private String gameType;
    private String label;
    private Integer offerId;
    private String offerType;
    private String plpLink;
    private String rewardId;
    private String serialNumberId;
    private String status;

    static {
        Object object = new Coupon$Companion(null);
        Companion = object;
        KSerializer[] kSerializerArray = Filters$$serializer.INSTANCE;
        object = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{null, null, object, null, null, null, null, null, null, null, null, null, null, null};
        $childSerializers = kSerializerArray;
    }

    public Coupon() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ Coupon(int n3, Long l2, String string2, List list, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n4, String string6, String string7, String string8, String string9, String string10, a03_0 a03_02) {
        Coupon coupon = this;
        int n7 = n3;
        int n8 = n3 & 1;
        this.activeDate = n8 == 0 ? null : l2;
        n8 = n7 & 2;
        coupon.bannerImageURL = n8 == 0 ? null : string2;
        n8 = n7 & 4;
        coupon.couponAttributes = n8 == 0 ? null : list;
        n8 = n7 & 8;
        coupon.couponValue = n8 == 0 ? null : couponValue;
        n8 = n7 & 0x10;
        coupon.expiryDate = n8 == 0 ? null : l3;
        n8 = n7 & 0x20;
        coupon.extraLabel = n8 == 0 ? null : string3;
        n8 = n7 & 0x40;
        coupon.gameType = n8 == 0 ? null : string4;
        n8 = n7 & 0x80;
        coupon.label = n8 == 0 ? null : string5;
        n8 = n7 & 0x100;
        coupon.offerId = n8 == 0 ? null : n4;
        n8 = n7 & 0x200;
        coupon.offerType = n8 == 0 ? null : string6;
        n8 = n7 & 0x400;
        coupon.plpLink = n8 == 0 ? null : string7;
        n8 = n7 & 0x800;
        coupon.rewardId = n8 == 0 ? null : string8;
        n8 = n7 & 0x1000;
        coupon.serialNumberId = n8 == 0 ? null : string9;
        coupon.status = (n7 &= 0x2000) == 0 ? null : string10;
    }

    public Coupon(Long l2, String string2, List list, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10) {
        this.activeDate = l2;
        this.bannerImageURL = string2;
        this.couponAttributes = list;
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
    }

    public /* synthetic */ Coupon(Long object, String object2, List object3, CouponValue object4, Long object5, String object6, String string2, String string3, Integer object7, String object8, String string4, String string5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
        List list;
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
            list = null;
        } else {
            list = object3;
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
        if ((n7 &= 0x2000) == 0) {
            string16 = string7;
        }
        object = this;
        object2 = l3;
        object3 = string15;
        object4 = list;
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
        this(l3, string15, list, couponValue, l2, string14, string13, string12, n4, string11, string10, string9, string8, string16);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Coupon copy$default(Coupon coupon, Long l2, String string2, List list, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, int n4, Object object) {
        Coupon coupon2 = coupon;
        int n7 = n4;
        int n8 = n4 & 1;
        Long l4 = n8 != 0 ? coupon.activeDate : l2;
        int n10 = n7 & 2;
        String string11 = n10 != 0 ? coupon2.bannerImageURL : string2;
        int n14 = n7 & 4;
        List list2 = n14 != 0 ? coupon2.couponAttributes : list;
        int n15 = n7 & 8;
        CouponValue couponValue2 = n15 != 0 ? coupon2.couponValue : couponValue;
        int n16 = n7 & 0x10;
        Long l7 = n16 != 0 ? coupon2.expiryDate : l3;
        int n17 = n7 & 0x20;
        String string12 = n17 != 0 ? coupon2.extraLabel : string3;
        int n18 = n7 & 0x40;
        String string13 = n18 != 0 ? coupon2.gameType : string4;
        int n19 = n7 & 0x80;
        String string14 = n19 != 0 ? coupon2.label : string5;
        int n20 = n7 & 0x100;
        Integer n21 = n20 != 0 ? coupon2.offerId : n3;
        int n22 = n7 & 0x200;
        String string15 = n22 != 0 ? coupon2.offerType : string6;
        int n24 = n7 & 0x400;
        String string16 = n24 != 0 ? coupon2.plpLink : string7;
        int n25 = n7 & 0x800;
        String string17 = n25 != 0 ? coupon2.rewardId : string8;
        int n26 = n7 & 0x1000;
        String string18 = n26 != 0 ? coupon2.serialNumberId : string9;
        String string19 = (n7 &= 0x2000) != 0 ? coupon2.status : string10;
        l2 = l4;
        string2 = string11;
        list = list2;
        couponValue = couponValue2;
        l3 = l7;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        n3 = n21;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        return coupon.copy(l4, string11, list2, couponValue2, l7, string12, string13, string14, n21, string15, string16, string17, string18, string19);
    }

    public static final /* synthetic */ void write$Self$shared_release(Coupon object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        Object object2;
        Object object3;
        Object object4 = $childSerializers;
        int n4 = 0;
        Object object5 = null;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((Coupon)object).activeDate) != null) {
            object3 = mb1_2.a;
            object2 = ((Coupon)object).activeDate;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 1)) || (object3 = ((Coupon)object).bannerImageURL) != null) {
            object3 = pe3_2.a;
            object2 = ((Coupon)object).bannerImageURL;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 2)) || (object3 = ((Coupon)object).couponAttributes) != null) {
            object4 = object4[n4];
            object3 = ((Coupon)object).couponAttributes;
            u30_02.r(serialDescriptor, n4, (b03_0)object4, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 3) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).couponValue) != null) {
            object5 = CouponValue$$serializer.INSTANCE;
            object3 = ((Coupon)object).couponValue;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 4) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).expiryDate) != null) {
            object5 = mb1_2.a;
            object3 = ((Coupon)object).expiryDate;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 5) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).extraLabel) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).extraLabel;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 6) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).gameType) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).gameType;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 7) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).label) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).label;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 8) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).offerId) != null) {
            object5 = yi1_2.a;
            object3 = ((Coupon)object).offerId;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 9) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).offerType) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).offerType;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 10) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).plpLink) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).plpLink;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 11) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).rewardId) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).rewardId;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 12) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).serialNumberId) != null) {
            object5 = pe3_2.a;
            object3 = ((Coupon)object).serialNumberId;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 13) ? 1 : 0)) != 0 || (object5 = ((Coupon)object).status) != null) {
            object5 = pe3_2.a;
            object = ((Coupon)object).status;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object);
        }
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

    public final String component2() {
        return this.bannerImageURL;
    }

    public final List component3() {
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

    public final Coupon copy(Long l2, String string2, List list, CouponValue couponValue, Long l3, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10) {
        Coupon coupon = new Coupon(l2, string2, list, couponValue, l3, string3, string4, string5, n3, string6, string7, string8, string9, string10);
        return coupon;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Coupon;
        if (!bl3) {
            return false;
        }
        object = (Coupon)object;
        Object object2 = this.activeDate;
        Object object3 = ((Coupon)object).activeDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerImageURL;
        object3 = ((Coupon)object).bannerImageURL;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.couponAttributes;
        object3 = ((Coupon)object).couponAttributes;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.couponValue;
        object3 = ((Coupon)object).couponValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryDate;
        object3 = ((Coupon)object).expiryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extraLabel;
        object3 = ((Coupon)object).extraLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gameType;
        object3 = ((Coupon)object).gameType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.label;
        object3 = ((Coupon)object).label;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerId;
        object3 = ((Coupon)object).offerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerType;
        object3 = ((Coupon)object).offerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpLink;
        object3 = ((Coupon)object).plpLink;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rewardId;
        object3 = ((Coupon)object).rewardId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.serialNumberId;
        object3 = ((Coupon)object).serialNumberId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((Coupon)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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

    public final List getCouponAttributes() {
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
        return n4 + n7;
    }

    public final void setActiveDate(Long l2) {
        this.activeDate = l2;
    }

    public final void setBannerImageURL(String string2) {
        this.bannerImageURL = string2;
    }

    public final void setCouponAttributes(List list) {
        this.couponAttributes = list;
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

    public final void setSerialNumberId(String string2) {
        this.serialNumberId = string2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        Long l2 = this.activeDate;
        String string2 = this.bannerImageURL;
        List list = this.couponAttributes;
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
        StringBuilder stringBuilder = new StringBuilder("Coupon(activeDate=");
        stringBuilder.append(l2);
        stringBuilder.append(", bannerImageURL=");
        stringBuilder.append(string2);
        stringBuilder.append(", couponAttributes=");
        stringBuilder.append(list);
        stringBuilder.append(", couponValue=");
        stringBuilder.append(couponValue);
        stringBuilder.append(", expiryDate=");
        stringBuilder.append(l3);
        stringBuilder.append(", extraLabel=");
        stringBuilder.append(string3);
        stringBuilder.append(", gameType=");
        X50.a(stringBuilder, string4, ", label=", string5, ", offerId=");
        stringBuilder.append(n3);
        stringBuilder.append(", offerType=");
        stringBuilder.append(string6);
        stringBuilder.append(", plpLink=");
        X50.a(stringBuilder, string7, ", rewardId=", string8, ", serialNumberId=");
        return ko_0.a(stringBuilder, string9, ", status=", string10, ")");
    }
}

