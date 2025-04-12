/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RefundDetails
implements Serializable {
    private List itemsList;
    private List refundActivities;
    private String refundType;
    private Double totalNonRefundableAmount;
    private Double totalRefundAmount;
    private Double totalReturnLineCost;
    private String transactionalRefId;

    public RefundDetails() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public RefundDetails(String string2, Double d2, Double d5, Double d7, List list, List list2, String string3) {
        this.transactionalRefId = string2;
        this.totalRefundAmount = d2;
        this.totalNonRefundableAmount = d5;
        this.totalReturnLineCost = d7;
        this.refundActivities = list;
        this.itemsList = list2;
        this.refundType = string3;
    }

    public /* synthetic */ RefundDetails(String object, Double object2, Double d2, Double d5, List object3, List list, String object4, int n3, DefaultConstructorMarker object5) {
        String string2;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Double d7 = n7 != 0 ? null : d2;
        n7 = n3 & 8;
        Double d9 = n7 != 0 ? null : d5;
        n7 = n3 & 0x10;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x20;
        List list2 = n7 != 0 ? null : list;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string2 = null;
        } else {
            string2 = object4;
        }
        object = this;
        object2 = object5;
        d2 = object6;
        d5 = d7;
        object3 = d9;
        list = object7;
        object4 = list2;
        this((String)object5, (Double)object6, d7, d9, (List)object7, list2, string2);
    }

    public static /* synthetic */ RefundDetails copy$default(RefundDetails refundDetails, String string2, Double serializable, Double object, Double object2, List object3, List object4, String object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = refundDetails.transactionalRefId;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = refundDetails.totalRefundAmount;
        }
        object6 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = refundDetails.totalNonRefundableAmount;
        }
        Double d2 = object;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = refundDetails.totalReturnLineCost;
        }
        Double d5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = refundDetails.refundActivities;
        }
        List list = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = refundDetails.itemsList;
        }
        List list2 = object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = refundDetails.refundType;
        }
        String string3 = object5;
        serializable = refundDetails;
        object = string2;
        object2 = object6;
        object3 = d2;
        object4 = d5;
        object5 = list;
        object6 = string3;
        return refundDetails.copy(string2, (Double)object2, d2, d5, list, list2, string3);
    }

    public final String component1() {
        return this.transactionalRefId;
    }

    public final Double component2() {
        return this.totalRefundAmount;
    }

    public final Double component3() {
        return this.totalNonRefundableAmount;
    }

    public final Double component4() {
        return this.totalReturnLineCost;
    }

    public final List component5() {
        return this.refundActivities;
    }

    public final List component6() {
        return this.itemsList;
    }

    public final String component7() {
        return this.refundType;
    }

    public final RefundDetails copy(String string2, Double d2, Double d5, Double d7, List list, List list2, String string3) {
        RefundDetails refundDetails = new RefundDetails(string2, d2, d5, d7, list, list2, string3);
        return refundDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefundDetails;
        if (!bl3) {
            return false;
        }
        object = (RefundDetails)object;
        Object object2 = this.transactionalRefId;
        Object object3 = ((RefundDetails)object).transactionalRefId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalRefundAmount;
        object3 = ((RefundDetails)object).totalRefundAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalNonRefundableAmount;
        object3 = ((RefundDetails)object).totalNonRefundableAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalReturnLineCost;
        object3 = ((RefundDetails)object).totalReturnLineCost;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundActivities;
        object3 = ((RefundDetails)object).refundActivities;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.itemsList;
        object3 = ((RefundDetails)object).itemsList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundType;
        object = ((RefundDetails)object).refundType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getItemsList() {
        return this.itemsList;
    }

    public final List getRefundActivities() {
        return this.refundActivities;
    }

    public final String getRefundType() {
        return this.refundType;
    }

    public final Double getTotalNonRefundableAmount() {
        return this.totalNonRefundableAmount;
    }

    public final Double getTotalRefundAmount() {
        return this.totalRefundAmount;
    }

    public final Double getTotalReturnLineCost() {
        return this.totalReturnLineCost;
    }

    public final String getTransactionalRefId() {
        return this.transactionalRefId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.transactionalRefId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.totalRefundAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalNonRefundableAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalReturnLineCost;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundActivities;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.itemsList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundType;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setItemsList(List list) {
        this.itemsList = list;
    }

    public final void setRefundActivities(List list) {
        this.refundActivities = list;
    }

    public final void setRefundType(String string2) {
        this.refundType = string2;
    }

    public final void setTotalNonRefundableAmount(Double d2) {
        this.totalNonRefundableAmount = d2;
    }

    public final void setTotalRefundAmount(Double d2) {
        this.totalRefundAmount = d2;
    }

    public final void setTotalReturnLineCost(Double d2) {
        this.totalReturnLineCost = d2;
    }

    public final void setTransactionalRefId(String string2) {
        this.transactionalRefId = string2;
    }

    public String toString() {
        String string2 = this.transactionalRefId;
        Double d2 = this.totalRefundAmount;
        Double d5 = this.totalNonRefundableAmount;
        Double d7 = this.totalReturnLineCost;
        List list = this.refundActivities;
        List list2 = this.itemsList;
        String string3 = this.refundType;
        StringBuilder stringBuilder = new StringBuilder("RefundDetails(transactionalRefId=");
        stringBuilder.append(string2);
        stringBuilder.append(", totalRefundAmount=");
        stringBuilder.append(d2);
        stringBuilder.append(", totalNonRefundableAmount=");
        stringBuilder.append(d5);
        stringBuilder.append(", totalReturnLineCost=");
        stringBuilder.append(d7);
        stringBuilder.append(", refundActivities=");
        stringBuilder.append(list);
        stringBuilder.append(", itemsList=");
        stringBuilder.append(list2);
        stringBuilder.append(", refundType=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

