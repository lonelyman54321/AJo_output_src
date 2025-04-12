/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CancelledRefundDetailInfo {
    private String cancelReqTimestamp;
    private String canceledRefundMessage;
    private String canceledTimestamp;
    private String cancellationType;
    private List refundDetailsObj;
    private Double totalRefund;

    public CancelledRefundDetailInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CancelledRefundDetailInfo(Double d2, String string2, List list, String string3, String string4, String string5) {
        this.totalRefund = d2;
        this.canceledTimestamp = string2;
        this.refundDetailsObj = list;
        this.cancellationType = string3;
        this.canceledRefundMessage = string4;
        this.cancelReqTimestamp = string5;
    }

    public /* synthetic */ CancelledRefundDetailInfo(Double object, String object2, List object3, String object4, String string2, String string3, int n3, DefaultConstructorMarker object5) {
        String string4;
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
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object8 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        object = this;
        object2 = object5;
        object3 = object6;
        object4 = object7;
        string2 = object8;
        string3 = string5;
        this((Double)object5, (String)object6, (List)object7, (String)object8, string5, string4);
    }

    public static /* synthetic */ CancelledRefundDetailInfo copy$default(CancelledRefundDetailInfo cancelledRefundDetailInfo, Double d2, String object, List object2, String object3, String object4, String string2, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = cancelledRefundDetailInfo.totalRefund;
        }
        if ((n4 = n3 & 2) != 0) {
            object = cancelledRefundDetailInfo.canceledTimestamp;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = cancelledRefundDetailInfo.refundDetailsObj;
        }
        List list = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = cancelledRefundDetailInfo.cancellationType;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = cancelledRefundDetailInfo.canceledRefundMessage;
        }
        String string4 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string2 = cancelledRefundDetailInfo.cancelReqTimestamp;
        }
        String string5 = string2;
        object = cancelledRefundDetailInfo;
        object2 = d2;
        object3 = object5;
        object4 = list;
        string2 = string3;
        object5 = string5;
        return cancelledRefundDetailInfo.copy(d2, (String)object3, list, string3, string4, string5);
    }

    public final Double component1() {
        return this.totalRefund;
    }

    public final String component2() {
        return this.canceledTimestamp;
    }

    public final List component3() {
        return this.refundDetailsObj;
    }

    public final String component4() {
        return this.cancellationType;
    }

    public final String component5() {
        return this.canceledRefundMessage;
    }

    public final String component6() {
        return this.cancelReqTimestamp;
    }

    public final CancelledRefundDetailInfo copy(Double d2, String string2, List list, String string3, String string4, String string5) {
        CancelledRefundDetailInfo cancelledRefundDetailInfo = new CancelledRefundDetailInfo(d2, string2, list, string3, string4, string5);
        return cancelledRefundDetailInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CancelledRefundDetailInfo;
        if (!bl3) {
            return false;
        }
        object = (CancelledRefundDetailInfo)object;
        Object object2 = this.totalRefund;
        Object object3 = ((CancelledRefundDetailInfo)object).totalRefund;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.canceledTimestamp;
        object3 = ((CancelledRefundDetailInfo)object).canceledTimestamp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundDetailsObj;
        object3 = ((CancelledRefundDetailInfo)object).refundDetailsObj;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cancellationType;
        object3 = ((CancelledRefundDetailInfo)object).cancellationType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.canceledRefundMessage;
        object3 = ((CancelledRefundDetailInfo)object).canceledRefundMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cancelReqTimestamp;
        object = ((CancelledRefundDetailInfo)object).cancelReqTimestamp;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCancelReqTimestamp() {
        return this.cancelReqTimestamp;
    }

    public final String getCanceledRefundMessage() {
        return this.canceledRefundMessage;
    }

    public final String getCanceledTimestamp() {
        return this.canceledTimestamp;
    }

    public final String getCancellationType() {
        return this.cancellationType;
    }

    public final List getRefundDetailsObj() {
        return this.refundDetailsObj;
    }

    public final Double getTotalRefund() {
        return this.totalRefund;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.totalRefund;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Object object = this.canceledTimestamp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundDetailsObj;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cancellationType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.canceledRefundMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cancelReqTimestamp;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCancelReqTimestamp(String string2) {
        this.cancelReqTimestamp = string2;
    }

    public final void setCanceledRefundMessage(String string2) {
        this.canceledRefundMessage = string2;
    }

    public final void setCanceledTimestamp(String string2) {
        this.canceledTimestamp = string2;
    }

    public final void setCancellationType(String string2) {
        this.cancellationType = string2;
    }

    public final void setRefundDetailsObj(List list) {
        this.refundDetailsObj = list;
    }

    public final void setTotalRefund(Double d2) {
        this.totalRefund = d2;
    }

    public String toString() {
        Double d2 = this.totalRefund;
        String string2 = this.canceledTimestamp;
        List list = this.refundDetailsObj;
        String string3 = this.cancellationType;
        String string4 = this.canceledRefundMessage;
        String string5 = this.cancelReqTimestamp;
        StringBuilder stringBuilder = new StringBuilder("CancelledRefundDetailInfo(totalRefund=");
        stringBuilder.append(d2);
        stringBuilder.append(", canceledTimestamp=");
        stringBuilder.append(string2);
        stringBuilder.append(", refundDetailsObj=");
        stringBuilder.append(list);
        stringBuilder.append(", cancellationType=");
        stringBuilder.append(string3);
        stringBuilder.append(", canceledRefundMessage=");
        return ko_0.a(stringBuilder, string4, ", cancelReqTimestamp=", string5, ")");
    }
}

