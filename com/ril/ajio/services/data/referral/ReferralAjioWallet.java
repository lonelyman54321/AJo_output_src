/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralAjioWallet {
    private Float amount;
    private String description;
    private String moneyStatus;
    private String moneyType;
    private Float points;

    public ReferralAjioWallet() {
        this(null, null, null, null, null, 31, null);
    }

    public ReferralAjioWallet(Float f5, String string2, String string3, String string4, Float f6) {
        this.amount = f5;
        this.description = string2;
        this.moneyStatus = string3;
        this.moneyType = string4;
        this.points = f6;
    }

    public /* synthetic */ ReferralAjioWallet(Float object, String object2, String string2, String string3, Float object3, int n3, DefaultConstructorMarker object4) {
        int n4 = n3 & 1;
        Float f5 = Float.valueOf(0.0f);
        object4 = n4 != 0 ? f5 : object;
        int n7 = n3 & 2;
        String string4 = null;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        if (n7 == 0) {
            string4 = string3;
        }
        n7 = n3 & 0x10;
        Object object6 = n7 != 0 ? f5 : object3;
        object = this;
        object2 = object4;
        string2 = object5;
        string3 = string5;
        object3 = string4;
        this((Float)object4, (String)object5, string5, string4, (Float)object6);
    }

    public static /* synthetic */ ReferralAjioWallet copy$default(ReferralAjioWallet referralAjioWallet, Float f5, String object, String object2, String object3, Float object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = referralAjioWallet.amount;
        }
        if ((n4 = n3 & 2) != 0) {
            object = referralAjioWallet.description;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = referralAjioWallet.moneyStatus;
        }
        String string2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = referralAjioWallet.moneyType;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = referralAjioWallet.points;
        }
        Float f6 = object4;
        object = referralAjioWallet;
        object2 = f5;
        object3 = object5;
        object4 = string2;
        object5 = f6;
        return referralAjioWallet.copy(f5, (String)object3, string2, string3, f6);
    }

    public final Float component1() {
        return this.amount;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.moneyStatus;
    }

    public final String component4() {
        return this.moneyType;
    }

    public final Float component5() {
        return this.points;
    }

    public final ReferralAjioWallet copy(Float f5, String string2, String string3, String string4, Float f6) {
        ReferralAjioWallet referralAjioWallet = new ReferralAjioWallet(f5, string2, string3, string4, f6);
        return referralAjioWallet;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralAjioWallet;
        if (!bl3) {
            return false;
        }
        object = (ReferralAjioWallet)object;
        Object object2 = this.amount;
        Object object3 = ((ReferralAjioWallet)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((ReferralAjioWallet)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.moneyStatus;
        object3 = ((ReferralAjioWallet)object).moneyStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.moneyType;
        object3 = ((ReferralAjioWallet)object).moneyType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.points;
        object = ((ReferralAjioWallet)object).points;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMoneyStatus() {
        return this.moneyStatus;
    }

    public final String getMoneyType() {
        return this.moneyType;
    }

    public final Float getPoints() {
        return this.points;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.amount;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Object object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.moneyStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.moneyType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.points;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setMoneyStatus(String string2) {
        this.moneyStatus = string2;
    }

    public final void setMoneyType(String string2) {
        this.moneyType = string2;
    }

    public final void setPoints(Float f5) {
        this.points = f5;
    }

    public String toString() {
        Float f5 = this.amount;
        String string2 = this.description;
        String string3 = this.moneyStatus;
        String string4 = this.moneyType;
        Float f6 = this.points;
        StringBuilder stringBuilder = new StringBuilder("ReferralAjioWallet(amount=");
        stringBuilder.append(f5);
        stringBuilder.append(", description=");
        stringBuilder.append(string2);
        stringBuilder.append(", moneyStatus=");
        X50.a(stringBuilder, string3, ", moneyType=", string4, ", points=");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

