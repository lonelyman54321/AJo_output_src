/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class SpendHistory {
    private final String debitedDate;
    private final String description;
    private final ArrayList orderHistoryResponses;
    private final String orderId;
    private final Float spendCash;
    private final Float spendPoints;

    public SpendHistory(String string2, ArrayList arrayList, String string3, String string4, Float f5, Float f6) {
        this.debitedDate = string2;
        this.orderHistoryResponses = arrayList;
        this.description = string3;
        this.orderId = string4;
        this.spendCash = f5;
        this.spendPoints = f6;
    }

    public static /* synthetic */ SpendHistory copy$default(SpendHistory spendHistory, String string2, ArrayList object, String string3, String object2, Float object3, Float object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = spendHistory.debitedDate;
        }
        if ((n4 = n3 & 2) != 0) {
            object = spendHistory.orderHistoryResponses;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = spendHistory.description;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = spendHistory.orderId;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = spendHistory.spendCash;
        }
        Float f5 = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = spendHistory.spendPoints;
        }
        Float f6 = object4;
        object = spendHistory;
        string3 = string2;
        object2 = object5;
        object3 = string4;
        object4 = string5;
        object5 = f6;
        return spendHistory.copy(string2, (ArrayList)object2, string4, string5, f5, f6);
    }

    public final String component1() {
        return this.debitedDate;
    }

    public final ArrayList component2() {
        return this.orderHistoryResponses;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.orderId;
    }

    public final Float component5() {
        return this.spendCash;
    }

    public final Float component6() {
        return this.spendPoints;
    }

    public final SpendHistory copy(String string2, ArrayList arrayList, String string3, String string4, Float f5, Float f6) {
        SpendHistory spendHistory = new SpendHistory(string2, arrayList, string3, string4, f5, f6);
        return spendHistory;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SpendHistory;
        if (!bl3) {
            return false;
        }
        object = (SpendHistory)object;
        Object object2 = this.debitedDate;
        Object object3 = ((SpendHistory)object).debitedDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderHistoryResponses;
        object3 = ((SpendHistory)object).orderHistoryResponses;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((SpendHistory)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderId;
        object3 = ((SpendHistory)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.spendCash;
        object3 = ((SpendHistory)object).spendCash;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.spendPoints;
        object = ((SpendHistory)object).spendPoints;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDebitedDate() {
        return this.debitedDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ArrayList getOrderHistoryResponses() {
        return this.orderHistoryResponses;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Float getSpendCash() {
        return this.spendCash;
    }

    public final Float getSpendPoints() {
        return this.spendPoints;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.debitedDate;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.orderHistoryResponses;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
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
        object = this.spendCash;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.spendPoints;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.debitedDate;
        ArrayList arrayList = this.orderHistoryResponses;
        String string3 = this.description;
        String string4 = this.orderId;
        Float f5 = this.spendCash;
        Float f6 = this.spendPoints;
        StringBuilder stringBuilder = new StringBuilder("SpendHistory(debitedDate=");
        stringBuilder.append(string2);
        stringBuilder.append(", orderHistoryResponses=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", description=");
        X50.a(stringBuilder, string3, ", orderId=", string4, ", spendCash=");
        stringBuilder.append(f5);
        stringBuilder.append(", spendPoints=");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

