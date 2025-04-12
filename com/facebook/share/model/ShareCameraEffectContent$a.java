/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectArguments$a;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.CameraEffectTextures$a;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

public final class ShareCameraEffectContent$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ShareCameraEffectContent shareCameraEffectContent = new ShareContent((Parcel)object);
        Object object3 = object.readString();
        shareCameraEffectContent.g = object3;
        object3 = new CameraEffectArguments$a();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object4 = CameraEffectArguments.class.getClassLoader();
        object4 = (CameraEffectArguments)object.readParcelable((ClassLoader)object4);
        if (object4 != null) {
            Bundle bundle = ((CameraEffectArguments$a)object3).a;
            object4 = ((CameraEffectArguments)object4).a;
            bundle.putAll((Bundle)object4);
        }
        shareCameraEffectContent.h = object4 = new CameraEffectArguments((CameraEffectArguments$a)object3);
        object3 = new CameraEffectTextures$a();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = CameraEffectTextures.class.getClassLoader();
        object = (CameraEffectTextures)object.readParcelable((ClassLoader)object2);
        if (object != null) {
            object2 = ((CameraEffectTextures$a)object3).a;
            object = object.a;
            object2.putAll((Bundle)object);
        }
        object = new CameraEffectTextures((CameraEffectTextures$a)object3);
        shareCameraEffectContent.i = object;
        return shareCameraEffectContent;
    }

    public final Object[] newArray(int n3) {
        return new ShareCameraEffectContent[n3];
    }
}

