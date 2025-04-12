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
import com.ril.ajio.services.query.QueryLangingCode$1;

public class QueryLangingCode
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String landingCode;

    static {
        QueryLangingCode$1 queryLangingCode$1 = new QueryLangingCode$1();
        CREATOR = queryLangingCode$1;
    }

    public QueryLangingCode() {
    }

    private QueryLangingCode(Parcel object) {
        object = object.readString();
        this.landingCode = object;
    }

    public /* synthetic */ QueryLangingCode(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getLandingCode() {
        return this.landingCode;
    }

    public void setLandingCode(String string2) {
        this.landingCode = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.landingCode;
        parcel.writeString(string2);
    }
}

