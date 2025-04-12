/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectTextures$a;
import com.facebook.share.model.CameraEffectTextures$b;
import kotlin.jvm.internal.Intrinsics;

public final class CameraEffectTextures
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        CameraEffectTextures$b cameraEffectTextures$b = new Object();
        CREATOR = cameraEffectTextures$b;
    }

    public CameraEffectTextures(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ClassLoader classLoader = CameraEffectTextures.class.getClassLoader();
        parcel = parcel.readBundle(classLoader);
        this.a = parcel;
    }

    public CameraEffectTextures(CameraEffectTextures$a cameraEffectTextures$a) {
        cameraEffectTextures$a = cameraEffectTextures$a.a;
        this.a = cameraEffectTextures$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Bundle bundle = this.a;
        parcel.writeBundle(bundle);
    }
}

