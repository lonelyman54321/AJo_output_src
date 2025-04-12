/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder
extends CrashlyticsReport$ApplicationExitInfo$Builder {
    private List buildIdMappingForArch;
    private int importance;
    private int pid;
    private String processName;
    private long pss;
    private int reasonCode;
    private long rss;
    private byte set$0;
    private long timestamp;
    private String traceFile;

    public CrashlyticsReport$ApplicationExitInfo build() {
        Object object;
        String string2;
        AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder autoValue_CrashlyticsReport_ApplicationExitInfo$Builder = this;
        int n3 = this.set$0;
        int n4 = 63;
        if (n3 == n4 && (string2 = this.processName) != null) {
            int n7 = this.pid;
            int n8 = this.reasonCode;
            int n10 = this.importance;
            long l2 = this.pss;
            long l3 = this.rss;
            long l4 = this.timestamp;
            String string3 = this.traceFile;
            List list = this.buildIdMappingForArch;
            AutoValue_CrashlyticsReport_ApplicationExitInfo autoValue_CrashlyticsReport_ApplicationExitInfo = new AutoValue_CrashlyticsReport_ApplicationExitInfo(n7, string2, n8, n10, l2, l3, l4, string3, list, null);
            return autoValue_CrashlyticsReport_ApplicationExitInfo;
        }
        CharSequence charSequence = new StringBuilder();
        n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 1;
        if (n4 == 0) {
            object = " pid";
            charSequence.append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.processName) == null) {
            object = " processName";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 2) == 0) {
            object = " reasonCode";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 4) == 0) {
            object = " importance";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 8) == 0) {
            object = " pss";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 0x10) == 0) {
            object = " rss";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_ApplicationExitInfo$Builder.set$0 & 0x20) == 0) {
            object = " timestamp";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setBuildIdMappingForArch(List list) {
        this.buildIdMappingForArch = list;
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setImportance(int n3) {
        this.importance = n3;
        n3 = (byte)(this.set$0 | 4);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setPid(int n3) {
        this.pid = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setProcessName(String object) {
        if (object != null) {
            this.processName = object;
            return this;
        }
        object = new NullPointerException("Null processName");
        throw object;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setPss(long l2) {
        byte by2;
        this.pss = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 8);
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setReasonCode(int n3) {
        this.reasonCode = n3;
        n3 = (byte)(this.set$0 | 2);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setRss(long l2) {
        byte by2;
        this.rss = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 0x10);
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setTimestamp(long l2) {
        byte by2;
        this.timestamp = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 0x20);
        return this;
    }

    public CrashlyticsReport$ApplicationExitInfo$Builder setTraceFile(String string2) {
        this.traceFile = string2;
        return this;
    }
}

