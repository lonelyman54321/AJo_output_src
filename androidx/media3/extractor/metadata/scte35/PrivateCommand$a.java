/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;

public final class PrivateCommand$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        PrivateCommand privateCommand = new PrivateCommand(parcel);
        return privateCommand;
    }

    public final Object[] newArray(int n3) {
        return new PrivateCommand[n3];
    }
}

