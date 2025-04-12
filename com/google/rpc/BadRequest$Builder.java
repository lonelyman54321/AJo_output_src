/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.BadRequest;
import com.google.rpc.BadRequest$1;
import com.google.rpc.BadRequest$FieldViolation;
import com.google.rpc.BadRequest$FieldViolation$Builder;
import com.google.rpc.BadRequestOrBuilder;
import java.util.Collections;
import java.util.List;

public final class BadRequest$Builder
extends GeneratedMessageLite$Builder
implements BadRequestOrBuilder {
    private BadRequest$Builder() {
        BadRequest badRequest = BadRequest.access$800();
        super(badRequest);
    }

    public /* synthetic */ BadRequest$Builder(BadRequest$1 badRequest$1) {
        this();
    }

    public BadRequest$Builder addAllFieldViolations(Iterable iterable) {
        this.copyOnWrite();
        BadRequest.access$1200((BadRequest)this.instance, iterable);
        return this;
    }

    public BadRequest$Builder addFieldViolations(int n3, BadRequest$FieldViolation$Builder badRequest$FieldViolationOrBuilder) {
        this.copyOnWrite();
        BadRequest badRequest = (BadRequest)this.instance;
        badRequest$FieldViolationOrBuilder = (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder.build();
        BadRequest.access$1100(badRequest, n3, (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder);
        return this;
    }

    public BadRequest$Builder addFieldViolations(int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        this.copyOnWrite();
        BadRequest.access$1100((BadRequest)this.instance, n3, badRequest$FieldViolation);
        return this;
    }

    public BadRequest$Builder addFieldViolations(BadRequest$FieldViolation$Builder badRequest$FieldViolationOrBuilder) {
        this.copyOnWrite();
        BadRequest badRequest = (BadRequest)this.instance;
        badRequest$FieldViolationOrBuilder = (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder.build();
        BadRequest.access$1000(badRequest, (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder);
        return this;
    }

    public BadRequest$Builder addFieldViolations(BadRequest$FieldViolation badRequest$FieldViolation) {
        this.copyOnWrite();
        BadRequest.access$1000((BadRequest)this.instance, badRequest$FieldViolation);
        return this;
    }

    public BadRequest$Builder clearFieldViolations() {
        this.copyOnWrite();
        BadRequest.access$1300((BadRequest)this.instance);
        return this;
    }

    public BadRequest$FieldViolation getFieldViolations(int n3) {
        return ((BadRequest)this.instance).getFieldViolations(n3);
    }

    public int getFieldViolationsCount() {
        return ((BadRequest)this.instance).getFieldViolationsCount();
    }

    public List getFieldViolationsList() {
        return Collections.unmodifiableList(((BadRequest)this.instance).getFieldViolationsList());
    }

    public BadRequest$Builder removeFieldViolations(int n3) {
        this.copyOnWrite();
        BadRequest.access$1400((BadRequest)this.instance, n3);
        return this;
    }

    public BadRequest$Builder setFieldViolations(int n3, BadRequest$FieldViolation$Builder badRequest$FieldViolationOrBuilder) {
        this.copyOnWrite();
        BadRequest badRequest = (BadRequest)this.instance;
        badRequest$FieldViolationOrBuilder = (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder.build();
        BadRequest.access$900(badRequest, n3, (BadRequest$FieldViolation)badRequest$FieldViolationOrBuilder);
        return this;
    }

    public BadRequest$Builder setFieldViolations(int n3, BadRequest$FieldViolation badRequest$FieldViolation) {
        this.copyOnWrite();
        BadRequest.access$900((BadRequest)this.instance, n3, badRequest$FieldViolation);
        return this;
    }
}

