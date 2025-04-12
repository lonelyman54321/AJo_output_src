/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.RefundAmountDetails;
import kotlin.jvm.internal.Intrinsics;

public final class RefundAmountDetails$Creator
implements Parcelable.Creator {
    public final RefundAmountDetails createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        RefundAmountDetails refundAmountDetails = new RefundAmountDetails((String)object);
        return refundAmountDetails;
    }

    public final RefundAmountDetails[] newArray(int n3) {
        return new RefundAmountDetails[n3];
    }
}

