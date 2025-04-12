/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics$Builder {
    private String app_namespace_;
    private GlobalMetrics global_metrics_;
    private List log_source_metrics_;
    private TimeWindow window_ = null;

    public ClientMetrics$Builder() {
        ArrayList arrayList;
        this.log_source_metrics_ = arrayList = new ArrayList();
        this.global_metrics_ = null;
        this.app_namespace_ = "";
    }

    public ClientMetrics$Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics) {
        this.log_source_metrics_.add(logSourceMetrics);
        return this;
    }

    public ClientMetrics build() {
        TimeWindow timeWindow = this.window_;
        List list = Collections.unmodifiableList(this.log_source_metrics_);
        GlobalMetrics globalMetrics = this.global_metrics_;
        String string2 = this.app_namespace_;
        ClientMetrics clientMetrics = new ClientMetrics(timeWindow, list, globalMetrics, string2);
        return clientMetrics;
    }

    public ClientMetrics$Builder setAppNamespace(String string2) {
        this.app_namespace_ = string2;
        return this;
    }

    public ClientMetrics$Builder setGlobalMetrics(GlobalMetrics globalMetrics) {
        this.global_metrics_ = globalMetrics;
        return this;
    }

    public ClientMetrics$Builder setLogSourceMetricsList(List list) {
        this.log_source_metrics_ = list;
        return this;
    }

    public ClientMetrics$Builder setWindow(TimeWindow timeWindow) {
        this.window_ = timeWindow;
        return this;
    }
}

