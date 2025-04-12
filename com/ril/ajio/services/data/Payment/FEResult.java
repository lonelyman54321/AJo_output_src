/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.OTPValidation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FEResult {
    private FEPayment COD;
    private FEPayment COHORT_COD_FEE;
    private FEPayment OTP_VALIDATION;
    private FEPayment RVP;
    private String customerId;
    private FEPayment delivery;
    private OTPValidation otpValidation;
    private FEPayment outcomeWithPayment;
    private FEPayment outcomeWithoutPayment;
    private FEPayment total;

    public FEResult() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public FEResult(String string2, FEPayment fEPayment, FEPayment fEPayment2, OTPValidation oTPValidation, FEPayment fEPayment3, FEPayment fEPayment4, FEPayment fEPayment5, FEPayment fEPayment6, FEPayment fEPayment7, FEPayment fEPayment8) {
        this.customerId = string2;
        this.outcomeWithoutPayment = fEPayment;
        this.outcomeWithPayment = fEPayment2;
        this.otpValidation = oTPValidation;
        this.COD = fEPayment3;
        this.RVP = fEPayment4;
        this.delivery = fEPayment5;
        this.total = fEPayment6;
        this.OTP_VALIDATION = fEPayment7;
        this.COHORT_COD_FEE = fEPayment8;
    }

    public /* synthetic */ FEResult(String object, FEPayment object2, FEPayment fEPayment, OTPValidation object3, FEPayment object4, FEPayment fEPayment2, FEPayment fEPayment3, FEPayment fEPayment4, FEPayment fEPayment5, FEPayment fEPayment6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        FEPayment fEPayment7;
        FEPayment fEPayment8;
        FEPayment fEPayment9;
        FEPayment fEPayment10;
        FEPayment fEPayment11;
        OTPValidation oTPValidation;
        FEPayment fEPayment12;
        FEPayment fEPayment13;
        String string2;
        int n4 = n3;
        int n7 = n3 & 1;
        FEPayment fEPayment14 = null;
        if (n7 != 0) {
            n7 = 0;
            string2 = null;
        } else {
            string2 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            fEPayment13 = null;
        } else {
            fEPayment13 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            fEPayment12 = null;
        } else {
            fEPayment12 = fEPayment;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            oTPValidation = null;
        } else {
            oTPValidation = object3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            fEPayment11 = null;
        } else {
            fEPayment11 = object4;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            fEPayment10 = null;
        } else {
            fEPayment10 = fEPayment2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            fEPayment9 = null;
        } else {
            fEPayment9 = fEPayment3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            fEPayment8 = null;
        } else {
            fEPayment8 = fEPayment4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            fEPayment7 = null;
        } else {
            fEPayment7 = fEPayment5;
        }
        if ((n4 &= 0x200) == 0) {
            fEPayment14 = fEPayment6;
        }
        object = this;
        object2 = string2;
        fEPayment = fEPayment13;
        object3 = fEPayment12;
        object4 = oTPValidation;
        fEPayment2 = fEPayment11;
        fEPayment3 = fEPayment10;
        fEPayment4 = fEPayment9;
        fEPayment5 = fEPayment8;
        fEPayment6 = fEPayment7;
        this(string2, fEPayment13, fEPayment12, oTPValidation, fEPayment11, fEPayment10, fEPayment9, fEPayment8, fEPayment7, fEPayment14);
    }

    public static /* synthetic */ FEResult copy$default(FEResult fEResult, String string2, FEPayment fEPayment, FEPayment fEPayment2, OTPValidation oTPValidation, FEPayment fEPayment3, FEPayment fEPayment4, FEPayment fEPayment5, FEPayment fEPayment6, FEPayment fEPayment7, FEPayment fEPayment8, int n3, Object object) {
        FEResult fEResult2 = fEResult;
        int n4 = n3;
        int n7 = n3 & 1;
        String string3 = n7 != 0 ? fEResult.customerId : string2;
        int n8 = n4 & 2;
        FEPayment fEPayment9 = n8 != 0 ? fEResult2.outcomeWithoutPayment : fEPayment;
        int n10 = n4 & 4;
        FEPayment fEPayment10 = n10 != 0 ? fEResult2.outcomeWithPayment : fEPayment2;
        int n14 = n4 & 8;
        OTPValidation oTPValidation2 = n14 != 0 ? fEResult2.otpValidation : oTPValidation;
        int n15 = n4 & 0x10;
        FEPayment fEPayment11 = n15 != 0 ? fEResult2.COD : fEPayment3;
        int n16 = n4 & 0x20;
        FEPayment fEPayment12 = n16 != 0 ? fEResult2.RVP : fEPayment4;
        int n17 = n4 & 0x40;
        FEPayment fEPayment13 = n17 != 0 ? fEResult2.delivery : fEPayment5;
        int n18 = n4 & 0x80;
        FEPayment fEPayment14 = n18 != 0 ? fEResult2.total : fEPayment6;
        int n19 = n4 & 0x100;
        FEPayment fEPayment15 = n19 != 0 ? fEResult2.OTP_VALIDATION : fEPayment7;
        FEPayment fEPayment16 = (n4 &= 0x200) != 0 ? fEResult2.COHORT_COD_FEE : fEPayment8;
        string2 = string3;
        fEPayment = fEPayment9;
        fEPayment2 = fEPayment10;
        oTPValidation = oTPValidation2;
        fEPayment3 = fEPayment11;
        fEPayment4 = fEPayment12;
        fEPayment5 = fEPayment13;
        fEPayment6 = fEPayment14;
        fEPayment7 = fEPayment15;
        fEPayment8 = fEPayment16;
        return fEResult.copy(string3, fEPayment9, fEPayment10, oTPValidation2, fEPayment11, fEPayment12, fEPayment13, fEPayment14, fEPayment15, fEPayment16);
    }

    public final String component1() {
        return this.customerId;
    }

    public final FEPayment component10() {
        return this.COHORT_COD_FEE;
    }

    public final FEPayment component2() {
        return this.outcomeWithoutPayment;
    }

    public final FEPayment component3() {
        return this.outcomeWithPayment;
    }

    public final OTPValidation component4() {
        return this.otpValidation;
    }

    public final FEPayment component5() {
        return this.COD;
    }

    public final FEPayment component6() {
        return this.RVP;
    }

    public final FEPayment component7() {
        return this.delivery;
    }

    public final FEPayment component8() {
        return this.total;
    }

    public final FEPayment component9() {
        return this.OTP_VALIDATION;
    }

    public final FEResult copy(String string2, FEPayment fEPayment, FEPayment fEPayment2, OTPValidation oTPValidation, FEPayment fEPayment3, FEPayment fEPayment4, FEPayment fEPayment5, FEPayment fEPayment6, FEPayment fEPayment7, FEPayment fEPayment8) {
        FEResult fEResult = new FEResult(string2, fEPayment, fEPayment2, oTPValidation, fEPayment3, fEPayment4, fEPayment5, fEPayment6, fEPayment7, fEPayment8);
        return fEResult;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FEResult;
        if (!bl3) {
            return false;
        }
        object = (FEResult)object;
        Object object2 = this.customerId;
        Object object3 = ((FEResult)object).customerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.outcomeWithoutPayment;
        object3 = ((FEResult)object).outcomeWithoutPayment;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.outcomeWithPayment;
        object3 = ((FEResult)object).outcomeWithPayment;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.otpValidation;
        object3 = ((FEResult)object).otpValidation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.COD;
        object3 = ((FEResult)object).COD;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.RVP;
        object3 = ((FEResult)object).RVP;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.delivery;
        object3 = ((FEResult)object).delivery;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.total;
        object3 = ((FEResult)object).total;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.OTP_VALIDATION;
        object3 = ((FEResult)object).OTP_VALIDATION;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.COHORT_COD_FEE;
        object = ((FEResult)object).COHORT_COD_FEE;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final FEPayment getCOD() {
        return this.COD;
    }

    public final FEPayment getCOHORT_COD_FEE() {
        return this.COHORT_COD_FEE;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final FEPayment getDelivery() {
        return this.delivery;
    }

    public final FEPayment getOTP_VALIDATION() {
        return this.OTP_VALIDATION;
    }

    public final OTPValidation getOtpValidation() {
        return this.otpValidation;
    }

    public final FEPayment getOutcomeWithPayment() {
        return this.outcomeWithPayment;
    }

    public final FEPayment getOutcomeWithoutPayment() {
        return this.outcomeWithoutPayment;
    }

    public final FEPayment getRVP() {
        return this.RVP;
    }

    public final FEPayment getTotal() {
        return this.total;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.customerId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.outcomeWithoutPayment;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.outcomeWithPayment;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.otpValidation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((OTPValidation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.COD;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.RVP;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.delivery;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.total;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.OTP_VALIDATION;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FEPayment)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.COHORT_COD_FEE;
        if (object != null) {
            n7 = ((FEPayment)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCOD(FEPayment fEPayment) {
        this.COD = fEPayment;
    }

    public final void setCOHORT_COD_FEE(FEPayment fEPayment) {
        this.COHORT_COD_FEE = fEPayment;
    }

    public final void setCustomerId(String string2) {
        this.customerId = string2;
    }

    public final void setDelivery(FEPayment fEPayment) {
        this.delivery = fEPayment;
    }

    public final void setOTP_VALIDATION(FEPayment fEPayment) {
        this.OTP_VALIDATION = fEPayment;
    }

    public final void setOtpValidation(OTPValidation oTPValidation) {
        this.otpValidation = oTPValidation;
    }

    public final void setOutcomeWithPayment(FEPayment fEPayment) {
        this.outcomeWithPayment = fEPayment;
    }

    public final void setOutcomeWithoutPayment(FEPayment fEPayment) {
        this.outcomeWithoutPayment = fEPayment;
    }

    public final void setRVP(FEPayment fEPayment) {
        this.RVP = fEPayment;
    }

    public final void setTotal(FEPayment fEPayment) {
        this.total = fEPayment;
    }

    public String toString() {
        String string2 = this.customerId;
        FEPayment fEPayment = this.outcomeWithoutPayment;
        FEPayment fEPayment2 = this.outcomeWithPayment;
        OTPValidation oTPValidation = this.otpValidation;
        FEPayment fEPayment3 = this.COD;
        FEPayment fEPayment4 = this.RVP;
        FEPayment fEPayment5 = this.delivery;
        FEPayment fEPayment6 = this.total;
        FEPayment fEPayment7 = this.OTP_VALIDATION;
        FEPayment fEPayment8 = this.COHORT_COD_FEE;
        StringBuilder stringBuilder = new StringBuilder("FEResult(customerId=");
        stringBuilder.append(string2);
        stringBuilder.append(", outcomeWithoutPayment=");
        stringBuilder.append(fEPayment);
        stringBuilder.append(", outcomeWithPayment=");
        stringBuilder.append(fEPayment2);
        stringBuilder.append(", otpValidation=");
        stringBuilder.append(oTPValidation);
        stringBuilder.append(", COD=");
        stringBuilder.append(fEPayment3);
        stringBuilder.append(", RVP=");
        stringBuilder.append(fEPayment4);
        stringBuilder.append(", delivery=");
        stringBuilder.append(fEPayment5);
        stringBuilder.append(", total=");
        stringBuilder.append(fEPayment6);
        stringBuilder.append(", OTP_VALIDATION=");
        stringBuilder.append(fEPayment7);
        stringBuilder.append(", COHORT_COD_FEE=");
        stringBuilder.append(fEPayment8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

