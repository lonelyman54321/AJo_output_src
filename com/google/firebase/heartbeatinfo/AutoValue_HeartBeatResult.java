/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.List;

final class AutoValue_HeartBeatResult
extends HeartBeatResult {
    private final List usedDates;
    private final String userAgent;

    public AutoValue_HeartBeatResult(String object, List list) {
        if (object != null) {
            this.userAgent = object;
            if (list != null) {
                this.usedDates = list;
                return;
            }
            object = new NullPointerException("Null usedDates");
            throw object;
        }
        object = new NullPointerException("Null userAgent");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof HeartBeatResult;
        if (bl3) {
            boolean bl4;
            Object object2 = this.userAgent;
            String string2 = ((HeartBeatResult)(object = (HeartBeatResult)object)).getUserAgent();
            bl3 = ((String)object2).equals(string2);
            if (!bl3 || !(bl4 = (object2 = this.usedDates).equals(object = ((HeartBeatResult)object).getUsedDates()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List getUsedDates() {
        return this.usedDates;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int n3 = this.userAgent.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.usedDates.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HeartBeatResult{userAgent=");
        Object object = this.userAgent;
        stringBuilder.append((String)object);
        stringBuilder.append(", usedDates=");
        object = this.usedDates;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

