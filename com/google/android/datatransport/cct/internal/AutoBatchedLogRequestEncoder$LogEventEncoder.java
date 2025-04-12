/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoBatchedLogRequestEncoder$LogEventEncoder
implements ObjectEncoder {
    private static final FieldDescriptor COMPLIANCEDATA_DESCRIPTOR;
    private static final FieldDescriptor EVENTCODE_DESCRIPTOR;
    private static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR;
    private static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR;
    private static final FieldDescriptor EXPERIMENTIDS_DESCRIPTOR;
    static final AutoBatchedLogRequestEncoder$LogEventEncoder INSTANCE;
    private static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR;
    private static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR;
    private static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR;
    private static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR;

    static {
        AutoBatchedLogRequestEncoder$LogEventEncoder autoBatchedLogRequestEncoder$LogEventEncoder;
        INSTANCE = autoBatchedLogRequestEncoder$LogEventEncoder = new AutoBatchedLogRequestEncoder$LogEventEncoder();
        EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventTimeMs");
        EVENTCODE_DESCRIPTOR = FieldDescriptor.of("eventCode");
        COMPLIANCEDATA_DESCRIPTOR = FieldDescriptor.of("complianceData");
        EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventUptimeMs");
        SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.of("sourceExtension");
        SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.of("sourceExtensionJsonProto3");
        TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.of("timezoneOffsetSeconds");
        NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.of("networkConnectionInfo");
        EXPERIMENTIDS_DESCRIPTOR = FieldDescriptor.of("experimentIds");
    }

    private AutoBatchedLogRequestEncoder$LogEventEncoder() {
    }

    public void encode(LogEvent object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = EVENTTIMEMS_DESCRIPTOR;
        long l2 = ((LogEvent)object).getEventTimeMs();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = EVENTCODE_DESCRIPTOR;
        Object object2 = ((LogEvent)object).getEventCode();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = COMPLIANCEDATA_DESCRIPTOR;
        object2 = ((LogEvent)object).getComplianceData();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = EVENTUPTIMEMS_DESCRIPTOR;
        l2 = ((LogEvent)object).getEventUptimeMs();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = SOURCEEXTENSION_DESCRIPTOR;
        object2 = ((LogEvent)object).getSourceExtension();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR;
        object2 = ((LogEvent)object).getSourceExtensionJsonProto3();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = TIMEZONEOFFSETSECONDS_DESCRIPTOR;
        l2 = ((LogEvent)object).getTimezoneOffsetSeconds();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = NETWORKCONNECTIONINFO_DESCRIPTOR;
        object2 = ((LogEvent)object).getNetworkConnectionInfo();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = EXPERIMENTIDS_DESCRIPTOR;
        object = ((LogEvent)object).getExperimentIds();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

