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
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.AllOfferMerge;
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class AllOfferMerge$Creator
implements Parcelable.Creator {
    public final AllOfferMerge createFromParcel(Parcel object) {
        Parcelable.Creator creator;
        ArrayList arrayList;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.readInt();
        int n4 = 0;
        ArrayList arrayList2 = null;
        if (n3 == 0) {
            arrayList = null;
        } else {
            n3 = object.readInt();
            arrayList = new ArrayList(n3);
            int n7 = 0;
            creator = null;
            while (n7 != n3) {
                Parcelable.Creator creator2 = ProductPromotion.CREATOR;
                int n8 = 1;
                n7 = pz0_2.a(creator2, object, arrayList, n7, n8);
            }
        }
        n3 = object.readInt();
        if (n3 != 0) {
            n3 = object.readInt();
            arrayList2 = new ArrayList(n3);
            while (n4 != n3) {
                creator = BankOfferItem.CREATOR;
                int n10 = 1;
                n4 = pz0_2.a(creator, object, arrayList2, n4, n10);
            }
        }
        object = new AllOfferMerge(arrayList, arrayList2);
        return object;
    }

    public final AllOfferMerge[] newArray(int n3) {
        return new AllOfferMerge[n3];
    }
}

