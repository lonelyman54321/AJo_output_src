/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import java.util.List;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo
extends CrashlyticsReport$ApplicationExitInfo {
    private final List buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int n3, String string2, int n4, int n7, long l2, long l3, long l4, String string3, List list) {
        this.pid = n3;
        this.processName = string2;
        this.reasonCode = n4;
        this.importance = n7;
        this.pss = l2;
        this.rss = l3;
        this.timestamp = l4;
        this.traceFile = string3;
        this.buildIdMappingForArch = list;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_ApplicationExitInfo(int n3, String string2, int n4, int n7, long l2, long l3, long l4, String string3, List list, AutoValue_CrashlyticsReport_ApplicationExitInfo$1 autoValue_CrashlyticsReport_ApplicationExitInfo$1) {
        this(n3, string2, n4, n7, l2, l3, l4, string3, list);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof CrashlyticsReport$ApplicationExitInfo;
        if (n3 != 0) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            String string2;
            Object object2;
            n3 = this.pid;
            int n4 = ((CrashlyticsReport$ApplicationExitInfo)(object = (CrashlyticsReport$ApplicationExitInfo)object)).getPid();
            if (n3 != n4 || (n3 = (int)(((String)(object2 = this.processName)).equals(string2 = ((CrashlyticsReport$ApplicationExitInfo)object).getProcessName()) ? 1 : 0)) == 0 || (n3 = this.reasonCode) != (n4 = ((CrashlyticsReport$ApplicationExitInfo)object).getReasonCode()) || (n3 = this.importance) != (n4 = ((CrashlyticsReport$ApplicationExitInfo)object).getImportance()) || (n3 = (int)((l8 = (l7 = this.pss) - (l4 = ((CrashlyticsReport$ApplicationExitInfo)object).getPss())) == 0L ? 0 : (l8 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l3 = (l7 = this.rss) - (l4 = ((CrashlyticsReport$ApplicationExitInfo)object).getRss())) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l2 = (l7 = this.timestamp) - (l4 = ((CrashlyticsReport$ApplicationExitInfo)object).getTimestamp())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || !((object2 = this.traceFile) == null ? (object2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTraceFile()) == null : (n3 = (int)(((String)object2).equals(string2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTraceFile()) ? 1 : 0)) != 0) || !((object2 = this.buildIdMappingForArch) == null ? (object = ((CrashlyticsReport$ApplicationExitInfo)object).getBuildIdMappingForArch()) == null : (bl3 = object2.equals(object = ((CrashlyticsReport$ApplicationExitInfo)object).getBuildIdMappingForArch())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
    }

    public int getImportance() {
        return this.importance;
    }

    public int getPid() {
        return this.pid;
    }

    public String getProcessName() {
        return this.processName;
    }

    public long getPss() {
        return this.pss;
    }

    public int getReasonCode() {
        return this.reasonCode;
    }

    public long getRss() {
        return this.rss;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        int n3 = this.pid;
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.processName.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.reasonCode;
        n3 = (n3 ^ n7) * n4;
        n7 = this.importance;
        n3 = (n3 ^ n7) * n4;
        long l2 = this.pss;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n3 = (n3 ^ n10) * n4;
        l2 = this.rss;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 ^ n10) * n4;
        l2 = this.timestamp;
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n3 = (n3 ^ n10) * n4;
        String string2 = this.traceFile;
        n10 = 0;
        if (string2 == null) {
            n7 = 0;
            string2 = null;
        } else {
            n7 = string2.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        List list = this.buildIdMappingForArch;
        if (list != null) {
            n10 = list.hashCode();
        }
        return n3 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationExitInfo{pid=");
        int n3 = this.pid;
        stringBuilder.append(n3);
        stringBuilder.append(", processName=");
        Object object = this.processName;
        stringBuilder.append((String)object);
        stringBuilder.append(", reasonCode=");
        n3 = this.reasonCode;
        stringBuilder.append(n3);
        stringBuilder.append(", importance=");
        n3 = this.importance;
        stringBuilder.append(n3);
        stringBuilder.append(", pss=");
        long l2 = this.pss;
        stringBuilder.append(l2);
        stringBuilder.append(", rss=");
        l2 = this.rss;
        stringBuilder.append(l2);
        stringBuilder.append(", timestamp=");
        l2 = this.timestamp;
        stringBuilder.append(l2);
        stringBuilder.append(", traceFile=");
        object = this.traceFile;
        stringBuilder.append((String)object);
        stringBuilder.append(", buildIdMappingForArch=");
        object = this.buildIdMappingForArch;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

