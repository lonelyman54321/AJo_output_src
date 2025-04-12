/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ActivePoints {
    private final String activationDate;
    private final Float amount;
    private final String expiryDate;
    private final String iconTextDisplay;
    private final String imageUrl;
    private final Boolean isExpired;
    private final Boolean isImageIcon;
    private final String itemId;
    private final String moneyType;
    private final String orderId;
    private final Float points;
    private final String transactionDate;
    private final String transactionDescription;
    private final String transactionReason;
    private final String transactionSubDescription;
    private final String transactionType;

    public ActivePoints() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (char)-1, null);
    }

    public ActivePoints(String string2, String string3, Float f5, Float f6, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, Boolean bl3, String string13) {
        this.transactionDescription = string2;
        this.imageUrl = string3;
        this.amount = f5;
        this.points = f6;
        this.activationDate = string4;
        this.expiryDate = string5;
        this.moneyType = string6;
        this.isExpired = bl2;
        this.transactionReason = string7;
        this.itemId = string8;
        this.orderId = string9;
        this.transactionDate = string10;
        this.iconTextDisplay = string11;
        this.transactionSubDescription = string12;
        this.isImageIcon = bl3;
        this.transactionType = string13;
    }

    public /* synthetic */ ActivePoints(String object, String string2, Float object2, Float f5, String object3, String string3, String string4, Boolean object4, String object5, String string5, String string6, String string7, String string8, String string9, Boolean object6, String object7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string10;
        Boolean bl2;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        Boolean bl3;
        String string17;
        String string18;
        String string19;
        Float f6;
        Float f7;
        String string20;
        String string21;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string21 = null;
        } else {
            string21 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string20 = null;
        } else {
            string20 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            f7 = null;
        } else {
            f7 = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            f6 = null;
        } else {
            f6 = f5;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string19 = null;
        } else {
            string19 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string18 = null;
        } else {
            string18 = string3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string17 = null;
        } else {
            string17 = string4;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            bl3 = null;
        } else {
            bl3 = object4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string16 = null;
        } else {
            string16 = object5;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string14 = null;
        } else {
            string14 = string6;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string13 = null;
        } else {
            string13 = string7;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string12 = null;
        } else {
            string12 = string8;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string11 = null;
        } else {
            string11 = string9;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            bl2 = null;
        } else {
            bl2 = object6;
        }
        int n27 = 32768;
        if ((n4 &= n27) != 0) {
            n4 = 0;
            string10 = null;
        } else {
            string10 = object7;
        }
        object = this;
        string2 = string21;
        object2 = string20;
        f5 = f7;
        object3 = f6;
        string3 = string19;
        string4 = string18;
        object4 = string17;
        object5 = bl3;
        string5 = string16;
        string6 = string15;
        string7 = string14;
        string8 = string13;
        string9 = string12;
        object6 = string11;
        object7 = bl2;
        this(string21, string20, f7, f6, string19, string18, string17, bl3, string16, string15, string14, string13, string12, string11, bl2, string10);
    }

    public static /* synthetic */ ActivePoints copy$default(ActivePoints activePoints, String string2, String string3, Float f5, Float f6, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, Boolean object, String string13, int n3, Object object2) {
        ActivePoints activePoints2 = activePoints;
        int n4 = n3;
        int n7 = n3 & 1;
        String string14 = n7 != 0 ? activePoints.transactionDescription : string2;
        int n8 = n4 & 2;
        String string15 = n8 != 0 ? activePoints2.imageUrl : string3;
        int n10 = n4 & 4;
        Float f7 = n10 != 0 ? activePoints2.amount : f5;
        int n14 = n4 & 8;
        Float f8 = n14 != 0 ? activePoints2.points : f6;
        int n15 = n4 & 0x10;
        String string16 = n15 != 0 ? activePoints2.activationDate : string4;
        int n16 = n4 & 0x20;
        String string17 = n16 != 0 ? activePoints2.expiryDate : string5;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? activePoints2.moneyType : string6;
        int n18 = n4 & 0x80;
        Boolean bl3 = n18 != 0 ? activePoints2.isExpired : bl2;
        int n19 = n4 & 0x100;
        String string19 = n19 != 0 ? activePoints2.transactionReason : string7;
        int n20 = n4 & 0x200;
        String string20 = n20 != 0 ? activePoints2.itemId : string8;
        int n21 = n4 & 0x400;
        String string21 = n21 != 0 ? activePoints2.orderId : string9;
        int n22 = n4 & 0x800;
        String string22 = n22 != 0 ? activePoints2.transactionDate : string10;
        int n24 = n4 & 0x1000;
        String string23 = n24 != 0 ? activePoints2.iconTextDisplay : string11;
        int n25 = n4 & 0x2000;
        Object object3 = n25 != 0 ? activePoints2.transactionSubDescription : string12;
        string12 = object3;
        n25 = n4 & 0x4000;
        object3 = n25 != 0 ? activePoints2.isImageIcon : object;
        int n26 = 32768;
        String string24 = (n4 &= n26) != 0 ? activePoints2.transactionType : string13;
        string2 = string14;
        string3 = string15;
        f5 = f7;
        f6 = f8;
        string4 = string16;
        string5 = string17;
        string6 = string18;
        bl2 = bl3;
        string7 = string19;
        string8 = string20;
        string9 = string21;
        string10 = string22;
        string11 = string23;
        object = object3;
        string13 = string24;
        return activePoints.copy(string14, string15, f7, f8, string16, string17, string18, bl3, string19, string20, string21, string22, string23, string12, (Boolean)object3, string24);
    }

    public final String component1() {
        return this.transactionDescription;
    }

    public final String component10() {
        return this.itemId;
    }

    public final String component11() {
        return this.orderId;
    }

    public final String component12() {
        return this.transactionDate;
    }

    public final String component13() {
        return this.iconTextDisplay;
    }

    public final String component14() {
        return this.transactionSubDescription;
    }

    public final Boolean component15() {
        return this.isImageIcon;
    }

    public final String component16() {
        return this.transactionType;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Float component3() {
        return this.amount;
    }

    public final Float component4() {
        return this.points;
    }

    public final String component5() {
        return this.activationDate;
    }

    public final String component6() {
        return this.expiryDate;
    }

    public final String component7() {
        return this.moneyType;
    }

    public final Boolean component8() {
        return this.isExpired;
    }

    public final String component9() {
        return this.transactionReason;
    }

    public final ActivePoints copy(String string2, String string3, Float f5, Float f6, String string4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, String string10, String string11, String string12, Boolean bl3, String string13) {
        ActivePoints activePoints = new ActivePoints(string2, string3, f5, f6, string4, string5, string6, bl2, string7, string8, string9, string10, string11, string12, bl3, string13);
        return activePoints;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ActivePoints;
        if (!bl3) {
            return false;
        }
        object = (ActivePoints)object;
        Object object2 = this.transactionDescription;
        Object object3 = ((ActivePoints)object).transactionDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((ActivePoints)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((ActivePoints)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.points;
        object3 = ((ActivePoints)object).points;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.activationDate;
        object3 = ((ActivePoints)object).activationDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryDate;
        object3 = ((ActivePoints)object).expiryDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.moneyType;
        object3 = ((ActivePoints)object).moneyType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isExpired;
        object3 = ((ActivePoints)object).isExpired;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionReason;
        object3 = ((ActivePoints)object).transactionReason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.itemId;
        object3 = ((ActivePoints)object).itemId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((ActivePoints)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionDate;
        object3 = ((ActivePoints)object).transactionDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.iconTextDisplay;
        object3 = ((ActivePoints)object).iconTextDisplay;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionSubDescription;
        object3 = ((ActivePoints)object).transactionSubDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isImageIcon;
        object3 = ((ActivePoints)object).isImageIcon;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionType;
        object = ((ActivePoints)object).transactionType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getActivationDate() {
        return this.activationDate;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getIconTextDisplay() {
        return this.iconTextDisplay;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getMoneyType() {
        return this.moneyType;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Float getPoints() {
        return this.points;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionDescription() {
        return this.transactionDescription;
    }

    public final String getTransactionReason() {
        return this.transactionReason;
    }

    public final String getTransactionSubDescription() {
        return this.transactionSubDescription;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.transactionDescription;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.imageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.amount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.points;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.activationDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryDate;
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
        object = this.isExpired;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionReason;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.itemId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.iconTextDisplay;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionSubDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isImageIcon;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionType;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isExpired() {
        return this.isExpired;
    }

    public final Boolean isImageIcon() {
        return this.isImageIcon;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.transactionDescription;
        String string2 = this.imageUrl;
        Object object3 = this.amount;
        Float f5 = this.points;
        String string3 = this.activationDate;
        String string4 = this.expiryDate;
        String string5 = this.moneyType;
        Boolean bl2 = this.isExpired;
        String string6 = this.transactionReason;
        String string7 = this.itemId;
        String string8 = this.orderId;
        String string9 = this.transactionDate;
        String string10 = this.iconTextDisplay;
        String string11 = this.transactionSubDescription;
        Boolean bl3 = this.isImageIcon;
        String string12 = this.transactionType;
        object = og_1.a("ActivePoints(transactionDescription=", (String)object2, ", imageUrl=", string2, ", amount=");
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(", points=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", activationDate=");
        X50.a((StringBuilder)object, string3, ", expiryDate=", string4, ", moneyType=");
        vw0_1.a(bl2, string5, ", isExpired=", ", transactionReason=", (StringBuilder)object);
        X50.a((StringBuilder)object, string6, ", itemId=", string7, ", orderId=");
        X50.a((StringBuilder)object, string8, ", transactionDate=", string9, ", iconTextDisplay=");
        object3 = string10;
        X50.a((StringBuilder)object, string10, ", transactionSubDescription=", string11, ", isImageIcon=");
        object2 = bl3;
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", transactionType=");
        object2 = string12;
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

