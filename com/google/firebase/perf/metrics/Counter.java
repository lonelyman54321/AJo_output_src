/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.metrics.Counter$1;
import java.util.concurrent.atomic.AtomicLong;

public class Counter
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final AtomicLong count;
    private final String name;

    static {
        Counter$1 counter$1 = new Counter$1();
        CREATOR = counter$1;
    }

    private Counter(Parcel parcel) {
        Object object = parcel.readString();
        this.name = object;
        long l2 = parcel.readLong();
        this.count = object = new AtomicLong(l2);
    }

    public /* synthetic */ Counter(Parcel parcel, Counter$1 counter$1) {
        this(parcel);
    }

    public Counter(String object) {
        this.name = object;
        this.count = object = new AtomicLong(0L);
    }

    public int describeContents() {
        return 0;
    }

    public long getCount() {
        return this.count.get();
    }

    public String getName() {
        return this.name;
    }

    public void increment(long l2) {
        this.count.addAndGet(l2);
    }

    public void setCount(long l2) {
        this.count.set(l2);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.name;
        parcel.writeString(string2);
        long l2 = this.count.get();
        parcel.writeLong(l2);
    }
}

