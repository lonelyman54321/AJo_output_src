/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectTextures;
import kotlin.jvm.internal.Intrinsics;

public final class CameraEffectTextures$b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        CameraEffectTextures cameraEffectTextures = new CameraEffectTextures(parcel);
        return cameraEffectTextures;
    }

    public final Object[] newArray(int n3) {
        return new CameraEffectTextures[n3];
    }
}

