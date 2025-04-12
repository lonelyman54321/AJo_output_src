/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.MdtaMetadataEntry;

public final class MdtaMetadataEntry$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        MdtaMetadataEntry mdtaMetadataEntry = new MdtaMetadataEntry(parcel);
        return mdtaMetadataEntry;
    }

    public final Object[] newArray(int n3) {
        return new MdtaMetadataEntry[n3];
    }
}

