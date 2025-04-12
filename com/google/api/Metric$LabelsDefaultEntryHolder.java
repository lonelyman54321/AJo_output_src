/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat$FieldType;

final class Metric$LabelsDefaultEntryHolder {
    static final MapEntryLite defaultEntry;

    static {
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
        String string2 = "";
        defaultEntry = MapEntryLite.newDefaultInstance(wireFormat$FieldType, string2, wireFormat$FieldType, string2);
    }

    private Metric$LabelsDefaultEntryHolder() {
    }
}

