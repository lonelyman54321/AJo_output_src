/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand$c {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public SpliceScheduleCommand$c(long l2, boolean bl2, boolean bl3, boolean bl4, ArrayList arrayList, long l3, boolean bl5, long l4, int n3, int n4, int n7) {
        List list;
        this.a = l2;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        this.f = list = Collections.unmodifiableList(arrayList);
        this.e = l3;
        this.g = bl5;
        this.h = l4;
        this.i = n3;
        this.j = n4;
        this.k = n7;
    }

    public SpliceScheduleCommand$c(Parcel parcel) {
        int n3;
        long l2;
        List list;
        long l3;
        this.a = l3 = parcel.readLong();
        int n4 = parcel.readByte();
        boolean bl2 = false;
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
        n4 = parcel.readInt();
        ArrayList<SpliceScheduleCommand$b> arrayList = new ArrayList<SpliceScheduleCommand$b>(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = parcel.readInt();
            long l4 = parcel.readLong();
            SpliceScheduleCommand$b spliceScheduleCommand$b = new SpliceScheduleCommand$b(n8, l4);
            arrayList.add(spliceScheduleCommand$b);
        }
        this.f = list = Collections.unmodifiableList(arrayList);
        this.e = l2 = parcel.readLong();
        n4 = parcel.readByte();
        if (n4 == n7) {
            bl2 = true;
        }
        this.g = bl2;
        this.h = l3 = parcel.readLong();
        this.i = n4 = parcel.readInt();
        this.j = n4 = parcel.readInt();
        this.k = n3 = parcel.readInt();
    }
}

