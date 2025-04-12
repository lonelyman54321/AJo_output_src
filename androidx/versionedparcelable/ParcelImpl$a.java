/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

public final class ParcelImpl$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        ParcelImpl parcelImpl = new ParcelImpl(parcel);
        return parcelImpl;
    }

    public final Object[] newArray(int n3) {
        return new ParcelImpl[n3];
    }
}

