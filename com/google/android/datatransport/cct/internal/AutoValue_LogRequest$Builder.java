/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogRequest$Builder;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

final class AutoValue_LogRequest$Builder
extends LogRequest$Builder {
    private ClientInfo clientInfo;
    private List logEvents;
    private Integer logSource;
    private String logSourceName;
    private QosTier qosTier;
    private Long requestTimeMs;
    private Long requestUptimeMs;

    public LogRequest build() {
        boolean bl2;
        Object object = this.requestTimeMs;
        object = object == null ? " requestTimeMs" : "";
        Object object2 = this.requestUptimeMs;
        if (object2 == null) {
            object2 = " requestUptimeMs";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            long l2 = this.requestTimeMs;
            long l3 = this.requestUptimeMs;
            ClientInfo clientInfo = this.clientInfo;
            Integer n3 = this.logSource;
            String string2 = this.logSourceName;
            List list = this.logEvents;
            QosTier qosTier = this.qosTier;
            object = new AutoValue_LogRequest(l2, l3, clientInfo, n3, string2, list, qosTier, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public LogRequest$Builder setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public LogRequest$Builder setLogEvents(List list) {
        this.logEvents = list;
        return this;
    }

    public LogRequest$Builder setLogSource(Integer n3) {
        this.logSource = n3;
        return this;
    }

    public LogRequest$Builder setLogSourceName(String string2) {
        this.logSourceName = string2;
        return this;
    }

    public LogRequest$Builder setQosTier(QosTier qosTier) {
        this.qosTier = qosTier;
        return this;
    }

    public LogRequest$Builder setRequestTimeMs(long l2) {
        Long l3;
        this.requestTimeMs = l3 = Long.valueOf(l2);
        return this;
    }

    public LogRequest$Builder setRequestUptimeMs(long l2) {
        Long l3;
        this.requestUptimeMs = l3 = Long.valueOf(l2);
        return this;
    }
}

