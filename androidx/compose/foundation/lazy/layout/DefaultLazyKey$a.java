/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;

public final class DefaultLazyKey$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        DefaultLazyKey defaultLazyKey = new DefaultLazyKey(n3);
        return defaultLazyKey;
    }

    public final Object[] newArray(int n3) {
        return new DefaultLazyKey[n3];
    }
}

