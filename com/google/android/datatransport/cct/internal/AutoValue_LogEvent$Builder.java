/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogEvent$Builder;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

final class AutoValue_LogEvent$Builder
extends LogEvent$Builder {
    private ComplianceData complianceData;
    private Integer eventCode;
    private Long eventTimeMs;
    private Long eventUptimeMs;
    private ExperimentIds experimentIds;
    private NetworkConnectionInfo networkConnectionInfo;
    private byte[] sourceExtension;
    private String sourceExtensionJsonProto3;
    private Long timezoneOffsetSeconds;

    public LogEvent build() {
        boolean bl2;
        AutoValue_LogEvent$Builder autoValue_LogEvent$Builder = this;
        Object object = this.eventTimeMs;
        object = object == null ? " eventTimeMs" : "";
        Object object2 = autoValue_LogEvent$Builder.eventUptimeMs;
        if (object2 == null) {
            object2 = " eventUptimeMs";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = autoValue_LogEvent$Builder.timezoneOffsetSeconds) == null) {
            object2 = " timezoneOffsetSeconds";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            long l2 = autoValue_LogEvent$Builder.eventTimeMs;
            Integer n3 = autoValue_LogEvent$Builder.eventCode;
            ComplianceData complianceData = autoValue_LogEvent$Builder.complianceData;
            long l3 = autoValue_LogEvent$Builder.eventUptimeMs;
            byte[] byArray = autoValue_LogEvent$Builder.sourceExtension;
            String string2 = autoValue_LogEvent$Builder.sourceExtensionJsonProto3;
            long l4 = autoValue_LogEvent$Builder.timezoneOffsetSeconds;
            NetworkConnectionInfo networkConnectionInfo = autoValue_LogEvent$Builder.networkConnectionInfo;
            ExperimentIds experimentIds = autoValue_LogEvent$Builder.experimentIds;
            object = new AutoValue_LogEvent(l2, n3, complianceData, l3, byArray, string2, l4, networkConnectionInfo, experimentIds, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public LogEvent$Builder setComplianceData(ComplianceData complianceData) {
        this.complianceData = complianceData;
        return this;
    }

    public LogEvent$Builder setEventCode(Integer n3) {
        this.eventCode = n3;
        return this;
    }

    public LogEvent$Builder setEventTimeMs(long l2) {
        Long l3;
        this.eventTimeMs = l3 = Long.valueOf(l2);
        return this;
    }

    public LogEvent$Builder setEventUptimeMs(long l2) {
        Long l3;
        this.eventUptimeMs = l3 = Long.valueOf(l2);
        return this;
    }

    public LogEvent$Builder setExperimentIds(ExperimentIds experimentIds) {
        this.experimentIds = experimentIds;
        return this;
    }

    public LogEvent$Builder setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo) {
        this.networkConnectionInfo = networkConnectionInfo;
        return this;
    }

    public LogEvent$Builder setSourceExtension(byte[] byArray) {
        this.sourceExtension = byArray;
        return this;
    }

    public LogEvent$Builder setSourceExtensionJsonProto3(String string2) {
        this.sourceExtensionJsonProto3 = string2;
        return this;
    }

    public LogEvent$Builder setTimezoneOffsetSeconds(long l2) {
        Long l3;
        this.timezoneOffsetSeconds = l3 = Long.valueOf(l2);
        return this;
    }
}

