/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.internal.zzae;
import java.util.Calendar;

public final class TimerBuilder
extends IndexableBuilder {
    public static final String EXPIRED = "Expired";
    public static final String MISSED = "Missed";
    public static final String PAUSED = "Paused";
    public static final String RESET = "Reset";
    public static final String STARTED = "Started";
    public static final String UNKNOWN = "Unknown";

    public TimerBuilder() {
        super("Timer");
    }

    public TimerBuilder setExpireTime(Calendar stringArray) {
        stringArray = zzae.zza((Calendar)stringArray);
        stringArray = new String[]{stringArray};
        this.put("expireTime", stringArray);
        return this;
    }

    public TimerBuilder setIdentifier(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("identifier", stringArray);
        return this;
    }

    public TimerBuilder setLength(long l2) {
        long[] lArray = new long[]{l2};
        this.put("length", lArray);
        return this;
    }

    public TimerBuilder setMessage(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("message", stringArray);
        return this;
    }

    public TimerBuilder setRemainingTime(long l2) {
        long[] lArray = new long[]{l2};
        this.put("remainingTime", lArray);
        return this;
    }

    public TimerBuilder setRingtone(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("ringtone", stringArray);
        return this;
    }

    public TimerBuilder setTimerStatus(String object) {
        Object object2 = STARTED;
        boolean bl2 = ((String)object2).equals(object);
        if (!(bl2 || (bl2 = ((String)(object2 = PAUSED)).equals(object)) || (bl2 = ((String)(object2 = EXPIRED)).equals(object)) || (bl2 = ((String)(object2 = MISSED)).equals(object)) || (bl2 = ((String)(object2 = RESET)).equals(object)) || (bl2 = ((String)(object2 = UNKNOWN)).equals(object)))) {
            object = String.valueOf(object);
            int n3 = ((String)object).length();
            String string2 = "Invalid timer status ";
            object = n3 != 0 ? string2.concat((String)object) : new String(string2);
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = new String[]{object};
        this.put("timerStatus", (String[])object);
        return this;
    }

    public TimerBuilder setVibrate(boolean bl2) {
        boolean[] blArray = new boolean[]{bl2};
        this.put("vibrate", blArray);
        return this;
    }
}

