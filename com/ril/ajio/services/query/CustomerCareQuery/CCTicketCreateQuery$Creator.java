/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query.CustomerCareQuery;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import kotlin.jvm.internal.Intrinsics;

public final class CCTicketCreateQuery$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final CCTicketCreateQuery createFromParcel(Parcel parcel) {
        void var14_17;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        int bl2 = parcel.readInt();
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        String string13 = parcel.readString();
        CCTicketCreateQuery cCTicketCreateQuery = new CCTicketCreateQuery(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, (boolean)var14_17, string13);
        return cCTicketCreateQuery;
    }

    public final CCTicketCreateQuery[] newArray(int n3) {
        return new CCTicketCreateQuery[n3];
    }
}

