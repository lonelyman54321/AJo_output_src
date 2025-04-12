/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.BackStackRecordState;

public final class BackStackRecordState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        BackStackRecordState backStackRecordState = new BackStackRecordState(parcel);
        return backStackRecordState;
    }

    public final Object[] newArray(int n3) {
        return new BackStackRecordState[n3];
    }
}

