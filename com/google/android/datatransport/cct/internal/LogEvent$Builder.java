/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

public abstract class LogEvent$Builder {
    public abstract LogEvent build();

    public abstract LogEvent$Builder setComplianceData(ComplianceData var1);

    public abstract LogEvent$Builder setEventCode(Integer var1);

    public abstract LogEvent$Builder setEventTimeMs(long var1);

    public abstract LogEvent$Builder setEventUptimeMs(long var1);

    public abstract LogEvent$Builder setExperimentIds(ExperimentIds var1);

    public abstract LogEvent$Builder setNetworkConnectionInfo(NetworkConnectionInfo var1);

    public abstract LogEvent$Builder setSourceExtension(byte[] var1);

    public abstract LogEvent$Builder setSourceExtensionJsonProto3(String var1);

    public abstract LogEvent$Builder setTimezoneOffsetSeconds(long var1);
}

