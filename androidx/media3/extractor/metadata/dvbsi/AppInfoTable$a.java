/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;

public final class AppInfoTable$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        String string2 = parcel.readString();
        string2.getClass();
        int n3 = parcel.readInt();
        AppInfoTable appInfoTable = new AppInfoTable(n3, string2);
        return appInfoTable;
    }

    public final Object[] newArray(int n3) {
        return new AppInfoTable[n3];
    }
}

