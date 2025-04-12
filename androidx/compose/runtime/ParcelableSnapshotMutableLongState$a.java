/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

public final class ParcelableSnapshotMutableLongState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        long l2 = parcel.readLong();
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = new ParcelableSnapshotMutableLongState(l2);
        return parcelableSnapshotMutableLongState;
    }

    public final Object[] newArray(int n3) {
        return new ParcelableSnapshotMutableLongState[n3];
    }
}

