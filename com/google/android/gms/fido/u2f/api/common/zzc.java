/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;

final class zzc
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ErrorCode.toErrorCode(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new ErrorCode[n3];
    }
}

