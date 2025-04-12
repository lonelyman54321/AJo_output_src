/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.internal.zzae;
import java.util.Calendar;

public class AlarmInstanceBuilder
extends IndexableBuilder {
    public static final String DISMISSED = "Dismissed";
    public static final String FIRED = "Fired";
    public static final String MISSED = "Missed";
    public static final String SCHEDULED = "Scheduled";
    public static final String SNOOZED = "Snoozed";
    public static final String UNKNOWN = "Unknown";

    public AlarmInstanceBuilder() {
        super("AlarmInstance");
    }

    public AlarmInstanceBuilder setAlarmStatus(String object) {
        Object object2 = FIRED;
        boolean bl2 = ((String)object2).equals(object);
        if (!(bl2 || (bl2 = ((String)(object2 = SNOOZED)).equals(object)) || (bl2 = ((String)(object2 = MISSED)).equals(object)) || (bl2 = ((String)(object2 = DISMISSED)).equals(object)) || (bl2 = ((String)(object2 = SCHEDULED)).equals(object)) || (bl2 = ((String)(object2 = UNKNOWN)).equals(object)))) {
            object = String.valueOf(object);
            int n3 = ((String)object).length();
            String string2 = "Invalid alarm status ";
            object = n3 != 0 ? string2.concat((String)object) : new String(string2);
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = new String[]{object};
        return (AlarmInstanceBuilder)this.put("alarmStatus", (String[])object);
    }

    public AlarmInstanceBuilder setScheduledTime(Calendar stringArray) {
        stringArray = zzae.zza((Calendar)stringArray);
        stringArray = new String[]{stringArray};
        return (AlarmInstanceBuilder)this.put("scheduledTime", stringArray);
    }
}

