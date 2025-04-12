/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.TaxInformation;
import kotlin.jvm.internal.Intrinsics;

public final class TaxInformation$Creator
implements Parcelable.Creator {
    public final TaxInformation createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        Object object2 = TaxInformation.class;
        Object object3 = ((Class)object2).getClassLoader();
        object3 = (Price)object.readParcelable((ClassLoader)object3);
        object2 = ((Class)object2).getClassLoader();
        object = (Price)object.readParcelable((ClassLoader)object2);
        TaxInformation taxInformation = new TaxInformation((Price)object3, (Price)object);
        return taxInformation;
    }

    public final TaxInformation[] newArray(int n3) {
        return new TaxInformation[n3];
    }
}

