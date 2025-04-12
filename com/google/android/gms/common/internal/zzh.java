/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;

final class zzh
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        BinderWrapper binderWrapper = new BinderWrapper(parcel, null);
        return binderWrapper;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new BinderWrapper[n3];
    }
}

