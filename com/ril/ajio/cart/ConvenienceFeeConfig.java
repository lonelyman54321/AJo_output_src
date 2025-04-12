/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.cart;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ConvenienceFeeConfig {
    public static final int $stable;
    private final String cashOnDeliveryFeeLabel;
    private final String codExtraDeliveryText;
    private final String codFeeDesc;
    private final String codPopUpTopDesc;
    private final String codPopUpTopDescFree;
    private final String convenienceFeeNote;
    private final String convenienceFeeTitle;
    private final String deliveryFeeDesc;
    private final String deliveryFeeLabel;
    private final String infoLabel;
    private final Boolean isCodFeeApplicable;
    private final Boolean isConvFeeOrderDetailEnable;
    private final Boolean isRvpFeeApplicable;
    private final Boolean masterFlag;
    private final String orderConfirmReadPolicy;
    private final String platformConvenienceFeeDesc;
    private final String platformConvenienceFeeLabel;
    private final String priorityDeliveryFeeDesc;
    private final String priorityDeliveryFeeLabel;
    private final String returnRefundReadPolicy;
    private final String totalConvenienceFeeLabel;

    public ConvenienceFeeConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFF, null);
    }

    public ConvenienceFeeConfig(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
        this.cashOnDeliveryFeeLabel = string2;
        this.codPopUpTopDesc = string3;
        this.codPopUpTopDescFree = string4;
        this.codExtraDeliveryText = string5;
        this.convenienceFeeTitle = string6;
        this.deliveryFeeLabel = string7;
        this.deliveryFeeDesc = string8;
        this.infoLabel = string9;
        this.isCodFeeApplicable = bl2;
        this.isRvpFeeApplicable = bl3;
        this.masterFlag = bl4;
        this.isConvFeeOrderDetailEnable = bl5;
        this.platformConvenienceFeeLabel = string10;
        this.platformConvenienceFeeDesc = string11;
        this.codFeeDesc = string12;
        this.convenienceFeeNote = string13;
        this.totalConvenienceFeeLabel = string14;
        this.orderConfirmReadPolicy = string15;
        this.returnRefundReadPolicy = string16;
        this.priorityDeliveryFeeLabel = string17;
        this.priorityDeliveryFeeDesc = string18;
    }

    public /* synthetic */ ConvenienceFeeConfig(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Boolean object2, Boolean bl2, Boolean bl3, Boolean bl4, String object3, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        Boolean bl5;
        Boolean bl6;
        Boolean bl7;
        String string26;
        String string27;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        String string33;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string33 = null;
        } else {
            string33 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string32 = null;
        } else {
            string32 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string31 = null;
        } else {
            string31 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string30 = null;
        } else {
            string30 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string29 = null;
        } else {
            string29 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string28 = null;
        } else {
            string28 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string27 = null;
        } else {
            string27 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string26 = null;
        } else {
            string26 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            bl7 = null;
        } else {
            bl7 = object2;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            bl6 = null;
        } else {
            bl6 = bl2;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            bl5 = null;
        } else {
            bl5 = bl3;
        }
        int n22 = n4 & 0x800;
        Boolean bl8 = n22 != 0 ? Boolean.FALSE : bl4;
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string25 = null;
        } else {
            string25 = object3;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string24 = null;
        } else {
            string24 = string9;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string23 = null;
        } else {
            string23 = string10;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string22 = null;
        } else {
            string22 = string11;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string21 = null;
        } else {
            string21 = string12;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string20 = null;
        } else {
            string20 = string13;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string19 = null;
        } else {
            string19 = string14;
        }
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            string18 = null;
        } else {
            string18 = string15;
        }
        int n34 = 0x100000;
        if ((n4 &= n34) != 0) {
            n4 = 0;
            string17 = null;
        } else {
            string17 = string16;
        }
        object = this;
        string2 = string33;
        string3 = string32;
        string4 = string31;
        string5 = string30;
        string6 = string29;
        string7 = string28;
        string8 = string27;
        object2 = string26;
        bl2 = bl7;
        bl3 = bl6;
        bl4 = bl5;
        object3 = bl8;
        string9 = string25;
        string10 = string24;
        string11 = string23;
        string12 = string22;
        string13 = string21;
        string14 = string20;
        string15 = string19;
        string16 = string18;
        this(string33, string32, string31, string30, string29, string28, string27, string26, bl7, bl6, bl5, bl8, string25, string24, string23, string22, string21, string20, string19, string18, string17);
    }

    public static /* synthetic */ ConvenienceFeeConfig copy$default(ConvenienceFeeConfig convenienceFeeConfig, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, int n3, Object object) {
        ConvenienceFeeConfig convenienceFeeConfig2 = convenienceFeeConfig;
        int n4 = n3;
        int n7 = n3 & 1;
        String string19 = n7 != 0 ? convenienceFeeConfig.cashOnDeliveryFeeLabel : string2;
        int n8 = n4 & 2;
        String string20 = n8 != 0 ? convenienceFeeConfig2.codPopUpTopDesc : string3;
        int n10 = n4 & 4;
        String string21 = n10 != 0 ? convenienceFeeConfig2.codPopUpTopDescFree : string4;
        int n14 = n4 & 8;
        String string22 = n14 != 0 ? convenienceFeeConfig2.codExtraDeliveryText : string5;
        int n15 = n4 & 0x10;
        String string23 = n15 != 0 ? convenienceFeeConfig2.convenienceFeeTitle : string6;
        int n16 = n4 & 0x20;
        String string24 = n16 != 0 ? convenienceFeeConfig2.deliveryFeeLabel : string7;
        int n17 = n4 & 0x40;
        String string25 = n17 != 0 ? convenienceFeeConfig2.deliveryFeeDesc : string8;
        int n18 = n4 & 0x80;
        String string26 = n18 != 0 ? convenienceFeeConfig2.infoLabel : string9;
        int n19 = n4 & 0x100;
        Boolean bl6 = n19 != 0 ? convenienceFeeConfig2.isCodFeeApplicable : bl2;
        int n20 = n4 & 0x200;
        Boolean bl7 = n20 != 0 ? convenienceFeeConfig2.isRvpFeeApplicable : bl3;
        int n21 = n4 & 0x400;
        Boolean bl8 = n21 != 0 ? convenienceFeeConfig2.masterFlag : bl4;
        int n22 = n4 & 0x800;
        Boolean bl9 = n22 != 0 ? convenienceFeeConfig2.isConvFeeOrderDetailEnable : bl5;
        int n24 = n4 & 0x1000;
        String string27 = n24 != 0 ? convenienceFeeConfig2.platformConvenienceFeeLabel : string10;
        int n25 = n4 & 0x2000;
        String string28 = n25 != 0 ? convenienceFeeConfig2.platformConvenienceFeeDesc : string11;
        string11 = string28;
        n25 = n4 & 0x4000;
        string28 = n25 != 0 ? convenienceFeeConfig2.codFeeDesc : string12;
        int n26 = n4 & 0x8000;
        string12 = string28;
        string28 = n26 != 0 ? convenienceFeeConfig2.convenienceFeeNote : string13;
        n26 = n4 & 0x10000;
        string13 = string28;
        string28 = n26 != 0 ? convenienceFeeConfig2.totalConvenienceFeeLabel : string14;
        n26 = n4 & 0x20000;
        string14 = string28;
        string28 = n26 != 0 ? convenienceFeeConfig2.orderConfirmReadPolicy : string15;
        n26 = n4 & 0x40000;
        string15 = string28;
        string28 = n26 != 0 ? convenienceFeeConfig2.returnRefundReadPolicy : string16;
        n26 = n4 & 0x80000;
        string16 = string28;
        string28 = n26 != 0 ? convenienceFeeConfig2.priorityDeliveryFeeLabel : string17;
        n26 = 0x100000;
        String string29 = (n4 &= n26) != 0 ? convenienceFeeConfig2.priorityDeliveryFeeDesc : string18;
        string2 = string19;
        string3 = string20;
        string4 = string21;
        string5 = string22;
        string6 = string23;
        string7 = string24;
        string8 = string25;
        string9 = string26;
        bl2 = bl6;
        bl3 = bl7;
        bl4 = bl8;
        bl5 = bl9;
        string10 = string27;
        string17 = string28;
        string18 = string29;
        return convenienceFeeConfig.copy(string19, string20, string21, string22, string23, string24, string25, string26, bl6, bl7, bl8, bl9, string27, string11, string12, string13, string14, string15, string16, string28, string29);
    }

    public final String component1() {
        return this.cashOnDeliveryFeeLabel;
    }

    public final Boolean component10() {
        return this.isRvpFeeApplicable;
    }

    public final Boolean component11() {
        return this.masterFlag;
    }

    public final Boolean component12() {
        return this.isConvFeeOrderDetailEnable;
    }

    public final String component13() {
        return this.platformConvenienceFeeLabel;
    }

    public final String component14() {
        return this.platformConvenienceFeeDesc;
    }

    public final String component15() {
        return this.codFeeDesc;
    }

    public final String component16() {
        return this.convenienceFeeNote;
    }

    public final String component17() {
        return this.totalConvenienceFeeLabel;
    }

    public final String component18() {
        return this.orderConfirmReadPolicy;
    }

    public final String component19() {
        return this.returnRefundReadPolicy;
    }

    public final String component2() {
        return this.codPopUpTopDesc;
    }

    public final String component20() {
        return this.priorityDeliveryFeeLabel;
    }

    public final String component21() {
        return this.priorityDeliveryFeeDesc;
    }

    public final String component3() {
        return this.codPopUpTopDescFree;
    }

    public final String component4() {
        return this.codExtraDeliveryText;
    }

    public final String component5() {
        return this.convenienceFeeTitle;
    }

    public final String component6() {
        return this.deliveryFeeLabel;
    }

    public final String component7() {
        return this.deliveryFeeDesc;
    }

    public final String component8() {
        return this.infoLabel;
    }

    public final Boolean component9() {
        return this.isCodFeeApplicable;
    }

    public final ConvenienceFeeConfig copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
        ConvenienceFeeConfig convenienceFeeConfig = new ConvenienceFeeConfig(string2, string3, string4, string5, string6, string7, string8, string9, bl2, bl3, bl4, bl5, string10, string11, string12, string13, string14, string15, string16, string17, string18);
        return convenienceFeeConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ConvenienceFeeConfig;
        if (!bl3) {
            return false;
        }
        object = (ConvenienceFeeConfig)object;
        Object object2 = this.cashOnDeliveryFeeLabel;
        Object object3 = ((ConvenienceFeeConfig)object).cashOnDeliveryFeeLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codPopUpTopDesc;
        object3 = ((ConvenienceFeeConfig)object).codPopUpTopDesc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codPopUpTopDescFree;
        object3 = ((ConvenienceFeeConfig)object).codPopUpTopDescFree;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codExtraDeliveryText;
        object3 = ((ConvenienceFeeConfig)object).codExtraDeliveryText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.convenienceFeeTitle;
        object3 = ((ConvenienceFeeConfig)object).convenienceFeeTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveryFeeLabel;
        object3 = ((ConvenienceFeeConfig)object).deliveryFeeLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveryFeeDesc;
        object3 = ((ConvenienceFeeConfig)object).deliveryFeeDesc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.infoLabel;
        object3 = ((ConvenienceFeeConfig)object).infoLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isCodFeeApplicable;
        object3 = ((ConvenienceFeeConfig)object).isCodFeeApplicable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isRvpFeeApplicable;
        object3 = ((ConvenienceFeeConfig)object).isRvpFeeApplicable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.masterFlag;
        object3 = ((ConvenienceFeeConfig)object).masterFlag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isConvFeeOrderDetailEnable;
        object3 = ((ConvenienceFeeConfig)object).isConvFeeOrderDetailEnable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.platformConvenienceFeeLabel;
        object3 = ((ConvenienceFeeConfig)object).platformConvenienceFeeLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.platformConvenienceFeeDesc;
        object3 = ((ConvenienceFeeConfig)object).platformConvenienceFeeDesc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codFeeDesc;
        object3 = ((ConvenienceFeeConfig)object).codFeeDesc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.convenienceFeeNote;
        object3 = ((ConvenienceFeeConfig)object).convenienceFeeNote;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalConvenienceFeeLabel;
        object3 = ((ConvenienceFeeConfig)object).totalConvenienceFeeLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderConfirmReadPolicy;
        object3 = ((ConvenienceFeeConfig)object).orderConfirmReadPolicy;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnRefundReadPolicy;
        object3 = ((ConvenienceFeeConfig)object).returnRefundReadPolicy;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priorityDeliveryFeeLabel;
        object3 = ((ConvenienceFeeConfig)object).priorityDeliveryFeeLabel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priorityDeliveryFeeDesc;
        object = ((ConvenienceFeeConfig)object).priorityDeliveryFeeDesc;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCashOnDeliveryFeeLabel() {
        return this.cashOnDeliveryFeeLabel;
    }

    public final String getCodExtraDeliveryText() {
        return this.codExtraDeliveryText;
    }

    public final String getCodFeeDesc() {
        return this.codFeeDesc;
    }

    public final String getCodPopUpTopDesc() {
        return this.codPopUpTopDesc;
    }

    public final String getCodPopUpTopDescFree() {
        return this.codPopUpTopDescFree;
    }

    public final String getConvenienceFeeNote() {
        return this.convenienceFeeNote;
    }

    public final String getConvenienceFeeTitle() {
        return this.convenienceFeeTitle;
    }

    public final String getDeliveryFeeDesc() {
        return this.deliveryFeeDesc;
    }

    public final String getDeliveryFeeLabel() {
        return this.deliveryFeeLabel;
    }

    public final String getInfoLabel() {
        return this.infoLabel;
    }

    public final Boolean getMasterFlag() {
        return this.masterFlag;
    }

    public final String getOrderConfirmReadPolicy() {
        return this.orderConfirmReadPolicy;
    }

    public final String getPlatformConvenienceFeeDesc() {
        return this.platformConvenienceFeeDesc;
    }

    public final String getPlatformConvenienceFeeLabel() {
        return this.platformConvenienceFeeLabel;
    }

    public final String getPriorityDeliveryFeeDesc() {
        return this.priorityDeliveryFeeDesc;
    }

    public final String getPriorityDeliveryFeeLabel() {
        return this.priorityDeliveryFeeLabel;
    }

    public final String getReturnRefundReadPolicy() {
        return this.returnRefundReadPolicy;
    }

    public final String getTotalConvenienceFeeLabel() {
        return this.totalConvenienceFeeLabel;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.cashOnDeliveryFeeLabel;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.codPopUpTopDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.codPopUpTopDescFree;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.codExtraDeliveryText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.convenienceFeeTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deliveryFeeLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deliveryFeeDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.infoLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isCodFeeApplicable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isRvpFeeApplicable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.masterFlag;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isConvFeeOrderDetailEnable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.platformConvenienceFeeLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.platformConvenienceFeeDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.codFeeDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.convenienceFeeNote;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalConvenienceFeeLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderConfirmReadPolicy;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnRefundReadPolicy;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priorityDeliveryFeeLabel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priorityDeliveryFeeDesc;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isCodFeeApplicable() {
        return this.isCodFeeApplicable;
    }

    public final Boolean isConvFeeOrderDetailEnable() {
        return this.isConvFeeOrderDetailEnable;
    }

    public final Boolean isRvpFeeApplicable() {
        return this.isRvpFeeApplicable;
    }

    public String toString() {
        Object object = this;
        String string2 = this.cashOnDeliveryFeeLabel;
        String string3 = this.codPopUpTopDesc;
        String string4 = this.codPopUpTopDescFree;
        String string5 = this.codExtraDeliveryText;
        String string6 = this.convenienceFeeTitle;
        String string7 = this.deliveryFeeLabel;
        String string8 = this.deliveryFeeDesc;
        String string9 = this.infoLabel;
        Boolean bl2 = this.isCodFeeApplicable;
        Boolean bl3 = this.isRvpFeeApplicable;
        Boolean bl4 = this.masterFlag;
        Boolean bl5 = this.isConvFeeOrderDetailEnable;
        String string10 = this.platformConvenienceFeeLabel;
        String string11 = this.platformConvenienceFeeDesc;
        String string12 = this.codFeeDesc;
        String string13 = this.convenienceFeeNote;
        String string14 = this.totalConvenienceFeeLabel;
        String string15 = this.orderConfirmReadPolicy;
        String string16 = this.returnRefundReadPolicy;
        String string17 = this.priorityDeliveryFeeLabel;
        String string18 = this.priorityDeliveryFeeDesc;
        object = og_1.a("ConvenienceFeeConfig(cashOnDeliveryFeeLabel=", string2, ", codPopUpTopDesc=", string3, ", codPopUpTopDescFree=");
        X50.a((StringBuilder)object, string4, ", codExtraDeliveryText=", string5, ", convenienceFeeTitle=");
        X50.a((StringBuilder)object, string6, ", deliveryFeeLabel=", string7, ", deliveryFeeDesc=");
        X50.a((StringBuilder)object, string8, ", infoLabel=", string9, ", isCodFeeApplicable=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", isRvpFeeApplicable=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", masterFlag=");
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", isConvFeeOrderDetailEnable=");
        ((StringBuilder)object).append(bl5);
        ((StringBuilder)object).append(", platformConvenienceFeeLabel=");
        string4 = string10;
        X50.a((StringBuilder)object, string10, ", platformConvenienceFeeDesc=", string11, ", codFeeDesc=");
        string4 = string12;
        string5 = string13;
        X50.a((StringBuilder)object, string12, ", convenienceFeeNote=", string13, ", totalConvenienceFeeLabel=");
        string4 = string14;
        string5 = string15;
        X50.a((StringBuilder)object, string14, ", orderConfirmReadPolicy=", string15, ", returnRefundReadPolicy=");
        string4 = string16;
        string5 = string17;
        X50.a((StringBuilder)object, string16, ", priorityDeliveryFeeLabel=", string17, ", priorityDeliveryFeeDesc=");
        string3 = string18;
        return h30_0.a((StringBuilder)object, string18, ")");
    }
}

