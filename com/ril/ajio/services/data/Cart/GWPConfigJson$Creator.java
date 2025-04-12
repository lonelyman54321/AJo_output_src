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
import com.ril.ajio.services.data.Cart.GWPConfigJson;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class GWPConfigJson$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final GWPConfigJson createFromParcel(Parcel parcel) {
        GWPConfigJson gWPConfigJson;
        Object object;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        int n3 = parcel.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            object = null;
        } else {
            void var11_16;
            int n4 = parcel.readInt();
            if (n4 != 0) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                object = null;
            }
            object = (boolean)var11_16;
        }
        Boolean bl5 = object;
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        String string19 = parcel.readString();
        String string20 = parcel.readString();
        String string21 = parcel.readString();
        String string22 = parcel.readString();
        String string23 = parcel.readString();
        String string24 = parcel.readString();
        String string25 = parcel.readString();
        String string26 = parcel.readString();
        String string27 = parcel.readString();
        String string28 = parcel.readString();
        String string29 = parcel.readString();
        ArrayList arrayList = parcel.createStringArrayList();
        object = gWPConfigJson;
        return new GWPConfigJson(string2, string3, string4, string5, string6, string7, string8, string9, bl5, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, arrayList);
    }

    public final GWPConfigJson[] newArray(int n3) {
        return new GWPConfigJson[n3];
    }
}

