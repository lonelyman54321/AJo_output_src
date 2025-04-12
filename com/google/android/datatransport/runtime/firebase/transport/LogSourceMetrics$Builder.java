/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics$Builder {
    private List log_event_dropped_;
    private String log_source_ = "";

    public LogSourceMetrics$Builder() {
        ArrayList arrayList;
        this.log_event_dropped_ = arrayList = new ArrayList();
    }

    public LogSourceMetrics$Builder addLogEventDropped(LogEventDropped logEventDropped) {
        this.log_event_dropped_.add(logEventDropped);
        return this;
    }

    public LogSourceMetrics build() {
        String string2 = this.log_source_;
        List list = Collections.unmodifiableList(this.log_event_dropped_);
        LogSourceMetrics logSourceMetrics = new LogSourceMetrics(string2, list);
        return logSourceMetrics;
    }

    public LogSourceMetrics$Builder setLogEventDroppedList(List list) {
        this.log_event_dropped_ = list;
        return this;
    }

    public LogSourceMetrics$Builder setLogSource(String string2) {
        this.log_source_ = string2;
        return this;
    }
}

