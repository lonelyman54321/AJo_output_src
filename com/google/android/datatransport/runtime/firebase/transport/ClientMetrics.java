/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import java.io.OutputStream;
import java.util.List;

public final class ClientMetrics {
    private static final ClientMetrics DEFAULT_INSTANCE;
    private final String app_namespace_;
    private final GlobalMetrics global_metrics_;
    private final List log_source_metrics_;
    private final TimeWindow window_;

    static {
        ClientMetrics$Builder clientMetrics$Builder = new ClientMetrics$Builder();
        DEFAULT_INSTANCE = clientMetrics$Builder.build();
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String string2) {
        this.window_ = timeWindow;
        this.log_source_metrics_ = list;
        this.global_metrics_ = globalMetrics;
        this.app_namespace_ = string2;
    }

    public static ClientMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ClientMetrics$Builder newBuilder() {
        ClientMetrics$Builder clientMetrics$Builder = new ClientMetrics$Builder();
        return clientMetrics$Builder;
    }

    public String getAppNamespace() {
        return this.app_namespace_;
    }

    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics globalMetrics = this.global_metrics_;
        if (globalMetrics == null) {
            globalMetrics = GlobalMetrics.getDefaultInstance();
        }
        return globalMetrics;
    }

    public GlobalMetrics getGlobalMetricsInternal() {
        return this.global_metrics_;
    }

    public List getLogSourceMetricsList() {
        return this.log_source_metrics_;
    }

    public TimeWindow getWindow() {
        TimeWindow timeWindow = this.window_;
        if (timeWindow == null) {
            timeWindow = TimeWindow.getDefaultInstance();
        }
        return timeWindow;
    }

    public TimeWindow getWindowInternal() {
        return this.window_;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}

