/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.Encoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder$1;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class JsonDataEncoderBuilder
implements EncoderConfig {
    private static final ValueEncoder BOOLEAN_ENCODER;
    private static final ObjectEncoder DEFAULT_FALLBACK_ENCODER;
    private static final ValueEncoder STRING_ENCODER;
    private static final JsonDataEncoderBuilder$TimestampEncoder TIMESTAMP_ENCODER;
    private ObjectEncoder fallbackEncoder;
    private boolean ignoreNullValues;
    private final Map objectEncoders;
    private final Map valueEncoders;

    static {
        Encoder encoder = new Object();
        DEFAULT_FALLBACK_ENCODER = encoder;
        encoder = new Object();
        STRING_ENCODER = encoder;
        encoder = new Object();
        BOOLEAN_ENCODER = encoder;
        encoder = new JsonDataEncoderBuilder$TimestampEncoder(null);
        TIMESTAMP_ENCODER = encoder;
    }

    public JsonDataEncoderBuilder() {
        Object object = new HashMap();
        this.objectEncoders = object;
        object = new HashMap();
        this.valueEncoders = object;
        this.fallbackEncoder = object = DEFAULT_FALLBACK_ENCODER;
        this.ignoreNullValues = false;
        ValueEncoder valueEncoder = STRING_ENCODER;
        this.registerEncoder(String.class, valueEncoder);
        valueEncoder = BOOLEAN_ENCODER;
        this.registerEncoder(Boolean.class, valueEncoder);
        valueEncoder = TIMESTAMP_ENCODER;
        this.registerEncoder(Date.class, valueEncoder);
    }

    public static /* synthetic */ void a(Boolean bl2, ValueEncoderContext valueEncoderContext) {
        JsonDataEncoderBuilder.lambda$static$2(bl2, valueEncoderContext);
    }

    public static /* synthetic */ Map access$100(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.objectEncoders;
    }

    public static /* synthetic */ Map access$200(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.valueEncoders;
    }

    public static /* synthetic */ ObjectEncoder access$300(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.fallbackEncoder;
    }

    public static /* synthetic */ boolean access$400(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        return jsonDataEncoderBuilder.ignoreNullValues;
    }

    public static /* synthetic */ void b(Object object, ObjectEncoderContext objectEncoderContext) {
        JsonDataEncoderBuilder.lambda$static$0(object, objectEncoderContext);
    }

    public static /* synthetic */ void c(String string2, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add(string2);
    }

    private static /* synthetic */ void lambda$static$0(Object object, ObjectEncoderContext object2) {
        StringBuilder stringBuilder = new StringBuilder("Couldn't find encoder for type ");
        object = object.getClass().getCanonicalName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new EncodingException((String)object);
        throw object2;
    }

    private static /* synthetic */ void lambda$static$2(Boolean bl2, ValueEncoderContext valueEncoderContext) {
        boolean bl3 = bl2;
        valueEncoderContext.add(bl3);
    }

    public DataEncoder build() {
        JsonDataEncoderBuilder$1 jsonDataEncoderBuilder$1 = new JsonDataEncoderBuilder$1(this);
        return jsonDataEncoderBuilder$1;
    }

    public JsonDataEncoderBuilder configureWith(Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public JsonDataEncoderBuilder ignoreNullValues(boolean bl2) {
        this.ignoreNullValues = bl2;
        return this;
    }

    public JsonDataEncoderBuilder registerEncoder(Class clazz, ObjectEncoder objectEncoder) {
        this.objectEncoders.put(clazz, objectEncoder);
        this.valueEncoders.remove(clazz);
        return this;
    }

    public JsonDataEncoderBuilder registerEncoder(Class clazz, ValueEncoder valueEncoder) {
        this.valueEncoders.put(clazz, valueEncoder);
        this.objectEncoders.remove(clazz);
        return this;
    }

    public JsonDataEncoderBuilder registerFallbackEncoder(ObjectEncoder objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }
}

