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
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

public final class ParcelableSnapshotMutableIntState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(n3);
        return parcelableSnapshotMutableIntState;
    }

    public final Object[] newArray(int n3) {
        return new ParcelableSnapshotMutableIntState[n3];
    }
}

