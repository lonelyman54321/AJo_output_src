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
import androidx.compose.runtime.ParcelableSnapshotMutableLongState$a;

public final class ParcelableSnapshotMutableLongState
extends F83
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSnapshotMutableLongState$a parcelableSnapshotMutableLongState$a = new Object();
        CREATOR = parcelableSnapshotMutableLongState$a;
    }

    public ParcelableSnapshotMutableLongState(long l2) {
        F83$a f83$a = new F83$a(l2);
        Object object = A83.b.a();
        if (object != null) {
            int n3;
            object = new F83$a(l2);
            ((Rb3)object).a = n3 = 1;
            f83$a.b = object;
        }
        this.b = f83$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.x();
        parcel.writeLong(l2);
    }
}

