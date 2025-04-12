/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.AutoValue_SdkHeartBeatResult;

public abstract class SdkHeartBeatResult
implements Comparable {
    public static SdkHeartBeatResult create(String string2, long l2) {
        AutoValue_SdkHeartBeatResult autoValue_SdkHeartBeatResult = new AutoValue_SdkHeartBeatResult(string2, l2);
        return autoValue_SdkHeartBeatResult;
    }

    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        long l2;
        long l3 = this.getMillis();
        long l4 = l3 - (l2 = sdkHeartBeatResult.getMillis());
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        object = object < 0 ? (Object)-1 : (Object)1;
        return (int)object;
    }

    public abstract long getMillis();

    public abstract String getSdkName();
}

