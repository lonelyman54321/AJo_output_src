/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.exoplayer.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.offline.DownloadRequest;

public final class DownloadRequest$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        DownloadRequest downloadRequest = new DownloadRequest(parcel);
        return downloadRequest;
    }

    public final Object[] newArray(int n3) {
        return new DownloadRequest[n3];
    }
}

