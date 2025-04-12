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
import com.facebook.share.model.CameraEffectArguments$a;
import com.facebook.share.model.CameraEffectArguments$b;
import kotlin.jvm.internal.Intrinsics;

public final class CameraEffectArguments
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        CameraEffectArguments$b cameraEffectArguments$b = new Object();
        CREATOR = cameraEffectArguments$b;
    }

    public CameraEffectArguments(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ClassLoader classLoader = CameraEffectArguments.class.getClassLoader();
        parcel = parcel.readBundle(classLoader);
        this.a = parcel;
    }

    public CameraEffectArguments(CameraEffectArguments$a cameraEffectArguments$a) {
        cameraEffectArguments$a = cameraEffectArguments$a.a;
        this.a = cameraEffectArguments$a;
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

