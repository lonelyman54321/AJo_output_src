/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.RefundAmountDetails$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RefundAmountDetails
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String canceledRefundMessage;

    static {
        RefundAmountDetails$Creator refundAmountDetails$Creator = new RefundAmountDetails$Creator();
        CREATOR = refundAmountDetails$Creator;
    }

    public RefundAmountDetails() {
        this(null, 1, null);
    }

    public RefundAmountDetails(String string2) {
        this.canceledRefundMessage = string2;
    }

    public /* synthetic */ RefundAmountDetails(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ RefundAmountDetails copy$default(RefundAmountDetails refundAmountDetails, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = refundAmountDetails.canceledRefundMessage;
        }
        return refundAmountDetails.copy(string2);
    }

    public final String component1() {
        return this.canceledRefundMessage;
    }

    public final RefundAmountDetails copy(String string2) {
        RefundAmountDetails refundAmountDetails = new RefundAmountDetails(string2);
        return refundAmountDetails;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefundAmountDetails;
        if (!bl3) {
            return false;
        }
        object = (RefundAmountDetails)object;
        String string2 = this.canceledRefundMessage;
        object = ((RefundAmountDetails)object).canceledRefundMessage;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCanceledRefundMessage() {
        return this.canceledRefundMessage;
    }

    public int hashCode() {
        int n3;
        String string2 = this.canceledRefundMessage;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setCanceledRefundMessage(String string2) {
        this.canceledRefundMessage = string2;
    }

    public String toString() {
        String string2 = this.canceledRefundMessage;
        return cP.a("RefundAmountDetails(canceledRefundMessage=", string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.canceledRefundMessage;
        parcel.writeString(string2);
    }
}

