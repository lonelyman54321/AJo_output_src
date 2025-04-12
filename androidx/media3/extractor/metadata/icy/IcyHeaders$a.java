/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

public final class IcyHeaders$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        IcyHeaders icyHeaders = new IcyHeaders(parcel);
        return icyHeaders;
    }

    public final Object[] newArray(int n3) {
        return new IcyHeaders[n3];
    }
}

