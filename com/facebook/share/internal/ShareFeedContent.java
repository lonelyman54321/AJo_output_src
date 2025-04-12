/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.ShareFeedContent$a;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

public final class ShareFeedContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    static {
        ShareFeedContent$a shareFeedContent$a = new Object();
        CREATOR = shareFeedContent$a;
    }

    public ShareFeedContent(Parcel object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        super((Parcel)object);
        this.g = string2 = object.readString();
        this.h = string2 = object.readString();
        this.i = string2 = object.readString();
        this.j = string2 = object.readString();
        this.k = string2 = object.readString();
        this.l = string2 = object.readString();
        object = object.readString();
        this.m = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        String string2 = this.g;
        parcel.writeString(string2);
        string2 = this.h;
        parcel.writeString(string2);
        string2 = this.i;
        parcel.writeString(string2);
        string2 = this.j;
        parcel.writeString(string2);
        string2 = this.k;
        parcel.writeString(string2);
        string2 = this.l;
        parcel.writeString(string2);
        string2 = this.m;
        parcel.writeString(string2);
    }
}

