/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;
import java.util.Map;

public final class a
implements ObjectEncoder {
    public final void encode(Object object, Object object2) {
        object = (Map.Entry)object;
        object2 = (ObjectEncoderContext)object2;
        ProtobufDataEncoderContext.a((Map.Entry)object, (ObjectEncoderContext)object2);
    }
}

