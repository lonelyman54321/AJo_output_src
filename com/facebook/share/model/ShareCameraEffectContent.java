/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent$a;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

public final class ShareCameraEffectContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public String g;
    public CameraEffectArguments h;
    public CameraEffectTextures i;

    static {
        ShareCameraEffectContent$a shareCameraEffectContent$a = new Object();
        CREATOR = shareCameraEffectContent$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Object object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.i;
        parcel.writeParcelable((Parcelable)object, 0);
    }
}

