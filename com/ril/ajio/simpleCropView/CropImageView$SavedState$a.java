/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.ril.ajio.simpleCropView;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ril.ajio.simpleCropView.CropImageView$SavedState;
import com.ril.ajio.simpleCropView.CropImageView$c;
import com.ril.ajio.simpleCropView.CropImageView$d;

public final class CropImageView$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        float f5;
        int n4;
        CropImageView$SavedState cropImageView$SavedState = new View.BaseSavedState(parcel);
        Object object = (CropImageView$c)((Object)parcel.readSerializable());
        cropImageView$SavedState.a = object;
        cropImageView$SavedState.b = n4 = parcel.readInt();
        cropImageView$SavedState.c = n4 = parcel.readInt();
        cropImageView$SavedState.d = n4 = parcel.readInt();
        object = (CropImageView$d)((Object)parcel.readSerializable());
        cropImageView$SavedState.e = object;
        object = (CropImageView$d)((Object)parcel.readSerializable());
        cropImageView$SavedState.f = object;
        n4 = parcel.readInt();
        boolean bl2 = false;
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        cropImageView$SavedState.g = n4;
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        cropImageView$SavedState.h = n4;
        cropImageView$SavedState.i = n4 = parcel.readInt();
        cropImageView$SavedState.j = n4 = parcel.readInt();
        cropImageView$SavedState.k = f5 = parcel.readFloat();
        cropImageView$SavedState.l = f5 = parcel.readFloat();
        cropImageView$SavedState.m = f5 = parcel.readFloat();
        cropImageView$SavedState.n = f5 = parcel.readFloat();
        cropImageView$SavedState.o = f5 = parcel.readFloat();
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        cropImageView$SavedState.p = n4;
        cropImageView$SavedState.q = n4 = parcel.readInt();
        cropImageView$SavedState.r = n4 = parcel.readInt();
        cropImageView$SavedState.s = f5 = parcel.readFloat();
        cropImageView$SavedState.t = f5 = parcel.readFloat();
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        cropImageView$SavedState.u = n4;
        cropImageView$SavedState.v = n4 = parcel.readInt();
        cropImageView$SavedState.w = n4 = parcel.readInt();
        object = Uri.class;
        ClassLoader classLoader = ((Class)object).getClassLoader();
        classLoader = (Uri)parcel.readParcelable(classLoader);
        cropImageView$SavedState.x = classLoader;
        object = ((Class)object).getClassLoader();
        object = (Uri)parcel.readParcelable((ClassLoader)object);
        cropImageView$SavedState.y = object;
        object = (Bitmap.CompressFormat)parcel.readSerializable();
        cropImageView$SavedState.z = object;
        cropImageView$SavedState.A = n4 = parcel.readInt();
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
        }
        cropImageView$SavedState.B = n4;
        cropImageView$SavedState.C = n4 = parcel.readInt();
        cropImageView$SavedState.D = n4 = parcel.readInt();
        cropImageView$SavedState.E = n4 = parcel.readInt();
        cropImageView$SavedState.F = n4 = parcel.readInt();
        n4 = parcel.readInt();
        if (n4 != 0) {
            bl2 = true;
        }
        cropImageView$SavedState.G = bl2;
        cropImageView$SavedState.H = n4 = parcel.readInt();
        cropImageView$SavedState.I = n4 = parcel.readInt();
        cropImageView$SavedState.J = n4 = parcel.readInt();
        cropImageView$SavedState.K = n3 = parcel.readInt();
        return cropImageView$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new CropImageView$SavedState[n3];
    }
}

