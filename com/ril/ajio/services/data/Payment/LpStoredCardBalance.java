/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LpStoredCardBalance
implements Serializable {
    private String cardNumber;
    private Error error;
    private String fullCardNumber;
    private String isLRManaged;
    private Boolean isSelected;
    private Float loyaltyPoints;
    private String mobile;
    private Boolean mobileNumberRegistered;
    private String payId;
    private Float remainingPoints;
    private String status;
    private Float usablePoints;

    public LpStoredCardBalance() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public LpStoredCardBalance(Error error, String string2, Float f5, String string3, Boolean bl2, String string4, Boolean bl3, String string5, Float f6, Float f7, String string6, String string7) {
        this.error = error;
        this.status = string2;
        this.loyaltyPoints = f5;
        this.payId = string3;
        this.mobileNumberRegistered = bl2;
        this.isLRManaged = string4;
        this.isSelected = bl3;
        this.mobile = string5;
        this.remainingPoints = f6;
        this.usablePoints = f7;
        this.cardNumber = string6;
        this.fullCardNumber = string7;
    }

    public /* synthetic */ LpStoredCardBalance(Error serializable, String object, Float object2, String object3, Boolean object4, String object5, Boolean object6, String object7, Float object8, Float f5, String object9, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        Error error;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = null;
        if (n7 != 0) {
            n7 = 0;
            error = null;
        } else {
            error = serializable;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n10 = n4 & 4;
        Float f6 = null;
        Object object10 = n10 != 0 ? Float.valueOf(0.0f) : object2;
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string6 = null;
        } else {
            string6 = object3;
        }
        int n15 = n4 & 0x10;
        Object object11 = n15 != 0 ? Boolean.FALSE : object4;
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string5 = null;
        } else {
            string5 = object5;
        }
        int n17 = n4 & 0x40;
        Object object12 = n17 != 0 ? Boolean.FALSE : object6;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string4 = null;
        } else {
            string4 = object7;
        }
        int n19 = n4 & 0x100;
        Object object13 = n19 != 0 ? Float.valueOf(0.0f) : object8;
        int n20 = n4 & 0x200;
        f6 = n20 != 0 ? Float.valueOf(0.0f) : f5;
        n20 = n4 & 0x400;
        if (n20 != 0) {
            n20 = 0;
            string3 = null;
        } else {
            string3 = object9;
        }
        if ((n4 &= 0x800) == 0) {
            string8 = string2;
        }
        serializable = this;
        object = error;
        object2 = string7;
        object3 = object10;
        object4 = string6;
        object5 = object11;
        object6 = string5;
        object7 = object12;
        object8 = string4;
        f5 = object13;
        object9 = f6;
        string2 = string3;
        this(error, string7, (Float)object10, string6, (Boolean)object11, string5, (Boolean)object12, string4, (Float)object13, f6, string3, string8);
    }

    public static /* synthetic */ LpStoredCardBalance copy$default(LpStoredCardBalance lpStoredCardBalance, Error error, String string2, Float f5, String string3, Boolean bl2, String string4, Boolean bl3, String string5, Float f6, Float f7, String string6, String string7, int n3, Object object) {
        LpStoredCardBalance lpStoredCardBalance2 = lpStoredCardBalance;
        int n4 = n3;
        int n7 = n3 & 1;
        Error error2 = n7 != 0 ? lpStoredCardBalance.error : error;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? lpStoredCardBalance2.status : string2;
        int n10 = n4 & 4;
        Float f8 = n10 != 0 ? lpStoredCardBalance2.loyaltyPoints : f5;
        int n14 = n4 & 8;
        String string9 = n14 != 0 ? lpStoredCardBalance2.payId : string3;
        int n15 = n4 & 0x10;
        Boolean bl4 = n15 != 0 ? lpStoredCardBalance2.mobileNumberRegistered : bl2;
        int n16 = n4 & 0x20;
        String string10 = n16 != 0 ? lpStoredCardBalance2.isLRManaged : string4;
        int n17 = n4 & 0x40;
        Boolean bl5 = n17 != 0 ? lpStoredCardBalance2.isSelected : bl3;
        int n18 = n4 & 0x80;
        String string11 = n18 != 0 ? lpStoredCardBalance2.mobile : string5;
        int n19 = n4 & 0x100;
        Float f11 = n19 != 0 ? lpStoredCardBalance2.remainingPoints : f6;
        int n20 = n4 & 0x200;
        Float f12 = n20 != 0 ? lpStoredCardBalance2.usablePoints : f7;
        int n21 = n4 & 0x400;
        String string12 = n21 != 0 ? lpStoredCardBalance2.cardNumber : string6;
        String string13 = (n4 &= 0x800) != 0 ? lpStoredCardBalance2.fullCardNumber : string7;
        error = error2;
        string2 = string8;
        f5 = f8;
        string3 = string9;
        bl2 = bl4;
        string4 = string10;
        bl3 = bl5;
        string5 = string11;
        f6 = f11;
        f7 = f12;
        string6 = string12;
        string7 = string13;
        return lpStoredCardBalance.copy(error2, string8, f8, string9, bl4, string10, bl5, string11, f11, f12, string12, string13);
    }

    public final Error component1() {
        return this.error;
    }

    public final Float component10() {
        return this.usablePoints;
    }

    public final String component11() {
        return this.cardNumber;
    }

    public final String component12() {
        return this.fullCardNumber;
    }

    public final String component2() {
        return this.status;
    }

    public final Float component3() {
        return this.loyaltyPoints;
    }

    public final String component4() {
        return this.payId;
    }

    public final Boolean component5() {
        return this.mobileNumberRegistered;
    }

    public final String component6() {
        return this.isLRManaged;
    }

    public final Boolean component7() {
        return this.isSelected;
    }

    public final String component8() {
        return this.mobile;
    }

    public final Float component9() {
        return this.remainingPoints;
    }

    public final LpStoredCardBalance copy(Error error, String string2, Float f5, String string3, Boolean bl2, String string4, Boolean bl3, String string5, Float f6, Float f7, String string6, String string7) {
        LpStoredCardBalance lpStoredCardBalance = new LpStoredCardBalance(error, string2, f5, string3, bl2, string4, bl3, string5, f6, f7, string6, string7);
        return lpStoredCardBalance;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LpStoredCardBalance;
        if (!bl3) {
            return false;
        }
        object = (LpStoredCardBalance)object;
        Object object2 = this.error;
        Object object3 = ((LpStoredCardBalance)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object3 = ((LpStoredCardBalance)object).status;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loyaltyPoints;
        object3 = ((LpStoredCardBalance)object).loyaltyPoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.payId;
        object3 = ((LpStoredCardBalance)object).payId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mobileNumberRegistered;
        object3 = ((LpStoredCardBalance)object).mobileNumberRegistered;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLRManaged;
        object3 = ((LpStoredCardBalance)object).isLRManaged;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isSelected;
        object3 = ((LpStoredCardBalance)object).isSelected;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mobile;
        object3 = ((LpStoredCardBalance)object).mobile;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.remainingPoints;
        object3 = ((LpStoredCardBalance)object).remainingPoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.usablePoints;
        object3 = ((LpStoredCardBalance)object).usablePoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardNumber;
        object3 = ((LpStoredCardBalance)object).cardNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fullCardNumber;
        object = ((LpStoredCardBalance)object).fullCardNumber;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getFullCardNumber() {
        return this.fullCardNumber;
    }

    public final Float getLoyaltyPoints() {
        return this.loyaltyPoints;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final Boolean getMobileNumberRegistered() {
        return this.mobileNumberRegistered;
    }

    public final String getPayId() {
        return this.payId;
    }

    public final Float getRemainingPoints() {
        return this.remainingPoints;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Float getUsablePoints() {
        return this.usablePoints;
    }

    public int hashCode() {
        int n3;
        int n4;
        Error error = this.error;
        int n7 = 0;
        if (error == null) {
            n4 = 0;
            error = null;
        } else {
            n4 = error.hashCode();
        }
        n4 *= 31;
        Object object = this.status;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.loyaltyPoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.payId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mobileNumberRegistered;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isLRManaged;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isSelected;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mobile;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.remainingPoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.usablePoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fullCardNumber;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isLRManaged() {
        return this.isLRManaged;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setFullCardNumber(String string2) {
        this.fullCardNumber = string2;
    }

    public final void setLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public final void setLoyaltyPoints(Float f5) {
        this.loyaltyPoints = f5;
    }

    public final void setMobile(String string2) {
        this.mobile = string2;
    }

    public final void setMobileNumberRegistered(Boolean bl2) {
        this.mobileNumberRegistered = bl2;
    }

    public final void setPayId(String string2) {
        this.payId = string2;
    }

    public final void setRemainingPoints(Float f5) {
        this.remainingPoints = f5;
    }

    public final void setSelected(Boolean bl2) {
        this.isSelected = bl2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public final void setUsablePoints(Float f5) {
        this.usablePoints = f5;
    }

    public String toString() {
        Error error = this.error;
        String string2 = this.status;
        Float f5 = this.loyaltyPoints;
        String string3 = this.payId;
        Boolean bl2 = this.mobileNumberRegistered;
        String string4 = this.isLRManaged;
        Boolean bl3 = this.isSelected;
        String string5 = this.mobile;
        Float f6 = this.remainingPoints;
        Float f7 = this.usablePoints;
        String string6 = this.cardNumber;
        String string7 = this.fullCardNumber;
        StringBuilder stringBuilder = new StringBuilder("LpStoredCardBalance(error=");
        stringBuilder.append(error);
        stringBuilder.append(", status=");
        stringBuilder.append(string2);
        stringBuilder.append(", loyaltyPoints=");
        stringBuilder.append(f5);
        stringBuilder.append(", payId=");
        stringBuilder.append(string3);
        stringBuilder.append(", mobileNumberRegistered=");
        xi0_2.a(bl2, ", isLRManaged=", string4, ", isSelected=", stringBuilder);
        xi0_2.a(bl3, ", mobile=", string5, ", remainingPoints=", stringBuilder);
        stringBuilder.append(f6);
        stringBuilder.append(", usablePoints=");
        stringBuilder.append(f7);
        stringBuilder.append(", cardNumber=");
        return ko_0.a(stringBuilder, string6, ", fullCardNumber=", string7, ")");
    }
}

