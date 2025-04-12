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
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable$a;

public final class AppInfoTable
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        AppInfoTable$a appInfoTable$a = new Object();
        CREATOR = appInfoTable$a;
    }

    public AppInfoTable(int n3, String string2) {
        this.a = n3;
        this.b = string2;
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ait(controlCode=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(",url=");
        String string2 = this.b;
        return h30_0.a(stringBuilder, string2, ")");
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.b;
        parcel.writeString(string2);
        n3 = this.a;
        parcel.writeInt(n3);
    }
}

