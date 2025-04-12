/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.BrandSubCategory$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrandSubCategory
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String activeImageUrl;
    private String id;
    private String name;
    private String page;
    private String picture;
    private String query;
    private String urlLink;

    static {
        BrandSubCategory$Creator brandSubCategory$Creator = new BrandSubCategory$Creator();
        CREATOR = brandSubCategory$Creator;
    }

    public BrandSubCategory() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public BrandSubCategory(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.page = string2;
        this.name = string3;
        this.picture = string4;
        this.query = string5;
        this.urlLink = string6;
        this.id = string7;
        this.activeImageUrl = string8;
    }

    public /* synthetic */ BrandSubCategory(String object, String object2, String string2, String string3, String string4, String string5, String string6, int n3, DefaultConstructorMarker object3) {
        String string7;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string8 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string9 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string10 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        String string11 = n7 != 0 ? null : string5;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        this((String)object3, (String)object4, string8, string9, string10, string11, string7);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getActiveImageUrl() {
        return this.activeImageUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getUrlLink() {
        return this.urlLink;
    }

    public final void setActiveImageUrl(String string2) {
        this.activeImageUrl = string2;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setPicture(String string2) {
        this.picture = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setUrlLink(String string2) {
        this.urlLink = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.page;
        parcel.writeString(string2);
        string2 = this.name;
        parcel.writeString(string2);
        string2 = this.picture;
        parcel.writeString(string2);
        string2 = this.query;
        parcel.writeString(string2);
        string2 = this.urlLink;
        parcel.writeString(string2);
        string2 = this.id;
        parcel.writeString(string2);
        string2 = this.activeImageUrl;
        parcel.writeString(string2);
    }
}

