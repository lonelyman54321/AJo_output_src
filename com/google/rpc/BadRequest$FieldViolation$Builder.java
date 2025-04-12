/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.BadRequest$1;
import com.google.rpc.BadRequest$FieldViolation;
import com.google.rpc.BadRequest$FieldViolationOrBuilder;

public final class BadRequest$FieldViolation$Builder
extends GeneratedMessageLite$Builder
implements BadRequest$FieldViolationOrBuilder {
    private BadRequest$FieldViolation$Builder() {
        BadRequest$FieldViolation badRequest$FieldViolation = BadRequest$FieldViolation.access$000();
        super(badRequest$FieldViolation);
    }

    public /* synthetic */ BadRequest$FieldViolation$Builder(BadRequest$1 badRequest$1) {
        this();
    }

    public BadRequest$FieldViolation$Builder clearDescription() {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$500((BadRequest$FieldViolation)this.instance);
        return this;
    }

    public BadRequest$FieldViolation$Builder clearField() {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$200((BadRequest$FieldViolation)this.instance);
        return this;
    }

    public String getDescription() {
        return ((BadRequest$FieldViolation)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((BadRequest$FieldViolation)this.instance).getDescriptionBytes();
    }

    public String getField() {
        return ((BadRequest$FieldViolation)this.instance).getField();
    }

    public ByteString getFieldBytes() {
        return ((BadRequest$FieldViolation)this.instance).getFieldBytes();
    }

    public BadRequest$FieldViolation$Builder setDescription(String string2) {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$400((BadRequest$FieldViolation)this.instance, string2);
        return this;
    }

    public BadRequest$FieldViolation$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$600((BadRequest$FieldViolation)this.instance, byteString);
        return this;
    }

    public BadRequest$FieldViolation$Builder setField(String string2) {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$100((BadRequest$FieldViolation)this.instance, string2);
        return this;
    }

    public BadRequest$FieldViolation$Builder setFieldBytes(ByteString byteString) {
        this.copyOnWrite();
        BadRequest$FieldViolation.access$300((BadRequest$FieldViolation)this.instance, byteString);
        return this;
    }
}

