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
import androidx.media3.extractor.metadata.scte35.PrivateCommand$a;
import androidx.media3.extractor.metadata.scte35.SpliceCommand;

public final class PrivateCommand
extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final byte[] c;

    static {
        PrivateCommand$a privateCommand$a = new Object();
        CREATOR = privateCommand$a;
    }

    public PrivateCommand(long l2, byte[] byArray, long l3) {
        this.a = l3;
        this.b = l2;
        this.c = byArray;
    }

    public PrivateCommand(Parcel object) {
        long l2;
        this.a = l2 = object.readLong();
        this.b = l2 = object.readLong();
        object = object.createByteArray();
        this.c = (byte[])object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", identifier= ");
        l2 = this.b;
        return jl0_0.b(stringBuilder, l2, " }");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        l2 = this.b;
        parcel.writeLong(l2);
        byte[] byArray = this.c;
        parcel.writeByteArray(byArray);
    }
}

