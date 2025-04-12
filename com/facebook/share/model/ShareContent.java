/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent$a;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareHashtag$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public abstract class ShareContent
implements Parcelable {
    public final Uri a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final ShareHashtag f;

    public ShareContent(Parcel object) {
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = Uri.class.getClassLoader();
        object3 = (Uri)object.readParcelable((ClassLoader)object3);
        this.a = object3;
        object3 = new ArrayList();
        object.readStringList(object3);
        boolean bl2 = ((ArrayList)object3).isEmpty();
        object3 = bl2 ? null : Collections.unmodifiableList(object3);
        this.b = object3;
        this.c = object3 = object.readString();
        this.d = object3 = object.readString();
        this.e = object3 = object.readString();
        object3 = new Object();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ShareHashtag.class.getClassLoader();
        object = (ShareHashtag)object.readParcelable((ClassLoader)object2);
        if (object != null) {
            object = object.a;
            ((ShareHashtag$a)object3).a = object;
        }
        super((ShareHashtag$a)object3);
        this.f = object;
    }

    public ShareContent(ShareContent$a object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "builder");
        this.a = object2 = ((ShareContent$a)object).a;
        object2 = ((ShareContent$a)object).b;
        this.b = object2;
        object2 = ((ShareContent$a)object).c;
        this.c = object2;
        object2 = ((ShareContent$a)object).d;
        this.d = object2;
        object2 = ((ShareContent$a)object).e;
        this.e = object2;
        this.f = object = ((ShareContent$a)object).f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Object object = this.a;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.b;
        parcel.writeStringList((List)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeParcelable((Parcelable)object, 0);
    }
}

