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
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductSwatchImage;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import kotlin.jvm.internal.Intrinsics;

public final class ProductOptionVariant$Creator
implements Parcelable.Creator {
    public final ProductOptionVariant createFromParcel(Parcel parcel) {
        ProductOptionVariant productOptionVariant;
        String string2;
        boolean bl2;
        Object object;
        Parcel parcel2 = parcel;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        int n3 = parcel.readInt();
        Class<ProductOptionVariant> clazz = null;
        if (n3 == 0) {
            n3 = 0;
            object = null;
        } else {
            object = ProductImage.CREATOR.createFromParcel(parcel);
        }
        Class<ProductOptionVariant> clazz2 = object;
        clazz2 = (ProductImage)object;
        n3 = parcel.readInt();
        if (n3 == 0) {
            n3 = 0;
            object = null;
        } else {
            object = ProductSwatchImage.CREATOR.createFromParcel(parcel2);
        }
        Class<ProductOptionVariant> clazz3 = object;
        clazz3 = (ProductSwatchImage)object;
        n3 = parcel.readInt();
        ClassLoader classLoader = null;
        boolean bl3 = true;
        boolean bl4 = n3 != 0;
        n3 = parcel.readInt();
        if (n3 != 0) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        n3 = parcel.readInt();
        if (n3 == 0) {
            bl3 = false;
        }
        String string7 = parcel.readString();
        Object object2 = parcel.readString();
        int n4 = parcel.readInt();
        object = ProductOptionVariant.class;
        classLoader = ((Class)object).getClassLoader();
        classLoader = parcel2.readParcelable(classLoader);
        Object object3 = classLoader;
        object3 = (Price)((Object)classLoader);
        object = ((Class)object).getClassLoader();
        Object object4 = object = parcel2.readParcelable((ClassLoader)object);
        object4 = (Price)object;
        n3 = parcel.readInt();
        if (n3 != 0) {
            object = ModelImage.CREATOR;
            clazz = object.createFromParcel(parcel2);
        }
        ModelImage modelImage = clazz;
        modelImage = (ModelImage)((Object)clazz);
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        object = productOptionVariant;
        clazz = clazz2;
        clazz2 = clazz3;
        string2 = object2;
        object2 = object3;
        productOptionVariant = new ProductOptionVariant(string3, string4, string5, string6, (ProductImage)((Object)clazz), (ProductSwatchImage)((Object)clazz3), bl4, bl2, bl3, string7, string2, n4, (Price)object3, (Price)object4, modelImage, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18);
        return productOptionVariant;
    }

    public final ProductOptionVariant[] newArray(int n3) {
        return new ProductOptionVariant[n3];
    }
}

