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
import com.ril.ajio.services.data.Product.MandatoryInfo;
import com.ril.ajio.services.data.Product.PriceBreakUp;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.flashsale.pdp.ModelImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ProductOptionItem$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final ProductOptionItem createFromParcel(Parcel parcel) {
        void var40_54;
        void var22_30;
        ProductOptionItem productOptionItem;
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2;
        ArrayList<Object> arrayList3;
        Object object;
        Object object2;
        int n3;
        Object object3;
        ArrayList<Object> arrayList4;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        ArrayList<Object> arrayList5;
        Parcel parcel2 = parcel;
        ArrayList arrayList6 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)((Object)arrayList6));
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        int n8 = parcel.readInt();
        if (n8 == 0) {
            arrayList5 = null;
        } else {
            n8 = parcel.readInt();
            arrayList5 = new ArrayList<Object>(n8);
            n7 = 0;
            object6 = null;
            while (n7 != n8) {
                object5 = ProductOptionVariant.CREATOR;
                int n10 = 1;
                n7 = pz0_2.a(object5, parcel2, arrayList5, n7, n10);
            }
        }
        n8 = parcel.readInt();
        if (n8 == 0) {
            n7 = 0;
            object6 = null;
        } else {
            n8 = parcel.readInt();
            object6 = new ArrayList(n8);
            int n14 = 0;
            object5 = null;
            while (n14 != n8) {
                object4 = ProductOptionVariant.CREATOR;
                int n15 = 1;
                n14 = pz0_2.a(object4, parcel2, object6, n14, n15);
            }
        }
        arrayList6 = ProductOptionItem.class;
        object5 = ((Class)((Object)arrayList6)).getClassLoader();
        object5 = (Price)parcel2.readParcelable((ClassLoader)object5);
        object4 = parcel.readString();
        String string7 = parcel.readString();
        Object object7 = parcel.readString();
        int n16 = parcel.readInt();
        if (n16 == 0) {
            boolean bl2 = false;
            arrayList4 = null;
        } else {
            arrayList4 = ModelImage.CREATOR.createFromParcel(parcel2);
        }
        arrayList4 = (ModelImage)((Object)arrayList4);
        int n4 = parcel.readInt();
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object3 = null;
        }
        int n10 = parcel.readInt();
        if (n10 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = Stock.CREATOR.createFromParcel(parcel2);
        }
        Object object8 = object2;
        object8 = (Stock)object2;
        arrayList6 = ((Class)((Object)arrayList6)).getClassLoader();
        arrayList6 = (Price)parcel2.readParcelable((ClassLoader)((Object)arrayList6));
        n3 = parcel.readInt();
        if (n3 == 0) {
            object = arrayList6;
            arrayList3 = arrayList4;
            n8 = 0;
            arrayList6 = null;
        } else {
            n3 = parcel.readInt();
            arrayList2 = new ArrayList<Object>(n3);
            object = arrayList6;
            n8 = 0;
            arrayList6 = null;
            while (n8 != n3) {
                object2 = MandatoryInfo.CREATOR;
                arrayList3 = arrayList4;
                int n14 = 1;
                n8 = pz0_2.a((Parcelable.Creator)object2, parcel2, arrayList2, n8, n14);
            }
            arrayList3 = arrayList4;
            arrayList6 = arrayList2;
        }
        String string8 = parcel.readString();
        Object object9 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 == 0) {
            boolean bl5 = false;
            arrayList = null;
        } else {
            void var20_24;
            n3 = parcel.readInt();
            arrayList2 = new ArrayList<Object>(n3);
            boolean bl6 = false;
            arrayList4 = null;
            while (var20_24 != n3) {
                int n15 = parcel.readInt();
                if (n15 == 0) {
                    n15 = n3;
                    n3 = 0;
                    object2 = null;
                } else {
                    n15 = n3;
                    object2 = PriceBreakUp.CREATOR.createFromParcel(parcel2);
                }
                arrayList2.add(object2);
                ++var20_24;
                n3 = n15;
            }
            arrayList = arrayList2;
        }
        n3 = parcel.readInt();
        if (n3 == 0) {
            arrayList2 = null;
        } else {
            object2 = ProductOptionVariant.CREATOR;
            arrayList2 = object2.createFromParcel(parcel2);
        }
        Cloneable cloneable = arrayList2;
        cloneable = (ProductOptionVariant)((Object)arrayList2);
        n3 = parcel.readInt();
        boolean bl7 = n3 != 0;
        int n17 = parcel.readInt();
        int n18 = parcel.readInt();
        if (n18 != 0) {
            boolean bl8 = true;
        } else {
            boolean bl9 = false;
            parcel2 = null;
        }
        object2 = productOptionItem;
        arrayList2 = arrayList5;
        arrayList5 = object6;
        object6 = object5;
        object5 = object4;
        object4 = string7;
        string7 = object7;
        object7 = arrayList3;
        void var20_25 = var22_30;
        object3 = object8;
        ArrayList arrayList7 = object;
        object8 = string8;
        String string11 = object9;
        object = string9;
        string8 = string10;
        arrayList3 = arrayList;
        object9 = cloneable;
        void var35_46 = var40_54;
        productOptionItem = new ProductOptionItem(string2, string3, string4, string5, string6, arrayList2, arrayList5, (Price)object6, (String)object5, (String)object4, string7, (ModelImage)object7, (boolean)var22_30, (Stock)object3, (Price)((Object)arrayList7), arrayList6, (String)object8, string11, string9, string10, arrayList, (ProductOptionVariant)cloneable, bl7, n17, (boolean)var40_54);
        return productOptionItem;
    }

    public final ProductOptionItem[] newArray(int n3) {
        return new ProductOptionItem[n3];
    }
}

