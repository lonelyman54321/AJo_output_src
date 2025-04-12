/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.StopwatchLapBuilder;
import com.google.firebase.appindexing.internal.zzae;
import java.util.Calendar;

public final class StopwatchBuilder
extends IndexableBuilder {
    public static final String PAUSED = "Paused";
    public static final String STARTED = "Started";
    public static final String UNKNOWN = "Unknown";

    public StopwatchBuilder() {
        super("Stopwatch");
    }

    public StopwatchBuilder setElapsedTime(long l2) {
        long[] lArray = new long[]{l2};
        this.put("elapsedTime", lArray);
        return this;
    }

    public StopwatchBuilder setLaps(StopwatchLapBuilder ... stopwatchLapBuilderArray) {
        this.put("laps", stopwatchLapBuilderArray);
        return this;
    }

    public StopwatchBuilder setStartTime(Calendar stringArray) {
        stringArray = zzae.zza((Calendar)stringArray);
        stringArray = new String[]{stringArray};
        this.put("startTime", stringArray);
        return this;
    }

    public StopwatchBuilder setStopwatchStatus(String object) {
        Object object2 = STARTED;
        boolean bl2 = ((String)object2).equals(object);
        if (!(bl2 || (bl2 = ((String)(object2 = PAUSED)).equals(object)) || (bl2 = ((String)(object2 = UNKNOWN)).equals(object)))) {
            object = String.valueOf(object);
            int n3 = ((String)object).length();
            String string2 = "Invalid stopwatch status ";
            object = n3 != 0 ? string2.concat((String)object) : new String(string2);
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = new String[]{object};
        this.put("stopwatchStatus", (String[])object);
        return this;
    }
}

