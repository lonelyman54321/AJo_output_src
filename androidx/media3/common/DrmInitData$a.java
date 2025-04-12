/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.DrmInitData;

public final class DrmInitData$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        DrmInitData drmInitData = new DrmInitData(parcel);
        return drmInitData;
    }

    public final Object[] newArray(int n3) {
        return new DrmInitData[n3];
    }
}

