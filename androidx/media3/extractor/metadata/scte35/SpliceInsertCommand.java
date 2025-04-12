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
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$a;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand
extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    static {
        SpliceInsertCommand$a spliceInsertCommand$a = new Object();
        CREATOR = spliceInsertCommand$a;
    }

    public SpliceInsertCommand(long l2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, long l3, long l4, List list, boolean bl6, long l7, int n3, int n4, int n7) {
        List list2;
        this.a = l2;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        this.e = bl5;
        this.f = l3;
        this.g = l4;
        this.h = list2 = Collections.unmodifiableList(list);
        this.i = bl6;
        this.j = l7;
        this.k = n3;
        this.l = n4;
        this.m = n7;
    }

    public SpliceInsertCommand(Parcel parcel) {
        int n3;
        long l2;
        List list;
        long l3;
        this.a = l3 = parcel.readLong();
        int n4 = parcel.readByte();
        int n7 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            list = null;
        }
        this.b = n4;
        n4 = parcel.readByte();
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            list = null;
        }
        this.c = n4;
        n4 = parcel.readByte();
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            list = null;
        }
        this.d = n4;
        n4 = parcel.readByte();
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            list = null;
        }
        this.e = n4;
        this.f = l2 = parcel.readLong();
        this.g = l2 = parcel.readLong();
        n4 = parcel.readInt();
        ArrayList<SpliceInsertCommand$b> arrayList = new ArrayList<SpliceInsertCommand$b>(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = parcel.readInt();
            long l4 = parcel.readLong();
            long l7 = parcel.readLong();
            SpliceInsertCommand$b spliceInsertCommand$b = new SpliceInsertCommand$b(n8, l4, l7);
            arrayList.add(spliceInsertCommand$b);
        }
        this.h = list = Collections.unmodifiableList(arrayList);
        n4 = parcel.readByte();
        if (n4 != n7) {
            n7 = 0;
        }
        this.i = n7;
        this.j = l3 = parcel.readLong();
        this.k = n4 = parcel.readInt();
        this.l = n4 = parcel.readInt();
        this.m = n3 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        long l2 = this.f;
        stringBuilder.append(l2);
        stringBuilder.append(", programSplicePlaybackPositionUs= ");
        l2 = this.g;
        return jl0_0.b(stringBuilder, l2, " }");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.a;
        parcel.writeLong(l2);
        n3 = (byte)(this.b ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.c ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.d ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.e ? 1 : 0);
        parcel.writeByte((byte)n3);
        l2 = this.f;
        parcel.writeLong(l2);
        l2 = this.g;
        parcel.writeLong(l2);
        List list = this.h;
        int n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            SpliceInsertCommand$b spliceInsertCommand$b = (SpliceInsertCommand$b)list.get(i3);
            int n7 = spliceInsertCommand$b.a;
            parcel.writeInt(n7);
            long l3 = spliceInsertCommand$b.b;
            parcel.writeLong(l3);
            long l4 = spliceInsertCommand$b.c;
            parcel.writeLong(l4);
        }
        n3 = (byte)(this.i ? 1 : 0);
        parcel.writeByte((byte)n3);
        l2 = this.j;
        parcel.writeLong(l2);
        n3 = this.k;
        parcel.writeInt(n3);
        n3 = this.l;
        parcel.writeInt(n3);
        n3 = this.m;
        parcel.writeInt(n3);
    }
}

