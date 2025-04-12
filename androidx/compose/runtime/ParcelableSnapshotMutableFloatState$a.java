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
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

public final class ParcelableSnapshotMutableFloatState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        float f5 = parcel.readFloat();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState(f5);
        return parcelableSnapshotMutableFloatState;
    }

    public final Object[] newArray(int n3) {
        return new ParcelableSnapshotMutableFloatState[n3];
    }
}

