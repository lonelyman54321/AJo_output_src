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
import com.ril.ajio.services.query.CurrentQuery$Creator;
import com.ril.ajio.services.query.Query;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CurrentQuery
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Query query;
    private final String url;

    static {
        CurrentQuery$Creator currentQuery$Creator = new CurrentQuery$Creator();
        CREATOR = currentQuery$Creator;
    }

    public CurrentQuery() {
        this(null, null, 3, null);
    }

    public CurrentQuery(Query query, String string2) {
        this.query = query;
        this.url = string2;
    }

    public /* synthetic */ CurrentQuery(Query query, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            query = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(query, string2);
    }

    public final int describeContents() {
        return 0;
    }

    public final Query getQuery() {
        return this.query;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setQuery(Query query) {
        this.query = query;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Query query = this.query;
        if (query == null) {
            n3 = 0;
            string2 = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            query.writeToParcel(parcel, n3);
        }
        string2 = this.url;
        parcel.writeString(string2);
    }
}

