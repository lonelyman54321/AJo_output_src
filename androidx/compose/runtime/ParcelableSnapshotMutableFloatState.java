/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState$a;

public final class ParcelableSnapshotMutableFloatState
extends D83
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSnapshotMutableFloatState$a parcelableSnapshotMutableFloatState$a = new Object();
        CREATOR = parcelableSnapshotMutableFloatState$a;
    }

    public ParcelableSnapshotMutableFloatState(float f5) {
        D83$a d83$a = new D83$a(f5);
        Object object = A83.b.a();
        if (object != null) {
            object = new D83$a(f5);
            int n3 = 1;
            f5 = Float.MIN_VALUE;
            ((Rb3)object).a = n3;
            d83$a.b = object;
        }
        this.b = d83$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        float f5 = this.c();
        parcel.writeFloat(f5);
    }
}

