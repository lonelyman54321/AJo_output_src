/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.AlarmInstanceBuilder;
import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class AlarmBuilder
extends IndexableBuilder {
    public static final String FRIDAY = "Friday";
    public static final String MONDAY = "Monday";
    public static final String SATURDAY = "Saturday";
    public static final String SUNDAY = "Sunday";
    public static final String THURSDAY = "Thursday";
    public static final String TUESDAY = "Tuesday";
    public static final String WEDNESDAY = "Wednesday";

    public AlarmBuilder() {
        super("Alarm");
    }

    public AlarmBuilder setAlarmInstances(AlarmInstanceBuilder ... alarmInstanceBuilderArray) {
        this.put("alarmInstances", alarmInstanceBuilderArray);
        return this;
    }

    public AlarmBuilder setDayOfWeek(String ... object) {
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = SUNDAY;
            String string3 = object[i3];
            boolean bl2 = string2.equals(string3);
            if (bl2 || (bl2 = (string2 = MONDAY).equals(string3)) || (bl2 = (string2 = TUESDAY).equals(string3)) || (bl2 = (string2 = WEDNESDAY).equals(string3)) || (bl2 = (string2 = THURSDAY).equals(string3)) || (bl2 = (string2 = FRIDAY).equals(string3)) || (bl2 = (string2 = SATURDAY).equals(string3))) continue;
            String string4 = String.valueOf(string3);
            i3 = string4.length();
            string3 = "Invalid weekday ";
            string4 = i3 != 0 ? string3.concat(string4) : new String(string3);
            object = new IllegalArgumentException(string4);
            throw object;
        }
        this.put("dayOfWeek", (String)object);
        return this;
    }

    public AlarmBuilder setEnabled(boolean bl2) {
        boolean[] blArray = new boolean[]{bl2};
        this.put("enabled", blArray);
        return this;
    }

    public AlarmBuilder setHour(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = 23)) {
            long l2 = n3;
            long[] lArray = new long[]{l2};
            this.put("hour", lArray);
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid alarm hour");
        throw illegalArgumentException;
    }

    public AlarmBuilder setIdentifier(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("identifier", stringArray);
        return this;
    }

    public AlarmBuilder setMessage(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("message", stringArray);
        return this;
    }

    public AlarmBuilder setMinute(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = 59)) {
            long l2 = n3;
            long[] lArray = new long[]{l2};
            this.put("minute", lArray);
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid alarm minute");
        throw illegalArgumentException;
    }

    public AlarmBuilder setRingtone(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("ringtone", stringArray);
        return this;
    }

    public AlarmBuilder setVibrate(boolean bl2) {
        boolean[] blArray = new boolean[]{bl2};
        this.put("vibrate", blArray);
        return this;
    }
}

