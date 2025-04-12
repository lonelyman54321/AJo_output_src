/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.AutoValue_HeartBeatResult;
import java.util.List;

public abstract class HeartBeatResult {
    public static HeartBeatResult create(String string2, List list) {
        AutoValue_HeartBeatResult autoValue_HeartBeatResult = new AutoValue_HeartBeatResult(string2, list);
        return autoValue_HeartBeatResult;
    }

    public abstract List getUsedDates();

    public abstract String getUserAgent();
}

