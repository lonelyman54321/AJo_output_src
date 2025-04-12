/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Deal;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.TaxInformation;
import kotlin.jvm.internal.Intrinsics;

public final class Price$Creator
implements Parcelable.Creator {
    public final Price createFromParcel(Parcel parcel) {
        Price price;
        Object object;
        float f5;
        Object object2;
        Object object3 = parcel;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        int n3 = parcel.readInt();
        Object object4 = null;
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        } else {
            object2 = TaxInformation.CREATOR.createFromParcel(parcel);
        }
        Object object5 = object2;
        object5 = (TaxInformation)object2;
        n3 = parcel.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        } else {
            object2 = Deal.CREATOR.createFromParcel(object3);
        }
        Object object6 = object2;
        object6 = (Deal)object2;
        Object object7 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        } else {
            object2 = PriceReveal.CREATOR.createFromParcel(object3);
        }
        Object object8 = object2;
        object8 = (PriceReveal)object2;
        n3 = parcel.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            f5 = parcel.readFloat();
            object = object2 = Float.valueOf(f5);
        }
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            object3 = null;
        } else {
            int n4 = parcel.readInt();
            if (n4) {
                n4 = 1;
            } else {
                n4 = 0;
                object3 = null;
            }
            object3 = n4 != 0;
        }
        object2 = price;
        object4 = object5;
        object5 = object6;
        object6 = object7;
        object7 = object8;
        object8 = object;
        object = string5;
        string5 = string6;
        string6 = string7;
        string7 = string8;
        string8 = object3;
        price = new Price(string2, string3, string4, (TaxInformation)object4, (Deal)object5, (String)object6, (PriceReveal)object7, (Float)object8, (String)object, string5, string6, string7, (Boolean)object3);
        return price;
    }

    public final Price[] newArray(int n3) {
        return new Price[n3];
    }
}

