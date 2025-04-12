/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogRequest$1;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

final class AutoValue_LogRequest
extends LogRequest {
    private final ClientInfo clientInfo;
    private final List logEvents;
    private final Integer logSource;
    private final String logSourceName;
    private final QosTier qosTier;
    private final long requestTimeMs;
    private final long requestUptimeMs;

    private AutoValue_LogRequest(long l2, long l3, ClientInfo clientInfo, Integer n3, String string2, List list, QosTier qosTier) {
        this.requestTimeMs = l2;
        this.requestUptimeMs = l3;
        this.clientInfo = clientInfo;
        this.logSource = n3;
        this.logSourceName = string2;
        this.logEvents = list;
        this.qosTier = qosTier;
    }

    public /* synthetic */ AutoValue_LogRequest(long l2, long l3, ClientInfo clientInfo, Integer n3, String string2, List list, QosTier qosTier, AutoValue_LogRequest$1 autoValue_LogRequest$1) {
        this(l2, l3, clientInfo, n3, string2, list, qosTier);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof LogRequest;
        if (object2) {
            boolean bl3;
            Object object3;
            Object object4;
            long l2;
            long l3 = this.requestTimeMs;
            long l4 = ((LogRequest)(object = (LogRequest)object)).getRequestTimeMs();
            long l7 = l3 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (!(!object2 && !(object2 = (l2 = (l3 = this.requestUptimeMs) - (l4 = ((LogRequest)object).getRequestUptimeMs())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) && ((object4 = this.clientInfo) == null ? (object4 = ((LogRequest)object).getClientInfo()) == null : (object2 = object4.equals(object3 = ((LogRequest)object).getClientInfo()))) && ((object4 = this.logSource) == null ? (object4 = ((LogRequest)object).getLogSource()) == null : (object2 = ((Integer)object4).equals(object3 = ((LogRequest)object).getLogSource()))) && ((object4 = this.logSourceName) == null ? (object4 = ((LogRequest)object).getLogSourceName()) == null : (object2 = ((String)object4).equals(object3 = ((LogRequest)object).getLogSourceName()))) && ((object4 = this.logEvents) == null ? (object4 = ((LogRequest)object).getLogEvents()) == null : (object2 = object4.equals(object3 = ((LogRequest)object).getLogEvents()))) && ((object4 = this.qosTier) == null ? (object = ((LogRequest)object).getQosTier()) == null : (bl3 = object4.equals(object = ((LogRequest)object).getQosTier()))))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public List getLogEvents() {
        return this.logEvents;
    }

    public Integer getLogSource() {
        return this.logSource;
    }

    public String getLogSourceName() {
        return this.logSourceName;
    }

    public QosTier getQosTier() {
        return this.qosTier;
    }

    public long getRequestTimeMs() {
        return this.requestTimeMs;
    }

    public long getRequestUptimeMs() {
        return this.requestUptimeMs;
    }

    public int hashCode() {
        long l2 = this.requestTimeMs;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        l3 = this.requestUptimeMs;
        long l4 = l3 >>> n3;
        long l7 = l4 ^ l3;
        int n8 = (int)l7;
        n4 = (n4 ^ n8) * n7;
        Object object = this.clientInfo;
        n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.logSource;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Integer)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.logSourceName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.logEvents;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        QosTier qosTier = this.qosTier;
        if (qosTier != null) {
            n8 = ((Object)((Object)qosTier)).hashCode();
        }
        return n4 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogRequest{requestTimeMs=");
        long l2 = this.requestTimeMs;
        stringBuilder.append(l2);
        stringBuilder.append(", requestUptimeMs=");
        l2 = this.requestUptimeMs;
        stringBuilder.append(l2);
        stringBuilder.append(", clientInfo=");
        Object object = this.clientInfo;
        stringBuilder.append(object);
        stringBuilder.append(", logSource=");
        object = this.logSource;
        stringBuilder.append(object);
        stringBuilder.append(", logSourceName=");
        object = this.logSourceName;
        stringBuilder.append((String)object);
        stringBuilder.append(", logEvents=");
        object = this.logEvents;
        stringBuilder.append(object);
        stringBuilder.append(", qosTier=");
        object = this.qosTier;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

