/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;
import java.util.Map;

public final class ProtobufEncoder$Builder
implements EncoderConfig {
    private static final ObjectEncoder DEFAULT_FALLBACK_ENCODER;
    private ObjectEncoder fallbackEncoder;
    private final Map objectEncoders;
    private final Map valueEncoders;

    static {
        hb2_0 hb2_02 = new Object();
        DEFAULT_FALLBACK_ENCODER = hb2_02;
    }

    public ProtobufEncoder$Builder() {
        Object object = new HashMap();
        this.objectEncoders = object;
        object = new HashMap();
        this.valueEncoders = object;
        this.fallbackEncoder = object = DEFAULT_FALLBACK_ENCODER;
    }

    public static /* synthetic */ void a(Object object, ObjectEncoderContext objectEncoderContext) {
        ProtobufEncoder$Builder.lambda$static$0(object, objectEncoderContext);
    }

    private static /* synthetic */ void lambda$static$0(Object object, ObjectEncoderContext object2) {
        StringBuilder stringBuilder = new StringBuilder("Couldn't find encoder for type ");
        object = object.getClass().getCanonicalName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new EncodingException((String)object);
        throw object2;
    }

    public ProtobufEncoder build() {
        HashMap hashMap = this.objectEncoders;
        HashMap hashMap2 = new HashMap(hashMap);
        Object object = this.valueEncoders;
        hashMap = new HashMap(object);
        object = this.fallbackEncoder;
        ProtobufEncoder protobufEncoder = new ProtobufEncoder(hashMap2, hashMap, (ObjectEncoder)object);
        return protobufEncoder;
    }

    public ProtobufEncoder$Builder configureWith(Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public ProtobufEncoder$Builder registerEncoder(Class clazz, ObjectEncoder objectEncoder) {
        this.objectEncoders.put(clazz, objectEncoder);
        this.valueEncoders.remove(clazz);
        return this;
    }

    public ProtobufEncoder$Builder registerEncoder(Class clazz, ValueEncoder valueEncoder) {
        this.valueEncoders.put(clazz, valueEncoder);
        this.objectEncoders.remove(clazz);
        return this;
    }

    public ProtobufEncoder$Builder registerFallbackEncoder(ObjectEncoder objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }
}

