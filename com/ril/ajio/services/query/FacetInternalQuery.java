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
import com.ril.ajio.services.query.FacetInternalQuery$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class FacetInternalQuery
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String value;

    static {
        FacetInternalQuery$Creator facetInternalQuery$Creator = new FacetInternalQuery$Creator();
        CREATOR = facetInternalQuery$Creator;
    }

    public FacetInternalQuery(String string2) {
        this.value = string2;
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
        String string2 = this.value;
        parcel.writeString(string2);
    }
}

