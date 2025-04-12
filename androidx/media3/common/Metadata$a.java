/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class Metadata$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Metadata metadata = new Metadata(parcel);
        return metadata;
    }

    public final Object[] newArray(int n3) {
        return new Metadata[n3];
    }
}

