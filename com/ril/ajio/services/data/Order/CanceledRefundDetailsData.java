/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CanceledRefundDetailsData
implements Serializable {
    private List refundsDetail;

    public CanceledRefundDetailsData() {
        this(null, 1, null);
    }

    public CanceledRefundDetailsData(List list) {
        this.refundsDetail = list;
    }

    public /* synthetic */ CanceledRefundDetailsData(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            list = null;
        }
        this(list);
    }

    public static /* synthetic */ CanceledRefundDetailsData copy$default(CanceledRefundDetailsData canceledRefundDetailsData, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = canceledRefundDetailsData.refundsDetail;
        }
        return canceledRefundDetailsData.copy(list);
    }

    public final List component1() {
        return this.refundsDetail;
    }

    public final CanceledRefundDetailsData copy(List list) {
        CanceledRefundDetailsData canceledRefundDetailsData = new CanceledRefundDetailsData(list);
        return canceledRefundDetailsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CanceledRefundDetailsData;
        if (!bl3) {
            return false;
        }
        object = (CanceledRefundDetailsData)object;
        List list = this.refundsDetail;
        object = ((CanceledRefundDetailsData)object).refundsDetail;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getRefundsDetail() {
        return this.refundsDetail;
    }

    public int hashCode() {
        int n3;
        List list = this.refundsDetail;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public final void setRefundsDetail(List list) {
        this.refundsDetail = list;
    }

    public String toString() {
        List list = this.refundsDetail;
        StringBuilder stringBuilder = new StringBuilder("CanceledRefundDetailsData(refundsDetail=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

