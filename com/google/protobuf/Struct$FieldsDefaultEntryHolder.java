/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Value;
import com.google.protobuf.WireFormat$FieldType;

final class Struct$FieldsDefaultEntryHolder {
    static final MapEntryLite defaultEntry;

    static {
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.MESSAGE;
        Value value = Value.getDefaultInstance();
        defaultEntry = MapEntryLite.newDefaultInstance(wireFormat$FieldType, "", wireFormat$FieldType2, value);
    }

    private Struct$FieldsDefaultEntryHolder() {
    }
}

