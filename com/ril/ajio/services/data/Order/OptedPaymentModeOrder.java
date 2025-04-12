/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OptedPaymentModeOrder
implements Serializable {
    private String amount;
    private String cardNetwork;
    private String logo;
    private String maskedDigits;
    private String modeOfPayment;
    private String modeOfPaymentCode;
    private String modeOfPaymentName;
    private String savedMop;

    public OptedPaymentModeOrder() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public OptedPaymentModeOrder(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        this.modeOfPaymentName = string2;
        this.modeOfPaymentCode = string3;
        this.amount = string4;
        this.logo = string5;
        this.maskedDigits = string6;
        this.cardNetwork = string7;
        this.modeOfPayment = string8;
        this.savedMop = string9;
    }

    public /* synthetic */ OptedPaymentModeOrder(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = null;
        if (n7 != 0) {
            n7 = 0;
            string15 = null;
        } else {
            string15 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string10 = null;
        } else {
            string10 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string9 = null;
        } else {
            string9 = string7;
        }
        if ((n4 &= 0x80) == 0) {
            string16 = string8;
        }
        object = this;
        string2 = string15;
        string3 = string14;
        string4 = string13;
        string5 = string12;
        string6 = string11;
        string7 = string10;
        string8 = string9;
        this(string15, string14, string13, string12, string11, string10, string9, string16);
    }

    public static /* synthetic */ OptedPaymentModeOrder copy$default(OptedPaymentModeOrder optedPaymentModeOrder, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, int n3, Object object) {
        OptedPaymentModeOrder optedPaymentModeOrder2 = optedPaymentModeOrder;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? optedPaymentModeOrder.modeOfPaymentName : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? optedPaymentModeOrder2.modeOfPaymentCode : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? optedPaymentModeOrder2.amount : string4;
        int n14 = n4 & 8;
        String string13 = n14 != 0 ? optedPaymentModeOrder2.logo : string5;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? optedPaymentModeOrder2.maskedDigits : string6;
        int n16 = n4 & 0x20;
        String string15 = n16 != 0 ? optedPaymentModeOrder2.cardNetwork : string7;
        int n17 = n4 & 0x40;
        String string16 = n17 != 0 ? optedPaymentModeOrder2.modeOfPayment : string8;
        String string17 = (n4 &= 0x80) != 0 ? optedPaymentModeOrder2.savedMop : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        string7 = string15;
        string8 = string16;
        string9 = string17;
        return optedPaymentModeOrder.copy(string10, string11, string12, string13, string14, string15, string16, string17);
    }

    public final String component1() {
        return this.modeOfPaymentName;
    }

    public final String component2() {
        return this.modeOfPaymentCode;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.logo;
    }

    public final String component5() {
        return this.maskedDigits;
    }

    public final String component6() {
        return this.cardNetwork;
    }

    public final String component7() {
        return this.modeOfPayment;
    }

    public final String component8() {
        return this.savedMop;
    }

    public final OptedPaymentModeOrder copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        OptedPaymentModeOrder optedPaymentModeOrder = new OptedPaymentModeOrder(string2, string3, string4, string5, string6, string7, string8, string9);
        return optedPaymentModeOrder;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OptedPaymentModeOrder;
        if (!bl3) {
            return false;
        }
        object = (OptedPaymentModeOrder)object;
        String string2 = this.modeOfPaymentName;
        String string3 = ((OptedPaymentModeOrder)object).modeOfPaymentName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.modeOfPaymentCode;
        string3 = ((OptedPaymentModeOrder)object).modeOfPaymentCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.amount;
        string3 = ((OptedPaymentModeOrder)object).amount;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.logo;
        string3 = ((OptedPaymentModeOrder)object).logo;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.maskedDigits;
        string3 = ((OptedPaymentModeOrder)object).maskedDigits;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.cardNetwork;
        string3 = ((OptedPaymentModeOrder)object).cardNetwork;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.modeOfPayment;
        string3 = ((OptedPaymentModeOrder)object).modeOfPayment;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.savedMop;
        object = ((OptedPaymentModeOrder)object).savedMop;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getMaskedDigits() {
        return this.maskedDigits;
    }

    public final String getModeOfPayment() {
        return this.modeOfPayment;
    }

    public final String getModeOfPaymentCode() {
        return this.modeOfPaymentCode;
    }

    public final String getModeOfPaymentName() {
        return this.modeOfPaymentName;
    }

    public final String getSavedMop() {
        return this.savedMop;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.modeOfPaymentName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.modeOfPaymentCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.amount;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.logo;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.maskedDigits;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.cardNetwork;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.modeOfPayment;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.savedMop;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(String string2) {
        this.amount = string2;
    }

    public final void setCardNetwork(String string2) {
        this.cardNetwork = string2;
    }

    public final void setLogo(String string2) {
        this.logo = string2;
    }

    public final void setMaskedDigits(String string2) {
        this.maskedDigits = string2;
    }

    public final void setModeOfPayment(String string2) {
        this.modeOfPayment = string2;
    }

    public final void setModeOfPaymentCode(String string2) {
        this.modeOfPaymentCode = string2;
    }

    public final void setModeOfPaymentName(String string2) {
        this.modeOfPaymentName = string2;
    }

    public final void setSavedMop(String string2) {
        this.savedMop = string2;
    }

    public String toString() {
        CharSequence charSequence = this.modeOfPaymentName;
        String string2 = this.modeOfPaymentCode;
        String string3 = this.amount;
        String string4 = this.logo;
        String string5 = this.maskedDigits;
        String string6 = this.cardNetwork;
        String string7 = this.modeOfPayment;
        String string8 = this.savedMop;
        charSequence = og_1.a("OptedPaymentModeOrder(modeOfPaymentName=", charSequence, ", modeOfPaymentCode=", string2, ", amount=");
        X50.a((StringBuilder)charSequence, string3, ", logo=", string4, ", maskedDigits=");
        X50.a((StringBuilder)charSequence, string5, ", cardNetwork=", string6, ", modeOfPayment=");
        return ko_0.a((StringBuilder)charSequence, string7, ", savedMop=", string8, ")");
    }
}

