/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.SuggestedSearchTerms$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SuggestedSearchTerms
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String itemCount;
    private String searchTerm;
    private String url;

    static {
        SuggestedSearchTerms$Creator suggestedSearchTerms$Creator = new SuggestedSearchTerms$Creator();
        CREATOR = suggestedSearchTerms$Creator;
    }

    public SuggestedSearchTerms() {
        this(null, null, null, 7, null);
    }

    public SuggestedSearchTerms(String string2, String string3, String string4) {
        this.searchTerm = string2;
        this.url = string3;
        this.itemCount = string4;
    }

    public /* synthetic */ SuggestedSearchTerms(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string5 = "";
        if (n4 != 0) {
            string2 = string5;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = string5;
        }
        if ((n3 &= 4) != 0) {
            string4 = string5;
        }
        this(string2, string3, string4);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getItemCount() {
        return this.itemCount;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setItemCount(String string2) {
        this.itemCount = string2;
    }

    public final void setSearchTerm(String string2) {
        this.searchTerm = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.searchTerm;
        parcel.writeString(string2);
        string2 = this.url;
        parcel.writeString(string2);
        string2 = this.itemCount;
        parcel.writeString(string2);
    }
}

