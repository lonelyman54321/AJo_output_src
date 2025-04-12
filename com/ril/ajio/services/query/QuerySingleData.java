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
import com.ril.ajio.services.query.QuerySingleData$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class QuerySingleData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String data;

    static {
        QuerySingleData$Creator querySingleData$Creator = new QuerySingleData$Creator();
        CREATOR = querySingleData$Creator;
    }

    public QuerySingleData() {
        this(null, 1, null);
    }

    public QuerySingleData(String string2) {
        this.data = string2;
    }

    public /* synthetic */ QuerySingleData(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String string2) {
        this.data = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.data;
        parcel.writeString(string2);
    }
}

