/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.CanceledRefundDetailsData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CancelledRefundDetails
implements Serializable {
    private String canceledRefundMessage;
    private Integer code;
    private CanceledRefundDetailsData data;
    private String message;

    public CancelledRefundDetails() {
        this(null, null, null, null, 15, null);
    }

    public CancelledRefundDetails(Integer n3, String string2, String string3, CanceledRefundDetailsData canceledRefundDetailsData) {
        this.code = n3;
        this.message = string2;
        this.canceledRefundMessage = string3;
        this.data = canceledRefundDetailsData;
    }

    public /* synthetic */ CancelledRefundDetails(Integer n3, String string2, String string3, CanceledRefundDetailsData canceledRefundDetailsData, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = null;
        }
        if ((n4 &= 8) != 0) {
            canceledRefundDetailsData = null;
        }
        this(n3, string2, string3, canceledRefundDetailsData);
    }

    public static /* synthetic */ CancelledRefundDetails copy$default(CancelledRefundDetails cancelledRefundDetails, Integer n3, String string2, String string3, CanceledRefundDetailsData canceledRefundDetailsData, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = cancelledRefundDetails.code;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = cancelledRefundDetails.message;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = cancelledRefundDetails.canceledRefundMessage;
        }
        if ((n4 &= 8) != 0) {
            canceledRefundDetailsData = cancelledRefundDetails.data;
        }
        return cancelledRefundDetails.copy(n3, string2, string3, canceledRefundDetailsData);
    }

    public final Integer component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.canceledRefundMessage;
    }

    public final CanceledRefundDetailsData component4() {
        return this.data;
    }

    public final CancelledRefundDetails copy(Integer n3, String string2, String string3, CanceledRefundDetailsData canceledRefundDetailsData) {
        CancelledRefundDetails cancelledRefundDetails = new CancelledRefundDetails(n3, string2, string3, canceledRefundDetailsData);
        return cancelledRefundDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CancelledRefundDetails;
        if (!bl3) {
            return false;
        }
        object = (CancelledRefundDetails)object;
        Object object2 = this.code;
        Object object3 = ((CancelledRefundDetails)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((CancelledRefundDetails)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.canceledRefundMessage;
        object3 = ((CancelledRefundDetails)object).canceledRefundMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.data;
        object = ((CancelledRefundDetails)object).data;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCanceledRefundMessage() {
        return this.canceledRefundMessage;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final CanceledRefundDetailsData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.code;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.message;
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
        object = this.data;
        if (object != null) {
            n8 = ((CanceledRefundDetailsData)object).hashCode();
        }
        return n4 + n8;
    }

    public final void setCanceledRefundMessage(String string2) {
        this.canceledRefundMessage = string2;
    }

    public final void setCode(Integer n3) {
        this.code = n3;
    }

    public final void setData(CanceledRefundDetailsData canceledRefundDetailsData) {
        this.data = canceledRefundDetailsData;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public String toString() {
        Integer n3 = this.code;
        String string2 = this.message;
        String string3 = this.canceledRefundMessage;
        CanceledRefundDetailsData canceledRefundDetailsData = this.data;
        StringBuilder stringBuilder = new StringBuilder("CancelledRefundDetails(code=");
        stringBuilder.append(n3);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", canceledRefundMessage=");
        stringBuilder.append(string3);
        stringBuilder.append(", data=");
        stringBuilder.append(canceledRefundDetailsData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

