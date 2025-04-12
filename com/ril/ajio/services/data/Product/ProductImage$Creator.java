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
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductVideos;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ProductImage$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final ProductImage createFromParcel(Parcel object) {
        ProductImage productImage;
        Serializable serializable;
        void var9_16;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        int n3 = object.readInt();
        String string5 = object.readString();
        int n4 = object.readInt();
        if (n4 == 0) {
            boolean bl2 = false;
            Object var9_15 = null;
        } else {
            void var8_14;
            int n7 = object.readInt();
            if (n7 != 0) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                Object var9_17 = null;
            }
            Boolean bl5 = (boolean)var8_14;
        }
        void var10_20 = var9_16;
        String string6 = object.readString();
        String string7 = object.readString();
        Serializable serializable2 = serializable = object.readSerializable();
        ProductVideos productVideos = (ProductVideos)serializable;
        ProductImage productImage2 = productImage;
        return new ProductImage(string2, string3, string4, n3, string5, (Boolean)var10_20, string6, string7, productVideos);
    }

    public final ProductImage[] newArray(int n3) {
        return new ProductImage[n3];
    }
}

