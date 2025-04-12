/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat$FieldType;

final class TraceMetric$CountersDefaultEntryHolder {
    static final MapEntryLite defaultEntry;

    static {
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.INT64;
        Long l2 = 0L;
        defaultEntry = MapEntryLite.newDefaultInstance(wireFormat$FieldType, "", wireFormat$FieldType2, l2);
    }

    private TraceMetric$CountersDefaultEntryHolder() {
    }
}

