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
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts$Quantity$Creator
implements Parcelable.Creator {
    public final GiftProducts$Quantity createFromParcel(Parcel object) {
        GiftProducts$Quantity giftProducts$Quantity;
        Number number;
        Serializable serializable;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
        Double d2 = null;
        if (n3 == 0) {
            object2 = null;
        } else {
            double d5 = object.readDouble();
            serializable = d5;
            object2 = serializable;
        }
        Object object3 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            number = null;
        } else {
            n3 = object.readInt();
            number = serializable = Integer.valueOf(n3);
        }
        n3 = object.readInt();
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
        serializable = giftProducts$Quantity;
        d2 = object2;
        object2 = object3;
        object3 = number;
        number = object;
        giftProducts$Quantity = new GiftProducts$Quantity(string2, string3, d2, (String)object2, (Integer)object3, (Boolean)object);
        return giftProducts$Quantity;
    }

    public final GiftProducts$Quantity[] newArray(int n3) {
        return new GiftProducts$Quantity[n3];
    }
}

