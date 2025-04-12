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
import com.ril.ajio.services.data.Cart.PanCardVerificationRequest;
import kotlin.jvm.internal.Intrinsics;

public final class PanCardVerificationRequest$Creator
implements Parcelable.Creator {
    public final PanCardVerificationRequest createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            object = null;
        } else {
            int n4 = object.readInt();
            if (n4) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            object = n4 != 0;
        }
        PanCardVerificationRequest panCardVerificationRequest = new PanCardVerificationRequest(string2, string3, string4, (Boolean)object);
        return panCardVerificationRequest;
    }

    public final PanCardVerificationRequest[] newArray(int n3) {
        return new PanCardVerificationRequest[n3];
    }
}

