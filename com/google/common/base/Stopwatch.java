/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch$1;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;

public final class Stopwatch {
    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    public Stopwatch() {
        Ticker ticker;
        this.ticker = ticker = Ticker.systemTicker();
    }

    public Stopwatch(Ticker ticker) {
        this.ticker = ticker = (Ticker)Preconditions.checkNotNull(ticker, "ticker");
    }

    private static String abbreviate(TimeUnit object) {
        int[] nArray = Stopwatch$1.$SwitchMap$java$util$concurrent$TimeUnit;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new AssertionError();
                throw object;
            }
            case 7: {
                return "d";
            }
            case 6: {
                return "h";
            }
            case 5: {
                return "min";
            }
            case 4: {
                return "s";
            }
            case 3: {
                return "ms";
            }
            case 2: {
                return "\u03bcs";
            }
            case 1: 
        }
        return "ns";
    }

    private static TimeUnit chooseUnit(long l2) {
        long l3;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long l4 = timeUnit.convert(l2, timeUnit2);
        long l7 = l4 - (l3 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            return timeUnit;
        }
        timeUnit = TimeUnit.HOURS;
        l4 = timeUnit.convert(l2, timeUnit2);
        long l8 = l4 - l3;
        object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object > 0) {
            return timeUnit;
        }
        timeUnit = TimeUnit.MINUTES;
        l4 = timeUnit.convert(l2, timeUnit2);
        long l12 = l4 - l3;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object > 0) {
            return timeUnit;
        }
        timeUnit = TimeUnit.SECONDS;
        l4 = timeUnit.convert(l2, timeUnit2);
        long l14 = l4 - l3;
        object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object > 0) {
            return timeUnit;
        }
        timeUnit = TimeUnit.MILLISECONDS;
        l4 = timeUnit.convert(l2, timeUnit2);
        long l15 = l4 - l3;
        object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object > 0) {
            return timeUnit;
        }
        timeUnit = TimeUnit.MICROSECONDS;
        long l16 = (l2 = timeUnit.convert(l2, timeUnit2)) - l3;
        Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object2 > 0) {
            return timeUnit;
        }
        return timeUnit2;
    }

    public static Stopwatch createStarted() {
        Stopwatch stopwatch = new Stopwatch();
        return stopwatch.start();
    }

    public static Stopwatch createStarted(Ticker ticker) {
        Stopwatch stopwatch = new Stopwatch(ticker);
        return stopwatch.start();
    }

    public static Stopwatch createUnstarted() {
        Stopwatch stopwatch = new Stopwatch();
        return stopwatch;
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
        Stopwatch stopwatch = new Stopwatch(ticker);
        return stopwatch;
    }

    private long elapsedNanos() {
        long l2;
        boolean bl2 = this.isRunning;
        if (bl2) {
            Ticker ticker = this.ticker;
            l2 = ticker.read();
            long l3 = this.startTick;
            l2 -= l3;
            l3 = this.elapsedNanos;
            l2 += l3;
        } else {
            l2 = this.elapsedNanos;
        }
        return l2;
    }

    public long elapsed(TimeUnit timeUnit) {
        long l2 = this.elapsedNanos();
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        return timeUnit.convert(l2, timeUnit2);
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public Stopwatch reset() {
        this.elapsedNanos = 0L;
        this.isRunning = false;
        return this;
    }

    public Stopwatch start() {
        long l2;
        boolean bl2 = this.isRunning;
        boolean bl3 = true;
        Preconditions.checkState(bl2 ^ bl3, "This stopwatch is already running.");
        this.isRunning = bl3;
        this.startTick = l2 = this.ticker.read();
        return this;
    }

    public Stopwatch stop() {
        long l2 = this.ticker.read();
        Preconditions.checkState(this.isRunning, "This stopwatch is already stopped.");
        this.isRunning = false;
        long l3 = this.elapsedNanos;
        long l4 = this.startTick;
        this.elapsedNanos = l2 = l2 - l4 + l3;
        return this;
    }

    public String toString() {
        long l2 = this.elapsedNanos();
        TimeUnit timeUnit = Stopwatch.chooseUnit(l2);
        double d2 = l2;
        double d5 = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Platform.formatCompact4Digits(d2 /= d5);
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        string2 = Stopwatch.abbreviate(timeUnit);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

