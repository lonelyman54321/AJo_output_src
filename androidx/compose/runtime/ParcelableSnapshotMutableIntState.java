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
import androidx.compose.runtime.ParcelableSnapshotMutableIntState$a;

public final class ParcelableSnapshotMutableIntState
extends e83_0
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSnapshotMutableIntState$a parcelableSnapshotMutableIntState$a = new Object();
        CREATOR = parcelableSnapshotMutableIntState$a;
    }

    public ParcelableSnapshotMutableIntState(int n3) {
        E83$a e83$a = new E83$a(n3);
        Object object = A83.b.a();
        if (object != null) {
            object = new E83$a(n3);
            ((Rb3)object).a = n3 = 1;
            e83$a.b = object;
        }
        this.b = e83$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.o();
        parcel.writeInt(n3);
    }
}

