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
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import kotlin.jvm.internal.Intrinsics;

public final class ConvenienceFee$Creator
implements Parcelable.Creator {
    public final ConvenienceFee createFromParcel(Parcel object) {
        ConvenienceFee convenienceFee;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        Object object3 = null;
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = AmountData.CREATOR.createFromParcel(object);
        }
        Object object4 = object2;
        object4 = (AmountData)object2;
        n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = AmountData.CREATOR.createFromParcel(object);
        }
        Object object5 = object2;
        object5 = (AmountData)object2;
        n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = AmountData.CREATOR.createFromParcel(object);
        }
        Object object6 = object2;
        object6 = (AmountData)object2;
        n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = AmountData.CREATOR.createFromParcel(object);
        }
        Object object7 = object2;
        object7 = (AmountData)object2;
        n3 = object.readInt();
        if (n3 != 0) {
            object2 = AmountData.CREATOR;
            object3 = object2.createFromParcel(object);
        }
        object = object3;
        object = (AmountData)object3;
        object2 = convenienceFee;
        object3 = object4;
        object4 = object5;
        object5 = object6;
        object6 = object7;
        object7 = object;
        convenienceFee = new ConvenienceFee((AmountData)object3, (AmountData)object4, (AmountData)object5, (AmountData)object6, (AmountData)object);
        return convenienceFee;
    }

    public final ConvenienceFee[] newArray(int n3) {
        return new ConvenienceFee[n3];
    }
}

