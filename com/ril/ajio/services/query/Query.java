/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.Query$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class Query
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String value;

    static {
        Query$Creator query$Creator = new Query$Creator();
        CREATOR = query$Creator;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

