/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 */
package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.firebase.perf.util.Timer$1;
import java.util.concurrent.TimeUnit;

public class Timer
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private long elapsedRealtimeMicros;
    private long wallClockMicros;

    static {
        Timer$1 timer$1 = new Timer$1();
        CREATOR = timer$1;
    }

    public Timer() {
        long l2 = Timer.wallClockMicros();
        long l3 = Timer.elapsedRealtimeMicros();
        this(l2, l3);
    }

    public Timer(long l2) {
        this(l2, l2);
    }

    public Timer(long l2, long l3) {
        this.wallClockMicros = l2;
        this.elapsedRealtimeMicros = l3;
    }

    private Timer(Parcel parcel) {
        long l2 = parcel.readLong();
        long l3 = parcel.readLong();
        this(l2, l3);
    }

    public /* synthetic */ Timer(Parcel parcel, Timer$1 timer$1) {
        this(parcel);
    }

    private static long elapsedRealtimeMicros() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long l2 = SystemClock.elapsedRealtimeNanos();
        return timeUnit.toMicros(l2);
    }

    public static Timer ofElapsedRealtime(long l2) {
        l2 = TimeUnit.MILLISECONDS.toMicros(l2);
        long l3 = Timer.wallClockMicros();
        long l4 = Timer.elapsedRealtimeMicros();
        l4 = l2 - l4 + l3;
        Timer timer = new Timer(l4, l2);
        return timer;
    }

    private static long wallClockMicros() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = System.currentTimeMillis();
        return timeUnit.toMicros(l2);
    }

    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        long l2 = this.wallClockMicros;
        return this.getDurationMicros() + l2;
    }

    public long getDurationMicros() {
        Timer timer = new Timer();
        return this.getDurationMicros(timer);
    }

    public long getDurationMicros(Timer timer) {
        long l2 = timer.elapsedRealtimeMicros;
        long l3 = this.elapsedRealtimeMicros;
        return l2 - l3;
    }

    public long getMicros() {
        return this.wallClockMicros;
    }

    public void reset() {
        long l2;
        this.wallClockMicros = l2 = Timer.wallClockMicros();
        this.elapsedRealtimeMicros = l2 = Timer.elapsedRealtimeMicros();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.wallClockMicros;
        parcel.writeLong(l2);
        l2 = this.elapsedRealtimeMicros;
        parcel.writeLong(l2);
    }
}

