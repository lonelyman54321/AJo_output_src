/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

public final class SmtaMetadataEntry$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        SmtaMetadataEntry smtaMetadataEntry = new SmtaMetadataEntry(parcel);
        return smtaMetadataEntry;
    }

    public final Object[] newArray(int n3) {
        return new SmtaMetadataEntry[n3];
    }
}

