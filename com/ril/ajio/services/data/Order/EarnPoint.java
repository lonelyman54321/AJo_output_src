/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.Status;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EarnPoint
implements Serializable {
    private Double eligibleEarnAmount;
    private ArrayList extraResponseParams;
    private Status status;

    public EarnPoint() {
        this(null, null, null, 7, null);
    }

    public EarnPoint(Double d2, Status status, ArrayList arrayList) {
        this.eligibleEarnAmount = d2;
        this.status = status;
        this.extraResponseParams = arrayList;
    }

    public /* synthetic */ EarnPoint(Double d2, Status status, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            double d5 = 0.0;
            d2 = d5;
        }
        if ((n4 = n3 & 2) != 0) {
            status = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList = null;
        }
        this(d2, status, arrayList);
    }

    public static /* synthetic */ EarnPoint copy$default(EarnPoint earnPoint, Double d2, Status status, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = earnPoint.eligibleEarnAmount;
        }
        if ((n4 = n3 & 2) != 0) {
            status = earnPoint.status;
        }
        if ((n3 &= 4) != 0) {
            arrayList = earnPoint.extraResponseParams;
        }
        return earnPoint.copy(d2, status, arrayList);
    }

    public final Double component1() {
        return this.eligibleEarnAmount;
    }

    public final Status component2() {
        return this.status;
    }

    public final ArrayList component3() {
        return this.extraResponseParams;
    }

    public final EarnPoint copy(Double d2, Status status, ArrayList arrayList) {
        EarnPoint earnPoint = new EarnPoint(d2, status, arrayList);
        return earnPoint;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EarnPoint;
        if (!bl3) {
            return false;
        }
        object = (EarnPoint)object;
        Serializable serializable = this.eligibleEarnAmount;
        Serializable serializable2 = ((EarnPoint)object).eligibleEarnAmount;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.status;
        serializable2 = ((EarnPoint)object).status;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.extraResponseParams;
        object = ((EarnPoint)object).extraResponseParams;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getEligibleEarnAmount() {
        return this.eligibleEarnAmount;
    }

    public final ArrayList getExtraResponseParams() {
        return this.extraResponseParams;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.eligibleEarnAmount;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.status;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.extraResponseParams;
        if (serializable != null) {
            n7 = ((ArrayList)serializable).hashCode();
        }
        return n4 + n7;
    }

    public final void setEligibleEarnAmount(Double d2) {
        this.eligibleEarnAmount = d2;
    }

    public final void setExtraResponseParams(ArrayList arrayList) {
        this.extraResponseParams = arrayList;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        Double d2 = this.eligibleEarnAmount;
        Status status = this.status;
        ArrayList arrayList = this.extraResponseParams;
        StringBuilder stringBuilder = new StringBuilder("EarnPoint(eligibleEarnAmount=");
        stringBuilder.append(d2);
        stringBuilder.append(", status=");
        stringBuilder.append(status);
        stringBuilder.append(", extraResponseParams=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

