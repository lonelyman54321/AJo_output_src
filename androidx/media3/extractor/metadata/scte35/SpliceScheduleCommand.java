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
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$a;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$b;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand
extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        SpliceScheduleCommand$a spliceScheduleCommand$a = new Object();
        CREATOR = spliceScheduleCommand$a;
    }

    public SpliceScheduleCommand(Parcel object) {
        int n3 = object.readInt();
        ArrayList<SpliceScheduleCommand$c> arrayList = new ArrayList<SpliceScheduleCommand$c>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            SpliceScheduleCommand$c spliceScheduleCommand$c = new SpliceScheduleCommand$c((Parcel)object);
            arrayList.add(spliceScheduleCommand$c);
        }
        object = Collections.unmodifiableList(arrayList);
        this.a = object;
    }

    public SpliceScheduleCommand(ArrayList list) {
        list = Collections.unmodifiableList(list);
        this.a = list;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        List list = this.a;
        int n4 = list.size();
        parcel.writeInt(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            SpliceScheduleCommand$c spliceScheduleCommand$c = (SpliceScheduleCommand$c)list.get(i3);
            long l2 = spliceScheduleCommand$c.a;
            parcel.writeLong(l2);
            int n7 = (int)(spliceScheduleCommand$c.b ? 1 : 0);
            parcel.writeByte((byte)n7);
            n7 = (byte)(spliceScheduleCommand$c.c ? 1 : 0);
            parcel.writeByte((byte)n7);
            n7 = (byte)(spliceScheduleCommand$c.d ? 1 : 0);
            parcel.writeByte((byte)n7);
            List list2 = spliceScheduleCommand$c.f;
            int n8 = list2.size();
            parcel.writeInt(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                SpliceScheduleCommand$b spliceScheduleCommand$b = (SpliceScheduleCommand$b)list2.get(i8);
                int n10 = spliceScheduleCommand$b.a;
                parcel.writeInt(n10);
                long l3 = spliceScheduleCommand$b.b;
                parcel.writeLong(l3);
            }
            l2 = spliceScheduleCommand$c.e;
            parcel.writeLong(l2);
            n7 = (byte)(spliceScheduleCommand$c.g ? 1 : 0);
            parcel.writeByte((byte)n7);
            l2 = spliceScheduleCommand$c.h;
            parcel.writeLong(l2);
            n7 = spliceScheduleCommand$c.i;
            parcel.writeInt(n7);
            n7 = spliceScheduleCommand$c.j;
            parcel.writeInt(n7);
            int n14 = spliceScheduleCommand$c.k;
            parcel.writeInt(n14);
        }
    }
}

