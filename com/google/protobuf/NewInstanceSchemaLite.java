/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.NewInstanceSchema;

final class NewInstanceSchemaLite
implements NewInstanceSchema {
    public Object newInstance(Object object) {
        return ((GeneratedMessageLite)object).newMutableInstance();
    }
}

