/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;

class ProtobufValueEncoderContext
implements ValueEncoderContext {
    private boolean encoded = false;
    private FieldDescriptor field;
    private final ProtobufDataEncoderContext objEncoderCtx;
    private boolean skipDefault = false;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.objEncoderCtx = protobufDataEncoderContext;
    }

    private void checkNotUsed() {
        boolean bl2 = this.encoded;
        if (!bl2) {
            this.encoded = true;
            return;
        }
        EncodingException encodingException = new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        throw encodingException;
    }

    public ValueEncoderContext add(double d2) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, d2, bl2);
        return this;
    }

    public ValueEncoderContext add(float f5) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, f5, bl2);
        return this;
    }

    public ValueEncoderContext add(int n3) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, n3, bl2);
        return this;
    }

    public ValueEncoderContext add(long l2) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, l2, bl2);
        return this;
    }

    public ValueEncoderContext add(String string2) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, string2, bl2);
        return this;
    }

    public ValueEncoderContext add(boolean bl2) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl3 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, bl2, bl3);
        return this;
    }

    public ValueEncoderContext add(byte[] byArray) {
        this.checkNotUsed();
        ProtobufDataEncoderContext protobufDataEncoderContext = this.objEncoderCtx;
        FieldDescriptor fieldDescriptor = this.field;
        boolean bl2 = this.skipDefault;
        protobufDataEncoderContext.add(fieldDescriptor, byArray, bl2);
        return this;
    }

    public void resetContext(FieldDescriptor fieldDescriptor, boolean bl2) {
        this.encoded = false;
        this.field = fieldDescriptor;
        this.skipDefault = bl2;
    }
}

