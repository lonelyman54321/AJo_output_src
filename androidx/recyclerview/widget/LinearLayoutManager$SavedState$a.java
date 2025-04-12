/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager$SavedState;

public final class LinearLayoutManager$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new Object();
        linearLayoutManager$SavedState.a = n3 = parcel.readInt();
        linearLayoutManager$SavedState.b = n3 = parcel.readInt();
        int n4 = parcel.readInt();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        linearLayoutManager$SavedState.c = n3;
        return linearLayoutManager$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new LinearLayoutManager$SavedState[n3];
    }
}

