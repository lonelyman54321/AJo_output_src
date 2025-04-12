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
import androidx.media3.extractor.metadata.scte35.SpliceCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand$a;

public final class TimeSignalCommand
extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;

    static {
        TimeSignalCommand$a timeSignalCommand$a = new Object();
        CREATOR = timeSignalCommand$a;
    }

    public TimeSignalCommand(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public static long a(long l2, Xm2 xm2) {
        long l3;
        int n3 = xm2.w();
        long l4 = n3;
        long l7 = 0x80L & l4;
        long l8 = l7 - (l3 = 0L);
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object != false) {
            l4 &= 1L;
            int n4 = 32;
            l4 <<= n4;
            l7 = xm2.y();
            l4 = (l4 | l7) + l2;
            l2 = 0x1FFFFFFFFL & l4;
        } else {
            l2 = -9223372036854775807L;
        }
        return l2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", playbackPositionUs= ");
        l2 = this.b;
        return jl0_0.b(stringBuilder, l2, " }");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        l2 = this.b;
        parcel.writeLong(l2);
    }
}

