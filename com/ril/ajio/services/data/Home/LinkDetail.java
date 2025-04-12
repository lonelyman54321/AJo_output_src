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
import com.ril.ajio.services.data.Home.LinkDetail$Creator;
import com.ril.ajio.services.data.Home.NavImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LinkDetail
implements NavImpl,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private boolean isURLUpdated;
    private String linkName;
    private String page;
    private String query;
    private String storeType;
    private String url;

    static {
        LinkDetail$Creator linkDetail$Creator = new LinkDetail$Creator();
        CREATOR = linkDetail$Creator;
    }

    public LinkDetail() {
        this(null, null, null, null, false, null, 63, null);
    }

    public LinkDetail(LinkDetail linkDetail) {
        Intrinsics.checkNotNullParameter(linkDetail, "originalObject");
        String string2 = linkDetail.linkName;
        String string3 = linkDetail.page;
        String string4 = linkDetail.query;
        String string5 = linkDetail.url;
        boolean bl2 = linkDetail.isURLUpdated;
        String string6 = linkDetail.storeType;
        this(string2, string3, string4, string5, bl2, string6);
    }

    public LinkDetail(String string2, String string3, String string4, String string5, boolean bl2, String string6) {
        this.linkName = string2;
        this.page = string3;
        this.query = string4;
        this.url = string5;
        this.isURLUpdated = bl2;
        this.storeType = string6;
    }

    public /* synthetic */ LinkDetail(String object, String object2, String string2, String string3, boolean bl2, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        boolean bl3;
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
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        this((String)object3, (String)object4, string6, string7, bl3, string5);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getLinkName() {
        return this.linkName;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getStoreType() {
        return this.storeType;
    }

    public String getThisName() {
        return this.linkName;
    }

    public String getThisParentName() {
        return null;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean isLeafNode() {
        return true;
    }

    public final boolean isURLUpdated() {
        return this.isURLUpdated;
    }

    public final void setLinkName(String string2) {
        this.linkName = string2;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setStoreType(String string2) {
        this.storeType = string2;
    }

    public final void setURLUpdated(boolean bl2) {
        this.isURLUpdated = bl2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        String string2 = this.linkName;
        String string3 = this.page;
        String string4 = this.query;
        String string5 = this.url;
        return ko_0.a(og_1.a("LinkDetail{, linkName='", string2, "', page='", string3, "', query='"), string4, "', url='", string5, "'}");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.linkName;
        parcel.writeString(string2);
        string2 = this.page;
        parcel.writeString(string2);
        string2 = this.query;
        parcel.writeString(string2);
        string2 = this.url;
        parcel.writeString(string2);
        n3 = (int)(this.isURLUpdated ? 1 : 0);
        parcel.writeInt(n3);
        string2 = this.storeType;
        parcel.writeString(string2);
    }
}

