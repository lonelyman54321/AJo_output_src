/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;

final class AutoValue_SdkHeartBeatResult
extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String object, long l2) {
        if (object != null) {
            this.sdkName = object;
            this.millis = l2;
            return;
        }
        object = new NullPointerException("Null sdkName");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof SdkHeartBeatResult;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            String string2 = this.sdkName;
            String string3 = ((SdkHeartBeatResult)(object = (SdkHeartBeatResult)object)).getSdkName();
            bl3 = string2.equals(string3);
            if (!bl3 || (l7 = (l4 = (l3 = this.millis) - (l2 = ((SdkHeartBeatResult)object).getMillis())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getMillis() {
        return this.millis;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int n3 = this.sdkName.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        long l2 = this.millis;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SdkHeartBeatResult{sdkName=");
        String string2 = this.sdkName;
        stringBuilder.append(string2);
        stringBuilder.append(", millis=");
        long l2 = this.millis;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

