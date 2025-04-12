/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.exoplayer.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.scheduler.Requirements;

public final class Requirements$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        Requirements requirements = new Requirements(n3);
        return requirements;
    }

    public final Object[] newArray(int n3) {
        return new Requirements[n3];
    }
}

