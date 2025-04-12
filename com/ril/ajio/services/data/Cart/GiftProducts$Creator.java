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
import com.ril.ajio.services.data.Cart.GiftProducts;
import com.ril.ajio.services.data.Cart.GiftProducts$AssociatedProduct;
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts$Creator
implements Parcelable.Creator {
    public final GiftProducts createFromParcel(Parcel object) {
        Object object2;
        String string2;
        ArrayList arrayList;
        String string3 = "parcel";
        Intrinsics.checkNotNullParameter(object, string3);
        int n3 = object.readInt();
        int n4 = 0;
        int n7 = 0;
        Object object3 = null;
        if (n3 == 0) {
            arrayList = null;
        } else {
            n3 = object.readInt();
            arrayList = new ArrayList(n3);
            int n8 = 0;
            string2 = null;
            while (n8 != n3) {
                object2 = GiftProducts$AssociatedProduct.CREATOR;
                int n10 = 1;
                n8 = pz0_2.a(object2, object, arrayList, n8, n10);
            }
        }
        string3 = object.readString();
        string2 = object.readString();
        int n14 = object.readInt();
        if (n14 != 0) {
            n7 = object.readInt();
            object2 = new ArrayList(n7);
            while (n4 != n7) {
                Parcelable.Creator creator = GiftProducts$Quantity.CREATOR;
                int n15 = 1;
                n4 = pz0_2.a(creator, object, (ArrayList)object2, n4, n15);
            }
            object3 = object2;
        }
        object = new GiftProducts(arrayList, string3, string2, (List)object3);
        return object;
    }

    public final GiftProducts[] newArray(int n3) {
        return new GiftProducts[n3];
    }
}

