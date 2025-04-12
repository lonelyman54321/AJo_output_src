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
import com.ril.ajio.services.data.Cart.PanEncryptionItem;
import kotlin.jvm.internal.Intrinsics;

public final class PanEncryptionItem$Creator
implements Parcelable.Creator {
    public final PanEncryptionItem createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
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
        PanEncryptionItem panEncryptionItem = new PanEncryptionItem(string2, string3, (Boolean)object);
        return panEncryptionItem;
    }

    public final PanEncryptionItem[] newArray(int n3) {
        return new PanEncryptionItem[n3];
    }
}

