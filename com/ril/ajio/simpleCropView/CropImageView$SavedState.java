/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
package com.ril.ajio.simpleCropView;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ril.ajio.simpleCropView.CropImageView$SavedState$a;
import com.ril.ajio.simpleCropView.CropImageView$c;
import com.ril.ajio.simpleCropView.CropImageView$d;
import java.io.Serializable;

public class CropImageView$SavedState
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public int A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public CropImageView$c a;
    public int b;
    public int c;
    public int d;
    public CropImageView$d e;
    public CropImageView$d f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public int v;
    public int w;
    public Uri x;
    public Uri y;
    public Bitmap.CompressFormat z;

    static {
        CropImageView$SavedState$a cropImageView$SavedState$a = new Object();
        CREATOR = cropImageView$SavedState$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        Enum enum_ = this.a;
        parcel.writeSerializable((Serializable)((Object)enum_));
        int n4 = this.b;
        parcel.writeInt(n4);
        n4 = this.c;
        parcel.writeInt(n4);
        n4 = this.d;
        parcel.writeInt(n4);
        enum_ = this.e;
        parcel.writeSerializable((Serializable)((Object)enum_));
        enum_ = this.f;
        parcel.writeSerializable((Serializable)((Object)enum_));
        n4 = (int)(this.g ? 1 : 0);
        parcel.writeInt(n4);
        n4 = (int)(this.h ? 1 : 0);
        parcel.writeInt(n4);
        n4 = this.i;
        parcel.writeInt(n4);
        n4 = this.j;
        parcel.writeInt(n4);
        float f5 = this.k;
        parcel.writeFloat(f5);
        f5 = this.l;
        parcel.writeFloat(f5);
        f5 = this.m;
        parcel.writeFloat(f5);
        f5 = this.n;
        parcel.writeFloat(f5);
        f5 = this.o;
        parcel.writeFloat(f5);
        n4 = (int)(this.p ? 1 : 0);
        parcel.writeInt(n4);
        n4 = this.q;
        parcel.writeInt(n4);
        n4 = this.r;
        parcel.writeInt(n4);
        f5 = this.s;
        parcel.writeFloat(f5);
        f5 = this.t;
        parcel.writeFloat(f5);
        n4 = (int)(this.u ? 1 : 0);
        parcel.writeInt(n4);
        n4 = this.v;
        parcel.writeInt(n4);
        n4 = this.w;
        parcel.writeInt(n4);
        enum_ = this.x;
        parcel.writeParcelable((Parcelable)enum_, n3);
        enum_ = this.y;
        parcel.writeParcelable((Parcelable)enum_, n3);
        Bitmap.CompressFormat compressFormat = this.z;
        parcel.writeSerializable((Serializable)compressFormat);
        n3 = this.A;
        parcel.writeInt(n3);
        n3 = (int)(this.B ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.C;
        parcel.writeInt(n3);
        n3 = this.D;
        parcel.writeInt(n3);
        n3 = this.E;
        parcel.writeInt(n3);
        n3 = this.F;
        parcel.writeInt(n3);
        n3 = (int)(this.G ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.H;
        parcel.writeInt(n3);
        n3 = this.I;
        parcel.writeInt(n3);
        n3 = this.J;
        parcel.writeInt(n3);
        n3 = this.K;
        parcel.writeInt(n3);
    }
}

