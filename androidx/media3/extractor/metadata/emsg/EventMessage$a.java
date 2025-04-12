/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.emsg.EventMessage;

public final class EventMessage$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        EventMessage eventMessage = new EventMessage(parcel);
        return eventMessage;
    }

    public final Object[] newArray(int n3) {
        return new EventMessage[n3];
    }
}

