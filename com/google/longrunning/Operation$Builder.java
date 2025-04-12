/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.longrunning.Operation$1;
import com.google.longrunning.Operation$ResultCase;
import com.google.longrunning.OperationOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.Status;
import com.google.rpc.Status$Builder;

public final class Operation$Builder
extends GeneratedMessageLite$Builder
implements OperationOrBuilder {
    private Operation$Builder() {
        Operation operation = Operation.access$000();
        super(operation);
    }

    public /* synthetic */ Operation$Builder(Operation$1 operation$1) {
        this();
    }

    public Operation$Builder clearDone() {
        this.copyOnWrite();
        Operation.access$900((Operation)this.instance);
        return this;
    }

    public Operation$Builder clearError() {
        this.copyOnWrite();
        Operation.access$1200((Operation)this.instance);
        return this;
    }

    public Operation$Builder clearMetadata() {
        this.copyOnWrite();
        Operation.access$700((Operation)this.instance);
        return this;
    }

    public Operation$Builder clearName() {
        this.copyOnWrite();
        Operation.access$300((Operation)this.instance);
        return this;
    }

    public Operation$Builder clearResponse() {
        this.copyOnWrite();
        Operation.access$1500((Operation)this.instance);
        return this;
    }

    public Operation$Builder clearResult() {
        this.copyOnWrite();
        Operation.access$100((Operation)this.instance);
        return this;
    }

    public boolean getDone() {
        return ((Operation)this.instance).getDone();
    }

    public Status getError() {
        return ((Operation)this.instance).getError();
    }

    public Any getMetadata() {
        return ((Operation)this.instance).getMetadata();
    }

    public String getName() {
        return ((Operation)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Operation)this.instance).getNameBytes();
    }

    public Any getResponse() {
        return ((Operation)this.instance).getResponse();
    }

    public Operation$ResultCase getResultCase() {
        return ((Operation)this.instance).getResultCase();
    }

    public boolean hasError() {
        return ((Operation)this.instance).hasError();
    }

    public boolean hasMetadata() {
        return ((Operation)this.instance).hasMetadata();
    }

    public boolean hasResponse() {
        return ((Operation)this.instance).hasResponse();
    }

    public Operation$Builder mergeError(Status status) {
        this.copyOnWrite();
        Operation.access$1100((Operation)this.instance, status);
        return this;
    }

    public Operation$Builder mergeMetadata(Any any) {
        this.copyOnWrite();
        Operation.access$600((Operation)this.instance, any);
        return this;
    }

    public Operation$Builder mergeResponse(Any any) {
        this.copyOnWrite();
        Operation.access$1400((Operation)this.instance, any);
        return this;
    }

    public Operation$Builder setDone(boolean bl2) {
        this.copyOnWrite();
        Operation.access$800((Operation)this.instance, bl2);
        return this;
    }

    public Operation$Builder setError(Status$Builder statusOrBuilder) {
        this.copyOnWrite();
        Operation operation = (Operation)this.instance;
        statusOrBuilder = (Status)statusOrBuilder.build();
        Operation.access$1000(operation, (Status)statusOrBuilder);
        return this;
    }

    public Operation$Builder setError(Status status) {
        this.copyOnWrite();
        Operation.access$1000((Operation)this.instance, status);
        return this;
    }

    public Operation$Builder setMetadata(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Operation operation = (Operation)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Operation.access$500(operation, (Any)anyOrBuilder);
        return this;
    }

    public Operation$Builder setMetadata(Any any) {
        this.copyOnWrite();
        Operation.access$500((Operation)this.instance, any);
        return this;
    }

    public Operation$Builder setName(String string2) {
        this.copyOnWrite();
        Operation.access$200((Operation)this.instance, string2);
        return this;
    }

    public Operation$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Operation.access$400((Operation)this.instance, byteString);
        return this;
    }

    public Operation$Builder setResponse(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        Operation operation = (Operation)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        Operation.access$1300(operation, (Any)anyOrBuilder);
        return this;
    }

    public Operation$Builder setResponse(Any any) {
        this.copyOnWrite();
        Operation.access$1300((Operation)this.instance, any);
        return this;
    }
}

