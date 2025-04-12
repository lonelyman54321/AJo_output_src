/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat$FieldType;

final class AttributeContext$Response$HeadersDefaultEntryHolder {
    static final MapEntryLite defaultEntry;

    static {
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
        String string2 = "";
        defaultEntry = MapEntryLite.newDefaultInstance(wireFormat$FieldType, string2, wireFormat$FieldType, string2);
    }

    private AttributeContext$Response$HeadersDefaultEntryHolder() {
    }
}

