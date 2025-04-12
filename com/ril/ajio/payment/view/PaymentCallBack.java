/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.payment.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.payment.view.PaymentCallBack$a;

public class PaymentCallBack
implements Parcelable {
    public static Parcelable.Creator CREATOR;

    static {
        PaymentCallBack$a paymentCallBack$a = new Object();
        CREATOR = paymentCallBack$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
    }
}

