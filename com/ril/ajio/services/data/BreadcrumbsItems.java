/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.BreadcrumbsItems$1;
import com.ril.ajio.services.query.CurrentQuery;
import java.io.Serializable;

public class BreadcrumbsItems
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private String facetCode;
    private String facetName;
    private String facetValueCode;
    private String facetValueName;
    private CurrentQuery removeQuery;

    static {
        BreadcrumbsItems$1 breadcrumbsItems$1 = new BreadcrumbsItems$1();
        CREATOR = breadcrumbsItems$1;
    }

    private BreadcrumbsItems(Parcel object) {
        Object object2 = object.readString();
        this.facetCode = object2;
        object2 = object.readString();
        this.facetName = object2;
        object2 = object.readString();
        this.facetValueCode = object2;
        object2 = object.readString();
        this.facetValueName = object2;
        object2 = CurrentQuery.class.getClassLoader();
        object = (CurrentQuery)object.readParcelable((ClassLoader)object2);
        this.removeQuery = object;
    }

    public /* synthetic */ BreadcrumbsItems(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getFacetCode() {
        return this.facetCode;
    }

    public String getFacetName() {
        return this.facetName;
    }

    public String getFacetValueCode() {
        return this.facetValueCode;
    }

    public String getFacetValueName() {
        return this.facetValueName;
    }

    public CurrentQuery getRemoveQuery() {
        return this.removeQuery;
    }

    public void setFacetCode(String string2) {
        this.facetCode = string2;
    }

    public void setFacetName(String string2) {
        this.facetName = string2;
    }

    public void setFacetValueCode(String string2) {
        this.facetValueCode = string2;
    }

    public void setFacetValueName(String string2) {
        this.facetValueName = string2;
    }

    public void setRemoveQuery(CurrentQuery currentQuery) {
        this.removeQuery = currentQuery;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.facetCode;
        parcel.writeString((String)object);
        object = this.facetName;
        parcel.writeString((String)object);
        object = this.facetValueCode;
        parcel.writeString((String)object);
        object = this.facetValueName;
        parcel.writeString((String)object);
        object = this.removeQuery;
        parcel.writeParcelable((Parcelable)object, n3);
    }
}

