/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogEvent$1;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

final class AutoValue_LogEvent
extends LogEvent {
    private final ComplianceData complianceData;
    private final Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final ExperimentIds experimentIds;
    private final NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    private AutoValue_LogEvent(long l2, Integer n3, ComplianceData complianceData, long l3, byte[] byArray, String string2, long l4, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.eventTimeMs = l2;
        this.eventCode = n3;
        this.complianceData = complianceData;
        this.eventUptimeMs = l3;
        this.sourceExtension = byArray;
        this.sourceExtensionJsonProto3 = string2;
        this.timezoneOffsetSeconds = l4;
        this.networkConnectionInfo = networkConnectionInfo;
        this.experimentIds = experimentIds;
    }

    public /* synthetic */ AutoValue_LogEvent(long l2, Integer n3, ComplianceData complianceData, long l3, byte[] byArray, String string2, long l4, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds, AutoValue_LogEvent$1 autoValue_LogEvent$1) {
        this(l2, n3, complianceData, l3, byArray, string2, l4, networkConnectionInfo, experimentIds);
    }

    public boolean equals(Object object) {
        block6: {
            boolean bl2;
            block8: {
                block7: {
                    boolean bl3;
                    long l2;
                    long l3;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    Object object4 = object instanceof LogEvent;
                    if (!object4) break block6;
                    long l4 = this.eventTimeMs;
                    long l7 = ((LogEvent)(object = (LogEvent)object)).getEventTimeMs();
                    long l8 = l4 - l7;
                    object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object4 || !((object3 = this.eventCode) == null ? (object3 = ((LogEvent)object).getEventCode()) == null : (object4 = ((Integer)object3).equals(object2 = ((LogEvent)object).getEventCode()))) || !((object3 = this.complianceData) == null ? (object3 = ((LogEvent)object).getComplianceData()) == null : (object4 = object3.equals(object2 = ((LogEvent)object).getComplianceData()))) || (object4 = (l3 = (l4 = this.eventUptimeMs) - (l7 = ((LogEvent)object).getEventUptimeMs())) == 0L ? 0 : (l3 < 0L ? -1 : 1))) break block7;
                    object3 = this.sourceExtension;
                    boolean bl4 = object instanceof AutoValue_LogEvent;
                    if (bl4) {
                        object2 = object;
                        object2 = ((AutoValue_LogEvent)object).sourceExtension;
                    } else {
                        object2 = ((LogEvent)object).getSourceExtension();
                    }
                    object4 = Arrays.equals((byte[])object3, (byte[])object2);
                    if (object4 && ((object3 = this.sourceExtensionJsonProto3) == null ? (object3 = ((LogEvent)object).getSourceExtensionJsonProto3()) == null : (object4 = ((String)object3).equals(object2 = ((LogEvent)object).getSourceExtensionJsonProto3()))) && !(object4 = (l2 = (l4 = this.timezoneOffsetSeconds) - (l7 = ((LogEvent)object).getTimezoneOffsetSeconds())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) && ((object3 = this.networkConnectionInfo) == null ? (object3 = ((LogEvent)object).getNetworkConnectionInfo()) == null : (object4 = object3.equals(object2 = ((LogEvent)object).getNetworkConnectionInfo()))) && ((object3 = this.experimentIds) == null ? (object = ((LogEvent)object).getExperimentIds()) == null : (bl3 = object3.equals(object = ((LogEvent)object).getExperimentIds())))) break block8;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public ComplianceData getComplianceData() {
        return this.complianceData;
    }

    public Integer getEventCode() {
        return this.eventCode;
    }

    public long getEventTimeMs() {
        return this.eventTimeMs;
    }

    public long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    public ExperimentIds getExperimentIds() {
        return this.experimentIds;
    }

    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    public byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    public String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    public long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    public int hashCode() {
        int n3;
        long l2 = this.eventTimeMs;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = (int)(l2 ^= l3);
        int n8 = 1000003;
        n7 = (n7 ^ n8) * n8;
        Object object = this.eventCode;
        int n10 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Integer)object).hashCode();
        }
        n7 = (n7 ^ n3) * n8;
        object = this.complianceData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n7 = (n7 ^ n3) * n8;
        long l4 = this.eventUptimeMs;
        long l7 = l4 >>> n4;
        n3 = (int)(l4 ^= l7);
        n7 = (n7 ^ n3) * n8;
        n3 = Arrays.hashCode(this.sourceExtension);
        n7 = (n7 ^ n3) * n8;
        object = this.sourceExtensionJsonProto3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n7 = (n7 ^ n3) * n8;
        l4 = this.timezoneOffsetSeconds;
        long l8 = l4 >>> n4 ^ l4;
        n3 = (int)l8;
        n7 = (n7 ^ n3) * n8;
        NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        if (networkConnectionInfo == null) {
            n4 = 0;
            networkConnectionInfo = null;
        } else {
            n4 = networkConnectionInfo.hashCode();
        }
        n7 = (n7 ^ n4) * n8;
        ExperimentIds experimentIds = this.experimentIds;
        if (experimentIds != null) {
            n10 = experimentIds.hashCode();
        }
        return n7 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEvent{eventTimeMs=");
        long l2 = this.eventTimeMs;
        stringBuilder.append(l2);
        stringBuilder.append(", eventCode=");
        Object object = this.eventCode;
        stringBuilder.append(object);
        stringBuilder.append(", complianceData=");
        object = this.complianceData;
        stringBuilder.append(object);
        stringBuilder.append(", eventUptimeMs=");
        l2 = this.eventUptimeMs;
        stringBuilder.append(l2);
        stringBuilder.append(", sourceExtension=");
        object = Arrays.toString(this.sourceExtension);
        stringBuilder.append((String)object);
        stringBuilder.append(", sourceExtensionJsonProto3=");
        object = this.sourceExtensionJsonProto3;
        stringBuilder.append((String)object);
        stringBuilder.append(", timezoneOffsetSeconds=");
        l2 = this.timezoneOffsetSeconds;
        stringBuilder.append(l2);
        stringBuilder.append(", networkConnectionInfo=");
        object = this.networkConnectionInfo;
        stringBuilder.append(object);
        stringBuilder.append(", experimentIds=");
        object = this.experimentIds;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

