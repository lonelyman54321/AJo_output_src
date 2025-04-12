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
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.container.Mp4TimestampData$a;
import com.google.common.primitives.Longs;

public final class Mp4TimestampData
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final long c;

    static {
        Mp4TimestampData$a mp4TimestampData$a = new Object();
        CREATOR = mp4TimestampData$a;
    }

    public Mp4TimestampData(long l2, long l3, long l4) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
    }

    public Mp4TimestampData(Parcel parcel) {
        long l2;
        this.a = l2 = parcel.readLong();
        this.b = l2 = parcel.readLong();
        this.c = l2 = parcel.readLong();
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof Mp4TimestampData;
        if (!object2) {
            return false;
        }
        object = (Mp4TimestampData)object;
        long l7 = this.a;
        long l8 = ((Mp4TimestampData)object).a;
        long l12 = l7 - l8;
        object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 || (object2 = (l4 = (l8 = this.b) - (l7 = ((Mp4TimestampData)object).b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) || (l3 = (l2 = (l8 = this.c) - (l7 = ((Mp4TimestampData)object).c)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = (Longs.hashCode(this.a) + 527) * 31;
        int n4 = (Longs.hashCode(this.b) + n3) * 31;
        return Longs.hashCode(this.c) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Mp4Timestamp: creation time=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", modification time=");
        l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", timescale=");
        l2 = this.c;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        l2 = this.b;
        parcel.writeLong(l2);
        l2 = this.c;
        parcel.writeLong(l2);
    }
}

