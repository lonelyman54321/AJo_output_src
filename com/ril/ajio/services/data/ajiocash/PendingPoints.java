/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PendingPoints {
    private final String activateOn;
    private final Float amount;
    private final String cancelledDate;
    private final String deliveredDate;
    private final String imageUrl;
    private final String itemId;
    private final String orderId;
    private final String orderItemStatus;
    private final String orderedDate;
    private final String points;
    private final String transactionDescription;
    private final String transactionSubDescription;

    public PendingPoints() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public PendingPoints(String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        this.transactionDescription = string2;
        this.imageUrl = string3;
        this.amount = f5;
        this.deliveredDate = string4;
        this.activateOn = string5;
        this.cancelledDate = string6;
        this.itemId = string7;
        this.orderId = string8;
        this.orderItemStatus = string9;
        this.orderedDate = string10;
        this.points = string11;
        this.transactionSubDescription = string12;
    }

    public /* synthetic */ PendingPoints(String object, String string2, Float object2, String object3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Float f5;
        String string19;
        String string20;
        int n4 = n3;
        int n7 = n3 & 1;
        String string21 = null;
        if (n7 != 0) {
            n7 = 0;
            string20 = null;
        } else {
            string20 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string19 = null;
        } else {
            string19 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            f5 = null;
        } else {
            f5 = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string18 = null;
        } else {
            string18 = object3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string17 = null;
        } else {
            string17 = string3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string16 = null;
        } else {
            string16 = string4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string14 = null;
        } else {
            string14 = string6;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string13 = null;
        } else {
            string13 = string7;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string12 = null;
        } else {
            string12 = string8;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string11 = null;
        } else {
            string11 = string9;
        }
        if ((n4 &= 0x800) == 0) {
            string21 = string10;
        }
        object = this;
        string2 = string20;
        object2 = string19;
        object3 = f5;
        string3 = string18;
        string4 = string17;
        string5 = string16;
        string6 = string15;
        string7 = string14;
        string8 = string13;
        string9 = string12;
        string10 = string11;
        this(string20, string19, f5, string18, string17, string16, string15, string14, string13, string12, string11, string21);
    }

    public static /* synthetic */ PendingPoints copy$default(PendingPoints pendingPoints, String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, int n3, Object object) {
        PendingPoints pendingPoints2 = pendingPoints;
        int n4 = n3;
        int n7 = n3 & 1;
        String string13 = n7 != 0 ? pendingPoints.transactionDescription : string2;
        int n8 = n4 & 2;
        String string14 = n8 != 0 ? pendingPoints2.imageUrl : string3;
        int n10 = n4 & 4;
        Float f6 = n10 != 0 ? pendingPoints2.amount : f5;
        int n14 = n4 & 8;
        String string15 = n14 != 0 ? pendingPoints2.deliveredDate : string4;
        int n15 = n4 & 0x10;
        String string16 = n15 != 0 ? pendingPoints2.activateOn : string5;
        int n16 = n4 & 0x20;
        String string17 = n16 != 0 ? pendingPoints2.cancelledDate : string6;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? pendingPoints2.itemId : string7;
        int n18 = n4 & 0x80;
        String string19 = n18 != 0 ? pendingPoints2.orderId : string8;
        int n19 = n4 & 0x100;
        String string20 = n19 != 0 ? pendingPoints2.orderItemStatus : string9;
        int n20 = n4 & 0x200;
        String string21 = n20 != 0 ? pendingPoints2.orderedDate : string10;
        int n21 = n4 & 0x400;
        String string22 = n21 != 0 ? pendingPoints2.points : string11;
        String string23 = (n4 &= 0x800) != 0 ? pendingPoints2.transactionSubDescription : string12;
        string2 = string13;
        string3 = string14;
        f5 = f6;
        string4 = string15;
        string5 = string16;
        string6 = string17;
        string7 = string18;
        string8 = string19;
        string9 = string20;
        string10 = string21;
        string11 = string22;
        string12 = string23;
        return pendingPoints.copy(string13, string14, f6, string15, string16, string17, string18, string19, string20, string21, string22, string23);
    }

    public final String component1() {
        return this.transactionDescription;
    }

    public final String component10() {
        return this.orderedDate;
    }

    public final String component11() {
        return this.points;
    }

    public final String component12() {
        return this.transactionSubDescription;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Float component3() {
        return this.amount;
    }

    public final String component4() {
        return this.deliveredDate;
    }

    public final String component5() {
        return this.activateOn;
    }

    public final String component6() {
        return this.cancelledDate;
    }

    public final String component7() {
        return this.itemId;
    }

    public final String component8() {
        return this.orderId;
    }

    public final String component9() {
        return this.orderItemStatus;
    }

    public final PendingPoints copy(String string2, String string3, Float f5, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        PendingPoints pendingPoints = new PendingPoints(string2, string3, f5, string4, string5, string6, string7, string8, string9, string10, string11, string12);
        return pendingPoints;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PendingPoints;
        if (!bl3) {
            return false;
        }
        object = (PendingPoints)object;
        Object object2 = this.transactionDescription;
        Object object3 = ((PendingPoints)object).transactionDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((PendingPoints)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((PendingPoints)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliveredDate;
        object3 = ((PendingPoints)object).deliveredDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.activateOn;
        object3 = ((PendingPoints)object).activateOn;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cancelledDate;
        object3 = ((PendingPoints)object).cancelledDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.itemId;
        object3 = ((PendingPoints)object).itemId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((PendingPoints)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderItemStatus;
        object3 = ((PendingPoints)object).orderItemStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderedDate;
        object3 = ((PendingPoints)object).orderedDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.points;
        object3 = ((PendingPoints)object).points;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionSubDescription;
        object = ((PendingPoints)object).transactionSubDescription;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getActivateOn() {
        return this.activateOn;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getCancelledDate() {
        return this.cancelledDate;
    }

    public final String getDeliveredDate() {
        return this.deliveredDate;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderItemStatus() {
        return this.orderItemStatus;
    }

    public final String getOrderedDate() {
        return this.orderedDate;
    }

    public final String getPoints() {
        return this.points;
    }

    public final String getTransactionDescription() {
        return this.transactionDescription;
    }

    public final String getTransactionSubDescription() {
        return this.transactionSubDescription;
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
        object = this.deliveredDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.activateOn;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cancelledDate;
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
        object = this.orderItemStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderedDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.points;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionSubDescription;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.transactionDescription;
        String string2 = this.imageUrl;
        Float f5 = this.amount;
        String string3 = this.deliveredDate;
        String string4 = this.activateOn;
        String string5 = this.cancelledDate;
        String string6 = this.itemId;
        String string7 = this.orderId;
        String string8 = this.orderItemStatus;
        String string9 = this.orderedDate;
        String string10 = this.points;
        String string11 = this.transactionSubDescription;
        charSequence = og_1.a("PendingPoints(transactionDescription=", (String)charSequence, ", imageUrl=", string2, ", amount=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", deliveredDate=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", activateOn=");
        X50.a((StringBuilder)charSequence, string4, ", cancelledDate=", string5, ", itemId=");
        X50.a((StringBuilder)charSequence, string6, ", orderId=", string7, ", orderItemStatus=");
        X50.a((StringBuilder)charSequence, string8, ", orderedDate=", string9, ", points=");
        return ko_0.a((StringBuilder)charSequence, string10, ", transactionSubDescription=", string11, ")");
    }
}

