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
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ProductPromotion$Creator
implements Parcelable.Creator {
    public final ProductPromotion createFromParcel(Parcel object) {
        ProductPromotion productPromotion;
        Serializable serializable;
        Boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        float f5 = object.readFloat();
        int n3 = object.readInt();
        boolean bl3 = false;
        Boolean bl4 = null;
        if (n3 == 0) {
            bl2 = null;
        } else {
            n3 = object.readInt();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                serializable = null;
            }
            bl2 = serializable = Boolean.valueOf(n3 != 0);
        }
        String string7 = object.readString();
        String string8 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            boolean bl5 = false;
            object = null;
        } else {
            int n4 = object.readInt();
            if (n4 != 0) {
                bl3 = true;
            }
            object = bl3;
        }
        serializable = productPromotion;
        bl4 = bl2;
        bl2 = object;
        productPromotion = new ProductPromotion(string2, string3, string4, string5, string6, f5, bl4, string7, string8, (Boolean)object);
        return productPromotion;
    }

    public final ProductPromotion[] newArray(int n3) {
        return new ProductPromotion[n3];
    }
}

